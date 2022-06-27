/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterFace;

import DAO.BacLuongDAO;
import Helper.MsgBox;
import Model.BacLuong;
import java.text.ParseException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class BacLuongJInternal extends javax.swing.JInternalFrame {

    /**
     * Creates new form BacLuongJInternalFrame
     */
    public BacLuongJInternal() {
        initComponents();
        fillToTable();
        //updateStatus();
    }

    BacLuongDAO dao = new BacLuongDAO();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtMaBacLuong = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtBacLuong = new javax.swing.JTextField();
        btnSua = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBacLuong = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("THÔNG TIN BẬC LƯƠNG");

        jLabel1.setText("Mã bậc lương:");

        jLabel2.setText("Bậc lương:");

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Edit.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
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

        tblBacLuong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã bậc lương", "Bậc lương"
            }
        ));
        tblBacLuong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBacLuongMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBacLuong);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaBacLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(txtBacLuong))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnThem)
                .addGap(28, 28, 28)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaBacLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBacLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMoi)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnThem))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void fillToTable() {
        DefaultTableModel model = (DefaultTableModel) tblBacLuong.getModel();
        model.setRowCount(0);//clear table
        try {
            for (BacLuong tk : dao.getAllBacLuong()) {
                Object rowData[] = new Object[2];
                rowData[0] = tk.getMaBacLuong();
                rowData[1] = tk.getBacLuong();
                model.addRow(rowData);
            }
        } catch (Exception e) {

        }
    }

    public boolean ValidateForm() {
        if (txtMaBacLuong.getText().isEmpty() || txtBacLuong.getText().isEmpty()) {
            //JOptionPane.showMessageDialog(this, "Chưa nhập đầy đủ thông tin");
            return false;
        }
        return true;
    }

    public BacLuong getModel() throws ParseException {
        BacLuong tk = new BacLuong();
        tk.setMaBacLuong(txtMaBacLuong.getText());
        tk.setBacLuong((Float.valueOf(txtBacLuong.getText())));

        return tk;
    }

    public void setModel(BacLuong tk) {
        txtMaBacLuong.setText(tk.getMaBacLuong());
        txtBacLuong.setText((String.valueOf(tk.getBacLuong())));
    }

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if (ValidateForm()) {
            try {
                BacLuong sv = getModel();
                if (dao.add(sv) > 0) {
                    MsgBox.alert(this, "Thêm thành công!");
                    fillToTable();
                }
            } catch (Exception e) {
                MsgBox.alert(this, "Bậc Lương đã tồn tại");
            }
        } else {
            MsgBox.alert(this, "Bạn chưa nhập đầy đủ thông tin");
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if (ValidateForm()) {
            try {
                BacLuong tk = getModel();
                if (dao.updateBacLuongByID(tk) > 0) {
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
        if (txtMaBacLuong.getText().isEmpty()) {
            MsgBox.alert(this, "Bạn chưa nhập mã bậc lương để xóa!");
        } else {
            if (MsgBox.confirm(this, "Bạn chắc chắn muốn xóa!")) {
                if (dao.delBacLuongByID(txtMaBacLuong.getText()) > 0) {
                    JOptionPane.showMessageDialog(this, "Xóa thành công");
                    fillToTable();
                    reset();
                } else {
                    MsgBox.alert(this, "Sai mã bậc lương!");
                }
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    public void reset() {
        txtMaBacLuong.setText("");
        txtBacLuong.setText("");
    }

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        reset();
    }//GEN-LAST:event_btnMoiActionPerformed
    int row = -1;
//    void updateStatus() {
//        String macd = (String) tblBacLuong.getValueAt(this.row, 0);
//        boolean edit = (this.row >= 0);
//        txtMaBacLuong.setEditable(!edit);
//        btnThem.setEnabled(!edit);
//        btnSua.setEnabled(edit);
//        btnXoa.setEnabled(edit);
//    }

    private void tblBacLuongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBacLuongMouseClicked
        try {
            int id = tblBacLuong.rowAtPoint(evt.getPoint());
            String mabl = tblBacLuong.getValueAt(id, 0).toString();
            BacLuong tk = dao.getBacLuongByID(mabl);
            setModel(tk);
        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "Error: MouseClick"+e.getMessage());
//            e.printStackTrace();
        }
    }//GEN-LAST:event_tblBacLuongMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBacLuong;
    private javax.swing.JTextField txtBacLuong;
    private javax.swing.JTextField txtMaBacLuong;
    // End of variables declaration//GEN-END:variables
}
