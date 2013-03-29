//Copyright (c) 2012, Provincial Department of Health Services, North western province, Sri Lanka
//All rights reserved.

package rmsd;


import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import mymod.dbconnector;
import mymod.voidmodule;

public class frmreceiptinsti extends javax.swing.JInternalFrame {

    public String user;

    public frmreceiptinsti() {
        initComponents();

        this.setuser(null);
        this.lablindicate("SELECT * from rcpttype ORDER BY rcptname");


    }

    void setuser(String suser) {
        user = suser;
        String a = voidmodule.readintitution(null);
        this.setTitle(a + "  - Invoice  -  User : " + user);
        voidmodule.fillcombo(cmbinscode, "SELECT DISTINCT rcptcode from rcpttype ORDER By rcptcode");
        voidmodule.fillcombo(cmbinsname, "SELECT DISTINCT rcptname from rcpttype ORDER By rcptname");
    }

    void lablindicate(String query) {

        String rcptname = null;
        Object rcptcode = null;
        int RC = 0;

    
        try {


            DefaultTableModel addabl = (DefaultTableModel) tblRinsti.getModel();
            while (tblRinsti.getRowCount() > 0) {
                addabl.removeRow(0);
            }


            Statement rss = dbconnector.conn().createStatement();
            ResultSet rs = rss.executeQuery(query);
            while (rs.next()) {
                rcptname = rs.getString("rcptname");
                rcptcode = rs.getString("rcptcode");


                addabl.addRow(new Object[]{rcptname, rcptcode});
                RC++;
            }
            lblwh.setText("" + RC);
            cmbinscode.setSelectedItem(rcptcode);
            cmbinsname.setSelectedItem(rcptname);



        } catch (SQLException ex) {
            Logger.getLogger(frmStock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        btnsave = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        optremove = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        lblwh = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRinsti = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbinscode = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cmbinsname = new javax.swing.JComboBox();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save.jpg"))); // NOI18N
        btnsave.setText("Save");
        btnsave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit.jpg"))); // NOI18N
        btnexit.setText("Exit");
        btnexit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        optremove.setText("Remove Item");
        optremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optremoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(optremove, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addGap(59, 59, 59)
                .addComponent(btnsave, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnexit, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnsave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnexit))
                    .addComponent(optremove))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Number of Institution :");

        lblwh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblwh.setText("wh");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tblRinsti.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Receiving Institution", "Code"
            }
        ));
        tblRinsti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblRinstiMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblRinsti);
        tblRinsti.getColumnModel().getColumn(1).setMinWidth(0);
        tblRinsti.getColumnModel().getColumn(1).setPreferredWidth(100);
        tblRinsti.getColumnModel().getColumn(1).setMaxWidth(100);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Code");

        cmbinscode.setEditable(true);
        cmbinscode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbinscodeMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cmbinscodeMouseReleased(evt);
            }
        });
        cmbinscode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbinscodeActionPerformed(evt);
            }
        });
        cmbinscode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbinscodeFocusGained(evt);
            }
        });
        cmbinscode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbinscodeKeyPressed(evt);
            }
        });

        jLabel2.setText("Receiving Institution");

        cmbinsname.setEditable(true);
        cmbinsname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbinsnameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbinsname, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbinscode, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbinscode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbinsname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 438, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblwh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblwh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
     
        dbconnector.conn();


        Object rcptcode = cmbinscode.getSelectedItem();
        Object rcptname = cmbinsname.getSelectedItem();


        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String sysdate = df.format(date);

        try {
            if (optremove.isSelected() == true) {
                int i = MessageBox.yesno("Do You Want to Delete Item  " + rcptcode);
                if (i == 0) {
                    dbconnector.insertquery("DELETE FROM rcpttype WHERE rcptcode ='" + rcptcode + "'");
                    voidmodule.U_transaction(user, "Delete rcpttype   " + rcptcode);
                }
            } else {


               
                int Count =  voidmodule.RCount("SELECT rcptcode from rcpttype WHERE rcptcode ='" + rcptcode + "'");
                if (Count > 0) {
                    int i = MessageBox.yesno("Records Already Exited. Do You Want to Update Records…? ");
                    if (i == 0) {
                        dbconnector.insertquery("UPDATE rcpttype SET rcptname = '" + rcptname + "',user = '" + user + "',sysdate = '" + sysdate + "'WHERE rcptcode ='" + rcptcode + "'");
                        voidmodule.U_transaction(user, "Update Receiving Institution   " + rcptname);
                    } else {
                    }
                } else {


                    dbconnector.insertquery("INSERT INTO rcpttype VALUES ('" + rcptcode + "','" + rcptname + "','" + user + "','" + sysdate + "')");
                   voidmodule.U_transaction(user, "Add rcpttype   " + rcptcode);
                    JOptionPane.showMessageDialog(null, "Records Saved");

                }
            }
            this.lablindicate("SELECT * from rcpttype ORDER BY rcptname");

        } catch (SQLException ex) {
            Logger.getLogger(frmStock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    void addrcpttype(JComboBox rcpt, String query) {

        try {
            Statement rss = dbconnector.conn().createStatement();
            ResultSet rs = rss.executeQuery(query);
            Object rcptrsl = null;
            while (rs.next()) {
                rcptrsl = rs.getString(1);
            }
            if (rcptrsl == null) {
            } else {
                rcpt.setSelectedItem(rcptrsl);
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmgrn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        this.setVisible(false);
}//GEN-LAST:event_btnexitActionPerformed

    private void optremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optremoveActionPerformed
        btnsave.setText("Delete");
}//GEN-LAST:event_optremoveActionPerformed

    private void tblRinstiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRinstiMouseReleased
        int SelectedRow = tblRinsti.getSelectedRow();
        String rcptname = tblRinsti.getValueAt(SelectedRow, 0).toString();
        String rcptcode = tblRinsti.getValueAt(SelectedRow, 1).toString();
        cmbinscode.setSelectedItem(rcptcode);
        cmbinsname.setSelectedItem(rcptname);
        btnsave.setText("Update");
}//GEN-LAST:event_tblRinstiMouseReleased

    private void cmbinscodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbinscodeMouseClicked
        btnsave.setText("Save");
}//GEN-LAST:event_cmbinscodeMouseClicked

    private void cmbinscodeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbinscodeMouseReleased
        btnsave.setText("Save");
}//GEN-LAST:event_cmbinscodeMouseReleased

    private void cmbinscodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbinscodeActionPerformed
        btnsave.setText("Save");
        Object inscode = cmbinscode.getSelectedItem();
        this.addrcpttype(cmbinsname, "SELECT rcptname from rcpttype WHERE rcptcode ='" + inscode + "'");

}//GEN-LAST:event_cmbinscodeActionPerformed

    private void cmbinscodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbinscodeFocusGained
        btnsave.setText("Save");
}//GEN-LAST:event_cmbinscodeFocusGained

    private void cmbinscodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbinscodeKeyPressed
}//GEN-LAST:event_cmbinscodeKeyPressed

    private void cmbinsnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbinsnameActionPerformed
        Object insname = cmbinsname.getSelectedItem();
        this.addrcpttype(cmbinscode, "SELECT rcptcode from rcpttype WHERE rcptname ='" + insname + "'");

    }//GEN-LAST:event_cmbinsnameActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnsave;
    private javax.swing.JComboBox cmbinscode;
    private javax.swing.JComboBox cmbinsname;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblwh;
    private javax.swing.JRadioButton optremove;
    private javax.swing.JTable tblRinsti;
    // End of variables declaration//GEN-END:variables
}
