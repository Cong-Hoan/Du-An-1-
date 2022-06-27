/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterFace;

import DAO.LuongCoBanDAO;
import Helper.MsgBox;
import Model.LuongCoBan;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class LuongCoBanJInternal extends javax.swing.JInternalFrame {

    /**
     * Creates new form TienThuongJInternal
     */
    public LuongCoBanJInternal() {
        initComponents();
        fillToTable();
    }

    LuongCoBanDAO dao = new LuongCoBanDAO();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaLCB = new javax.swing.JTextField();
        txtLuongCoBan = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLuongCoBan = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("THÔNG TIN LƯƠNG CƠ BẢN");

        jLabel1.setText("Mã lương cơ bản:");

        jLabel2.setText("Lương cơ bản");

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

        btnMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Document.png"))); // NOI18N
        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        tblLuongCoBan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã lương cơ bản", "Lương cơ bản"
            }
        ));
        tblLuongCoBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLuongCoBanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLuongCoBan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaLCB, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                            .addComponent(txtLuongCoBan))
                        .addContainerGap(83, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addGap(28, 28, 28)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaLCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtLuongCoBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMoi)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnThem))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void fillToTable() {
        DefaultTableModel model = (DefaultTableModel) tblLuongCoBan.getModel();
        model.setRowCount(0);//clear table
        try {
            for (LuongCoBan tk : dao.getAllLuongCoBan()) {
                Object rowData[] = new Object[2];
                rowData[0] = tk.getMaLuongCoBan();
                rowData[1] = tk.getLuongCoBan();
                model.addRow(rowData);
            }
        } catch (Exception e) {

        }
    }

    public boolean ValidateForm() {
        if (txtMaLCB.getText().isEmpty() || txtLuongCoBan.getText().isEmpty()) {
            //JOptionPane.showMessageDialog(this, "Chưa nhập đầy đủ thông tin");
            return false;
        }
        return true;
    }

    public LuongCoBan getModel() throws ParseException {
        LuongCoBan tk = new LuongCoBan();
        tk.setMaLuongCoBan(txtMaLCB.getText());
        tk.setLuongCoBan((Float.valueOf(txtLuongCoBan.getText())));

        return tk;
    }

    public void setModel(LuongCoBan tk) {
        txtMaLCB.setText(tk.getMaLuongCoBan());
        txtLuongCoBan.setText((String.valueOf(tk.getLuongCoBan())));
    }

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if (ValidateForm()) {
            try {
                LuongCoBan sv = getModel();
                if (dao.add(sv) > 0) {
                    MsgBox.alert(this, "Thêm thành công!");
                    fillToTable();
                }
            } catch (Exception e) {
                MsgBox.alert(this, "Lương đã tồn tại");
            }
        } else {
            MsgBox.alert(this, "Bạn chưa nhập đầy đủ thông tin");
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if (ValidateForm()) {
            try {
                LuongCoBan tk = getModel();
                if (dao.updateLuongCoBanByID(tk) > 0) {
                    MsgBox.alert(this, "Cập nhật thành công!");
                    fillToTable();
                }
            } catch (Exception e) {
            }
        } else {
            MsgBox.alert(this, "Bạn chưa nhập đầy đủ thông tin");
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        if (txtMaLCB.getText().isEmpty()) {
            MsgBox.alert(this, "Bạn chưa nhập mã lương để xóa!");
        } else {
            if (MsgBox.confirm(this, "Bạn chắc chắn muốn xóa!")) {
                if (dao.delLuongCoBanByID(txtMaLCB.getText()) > 0) {
                    JOptionPane.showMessageDialog(this, "Xóa thành công");
                    fillToTable();
                    reset();
                } else {
                    MsgBox.alert(this, "Sai mã lương!");
                }
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed
    public void reset() {
        txtMaLCB.setText("");
        txtLuongCoBan.setText("");
    }
    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        reset();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void tblLuongCoBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLuongCoBanMouseClicked
        try {
            int id = tblLuongCoBan.rowAtPoint(evt.getPoint());
            String malcb = tblLuongCoBan.getValueAt(id, 0).toString();
            LuongCoBan tk = dao.getLuongCoBanByID(malcb);
            setModel(tk);
        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "Error: MouseClick"+e.getMessage());
//            e.printStackTrace();
        }
    }//GEN-LAST:event_tblLuongCoBanMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLuongCoBan;
    private javax.swing.JTextField txtLuongCoBan;
    private javax.swing.JTextField txtMaLCB;
    // End of variables declaration//GEN-END:variables
}
