package DAO;


import Helper.DatabaseManager;
import Model.TaiKhoan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class TaiKhoanDAO {

    public static List<TaiKhoan> ls = new ArrayList<>();


    public int add(TaiKhoan tk) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "insert into TaiKhoan(MaNV, TenTaiKhoan, MatKhau, VaiTro)"
                    + " values (?, ?, ?, ?)";
            conn = DatabaseManager.openConnection();
            sttm = conn.prepareStatement(sSQL);
            
            sttm.setString(1, tk.getMaNV());
            sttm.setString(2, tk.getTenTaiKhoan());
            sttm.setString(3, tk.getMatKhau());
            sttm.setInt(4, tk.getVaiTro());

            if (sttm.executeUpdate() > 0) {
                System.out.println("Add Thanh Cong");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error: Add"+e.getMessage());
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
    public List<TaiKhoan> getAllTaiKhoan() {
        List<TaiKhoan> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "select * from TaiKhoan";
            conn = DatabaseManager.openConnection();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                TaiKhoan tk = new TaiKhoan();
                tk.setMaNV(rs.getString(1));
                tk.setTenTaiKhoan(rs.getString(2));
                tk.setMatKhau(rs.getString(3));
                tk.setVaiTro(rs.getInt(4));

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

    public TaiKhoan getTaiKhoanByID(String maNV) {
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        TaiKhoan tk = new TaiKhoan();
        try {
            String sSQL = "select * from TaiKhoan where MaNV = ?";
            conn = DatabaseManager.openConnection();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, maNV);
            rs = sttm.executeQuery();
            while (rs.next()) {
                tk.setMaNV(rs.getString(1));
                tk.setTenTaiKhoan(rs.getString(2));
                tk.setMatKhau(rs.getString(3));
                tk.setVaiTro(rs.getInt(4));
                return tk;
            }
        } catch (Exception e) {
            System.out.println("Error: getTaiKhoanByID"+e.getMessage());
            e.printStackTrace();
        }finally {
            try {
                conn.close();
                sttm.close();
            } catch (Exception e) {
            }
    }
        return null;
    }

    public int updateTaiKhoanByID(TaiKhoan tk) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "update TaiKhoan set TenTaiKhoan = ?, MatKhau = ?,"
                    + " VaiTro = ? where MaNV = ?";

            conn = DatabaseManager.openConnection();
            sttm = conn.prepareStatement(sSQL);
            
            sttm.setString(4, tk.getMaNV());
            sttm.setString(1, tk.getTenTaiKhoan());
            sttm.setString(2, tk.getMatKhau());
            sttm.setInt(3, tk.getVaiTro());

            if (sttm.executeUpdate() > 0) {
                System.out.println("Update Thanh Cong");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error: Update"+e.getMessage());
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
    public int delTaiKhoanByID(String maNV) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "delete TaiKhoan where MaNV = ?";
            conn = DatabaseManager.openConnection();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, maNV);
            
            if (sttm.executeUpdate() > 0) {
                System.out.println("Xoa Thanh Cong");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error: Delete"+e.getMessage());
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
    
    public TaiKhoan getOneNhanVienByMaNV(String maNV) {
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        TaiKhoan g = new TaiKhoan();
        try {
            String sSQL = "SELECT * from TaiKhoan where MaNV = ?";
            conn = DatabaseManager.openConnection();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, maNV);
            rs = sttm.executeQuery();
            while (rs.next()) {
                g.setMaNV(rs.getString(1));
                g.setTenTaiKhoan(rs.getString(2));
                g.setMatKhau(rs.getString(3));
                g.setVaiTro(rs.getInt(4));
                return g;
            }
        } catch (Exception e) {
            System.out.println("Error: getNhanVienByID" + e.getMessage());
            e.printStackTrace();
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

