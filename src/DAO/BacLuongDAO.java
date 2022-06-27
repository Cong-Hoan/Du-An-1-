package DAO;

import Helper.ConnectDatabase;
import Model.BacLuong;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class BacLuongDAO {
    public static List<BacLuong> ls = new ArrayList<>();


    public int add(BacLuong bl) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "insert into BacLuong(MaBacLuong, BacLuong)"
                    + " values (?, ?)";
            conn = ConnectDatabase.openConnection();
            sttm = conn.prepareStatement(sSQL);
            
            sttm.setString(1, bl.getMaBacLuong());
            sttm.setString(2,(String.valueOf(bl.getBacLuong())));

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
    public List<BacLuong> getAllBacLuong() {
        List<BacLuong> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "select * from BacLuong";
            conn = ConnectDatabase.openConnection();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                BacLuong tk = new BacLuong();
                tk.setMaBacLuong(rs.getString(1));
                tk.setBacLuong(rs.getFloat(2));

                ls.add(tk);
            }
        } catch (Exception e) {
            System.out.println("Error: getAll"+e.getMessage());
            e.printStackTrace();
        }finally {
            try {
                conn.close();
                sttm.close();
            } catch (Exception e) {   
            }
            }
        return ls;
    }

    public BacLuong getBacLuongByID(String maBL) {
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        BacLuong tk = new BacLuong();
        try {
            String sSQL = "select * from BacLuong where MaBacLuong = ?";
            conn = ConnectDatabase.openConnection();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, maBL);
            rs = sttm.executeQuery();
            while (rs.next()) {
                tk.setMaBacLuong(rs.getString(1));
                tk.setBacLuong(rs.getFloat(2));
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

    public int updateBacLuongByID(BacLuong tk) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "update BacLuong set BacLuong = ? where MaBacLuong = ?";

            conn = ConnectDatabase.openConnection();
            sttm = conn.prepareStatement(sSQL);
            
            sttm.setString(2, tk.getMaBacLuong());
            sttm.setString(1,(String.valueOf(tk.getBacLuong())));

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
    public int delBacLuongByID(String maBL) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "delete BacLuong where MaBacLuong = ?";
            conn = ConnectDatabase.openConnection();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, maBL);
            
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
    
    public BacLuong getOneBacLuongByMaBL(String maBL) {
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        BacLuong g = new BacLuong();
        try {
            String sSQL = "SELECT * from BacLuong where MaBacLuong = ?";
            conn = ConnectDatabase.openConnection();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, maBL);
            rs = sttm.executeQuery();
            while (rs.next()) {
                g.setMaBacLuong(rs.getString(1));
                g.setBacLuong(rs.getFloat(2));
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
