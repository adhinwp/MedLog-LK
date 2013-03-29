//Copyright (c) 2012, Provincial Department of Health Services, North western province, Sri Lanka
//All rights reserved.
package rmsd;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import mymod.dbconnector;
import mymod.voidmodule;

public class frmbackup extends javax.swing.JInternalFrame {

    public String user;

    public frmbackup() {
        initComponents();
    }

    void setuser(String suser) {
        user = suser;

        String a = voidmodule.readintitution(null);
        this.setTitle(a + "  - Manual Backup Form  -  User : " + user);

        this.newfile();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel2 = new javax.swing.JPanel();
        txtfilename = new javax.swing.JTextField();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtfileparth = new javax.swing.JTextField();
        btnbrowse = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtfilename1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnnewfile = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtok = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        btnrestore = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        txtfilename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfilenameActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setBackground(new java.awt.Color(0, 0, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Backup/Restore Database");
        jLabel4.setOpaque(true);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Backup : Please Set the file path & file (Location) as Example where save the Backup File.");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Restore : Please Browse Set the file path & SQL  file  to restore the Database.");

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtfileparth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfileparthActionPerformed(evt);
            }
        });

        btnbrowse.setText("File Browse");
        btnbrowse.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnbrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbrowseActionPerformed(evt);
            }
        });

        jLabel2.setText("File Name  (Auto)");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Ex: D:\\Backup\\sqlbackup");

        txtfilename1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfilename1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Backup Location ( Parth)");

        btnnewfile.setText("New file");
        btnnewfile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnnewfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfileparth, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                            .addComponent(txtfilename1, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnbrowse, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(btnnewfile, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfileparth)
                            .addComponent(btnbrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtfilename1)
                        .addComponent(btnnewfile, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtok.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txtok.setText("Backup");
        txtok.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtok.setFocusCycleRoot(true);
        txtok.setRequestFocusEnabled(false);
        txtok.setVerifyInputWhenFocusTarget(false);
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

        btnexit.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit.jpg"))); // NOI18N
        btnexit.setText("Exit");
        btnexit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        btnrestore.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnrestore.setText("Restore");
        btnrestore.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnrestore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(241, Short.MAX_VALUE)
                .addComponent(btnrestore, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtok, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtok, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnrestore, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void newfile() {

        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat dfmonth = new SimpleDateFormat("MM");
        DateFormat dfday = new SimpleDateFormat("dd");
        DateFormat dfyear = new SimpleDateFormat("yyyy");

        String bmonth = dfmonth.format(date);
        String bday = dfday.format(date);
        String byear = dfyear.format(date);
        // String db = new dbconnector().read_database();
        txtfilename1.setText(byear + bmonth + bday + dbconnector.db);
    }
    private void txtfilenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfilenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfilenameActionPerformed

    private void txtfilename1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfilename1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfilename1ActionPerformed

    private void txtokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtokActionPerformed
        try {
            Runtime rt = Runtime.getRuntime();
            String fileprth = txtfileparth.getText();
            String filename = txtfilename1.getText();
            String setdb = dbconnector.db;
            String uname = dbconnector.uname;
            String setpass = dbconnector.pword;


            // String uname = "root";
            //  String setpass = "weeranimal";

            rt.exec("C:\\Program Files\\MySQL\\MySQL Server 5.0\\bin\\mysqldump -u" + uname + " -p" + setpass + " " + setdb + " -r  " + fileprth + "/" + filename + ".sql");
            //  Set wamp Server
            //   rt.exec("C:\\wamp\\bin\\mysql\\mysql5.1.30\\bin\\mysqldump -u" + uname + " -p" + setpass + " " + setdb + " -r  " + fileprth + "/" + filename + ".sql");



            voidmodule.U_transaction(user, "Create Backpup file   " + filename);

        } catch (Exception ioe) {
            //  JOptionPane.showMessageDialog(null, "Can Not File Parth !!!");
        }

        this.exisfile();

}//GEN-LAST:event_txtokActionPerformed
    void exisfile() {
        String fileprth = txtfileparth.getText();
        String filename = txtfilename1.getText();
        String str = fileprth + "/" + filename + ".sql";
        File f = new File(str);
        if (f.exists()) {
            JOptionPane.showMessageDialog(null, "Backup completed successfully !!!");
        } else {
            JOptionPane.showMessageDialog(null, "Uncompleted !!!");
        }
    }
    private void txtokKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtokKeyPressed
}//GEN-LAST:event_txtokKeyPressed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        this.setVisible(false);
}//GEN-LAST:event_btnexitActionPerformed

    private void btnrestoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestoreActionPerformed
        int i = MessageBox.yesno("Do You Want to Restorethe DataBase  ? ");
        if (i == 0) {


            String admin = voidmodule.admin(user);
            String xy = "Administrator";

            try {
                if (admin.equals(xy)) {

                    Object em = txtfileparth.getText();
                    Object em1 = txtfilename1.getText();
                    if (em1.equals("") || em.equals("")) {
                        JOptionPane.showMessageDialog(null, "Can not keep emty field. please Check File path of File Name... ");
                    } else {

                        try {
                            Runtime rt = Runtime.getRuntime();
                            String fileprth = txtfileparth.getText();
                            String filename = txtfilename1.getText();
                            String setdb = dbconnector.db;
                          
                            String uname = dbconnector.uname;
                            String setpass = dbconnector.pword;
//                            String uname = "root";
//                            String setpass = "weeranimal";


                            String resre[] = new String[]{"C:\\Program Files\\MySQL\\MySQL Server 5.0\\bin\\mysql", setdb, "--user=" + uname, "--password=" + setpass, "-e", " source " + fileprth + "/" + filename + ""};
                            //set wamp Server
                            //    String resre[] = new String[]{"C:\\wamp\\bin\\mysql\\mysql5.1.30\\bin\\mysql", setdb, "--user=" + uname, "--password=" + setpass, "-e", " source " + fileprth + "/" + filename + ""};

                            rt.exec(resre);


                            JOptionPane.showMessageDialog(null, "Restore Completed");
                            voidmodule.U_transaction(user, "restore   " + filename);

                        } catch (Exception ioe) {
                            JOptionPane.showMessageDialog(null, "Can Not Find File Parth !!! Restore Faild");
                        }
                    }



                } else {
                    JOptionPane.showMessageDialog(this, "You do not have permission to Access ");
                    System.exit(0);
                }

            } catch (Exception ex) {
                Logger.getLogger(dbconnector.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, ex);

            }
        } else {
            JOptionPane.showMessageDialog(null, "Restore Exit");
        }

    }//GEN-LAST:event_btnrestoreActionPerformed

    private void btnbrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbrowseActionPerformed
        JFileChooser fileopen = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("F files", "F");
        fileopen.addChoosableFileFilter((javax.swing.filechooser.FileFilter) filter);

        int ret = fileopen.showDialog(null, "Import file");
        String Pfile = null;

        if (ret == JFileChooser.APPROVE_OPTION) {
            File file = fileopen.getSelectedFile();
            File pfile = fileopen.getCurrentDirectory();
            String fileName = fileopen.getName(file);
            String path = pfile.toString();
            txtfilename1.setText(fileName);
            txtfileparth.setText(path);
        }
    }//GEN-LAST:event_btnbrowseActionPerformed

    private void btnnewfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewfileActionPerformed
        this.newfile();
    }//GEN-LAST:event_btnnewfileActionPerformed

    private void txtfileparthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfileparthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfileparthActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbrowse;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnnewfile;
    private javax.swing.JButton btnrestore;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtfilename;
    private javax.swing.JTextField txtfilename1;
    private javax.swing.JTextField txtfileparth;
    private javax.swing.JButton txtok;
    // End of variables declaration//GEN-END:variables
}
