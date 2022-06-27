
package DAO;

import Helper.ConnectDatabase;
import Model.PhuCap;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class PhuCapDAO {
    public static List<PhuCap> ls = new ArrayList<>();


    public int add(PhuCap bl) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "insert into PhuCap(MaPhuCap, TienPhuCap)"
                    + " values (?, ?)";
            conn = ConnectDatabase.openConnection();
            sttm = conn.prepareStatement(sSQL);
            
            sttm.setString(1, bl.getMaPhuCap());
            sttm.setString(2,(String.valueOf(bl.getPhuCap())));

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
    public List<PhuCap> getAllPhuCap() {
        List<PhuCap> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "select * from PhuCap";
            conn = ConnectDatabase.openConnection();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                PhuCap tk = new PhuCap();
                tk.setMaPhuCap(rs.getString(1).toString());
                tk.setPhuCap(rs.getFloat(2));

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
    

    public PhuCap getPhuCapByID(String maPC) {
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        PhuCap tk = new PhuCap();
        try {
            String sSQL = "select * from PhuCap where MaPhuCap = ?";
            conn = ConnectDatabase.openConnection();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, maPC);
            rs = sttm.executeQuery();
            while (rs.next()) {
                tk.setMaPhuCap(rs.getString(1));
                tk.setPhuCap(rs.getFloat(2));
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

    public int updatePhuCapByID(PhuCap tk) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "update PhuCap set TienPhuCap = ? where MaPhuCap = ?";

            conn = ConnectDatabase.openConnection();
            sttm = conn.prepareStatement(sSQL);
            
            sttm.setString(2, tk.getMaPhuCap());
            sttm.setString(1,(String.valueOf( tk.getPhuCap())));

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
    public int delPhuCapByID(String maPC) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "delete PhuCap where MaPhuCap = ?";
            conn = ConnectDatabase.openConnection();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, maPC);
            
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
    
    public PhuCap getOnePhuCapByMaBL(String maPhuCap) {
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        PhuCap g = new PhuCap();
        try {
            String sSQL = "SELECT * from PhuCap where MaPhuCap = ?";
            conn = ConnectDatabase.openConnection();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, maPhuCap);
            rs = sttm.executeQuery();
            while (rs.next()) {
                g.setMaPhuCap(rs.getString(1));
                g.setPhuCap(rs.getFloat(2));
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
