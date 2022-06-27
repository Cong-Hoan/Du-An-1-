
package UserInterFace;

import Helper.ShareHelper;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.Timer;

public class MainForm extends javax.swing.JFrame {
    public MainForm() {
        initComponents();
        init();
           
    }
    
        void init() {
            
         new ManHinhChaoJDialog(this, true).setVisible(true);
         //new DangNhapJDialog(this, true).setVisible(true);
        setIconImage(ShareHelper.APP_ICON); //đặt icon góc trên trái
        setLocationRelativeTo(null);    //cho ra giữa màn hình
        setExtendedState(JFrame.MAXIMIZED_BOTH);    //cho toàn màn hình


        new Timer(1000, new ActionListener() {
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");

            public void actionPerformed(ActionEvent e) {
                lblDongHo.setText(sdf.format(new Date()));
            }
        }).start();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnQLTaiKhoan = new javax.swing.JButton();
        btnQLNhanVien = new javax.swing.JButton();
        btnQLLuong = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnHuongDan = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblDongHo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuPhongBan = new javax.swing.JMenuItem();
        mnuBacLuong = new javax.swing.JMenuItem();
        mnuTienThuong = new javax.swing.JMenuItem();
        mnuPhuCap = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ LƯƠNG NHÂN VIÊN");

        jToolBar1.setRollover(true);

        btnQLTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Clien list.png"))); // NOI18N
        btnQLTaiKhoan.setText("Quản lý tài khoản");
        btnQLTaiKhoan.setFocusable(false);
        btnQLTaiKhoan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLTaiKhoan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLTaiKhoanActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQLTaiKhoan);

        btnQLNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/User group.png"))); // NOI18N
        btnQLNhanVien.setText("Quản lý nhân viên");
        btnQLNhanVien.setFocusable(false);
        btnQLNhanVien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLNhanVien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLNhanVienActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQLNhanVien);

        btnQLLuong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Lists.png"))); // NOI18N
        btnQLLuong.setText("Quản lý lương");
        btnQLLuong.setFocusable(false);
        btnQLLuong.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLLuong.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLLuongActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQLLuong);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Best.png"))); // NOI18N
        jButton1.setText("Thống kê");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);
        jToolBar1.add(jSeparator1);

        btnHuongDan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Globe.png"))); // NOI18N
        btnHuongDan.setText("Hướng dẫn");
        btnHuongDan.setFocusable(false);
        btnHuongDan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHuongDan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnHuongDan);

        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Log out.png"))); // NOI18N
        btnDangXuat.setText("Đăng Xuất");
        btnDangXuat.setFocusable(false);
        btnDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnDangXuat);

        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Exit button.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.setFocusable(false);
        btnThoat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThoat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnThoat);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 521, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Info.png"))); // NOI18N
        jLabel1.setText("Hệ thống quản lý lương");

        lblDongHo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Alarm.png"))); // NOI18N
        lblDongHo.setText("10:55 PM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDongHo)
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(lblDongHo))
        );

        jMenu1.setText("Hệ thống");

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Login.png"))); // NOI18N
        jMenuItem9.setText("Đăng nhập");
        jMenu1.add(jMenuItem9);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Log out.png"))); // NOI18N
        jMenuItem7.setText("Đăng xuất");
        jMenu1.add(jMenuItem7);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Exit button.png"))); // NOI18N
        jMenuItem8.setText("Thoát");
        jMenu1.add(jMenuItem8);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản lý");

        mnuPhongBan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Conference.png"))); // NOI18N
        mnuPhongBan.setText("Phòng ban");
        mnuPhongBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPhongBanActionPerformed(evt);
            }
        });
        jMenu2.add(mnuPhongBan);

        mnuBacLuong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Dollar.png"))); // NOI18N
        mnuBacLuong.setText("Cập nhật bậc lương");
        mnuBacLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBacLuongActionPerformed(evt);
            }
        });
        jMenu2.add(mnuBacLuong);

        mnuTienThuong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Dollar.png"))); // NOI18N
        mnuTienThuong.setText("Cập nhật lương cơ bản");
        mnuTienThuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTienThuongActionPerformed(evt);
            }
        });
        jMenu2.add(mnuTienThuong);

        mnuPhuCap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Dollar.png"))); // NOI18N
        mnuPhuCap.setText("Cập nhật phụ cấp");
        mnuPhuCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPhuCapActionPerformed(evt);
            }
        });
        jMenu2.add(mnuPhuCap);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Thống kê");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Statistics.png"))); // NOI18N
        jMenuItem2.setText("Thống kê lương");
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Giới thiệu");

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Info.png"))); // NOI18N
        jMenuItem5.setText("Giới thiệu");
        jMenu4.add(jMenuItem5);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Hướng dẫn");

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Globe.png"))); // NOI18N
        jMenuItem6.setText("Hướng dẫn");
        jMenu5.add(jMenuItem6);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 928, Short.MAX_VALUE)
            .addComponent(jDesktopPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void openX(JInternalFrame x) {
        for (JInternalFrame frmChild : jDesktopPane1.getAllFrames()) {
            frmChild.dispose();
        }

        x.setLocation(this.getWidth() / 2 - x.getWidth() / 2,
                (this.getHeight() - 20) / 2 - x.getHeight() / 2 - 60);
        jDesktopPane1.add(x);
        x.setVisible(true);
    }
    
    void openQLTaiKhoan() {
        QuanLyTaiKhoanJInternal QLTaiKhoan = new QuanLyTaiKhoanJInternal();
            openX(QLTaiKhoan);
    }
    private void btnQLTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLTaiKhoanActionPerformed
        openQLTaiKhoan();
    }//GEN-LAST:event_btnQLTaiKhoanActionPerformed

    void openQLNhanVien() {
        QuanLyNhanVienJInternal QLNhanVien = new QuanLyNhanVienJInternal();
            openX(QLNhanVien);
    }
    
    private void btnQLNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLNhanVienActionPerformed
        openQLNhanVien();
    }//GEN-LAST:event_btnQLNhanVienActionPerformed

    void openQLLuong() {
        QuanLyLuongJInternal QLLuong = new QuanLyLuongJInternal();
            openX(QLLuong);
    }
    
    private void btnQLLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLLuongActionPerformed
        openQLLuong();
    }//GEN-LAST:event_btnQLLuongActionPerformed

    void openThongKe() {
        ThongKeJInternal thongKeJInternal = new ThongKeJInternal();
            openX(thongKeJInternal);
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        openThongKe();
    }//GEN-LAST:event_jButton1ActionPerformed

    void openBacLuong() {
        BacLuongJInternal bacLuongJInternal = new BacLuongJInternal();
            openX(bacLuongJInternal);
    }
    
    private void mnuBacLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBacLuongActionPerformed
        openBacLuong();
    }//GEN-LAST:event_mnuBacLuongActionPerformed

    void openTienThuong() {
        LuongCoBanJInternal tienThuongJInternal = new LuongCoBanJInternal();
            openX(tienThuongJInternal);
    }
    
    private void mnuTienThuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTienThuongActionPerformed
        openTienThuong();
    }//GEN-LAST:event_mnuTienThuongActionPerformed

    void openPhuCap() {
        PhuCapJInternal phuCapJInternal = new PhuCapJInternal();
            openX(phuCapJInternal);
    }
    
    private void mnuPhuCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPhuCapActionPerformed
        openPhuCap();
    }//GEN-LAST:event_mnuPhuCapActionPerformed

    void openPhongBan() {
        PhongBanJInternal phongbanJInternal = new PhongBanJInternal();
            openX(phongbanJInternal);
    }
    private void mnuPhongBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPhongBanActionPerformed
        openPhongBan();
    }//GEN-LAST:event_mnuPhongBanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnHuongDan;
    private javax.swing.JButton btnQLLuong;
    private javax.swing.JButton btnQLNhanVien;
    private javax.swing.JButton btnQLTaiKhoan;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JMenuItem mnuBacLuong;
    private javax.swing.JMenuItem mnuPhongBan;
    private javax.swing.JMenuItem mnuPhuCap;
    private javax.swing.JMenuItem mnuTienThuong;
    // End of variables declaration//GEN-END:variables
}
