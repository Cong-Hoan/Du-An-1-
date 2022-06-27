
package DAO;

import Helper.ConnectDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class LoginDAO {
    
//    public TaiKhoan getUserByID(String username) {
//        Connection con = null;
//        PreparedStatement sttm = null;
//        ResultSet rs = null;
//        TaiKhoan tk = new TaiKhoan();
//        try {
//            String sSQL = "select * from TaiKhoan where TenTaiKhoan = ?";
//            con = ConnectDatabase.openConnection();
//            sttm = con.prepareStatement(sSQL);
//            sttm.setString(1, username);
//            rs = sttm.executeQuery();
//            while (rs.next()) {
//                tk.setMaNV(rs.getString(1));
//                tk.setTenTaiKhoan(rs.getString(2));
//                tk.setMatKhau(rs.getString(3));
//                tk.setVaiTro(rs.getString(4));
//                return tk;
//            }
//        } catch (Exception e) {
//            System.out.println("Error getUserByID"+e.getMessage());
//            e.printStackTrace();
//        }finally{
//            try {
//                con.close();
//                rs.close();
//                sttm.close();
//            } catch (Exception e) {
//                System.out.println("Error: finally" + e.toString());
//                e.printStackTrace();     
//        }   
//    }
//        return null;
//    }
//    
//    public boolean checkLogin(String username, String pass) {
//            TaiKhoan uuser = getUserByID(username);
//            if (uuser != null) {
//                if (uuser.getMatKhau().equals(pass)) {
//                    return true;
//                }
//            }
//        return false;
//    }
    
}
