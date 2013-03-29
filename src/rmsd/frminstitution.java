//Copyright (c) 2012, Provincial Department of Health Services, North western province, Sri Lanka
//All rights reserved.
package rmsd;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import mymod.dbconnector;
import mymod.voidmodule;

public class frminstitution extends javax.swing.JInternalFrame {

    public String user;
    public String a;

    public frminstitution() {
        initComponents();

        this.setuser(null);
        this.lablindicate("SELECT * from institution ORDER BY Incode");
    }

    void setuser(String suser) {

        user = suser;
 
        a = voidmodule.readintitution(null);
        this.setTitle(a + "  - Invoice  -  User : " + user);
        voidmodule.fillcombo(cmbcatagory, "SELECT DISTINCT catagory from institution");
        voidmodule.fillcombo(cmbcode, "SELECT DISTINCT Incode from institution");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnsave = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        optremove = new javax.swing.JRadioButton();
        btnprint = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblins = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblinstitution = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        cmbcode = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbcatagory = new javax.swing.JComboBox();
        txtname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);

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

        btnprint.setText("Institution  Report");
        btnprint.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnprint, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(optremove, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optremove)
                    .addComponent(btnprint, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Institutions :");

        lblins.setFont(new java.awt.Font("Tahoma", 1, 11));
        lblins.setText("num");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tblinstitution.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Catagory", "Name"
            }
        ));
        tblinstitution.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblinstitutionMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblinstitution);
        tblinstitution.getColumnModel().getColumn(0).setMinWidth(0);
        tblinstitution.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblinstitution.getColumnModel().getColumn(0).setMaxWidth(100);
        tblinstitution.getColumnModel().getColumn(1).setMinWidth(0);
        tblinstitution.getColumnModel().getColumn(1).setPreferredWidth(100);
        tblinstitution.getColumnModel().getColumn(1).setMaxWidth(100);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cmbcode.setEditable(true);
        cmbcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbcodeActionPerformed(evt);
            }
        });
        cmbcode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbcodeFocusLost(evt);
            }
        });
        cmbcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmbcodeKeyReleased(evt);
            }
        });

        jLabel1.setText("Catagory");

        jLabel3.setText("Name");

        cmbcatagory.setEditable(true);
        cmbcatagory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbcatagoryMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cmbcatagoryMouseReleased(evt);
            }
        });
        cmbcatagory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbcatagoryActionPerformed(evt);
            }
        });
        cmbcatagory.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbcatagoryFocusGained(evt);
            }
        });
        cmbcatagory.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbcatagoryKeyPressed(evt);
            }
        });

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnameKeyPressed(evt);
            }
        });

        jLabel2.setText("Institute Code");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtname, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cmbcode, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(54, 54, 54)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cmbcatagory, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbcatagory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(541, 541, 541)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblins, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblins))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
  
        dbconnector.conn();


        Object code = cmbcode.getSelectedItem().toString().toUpperCase();
        Object cat = cmbcatagory.getSelectedItem();
        String name = txtname.getText();
        Object codeltr = cmbcode.getSelectedItem().toString().subSequence(0, 2);


        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String sysdate = df.format(date);

        try {
            if (optremove.isSelected() == true) {
                int i = MessageBox.yesno("Do You Want to Delete Item  " + code);
                if (i == 0) {
                    dbconnector.insertquery("DELETE FROM institution WHERE Incode ='" + code + "'");
                    voidmodule.U_transaction(user, "Delete Institution   " + code);
                }
            } else {


               
                int Count = voidmodule.RCount("SELECT Incode from institution WHERE Incode ='" + code + "'");
                if (Count > 0) {
                    int i = MessageBox.yesno("Records Already Exited. Do You Want to Update Records…? ");
                    if (i == 0) {
                        dbconnector.insertquery("UPDATE institution SET catagory = '" + cat + "',name = '" + name + "',user = '" + user + "',sysdate = '" + sysdate + "'WHERE Incode ='" + code + "'");
                        voidmodule.U_transaction(user, "update Institution   " + code);

                        dbconnector.insertquery("DELETE FROM incodeltr ");
                        dbconnector.insertquery("INSERT INTO incodeltr VALUES ('" + codeltr + "')");

                    } else {
                    }
                } else {


                    dbconnector.insertquery("INSERT INTO institution VALUES ('" + code + "','" + cat + "','" + name + "','" + user + "','" + sysdate + "')");
                    voidmodule.U_transaction(user, "insert Institution   " + code);
                    JOptionPane.showMessageDialog(null, "Records Saved");
}
            }
            this.lablindicate("SELECT * from institution ORDER BY Incode");

            dbconnector.insertquery("DELETE FROM incodeltr ");
            dbconnector.insertquery("INSERT INTO incodeltr VALUES ('" + codeltr + "')");

        } catch (SQLException ex) {
            Logger.getLogger(frmStock.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        this.setVisible(false);
}//GEN-LAST:event_btnexitActionPerformed

    void lablindicate(String query) {

        Object code = null;
        Object cat = null;
        String name = null;
        int RC = 0;


        try {


            DefaultTableModel addabl = (DefaultTableModel) tblinstitution.getModel();
            while (tblinstitution.getRowCount() > 0) {
                addabl.removeRow(0);
            }


            Statement rss = dbconnector.conn().createStatement();
            ResultSet rs = rss.executeQuery(query);
            while (rs.next()) {
                code = rs.getString("Incode");
                cat = rs.getString("catagory");
                name = rs.getString("name");


                addabl.addRow(new Object[]{code, cat, name});
                RC++;
            }
            lblins.setText("" + RC);
            cmbcode.setSelectedItem(code);
            cmbcatagory.setSelectedItem(cat);
            txtname.setText(name);



        } catch (SQLException ex) {
            Logger.getLogger(frmStock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void optremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optremoveActionPerformed
        btnsave.setText("Delete");
}//GEN-LAST:event_optremoveActionPerformed

    private void cmbcatagoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbcatagoryMouseClicked
        btnsave.setText("Save");
    }//GEN-LAST:event_cmbcatagoryMouseClicked

    private void tblinstitutionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblinstitutionMouseReleased
        int SelectedRow = tblinstitution.getSelectedRow();
        String code = tblinstitution.getValueAt(SelectedRow, 0).toString();
        String cat = tblinstitution.getValueAt(SelectedRow, 1).toString();
        String name = tblinstitution.getValueAt(SelectedRow, 2).toString();
        cmbcode.setSelectedItem(code);
        cmbcatagory.setSelectedItem(cat);
        txtname.setText(name);
        btnsave.setText("Update");
    }//GEN-LAST:event_tblinstitutionMouseReleased

    private void cmbcatagoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbcatagoryActionPerformed
    }//GEN-LAST:event_cmbcatagoryActionPerformed

    private void cmbcatagoryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbcatagoryFocusGained
        btnsave.setText("Save");
    }//GEN-LAST:event_cmbcatagoryFocusGained

    private void cmbcatagoryMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbcatagoryMouseReleased
    }//GEN-LAST:event_cmbcatagoryMouseReleased

    private void cmbcatagoryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbcatagoryKeyPressed
        if (evt.getKeyCode() == 10) {
            txtname.requestFocus();
        }
    }//GEN-LAST:event_cmbcatagoryKeyPressed

    private void cmbcodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbcodeKeyReleased
        btnsave.setText("Save");
   
    }//GEN-LAST:event_cmbcodeKeyReleased

    private void cmbcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbcodeActionPerformed
        btnsave.setText("Save");
    }//GEN-LAST:event_cmbcodeActionPerformed

    private void txtnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyPressed
        if (evt.getKeyCode() == 10) {
            btnsave.requestFocus();
        }
    }//GEN-LAST:event_txtnameKeyPressed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed
        try {
            Map m = new HashMap();
            m.put("p_institute", a);


            voidmodule.generateReport("//Report//Institution.jrxml", m);

        } catch (ArrayIndexOutOfBoundsException aiobe) {
        }
}//GEN-LAST:event_btnprintActionPerformed

    private void cmbcodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbcodeFocusLost
         Object inscode = cmbcode.getSelectedItem();
        cmbcode.setSelectedItem(inscode.toString().toUpperCase());
    }//GEN-LAST:event_cmbcodeFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnprint;
    private javax.swing.JButton btnsave;
    private javax.swing.JComboBox cmbcatagory;
    private javax.swing.JComboBox cmbcode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblins;
    private javax.swing.JRadioButton optremove;
    private javax.swing.JTable tblinstitution;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
