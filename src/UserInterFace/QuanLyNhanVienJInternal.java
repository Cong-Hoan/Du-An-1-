package UserInterFace;

import DAO.NhanVienDAO;
import DAO.PhongBanDAO;
import Helper.MsgBox;
import Model.NhanVien;
import Model.PhongBan;
import Model.PhuCap;
import Model.TaiKhoan;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class QuanLyNhanVienJInternal extends javax.swing.JInternalFrame {

    DefaultTableModel modelProducts;
    SimpleDateFormat date_format = new SimpleDateFormat("dd/MM/yyyy");

    public QuanLyNhanVienJInternal() {

        initComponents();
        setMaximizable(true);
        fillToTable();
        fillComboBoxPhongBan();
    }
    
    PhongBanDAO pbdao = new PhongBanDAO();
    
    void fillComboBoxPhongBan() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboMaPhong.getModel(); //kết nối model với cbo
        model.removeAllElements();   //xóa toàn bộ item của cbo
        try {
            List<PhongBan> list = pbdao.getAllPhongBan();
            for (PhongBan cd : list) {
                model.addElement(cd);    //thêm đối tượng (Object) vào model
                //chỉ thêm đc đối tượng đối với model, cbo chỉ được cbo.addItem(String);
                //lấy đối tượng thì từ cbo cũng được: cbo.getSelectedItem();
            }
            cboMaPhong.setSelectedIndex(0);
        } catch (Exception e) {
            //e.printStackTrace();
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    public void fillToTable() {
        DefaultTableModel model = (DefaultTableModel) tblNhanVien.getModel();
        model.setRowCount(0);//clear table
        try {
            for (NhanVien nv : dao.getAllNhanVien()) {
                Object rowData[] = new Object[8];
                rowData[0] = nv.getMaNV();
                rowData[1] = nv.getTenNV();
                rowData[2] = nv.getNgaySinh();
                rowData[3] = nv.getGioiTinh();
                rowData[4] = nv.getDiaChi();
                rowData[5] = nv.getTrinhDo();
                rowData[6] = nv.getMaPhong();
                rowData[7] = nv.getChucVu();

                model.addRow(rowData);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public void reset() {
        txtMa.setText("");
        txtTen.setText("");
        txtNgaySinh.setText("");

        txtDiaChi.setText("");
        txtTrinhDo.setText("");

        cboChucVu.setToolTipText("");
        cboMaPhong.setToolTipText("");
    }

    public NhanVien getModel() throws ParseException {
        NhanVien ns = new NhanVien();
        ns.setMaNV(txtMa.getText());
        ns.setTenNV(txtTen.getText());
        ns.setNgaySinh(txtNgaySinh.getText());
        ns.setDiaChi(txtDiaChi.getText());
        ns.setTrinhDo(txtTrinhDo.getText());
        ns.setGioiTinh(rdoNam.isSelected() ? 1 : 0);
        ns.setChucVu((String) cboChucVu.getSelectedItem());
        ns.setMaPhong((String) cboMaPhong.getSelectedItem());
        return ns;
    }

    public void setModel(NhanVien ns) {
        txtMa.setText(ns.getMaNV());
        txtTen.setText(ns.getTenNV());
        txtNgaySinh.setText(ns.getNgaySinh().toString());
        txtTrinhDo.setText(ns.getTrinhDo());

        cboMaPhong.setSelectedItem(ns.getMaPhong());
        cboChucVu.setSelectedItem(ns.getChucVu());
        rdoNam.setSelected(ns.getGioiTinh() == 1);
        rdoNu.setSelected(ns.getGioiTinh() == 0);
        txtDiaChi.setText(ns.getDiaChi());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        btnSeach = new javax.swing.JButton();
        txtTen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNgaySinh = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboMaPhong = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDiaChi = new javax.swing.JTextArea();
        txtTrinhDo = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        cboChucVu = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("QUẢN LÝ NHÂN VIÊN");
        setToolTipText("");

        jLabel1.setText("Mã nhân viên:");

        btnSeach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Search.png"))); // NOI18N
        btnSeach.setText("Tìm kiếm");
        btnSeach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeachActionPerformed(evt);
            }
        });

        jLabel3.setText("Họ và tên:");

        jLabel4.setText("Ngày sinh:");

        jLabel5.setText("Giới tính:");

        buttonGroup2.add(rdoNam);
        rdoNam.setText("Nam ");

        buttonGroup2.add(rdoNu);
        rdoNu.setText("Nữ");

        jLabel6.setText("Địa chỉ:");

        jLabel7.setText("Trình độ:");

        jLabel2.setText("Mã phòng:");

        cboMaPhong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MP01", "MP02", "MP03", "MP04" }));
        cboMaPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMaPhongActionPerformed(evt);
            }
        });

        jLabel8.setText("Chức vụ:");

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Edit.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Delete.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Document.png"))); // NOI18N
        btnThoat.setText("Mới");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        txtDiaChi.setColumns(20);
        txtDiaChi.setRows(5);
        jScrollPane2.setViewportView(txtDiaChi);

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Nhân Viên", "Tên Nhân Viên", "Ngày Sinh", "Giới Tính", "Địa Chỉ", "Trình độ", "Mã Phòng", "Chức Vụ"
            }
        ));
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblNhanVien);

        cboChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhân Viên", "Trưởng Phòng", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNgaySinh)
                                .addGap(81, 81, 81))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cboChucVu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(35, 35, 35)
                                .addComponent(txtTen))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel5)
                                .addGap(81, 81, 81)
                                .addComponent(rdoNam)
                                .addGap(69, 69, 69)
                                .addComponent(rdoNu))
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(59, 59, 59)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(49, 49, 49)
                                .addComponent(txtTrinhDo, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(165, 165, 165))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(cboMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSeach)
                        .addGap(39, 39, 39))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(cboMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnSeach)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtTrinhDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cboChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rdoNam)
                    .addComponent(rdoNu))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThoat)
                        .addComponent(btnXoa)
                        .addComponent(btnSua)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeachActionPerformed
        if (txtMa.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập mã nhân viên");
            return;
        }
        try {
            NhanVienDAO dao = new NhanVienDAO();
            NhanVien ns = dao.findById(txtMa.getText());

            if (ns != null) {
                txtMa.setText(ns.getMaNV());
                txtTen.setText(ns.getTenNV());
                txtNgaySinh.setText(ns.getNgaySinh().toString());
                txtTrinhDo.setText(ns.getTrinhDo());
                txtDiaChi.setText(ns.getDiaChi());
                cboMaPhong.setSelectedItem(ns.getMaPhong());
                cboChucVu.setSelectedItem(ns.getChucVu());
                rdoNam.setSelected(ns.getGioiTinh() == 1);
                rdoNu.setSelected(ns.getGioiTinh() == 0);

            } else {
                JOptionPane.showMessageDialog(this, "Nhân viên không tìm thấy");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSeachActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        StringBuilder sb = new StringBuilder();
        if (txtMa.getText().equals("")) {
            sb.append("Mã nhân viên không được để trống!\n");
            txtMa.setBackground(Color.red);
        } else {
            txtMa.setBackground(Color.white);
        }
        if (txtTen.getText().equals("")) {
            sb.append("Tên không được để trống!\n");
            txtTen.setBackground(Color.red);
        } else {
            txtTen.setBackground(Color.white);
        }
         if (txtTrinhDo.getText().equals("")) {
            sb.append("Trình độ không được để trống!\n");
            txtTrinhDo.setBackground(Color.red);
        } else {
            txtTrinhDo.setBackground(Color.white);
        }
         if (txtDiaChi.getText().equals("")) {
            sb.append("Địa Chỉ không được để trống!\n");
            txtDiaChi.setBackground(Color.red);
        } else {
            txtDiaChi.setBackground(Color.white);
        }
         SimpleDateFormat sdf = new SimpleDateFormat();
         sdf.applyPattern("dd-MM-yyyy");
         try {
            Date dob = sdf.parse(txtNgaySinh.getText());
            txtNgaySinh.setBackground(Color.white);
        } catch (Exception e) {
            txtNgaySinh.setBackground(Color.red);
            sb.append("Ngày Sinh không đúng định dạng (dd-MM-yyyy)");
            
        }
         

        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb);
            return;
        }
        if (JOptionPane.showConfirmDialog(this, "Bạn có muốn thêm nhân viên mới không?") == JOptionPane.NO_OPTION) {
            return;
        }

        try {
            NhanVien ns = new NhanVien();
            ns.setMaNV(txtMa.getText());
            ns.setTenNV(txtTen.getText());
            ns.setNgaySinh(txtNgaySinh.getText());
            ns.setDiaChi(txtDiaChi.getText());
            ns.setTrinhDo(txtTrinhDo.getText());
            ns.setGioiTinh(rdoNam.isSelected() ? 1 : 0);
            ns.setChucVu((String) cboChucVu.getSelectedItem());
//            ns.setMaPhong((String) cboMaPhong.getSelectedItem());
        PhongBan PhongBan = (PhongBan) cboMaPhong.getSelectedItem();
        ns.setMaPhong(PhongBan.getMaPhongBan());

            NhanVienDAO dao = new NhanVienDAO();
            dao.insert(ns);
            JOptionPane.showMessageDialog(this, "Thêm thành công vào CSDL!");
            fillToTable();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Thêm thất bại, mã nhân viên đã tồn tại trong CSDL");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        StringBuilder sb = new StringBuilder();
        if (txtMa.getText().equals("")) {
            sb.append("Mã nhân viên không được để trống!\n");
            txtMa.setBackground(Color.red);
        } else {
            txtMa.setBackground(Color.white);
        }
        if (txtTen.getText().equals("")) {
            sb.append("Tên không được để trống!\n");
            txtTen.setBackground(Color.red);
        } else {
            txtTen.setBackground(Color.white);
        }
         if (txtTrinhDo.getText().equals("")) {
            sb.append("Trình độ không được để trống!\n");
            txtTrinhDo.setBackground(Color.red);
        } else {
            txtTrinhDo.setBackground(Color.white);
        }
         if (txtDiaChi.getText().equals("")) {
            sb.append("Địa Chỉ không được để trống!\n");
            txtDiaChi.setBackground(Color.red);
        } else {
            txtDiaChi.setBackground(Color.white);
        }
         SimpleDateFormat sdf = new SimpleDateFormat();
         sdf.applyPattern("dd-MM-yyyy");
         try {
            Date dob = sdf.parse(txtNgaySinh.getText());
            txtNgaySinh.setBackground(Color.white);
        } catch (Exception e) {
            txtNgaySinh.setBackground(Color.red);
            sb.append("Ngày Sinh không đúng định dạng (dd-MM-yyyy)");
            
        }
         if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb);
            return;
        }
        if (JOptionPane.showConfirmDialog(this, "Bạn có muốn sửa nhân viên mới không?") == JOptionPane.NO_OPTION) {
            return;
        }
         
        try {
            NhanVien ns = new NhanVien();
            ns.setMaNV(txtMa.getText());
            ns.setTenNV(txtTen.getText());
            ns.setDiaChi(txtDiaChi.getText());
            ns.setNgaySinh(txtNgaySinh.getText());
            ns.setMaPhong((String) cboMaPhong.getSelectedItem());
            ns.setTrinhDo(txtTrinhDo.getText());
            ns.setChucVu((String) cboChucVu.getSelectedItem());
            ns.setGioiTinh(rdoNam.isSelected() ? 1 : 0);

            NhanVienDAO dao = new NhanVienDAO();
            dao.update(ns);
            JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
            fillToTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        StringBuilder sb = new StringBuilder();
        if (txtMa.getText().equals("")) {
            sb.append("Mã nhân viên không được để trống!");
            txtMa.setBackground(Color.red);
        } else {
            txtMa.setBackground(Color.white);
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb);
            return;
        }
        if (JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa nhân viên không?") == JOptionPane.NO_OPTION) {
            return;
        }
        try {
            NhanVienDAO dao = new NhanVienDAO();
            dao.delete(txtMa.getText());
            JOptionPane.showMessageDialog(this, "Xóa thành công!");

            fillToTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnXoaActionPerformed
    NhanVienDAO dao = new NhanVienDAO();

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        this.reset();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        try {
            int id = tblNhanVien.rowAtPoint(evt.getPoint());
            String manv = tblNhanVien.getValueAt(id, 0).toString();
            NhanVien nv = dao.findById(manv);
            setModel(nv);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: MouseClick" + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_tblNhanVienMouseClicked

    private void cboMaPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMaPhongActionPerformed

    }//GEN-LAST:event_cboMaPhongActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSeach;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cboChucVu;
    private javax.swing.JComboBox<String> cboMaPhong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextArea txtDiaChi;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTrinhDo;
    // End of variables declaration//GEN-END:variables
}
