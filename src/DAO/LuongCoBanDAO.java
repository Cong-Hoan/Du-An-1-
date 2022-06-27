
package DAO;

import Helper.ConnectDatabase;
import Model.LuongCoBan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class LuongCoBanDAO {
    
    
    public static List<LuongCoBan> ls = new ArrayList<>();


    public int add(LuongCoBan bl) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "insert into LuongCoBan(MaLuongCoBan, LuongCoBan)"
                    + " values (?, ?)";
            conn = ConnectDatabase.openConnection();
            sttm = conn.prepareStatement(sSQL);
            
            sttm.setString(1, bl.getMaLuongCoBan());
            sttm.setString(2,(String.valueOf(bl.getLuongCoBan())));

            if (sttm.executeUpdate() > 0) {
                System.out.println("Add Thanh Cong");
                return 1;
            }
        } catch (Exception e) {
            //e.printStackTrace();
        }finally {
            try {
                conn.close();
                sttm.close();
            } catch (Exception e) {
            }
        }
        return -1;
    }
    public List<LuongCoBan> getAllLuongCoBan() {
        List<LuongCoBan> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "select * from LuongCoBan";
            conn = ConnectDatabase.openConnection();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                LuongCoBan tk = new LuongCoBan();
                tk.setMaLuongCoBan(rs.getString(1));
                tk.setLuongCoBan(rs.getFloat(2));

                ls.add(tk);
            }
        } catch (Exception e) {
            System.out.println("Error: getAll"+e.getMessage());
            //e.printStackTrace();
        }finally {
            try {
                conn.close();
                sttm.close();
            } catch (Exception e) {   
            }
            }
        return ls;
    }

    public LuongCoBan getLuongCoBanByID(String maLCB) {
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        LuongCoBan tk = new LuongCoBan();
        try {
            String sSQL = "select * from LuongCoBan where MaLuongCoBan = ?";
            conn = ConnectDatabase.openConnection();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, maLCB);
            rs = sttm.executeQuery();
            while (rs.next()) {
                tk.setMaLuongCoBan(rs.getString(1));
                tk.setLuongCoBan(rs.getFloat(2));
                return tk;
            }
        } catch (Exception e) {
            System.out.println("Error: getTaiKhoanByID"+e.getMessage());
            //e.printStackTrace();
        }finally {
            try {
                conn.close();
                sttm.close();
            } catch (Exception e) {
            }
    }
        return null;
    }

    public int updateLuongCoBanByID(LuongCoBan tk) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "update LuongCoBan set LuongCoBan = ? where MaLuongCoBan = ?";

            conn = ConnectDatabase.openConnection();
            sttm = conn.prepareStatement(sSQL);
            
            sttm.setString(2, tk.getMaLuongCoBan());
            sttm.setString(1,(String.valueOf( tk.getLuongCoBan())));

            if (sttm.executeUpdate() > 0) {
                System.out.println("Update Thanh Cong");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error: Update"+e.getMessage());
            //e.printStackTrace();
        }finally {
            try {
                conn.close();
                sttm.close();
            } catch (Exception e) {
                
            }
            }
        return -1;
    }
    public int delLuongCoBanByID(String maLCB) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "delete LuongCoBan where MaLuongCoBan = ?";
            conn = ConnectDatabase.openConnection();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, maLCB);
            
            if (sttm.executeUpdate() > 0) {
                System.out.println("Xoa Thanh Cong");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error: Delete"+e.getMessage());
            //e.printStackTrace();
        }finally {
            try {
                conn.close();
                sttm.close();
            } catch (Exception e) {
            }
            }
        return -1;
    }
    
    public LuongCoBan getOneLuongCoBanByMaBL(String maLCB) {
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        LuongCoBan g = new LuongCoBan();
        try {
            String sSQL = "SELECT * from LuongCoBan where MaLuongCoBan = ?";
            conn = ConnectDatabase.openConnection();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, maLCB);
            rs = sttm.executeQuery();
            while (rs.next()) {
                g.setMaLuongCoBan(rs.getString(1));
                g.setLuongCoBan(rs.getFloat(2));
                return g;
            }
        } catch (Exception e) {
            System.out.println("Error: getNhanVienByID" + e.getMessage());
            //e.printStackTrace();
        } finally {
            try {
                conn.close();
                sttm.close();
            } catch (Exception e) {
            }
        }
        return null;
    }
}
