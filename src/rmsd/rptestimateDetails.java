//Copyright (c) 2012, Provincial Department of Health Services, North western province, Sri Lanka
//All rights reserved.
package rmsd;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import javax.swing.JTable;
import mymod.dbconnector;
import mymod.voidmodule;

public class rptestimateDetails extends javax.swing.JInternalFrame {

    public String user;
    public String a;
    public boolean stores;
    static int pb;
    public Object RRyear;

    public rptestimateDetails() {
        initComponents();

        this.setuser(null);

    }

    void setuser(String suser) {
        user = suser;

        a = voidmodule.readintitution(null);
        this.setTitle(a + "  - Issue Details Report  -  User : " + user);
        voidmodule.filltblwhere(tblfrom, "SELECT d_srno from dgs_surgicallist ORDER BY d_srno ");
        voidmodule.fillcombo(cmdyear, "SELECT DISTINCT g_year from transaction ORDER BY g_year");
        voidmodule.fillcombo(cmbinscode, "SELECT DISTINCT g_incode from transaction ORDER BY g_incode");
        voidmodule.fillcombo(cmbinsname, "SELECT DISTINCT name from institution ORDER BY name");


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        cmdyear = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        cmbinscode = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbinsname = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtfrom = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblto = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblfrom = new javax.swing.JTable();
        btnadd = new javax.swing.JButton();
        btnremove = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        optall = new javax.swing.JRadioButton();
        optselected = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        optrmsd = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        btnexit = new javax.swing.JButton();
        btnprint = new javax.swing.JButton();
        pbar = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cmdyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdyearActionPerformed(evt);
            }
        });

        jLabel1.setText("Select Analysis Year :");

        cmbinscode.setEditable(true);
        cmbinscode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbinscodeActionPerformed(evt);
            }
        });

        jLabel6.setText("Institution Code");

        jLabel7.setText("Institution Name");

        cmbinsname.setEditable(true);
        cmbinsname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbinsnameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbinsname, 0, 253, Short.MAX_VALUE)
                    .addComponent(cmdyear, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbinscode, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cmbinscode, cmbinsname, cmdyear});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmdyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbinscode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbinsname, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cmbinscode, cmbinsname, cmdyear});

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel5.setText("Item Code ");
        jLabel5.setEnabled(false);

        txtfrom.setEnabled(false);
        txtfrom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfromKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtfromKeyReleased(evt);
            }
        });

        tblto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Selected List"
            }
        ));
        tblto.setEnabled(false);
        tblto.setShowHorizontalLines(false);
        jScrollPane2.setViewportView(tblto);

        tblfrom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code List"
            }
        ));
        tblfrom.setEnabled(false);
        tblfrom.setGridColor(new java.awt.Color(255, 255, 255));
        tblfrom.setShowHorizontalLines(false);
        jScrollPane1.setViewportView(tblfrom);

        btnadd.setText(">>>");
        btnadd.setEnabled(false);
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnremove.setText("<<<");
        btnremove.setEnabled(false);
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtfrom, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnremove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnadd, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnadd, btnremove});

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane1, jScrollPane2});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtfrom))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnadd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnremove)
                        .addGap(0, 171, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnadd, btnremove});

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane1, jScrollPane2});

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttonGroup1.add(optall);
        optall.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        optall.setSelected(true);
        optall.setText("Institution");
        optall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optallActionPerformed(evt);
            }
        });

        buttonGroup1.add(optselected);
        optselected.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        optselected.setText("Selected");
        optselected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optselectedActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Reports.........");

        buttonGroup1.add(optrmsd);
        optrmsd.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        optrmsd.setText("RMSD ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addGap(126, 126, 126))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(optrmsd, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(optall, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(optselected, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {optall, optrmsd, optselected});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optall)
                    .addComponent(optselected)
                    .addComponent(optrmsd))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(79, 97, 47));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit.jpg"))); // NOI18N
        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        btnprint.setText("Print");
        btnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintActionPerformed(evt);
            }
        });

        pbar.setForeground(new java.awt.Color(79, 97, 47));
        pbar.setString("");
        pbar.setStringPainted(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pbar, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnprint, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnexit, btnprint});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnexit)
                    .addComponent(btnprint)
                    .addComponent(pbar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnexit, btnprint, pbar});

        jLabel4.setBackground(new java.awt.Color(79, 97, 47));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Estimate Details");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel4.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void optallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optallActionPerformed
        tblfrom.setEnabled(false);
        tblto.setEnabled(false);
        btnremove.setEnabled(false);
        btnadd.setEnabled(false);
        jLabel5.setEnabled(false);
        txtfrom.setEnabled(false);
    }//GEN-LAST:event_optallActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        this.setVisible(false);
}//GEN-LAST:event_btnexitActionPerformed

    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed
        Runnable run = new Runnable() {

            public void run() {
                if (optrmsd.isSelected() == true) {
                    printaction(tblfrom);
                }
                if (optall.isSelected() == true) {
                    printaction(tblfrom);
                }
                if (optselected.isSelected() == true) {
                    printaction(tblto);
                }

            }
        };


        Thread tr = new Thread(run);
        tr.start();
    }//GEN-LAST:event_btnprintActionPerformed
    void printaction(JTable table) {
        try {


            Object fyear = cmdyear.getSelectedItem();
            int rrcount = table.getRowCount();
            Object inscode = cmbinscode.getSelectedItem();
            Object insname = cmbinsname.getSelectedItem();


            Map m = new HashMap();
            m.put("p_institute", a);
            m.put("inscode", inscode);
            m.put("insname", insname);



            if (stores == true) {
                try {

                    dbconnector.insertquery("DELETE FROM temp_all_estimate");
                    pbar.setMaximum(rrcount);
                    pbar.setString("");
                    for (int xx = 0; xx < rrcount; xx++) {
                        pb = xx;
                        Object itemcode = table.getValueAt(xx, 0);


                        if (optrmsd.isSelected() == true) {
                            dbconnector.insertquery("INSERT INTO temp_all_estimate SELECT * FROM all_estimate WHERE ProductCode ='" + itemcode + "'AND year ='" + fyear + "'");
                        } else {
                            dbconnector.insertquery("INSERT INTO temp_all_estimate SELECT * FROM all_estimate WHERE Incode ='" + inscode + "'AND ProductCode ='" + itemcode + "'AND year ='" + fyear + "'");
                        }


                        Runnable run1 = new Runnable() {

                            public void run() {
                                pbar.setValue(pb + 1);
                            }
                        };


                        Thread tr1 = new Thread(run1);
                        tr1.start();

                    }
                } catch (SQLException ex) {
                    Logger.getLogger(rptledger.class.getName()).log(Level.SEVERE, null, ex);
                }
                pbar.setString("Generating Completed");
                if (optrmsd.isSelected() == true) {
                    voidmodule.generateReport("//Report//All_estimate_Rmsd.jrxml", m);
                } else {
                    voidmodule.generateReport("//Report//all_estimate.jrxml", m);
                }
 }
            voidmodule.U_transaction(user, "print  issue report");
        } catch (ArrayIndexOutOfBoundsException aiobe) {
            JOptionPane.showMessageDialog(null, "PLS SELCET CUSTOMER FROM TABLE ");
        }
    }
    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        int SelectedRow = tblfrom.getSelectedRow();
        String icode = tblfrom.getValueAt(SelectedRow, 0).toString();

        DefaultTableModel to = (DefaultTableModel) tblto.getModel();
        to.addRow(new Object[]{icode});
        DefaultTableModel from = (DefaultTableModel) tblfrom.getModel();
        from.removeRow(SelectedRow);


    }//GEN-LAST:event_btnaddActionPerformed

    private void optselectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optselectedActionPerformed
        tblfrom.setEnabled(true);
        tblto.setEnabled(true);
        btnremove.setEnabled(true);
        btnadd.setEnabled(true);
        jLabel5.setEnabled(true);
        txtfrom.setEnabled(true);
    }//GEN-LAST:event_optselectedActionPerformed

    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
        int SelectedRow = tblto.getSelectedRow();
        String icode = tblto.getValueAt(SelectedRow, 0).toString();

        DefaultTableModel from = (DefaultTableModel) tblfrom.getModel();
        from.addRow(new Object[]{icode});
        DefaultTableModel to = (DefaultTableModel) tblto.getModel();
        to.removeRow(SelectedRow);
    }//GEN-LAST:event_btnremoveActionPerformed

    private void txtfromKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfromKeyReleased
        String icode = txtfrom.getText();
        voidmodule.filltblwhere(tblfrom, "SELECT d_srno from dgs_surgicallist WHERE d_srno LIKE '" + icode + "%' ORDER BY d_srno ");
    }//GEN-LAST:event_txtfromKeyReleased

    private void txtfromKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfromKeyPressed
        if (evt.getKeyCode() == 10) {
            String icode = txtfrom.getText();

            DefaultTableModel to = (DefaultTableModel) tblto.getModel();
            to.addRow(new Object[]{icode});
        }

    }//GEN-LAST:event_txtfromKeyPressed

    private void cmdyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdyearActionPerformed
        RRyear = cmdyear.getSelectedItem();
        voidmodule.filltblwhere(tblfrom, "SELECT DISTINCT g_itemcode from transaction WHERE g_year ='" + RRyear + "' ORDER BY g_itemcode ");
    }//GEN-LAST:event_cmdyearActionPerformed

    private void cmbinscodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbinscodeActionPerformed
        Object inscode = cmbinscode.getSelectedItem();
        voidmodule.AddItemToCombo(cmbinsname, "SELECT name from institution WHERE Incode = '" + inscode + "'");
    }//GEN-LAST:event_cmbinscodeActionPerformed

    private void cmbinsnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbinsnameActionPerformed
        Object insname = cmbinsname.getSelectedItem();
        voidmodule.AddItemToCombo(cmbinscode, "SELECT Incode from institution WHERE name = '" + insname + "'");
    }//GEN-LAST:event_cmbinsnameActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnprint;
    private javax.swing.JButton btnremove;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox cmbinscode;
    private javax.swing.JComboBox cmbinsname;
    private javax.swing.JComboBox cmdyear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton optall;
    private javax.swing.JRadioButton optrmsd;
    private javax.swing.JRadioButton optselected;
    private javax.swing.JProgressBar pbar;
    private javax.swing.JTable tblfrom;
    private javax.swing.JTable tblto;
    private javax.swing.JTextField txtfrom;
    // End of variables declaration//GEN-END:variables
}
