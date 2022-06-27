package Helper;

import Model.NhanVien;
import Model.TaiKhoan;


public class Auth {
    public static TaiKhoan user = null;//chua login
    public static void clear() {//logout
        Auth.user = null;
    }
    public static boolean isLogin() {//checklogin
        return Auth.user != null;
    }
//    public static boolean isManager() {//checktruongphong
//        return Auth.isLogin()&& user.getVaiTro();
//    }
}
