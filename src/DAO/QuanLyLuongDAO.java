package DAO;

import Helper.ConnectDatabase;
import Model.BacLuong;
import Model.Luong;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class QuanLyLuongDAO {
    
    public static List<Luong> ls = new ArrayList<>();


    public int add(Luong bl) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "insert into Luong(Nam, Thang, MaNV, TenNV, SoNgayLam, GioLamThem, MaBacLuong, MaThuong, MaPhuCap, TamUng, LuongCoBan ,ThucLinh)"
                    + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            conn = ConnectDatabase.openConnection();
            sttm = conn.prepareStatement(sSQL);
            
            sttm.setString(1, bl.getNam());
            sttm.setString(2, bl.getThang());
            sttm.setString(3, bl.getMaNV());
            sttm.setString(4, bl.getTenNV());
            sttm.setString(5, bl.getSoNgayLam());
            sttm.setString(6, bl.getGioLamThem());
            sttm.setString(7, bl.getBacLuong());
            sttm.setString(8, bl.getTienThuong());
            sttm.setString(9, bl.getPhuCap());
            sttm.setString(10, bl.getTamUng());
            sttm.setString(11, bl.getLuongCoBan());
            sttm.setString(12, bl.getThucLinh());

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
    public List<Luong> getAllLuong() {
        List<Luong> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "select * from Luong";
            conn = ConnectDatabase.openConnection();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                Luong tk = new Luong();
                tk.setNam(rs.getString(1));
                tk.setThang(rs.getString(2));
                tk.setMaNV(rs.getString(3));
                tk.setTenNV(rs.getString(4));
                tk.setSoNgayLam(rs.getString(5));
                tk.setGioLamThem(rs.getString(6));
                tk.setBacLuong(rs.getString(7));
                tk.setTienThuong(rs.getString(8));
                tk.setPhuCap(rs.getString(9));
                tk.setTamUng(rs.getString(10));
                tk.setLuongCoBan(rs.getString(11));
                tk.setThucLinh(rs.getString(12));
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

    public Luong getLuongByID(String maBL) {
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        Luong tk = new Luong();
        try {
            String sSQL = "select * from Luong where MaNV = ?";
            conn = ConnectDatabase.openConnection();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, maBL);
            rs = sttm.executeQuery();
            while (rs.next()) {
                tk.setNam(rs.getString(1));
                tk.setThang(rs.getString(2));
                tk.setMaNV(rs.getString(3));
                tk.setTenNV(rs.getString(4));
                tk.setSoNgayLam(rs.getString(5));
                tk.setGioLamThem(rs.getString(6));
                tk.setBacLuong(rs.getString(7));
                tk.setTienThuong(rs.getString(8));
                tk.setPhuCap(rs.getString(9));
                tk.setTamUng(rs.getString(10));
                tk.setLuongCoBan(rs.getString(11));
                tk.setThucLinh(rs.getString(12));
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

    public int updateLuongByID(Luong tk) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "update Luong set Nam = ?, Thang = ?, TenNV = ?, SoNgayLam = ?,"
                    + " GioLamThem = ?, MaBacLuong = ?, MaThuong = ?, MaPhuCap = ?, TamUng = ?, LuongCoBan = ? where MaNV = ?";

            conn = ConnectDatabase.openConnection();
            sttm = conn.prepareStatement(sSQL);
            
            sttm.setString(11, tk.getMaNV());
            sttm.setString(1, tk.getNam());
            sttm.setString(2, tk.getThang());
            sttm.setString(3, tk.getTenNV());
            sttm.setString(4, tk.getSoNgayLam());
            sttm.setString(5, tk.getGioLamThem());
            sttm.setString(6, tk.getBacLuong());
            sttm.setString(7, tk.getTienThuong());
            sttm.setString(8, tk.getPhuCap());
            sttm.setString(9, tk.getTamUng());
            sttm.setString(10, tk.getLuongCoBan());

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
    public int delLuongByID(String maBL) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "delete Luong where MaNV = ?";
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
    
//    public Luong getOneLuongByMaNV(String maNV) {
//        Connection conn = null;
//        PreparedStatement sttm = null;
//        ResultSet rs = null;
//        Luong g = new Luong();
//        try {
//            String sSQL = "SELECT * from Luong where MaNV = ?";
//            conn = ConnectDatabase.openConnection();
//            sttm = conn.prepareStatement(sSQL);
//            sttm.setString(1, maBL);
//            rs = sttm.executeQuery();
//            while (rs.next()) {
//                g.setMaBacLuong(rs.getString(1));
//                g.setBacLuong(rs.getFloat(2));
//                return g;
//            }
//        } catch (Exception e) {
//            System.out.println("Error: getNhanVienByID" + e.getMessage());
//            //e.printStackTrace();
//        } finally {
//            try {
//                conn.close();
//                sttm.close();
//            } catch (Exception e) {
//            }
//        }
//        return null;
//    }
    
}
