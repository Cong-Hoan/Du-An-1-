/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Helper.DatabaseManager;
import Helper.Xjdbc;
import Model.NhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author USER
 */
public class NhanVienDAO {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    public boolean insert(NhanVien ns) throws Exception {
        String sql = "INSERT INTO NhanVien(maNV, tenNV, ngaySinh, gioiTinh, diaChi, trinhDo, maPhong, chucVu) "
                + " VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        try (
                Connection con = DatabaseManager.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, ns.getMaNV());
            
            pstmt.setString(2, ns.getTenNV());
            
            pstmt.setString(3, ns.getNgaySinh());
            pstmt.setInt(4, ns.getGioiTinh());
            pstmt.setString(5, ns.getDiaChi());
            pstmt.setString(6, ns.getTrinhDo());
            pstmt.setString(7, ns.getMaPhong());
            
            pstmt.setString(8, ns.getChucVu());
            
           
            
            return pstmt.executeUpdate() > 0;
        }
    }
    public List<NhanVien> selectAll() {
        String sql="SELECT * FROM NhanVien";
        return this.selectBySql(sql);
    }
     protected List<NhanVien> selectBySql(String sql, Object...args){
        List<NhanVien> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = Xjdbc.query(sql, args);
                while(rs.next()){
                    NhanVien entity=new NhanVien();
                    entity.setMaNV(rs.getString("MaNV"));
                    entity.setMaPhong(rs.getString("MaPhong"));
                    entity.setDiaChi(rs.getString("DiaChi"));
                    entity.setGioiTinh(rs.getInt("GioiTinh"));
                    entity.setChucVu(rs.getString("ChucVu"));
                    entity.setTrinhDo(rs.getString("TrinhDo"));
                    entity.setTenNV(rs.getString("Tennv"));
                    entity.setNgaySinh(rs.getString("ngaySinh"));
                    
                    list.add(entity);
                }
            }
            finally{
                rs.getStatement().getConnection().close();
            }
        } 
        catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
        }
    public List<NhanVien> getAllNhanVien() {
        List<NhanVien> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "select * from NhanVien";
            conn = DatabaseManager.openConnection();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString(1));
                nv.setTenNV(rs.getString(2));
                nv.setNgaySinh(rs.getString(3));
                nv.setGioiTinh(rs.getInt(4));
                nv.setDiaChi(rs.getString(5));
                nv.setTrinhDo(rs.getString(6));
                nv.setMaPhong(rs.getString(7));
                nv.setChucVu(rs.getString(8));
                

                ls.add(nv);
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
    public NhanVien findById (String maNV) throws Exception{
        String sql = "select * from NhanVien where manv = ?";
        try (
            Connection con = DatabaseManager.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
                ){
            pstmt.setString(1, maNV);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                NhanVien stud = new NhanVien();
                stud.setMaNV(rs.getString("MaNV"));
                stud.setTenNV(rs.getString("TenNV"));
                stud.setGioiTinh(rs.getInt("gioitinh"));
                stud.setNgaySinh(rs.getString("ngaySinh"));
                stud.setDiaChi(rs.getString("diachi"));
                stud.setTrinhDo(rs.getString("trinhdo"));
                stud.setMaPhong(rs.getString("maPhong"));
                stud.setChucVu(rs.getString("chucvu"));
                
                return stud;
            }
            return null;
        }
    }
    public boolean update (NhanVien stud) throws Exception{
        String sql = "update NhanVien set tenNV = ?, ngaySinh = ?, gioiTinh = ?, diachi = ?, trinhdo = ?, maphong = ?, chucvu = ?"
                +" where manv = ?";
        try (
            Connection con = DatabaseManager.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
                ){
            pstmt.setString(8, stud.getMaNV());
            pstmt.setString(1, stud.getTenNV());
            pstmt.setString(2, stud.getNgaySinh());
            pstmt.setInt(3, stud.getGioiTinh());
            pstmt.setString(4, stud.getDiaChi());
            pstmt.setString(5, stud.getTrinhDo());
            pstmt.setString(6, stud.getMaPhong());
            pstmt.setString(7, stud.getChucVu());
       
            return pstmt.executeUpdate() > 0;
        }
    }
    public boolean delete (String maNV) throws Exception{
        String sql = "delete from NhanVien where manv = ?";
        try (
            Connection con = DatabaseManager.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
                ){
            pstmt.setString(1, maNV);
            return pstmt.executeUpdate() > 0;
        }
    }
}

