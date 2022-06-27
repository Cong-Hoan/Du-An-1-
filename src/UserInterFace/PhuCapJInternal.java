/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterFace;

import DAO.PhuCapDAO;
import Helper.MsgBox;
import Model.BacLuong;
import Model.PhuCap;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class PhuCapJInternal extends javax.swing.JInternalFrame {

    /**
     * Creates new form PhuCapJInternal
     */
    public PhuCapJInternal() {
        initComponents();
        fillToTable();
    }
    
    PhuCapDAO dao = new PhuCapDAO();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtMaPhuCap = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTienPhuCap = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPhuCap = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("THÔNG TIN PHỤ CẤP");

        jLabel1.setText("Mã phụ cấp:");

        jLabel2.setText("Tiền phụ cấp:");

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

        tblPhuCap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã phụ cấp", "Tiền phụ cấp"
            }
        ));
        tblPhuCap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhuCapMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPhuCap);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTienPhuCap, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                    .addComponent(txtMaPhuCap))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnThem)
                .addGap(36, 36, 36)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
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
                    .addComponent(txtMaPhuCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTienPhuCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        DefaultTableModel model = (DefaultTableModel) tblPhuCap.getModel();
        model.setRowCount(0);//clear table
        try {
            for (PhuCap tk : dao.getAllPhuCap()) {
                Object rowData[] = new Object[2];
                rowData[0] = tk.getMaPhuCap();
                rowData[1] = tk.getPhuCap();
                model.addRow(rowData);
            }
        } catch (Exception e) {
            
        }
    }
    
    public boolean ValidateForm() {
        if (txtMaPhuCap.getText().isEmpty() || txtTienPhuCap.getText().isEmpty()) {
            //JOptionPane.showMessageDialog(this, "Chưa nhập đầy đủ thông tin");
            return false;
        }
        return true;
    }
    
    public PhuCap getModel() throws ParseException {
        PhuCap tk = new PhuCap();
        tk.setMaPhuCap(txtMaPhuCap.getText());
        tk.setPhuCap((Float.valueOf(txtTienPhuCap.getText())));


        return tk;
    }
    
        public void setModel(PhuCap tk) {
        txtMaPhuCap.setText(tk.getMaPhuCap());
        txtTienPhuCap.setText((String.valueOf(tk.getPhuCap())));
        }
    
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if (ValidateForm()) {
            try {
                PhuCap sv = getModel();
                if (dao.add(sv) > 0) {
                    MsgBox.alert(this, "Thêm thành công!");
                    fillToTable();
                }
            } catch (Exception e) {
                MsgBox.alert(this, "Phụ cấp đã tồn tại");
            }
        } else {
            MsgBox.alert(this, "Bạn chưa nhập đầy đủ thông tin");
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if (ValidateForm()) {
            try {
                PhuCap tk = getModel();
                if (dao.updatePhuCapByID(tk) > 0) {
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
       if (txtMaPhuCap.getText().isEmpty()) {
            MsgBox.alert(this, "Bạn chưa nhập mã phụ cấp để xóa!");
        } else {
                if(MsgBox.confirm(this, "Bạn chắc chắn muốn xóa!")){
                    if (dao.delPhuCapByID(txtMaPhuCap.getText()) > 0) {
                    JOptionPane.showMessageDialog(this, "Xóa thành công");
                fillToTable();
                reset();
                }else {
                MsgBox.alert(this, "Sai mã phụ cấp!");
            }
            } 
        }
    }//GEN-LAST:event_btnXoaActionPerformed
public void reset() {
        txtMaPhuCap.setText("");
        txtTienPhuCap.setText("");
    }
    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        reset();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void tblPhuCapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhuCapMouseClicked
         try {
            int id = tblPhuCap.rowAtPoint(evt.getPoint());
            String maPC = tblPhuCap.getValueAt(id, 0).toString();
            PhuCap tk = dao.getPhuCapByID(maPC);
            setModel(tk);
        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "Error: MouseClick"+e.getMessage());
//            e.printStackTrace();
        }
    }//GEN-LAST:event_tblPhuCapMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPhuCap;
    private javax.swing.JTextField txtMaPhuCap;
    private javax.swing.JTextField txtTienPhuCap;
    // End of variables declaration//GEN-END:variables
}
