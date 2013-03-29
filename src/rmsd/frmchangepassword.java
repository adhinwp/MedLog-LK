//Copyright (c) 2012, Provincial Department of Health Services, North western province, Sri Lanka
//All rights reserved.
package rmsd;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import mymod.dbconnector;
import mymod.voidmodule;

public class frmchangepassword extends javax.swing.JInternalFrame {

    public String user;
    public int Count;
    public String Fpasswrd;
    public int rsCount;

    public frmchangepassword() {
        initComponents();

        this.setuser(null);
    }

    void setuser(String suser) {
        user = suser;

        String a = voidmodule.readintitution(null);
        this.setTitle(a + "  - Change User Password  -  User : " + user);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        txtnewpass = new javax.swing.JPasswordField();
        txtrenewpass = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        txtok = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Enter Current Password");

        jLabel2.setText("Enter New Password");

        jLabel3.setText("Re-Enter Password");

        jLabel4.setBackground(new java.awt.Color(0, 0, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Change User Password");
        jLabel4.setOpaque(true);

        txtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassActionPerformed(evt);
            }
        });
        txtpass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtpassFocusLost(evt);
            }
        });
        txtpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpassKeyPressed(evt);
            }
        });

        txtnewpass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnewpassFocusLost(evt);
            }
        });
        txtnewpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnewpassKeyPressed(evt);
            }
        });

        txtrenewpass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtrenewpassFocusLost(evt);
            }
        });
        txtrenewpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtrenewpassKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                        .addGap(10, 10, 10)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtrenewpass, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtnewpass, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtnewpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtrenewpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtok.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtok.setText("Ok");
        txtok.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtok.setEnabled(false);
        txtok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtokActionPerformed(evt);
            }
        });
        txtok.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtokKeyPressed(evt);
            }
        });

        btnexit.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit.jpg"))); // NOI18N
        btnexit.setText("Exit");
        btnexit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtok, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtok, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtokActionPerformed


        try {
            Date date = new Date();
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String sysdate = df.format(date);

            DateFormat df2 = new SimpleDateFormat("HH:mm");
            String time = df2.format(date);

            String newpasswrd = txtnewpass.getText();
            String verpasswrd = txtrenewpass.getText();
            String host = dbconnector.host;

           int Count = voidmodule.RCount("SELECT user from user WHERE user ='" + user + "'");
            if (Count > 0) {
                int i = MessageBox.yesno("Hi   " + user + "  ..Do you want to Change Your password as Follows ?");
                if (i == 0) {
                    dbconnector.insertquery("UPDATE user SET  passwrd = PASSWORD('" + newpasswrd + "'), verpasswrd = PASSWORD('" + verpasswrd + "'), mdfDate = '" + sysdate + "', time = '" + time + "'WHERE user ='" + user + "'");


                    voidmodule.U_transaction(user, "Change User name and password   " + user);
                    JOptionPane.showMessageDialog(this, "Change's Successfully Completed");
                    System.exit(0);
                }

            }

            txtpass.setText(null);
            txtnewpass.setText(null);
            txtrenewpass.setText(null);



        } catch (Exception ex) {
            Logger.getLogger(dbconnector.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_txtokActionPerformed

    private void txtokKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtokKeyPressed
}//GEN-LAST:event_txtokKeyPressed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        this.setVisible(false);
}//GEN-LAST:event_btnexitActionPerformed

    private void txtpassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpassFocusLost
        this.checkpass();
    }//GEN-LAST:event_txtpassFocusLost

    private void txtpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyPressed
        if (evt.getKeyCode() == 10) {
            txtnewpass.requestFocus();
        }
    }//GEN-LAST:event_txtpassKeyPressed

    private void txtnewpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnewpassKeyPressed
        if (evt.getKeyCode() == 10) {
            txtrenewpass.requestFocus();
        }
    }//GEN-LAST:event_txtnewpassKeyPressed

    private void txtnewpassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnewpassFocusLost
        txtrenewpass.setText(null);
    }//GEN-LAST:event_txtnewpassFocusLost

    private void txtrenewpassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtrenewpassFocusLost
        String newpass = txtnewpass.getText();
        String renewpass = txtrenewpass.getText();

        if (newpass.equals(renewpass)) {
            txtok.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect Retype password");
            txtnewpass.setEditable(false);
            txtrenewpass.requestFocus();
            txtok.setEnabled(false);
        }
    }//GEN-LAST:event_txtrenewpassFocusLost

    private void txtrenewpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrenewpassKeyPressed
        if (evt.getKeyCode() == 10) {
            txtok.requestFocus();
        }
    }//GEN-LAST:event_txtrenewpassKeyPressed

    private void txtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassActionPerformed
        this.checkpass();
    }//GEN-LAST:event_txtpassActionPerformed

    void checkpass() {
        String Cpass = txtpass.getText();

        try {

            this.labfind("SELECT passwrd from user WHERE user ='" + user + "'AND passwrd =PASSWORD('" + Cpass + "')");
            if (rsCount > 0) {
                txtnewpass.setEditable(true);
                txtrenewpass.setEditable(true);
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect User Password..");
                txtnewpass.setEditable(false);
                txtrenewpass.setEditable(false);
            }

        } catch (Exception ex) {
            Logger.getLogger(frmUser.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    void labfind(String query) {



        try {
            Statement rss = dbconnector.conn().createStatement();
            ResultSet rs = rss.executeQuery(query);
            rs.last();
            rsCount = rs.getRow();
        } catch (Exception ex) {
            Logger.getLogger(frmchangepassword.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField txtnewpass;
    private javax.swing.JButton txtok;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JPasswordField txtrenewpass;
    // End of variables declaration//GEN-END:variables
}
