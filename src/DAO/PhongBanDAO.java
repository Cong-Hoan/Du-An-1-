/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Helper.ConnectDatabase;
import Model.PhongBan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class PhongBanDAO {
    public static List<PhongBan> ls = new ArrayList<>();


    public int add(PhongBan bl) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "insert into PhongBan(MaPhong, TenPhong, TenTruongPhong)"
                    + " values (?, ?, ?)";
            conn = ConnectDatabase.openConnection();
            sttm = conn.prepareStatement(sSQL);
            
            sttm.setString(1, bl.getMaPhongBan());
            sttm.setString(2, bl.getTenPhongBan());
            sttm.setString(3, bl.getTenTruongPhong());

            if (sttm.executeUpdate() > 0) {
                System.out.println("Add Thanh Cong");
                return 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                conn.close();
                sttm.close();
            } catch (Exception e) {
            }
        }
        return -1;
    }
    public List<PhongBan> getAllPhongBan() {
        List<PhongBan> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "select * from PhongBan";
            conn = ConnectDatabase.openConnection();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                PhongBan tk = new PhongBan();
                tk.setMaPhongBan(rs.getString(1));
                tk.setTenPhongBan(rs.getString(2));
                tk.setTenTruongPhong(rs.getString(3));

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

    public PhongBan getPhongBanByID(String maNV) {
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        PhongBan tk = new PhongBan();
        try {
            String sSQL = "select * from PhongBan where MaPhong = ?";
            conn = ConnectDatabase.openConnection();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, maNV);
            rs = sttm.executeQuery();
            while (rs.next()) {
                tk.setMaPhongBan(rs.getString(1));
                tk.setTenPhongBan(rs.getString(2));
                tk.setTenTruongPhong(rs.getString(3));
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

    public int updatePhongBanByID(PhongBan tk) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "update PhongBan set TenPhong = ?, TenTruongPhong = ? where MaPhong = ?";

            conn = ConnectDatabase.openConnection();
            sttm = conn.prepareStatement(sSQL);
            
            sttm.setString(3, tk.getMaPhongBan());
            sttm.setString(1, tk.getTenPhongBan());
            sttm.setString(2, tk.getTenTruongPhong());

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
    public int delPhongBanByID(String maPB) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "delete PhongBan where MaPhong = ?";
            conn = ConnectDatabase.openConnection();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, maPB);
            
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
    
    public PhongBan getOnePhongBanByMaBL(String maPB) {
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        PhongBan g = new PhongBan();
        try {
            String sSQL = "SELECT * from PhongBan where MaPhong = ?";
            conn = ConnectDatabase.openConnection();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, maPB);
            rs = sttm.executeQuery();
            while (rs.next()) {
                g.setMaPhongBan(rs.getString(1));
                g.setTenPhongBan(rs.getString(2));
                g.setTenTruongPhong(rs.getString(3));

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
