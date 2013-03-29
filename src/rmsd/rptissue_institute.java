//Copyright (c) 2012, Provincial Department of Health Services, North western province, Sri Lanka
//All rights reserved.
package rmsd;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JComboBox;
import mymod.dbconnector;
import mymod.voidmodule;

public class rptissue_institute extends javax.swing.JInternalFrame {

    public String user;
    public String a;
    public boolean stores;
    static int pb;

    public rptissue_institute() {
        initComponents();

        this.setuser(null);



    }

    void setuser(String suser) {
        user = suser;
        
        a = voidmodule.readintitution(null);
        this.setTitle(a + "  - Issue Details Report  -  User : " + user);
        voidmodule.filltblwhere(tblfrom,"SELECT d_srno from dgs_surgicallist ORDER BY d_srno ");
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
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblfrom = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblto = new javax.swing.JTable();
        btnremove = new javax.swing.JButton();
        txtfrom = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnadd = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        optallinvoice = new javax.swing.JRadioButton();
        optall = new javax.swing.JRadioButton();
        optselect_summary = new javax.swing.JRadioButton();
        optselected = new javax.swing.JRadioButton();
        optselected_percentage1 = new javax.swing.JRadioButton();
        optselect_summary1 = new javax.swing.JRadioButton();
        optselect_details = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        optall_details = new javax.swing.JRadioButton();
        optselected_percentage = new javax.swing.JRadioButton();
        optpercentage = new javax.swing.JRadioButton();
        optall_summary = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cmbinscode = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbinsname = new javax.swing.JComboBox();
        txttoDate = new de.wannawork.jcalendar.JCalendarComboBox();
        jLabel6 = new javax.swing.JLabel();
        txtfromDate = new de.wannawork.jcalendar.JCalendarComboBox();
        jPanel3 = new javax.swing.JPanel();
        btnexit = new javax.swing.JButton();
        btnprint = new javax.swing.JButton();
        pbar = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Please Select the Date Range");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        tblfrom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ins Code List"
            }
        ));
        tblfrom.setEnabled(false);
        tblfrom.setGridColor(new java.awt.Color(255, 255, 255));
        tblfrom.setShowHorizontalLines(false);
        jScrollPane1.setViewportView(tblfrom);

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

        btnremove.setText("<<<");
        btnremove.setEnabled(false);
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });

        txtfrom.setEnabled(false);
        txtfrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfromActionPerformed(evt);
            }
        });
        txtfrom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfromKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtfromKeyReleased(evt);
            }
        });

        jLabel5.setText("Item Code ");
        jLabel5.setEnabled(false);

        btnadd.setText(">>>");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtfrom, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnremove, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtfrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnadd)
                        .addGap(11, 11, 11)
                        .addComponent(btnremove)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttonGroup1.add(optallinvoice);
        optallinvoice.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        optallinvoice.setText("All Invoice");

        buttonGroup1.add(optall);
        optall.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        optall.setSelected(true);
        optall.setText("All");
        optall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optallActionPerformed(evt);
            }
        });

        buttonGroup3.add(optselect_summary);
        optselect_summary.setText("Summary");

        buttonGroup1.add(optselected);
        optselected.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        optselected.setText("Selected");
        optselected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optselectedActionPerformed(evt);
            }
        });

        buttonGroup3.add(optselected_percentage1);
        optselected_percentage1.setText("With All Estimate  (Graph)");
        optselected_percentage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optselected_percentage1ActionPerformed(evt);
            }
        });

        buttonGroup3.add(optselect_summary1);
        optselect_summary1.setText("With Own Estimate");

        buttonGroup3.add(optselect_details);
        optselect_details.setText("Details");
        optselect_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optselect_detailsActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Reports.........");

        buttonGroup2.add(optall_details);
        optall_details.setSelected(true);
        optall_details.setText("Details");

        buttonGroup3.add(optselected_percentage);
        optselected_percentage.setText("With Own Estimate (Graph)");
        optselected_percentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optselected_percentageActionPerformed(evt);
            }
        });

        buttonGroup2.add(optpercentage);
        optpercentage.setText("With Percentage");
        optpercentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optpercentageActionPerformed(evt);
            }
        });

        buttonGroup2.add(optall_summary);
        optall_summary.setText("Summary");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(optall_details, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(optall_summary, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(optpercentage))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(optselect_details, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(optselect_summary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(optselect_summary1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(optselected_percentage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(optselected_percentage1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(optall, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(optselected, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(optallinvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optall)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(optselected)
                        .addComponent(optallinvoice)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optselect_details)
                    .addComponent(optall_details))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optall_summary)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(optselect_summary)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(optselect_summary1)
                            .addComponent(optpercentage))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optselected_percentage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(optselected_percentage1)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setText("Institution Name");

        cmbinscode.setEditable(true);
        cmbinscode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbinscodeActionPerformed(evt);
            }
        });

        jLabel1.setText("From");

        jLabel2.setText("To");

        cmbinsname.setEditable(true);
        cmbinsname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbinsnameActionPerformed(evt);
            }
        });

        jLabel6.setText("Institution Code");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(65, 65, 65)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbinsname, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbinscode, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(txtfromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttoDate, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtfromDate, txttoDate});

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cmbinscode, cmbinsname});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtfromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txttoDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6)))
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addComponent(cmbinscode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbinsname, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cmbinscode, cmbinsname});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(148, 172, 193));
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

        pbar.setBackground(new java.awt.Color(148, 172, 193));
        pbar.setForeground(new java.awt.Color(148, 172, 193));
        pbar.setString("");
        pbar.setStringPainted(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pbar, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                .addComponent(btnprint, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnexit, btnprint});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pbar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnprint, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnexit))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnexit, btnprint, pbar});

        jLabel4.setBackground(new java.awt.Color(148, 172, 193));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Issue Details By Institution wise");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel4.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel4, jPanel1, jPanel3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    void insti(JComboBox combo, String query) {
        Object icode = null;
     
        try {
            Statement rss = dbconnector.conn().createStatement();
            ResultSet rs = rss.executeQuery(query);
            while (rs.next()) {
                icode = rs.getString(1);

            }
            combo.setSelectedItem(icode);
        } catch (SQLException ex) {
            Logger.getLogger(frmStock.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    private void optallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optallActionPerformed
        tblfrom.setEnabled(false);
        tblto.setEnabled(false);
        btnremove.setEnabled(false);
        btnadd.setEnabled(false);
        jLabel5.setEnabled(false);
        txtfrom.setEnabled(false);
    }//GEN-LAST:event_optallActionPerformed

    private void optselect_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optselect_detailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optselect_detailsActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        this.setVisible(false);
}//GEN-LAST:event_btnexitActionPerformed

    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed

        Runnable run = new Runnable() {
            public void run() {
                printaction();
            }
        };


        Thread tr = new Thread(run);
        tr.start();
    }//GEN-LAST:event_btnprintActionPerformed
void printaction(){
        try {
            DateFormat dfyear = new SimpleDateFormat("yyyy");
            Date fromDate = txtfromDate.getDate();
            Date toDate = txttoDate.getDate();
            Object inscode = cmbinscode.getSelectedItem();
            Object insname = cmbinsname.getSelectedItem();
            String transtype = "I";

            Map m = new HashMap();
            m.put("fromdate", fromDate);
            m.put("todate", toDate);
            m.put("transtype", transtype);
            m.put("inscode", inscode);
            m.put("insname", insname);
            m.put("p_institute", a);

            if (optall.isSelected() == true) {
                if (optall_details.isSelected() == true) {
                    voidmodule.generateReport("//Report//issue_ins_details.jrxml", m);
                } else if (optall_summary.isSelected() == true) {
                    voidmodule.generateReport("//Report//issue_ins_details_summary.jrxml", m);

                } else if (optpercentage.isSelected() == true) {
                    voidmodule.generateReport("//Report//issue_ins_details_summary_percentage.jrxml", m);
                }
            } else if (optselected.isSelected() == true) {
                try {
                 
                    dbconnector.conn();
                    dbconnector.insertquery("DELETE FROM temp_transaction");


                    String fyear = dfyear.format(txtfromDate.getDate());
                    int Rcount = tblto.getRowCount();
                    pbar.setMaximum(Rcount);
                    for (int xx = 0; xx < Rcount; xx++) {
                        pb = xx;
                        String icode = tblto.getValueAt(xx, 0).toString();
                        if (stores == true) {
                            dbconnector.insertquery("INSERT INTO temp_transaction SELECT * FROM transaction WHERE g_itemcode ='" + icode + "'AND g_year ='" + fyear + "'");
                        } else {
                            dbconnector.insertquery("INSERT INTO temp_transaction SELECT * FROM transaction_sub1 WHERE g_itemcode ='" + icode + "'AND g_year ='" + fyear + "'");

                        }


                        Runnable run1 = new Runnable() {

                            public void run() {
                                pbar.setValue(pb+1);
                            }
                        };


                        Thread tr1 = new Thread(run1);
                        tr1.start();

                    }
                } catch (SQLException ex) {
                    Logger.getLogger(rptledger.class.getName()).log(Level.SEVERE, null, ex);
                }
                pbar.setString("Generating Completed");
                if (optselect_details.isSelected() == true) {
                    voidmodule.generateReport("//Report//issue_ins_details_selected.jrxml", m);
                } else if (optselect_summary.isSelected() == true) {
                    voidmodule.generateReport("//Report//issue_ins_details_selected_summary.jrxml", m);
                } else if (optselect_summary1.isSelected() == true) {
                    voidmodule.generateReport("//Report//issue_ins_details_selected_summary_1.jrxml", m);
                } else if (optselected_percentage.isSelected() == true) {
                    voidmodule.generateReport("//Report//issue_ins_details_selected_summary_percentage.jrxml", m);
                } else if (optselected_percentage1.isSelected() == true) {
                    voidmodule.generateReport("//Report//issue_ins_details_selected_withall_esmt.jrxml", m);
                }

            } else if (optallinvoice.isSelected() == true) {
                voidmodule.generateReport("//Report//issue_ins_invoice.jrxml", m);

            }
            voidmodule.U_transaction(user, "print  institution report");
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
        voidmodule.filltblwhere(tblfrom,"SELECT d_srno from dgs_surgicallist WHERE d_srno LIKE '" + icode + "%' ORDER BY d_srno ");
    }//GEN-LAST:event_txtfromKeyReleased

    private void txtfromKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfromKeyPressed
        if (evt.getKeyCode() == 10) {
            String icode = txtfrom.getText();

            DefaultTableModel to = (DefaultTableModel) tblto.getModel();
            to.addRow(new Object[]{icode});
        }

    }//GEN-LAST:event_txtfromKeyPressed

    private void cmbinscodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbinscodeActionPerformed
        Object inscode = cmbinscode.getSelectedItem();
        voidmodule.fillcombo(cmbinsname, "SELECT name from institution WHERE Incode = '" + inscode + "'");
    }//GEN-LAST:event_cmbinscodeActionPerformed

    private void cmbinsnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbinsnameActionPerformed
        Object insname = cmbinsname.getSelectedItem();
        voidmodule.fillcombo(cmbinscode, "SELECT Incode from institution WHERE name = '" + insname + "'");
    }//GEN-LAST:event_cmbinsnameActionPerformed

    private void txtfromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfromActionPerformed

    private void optpercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optpercentageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optpercentageActionPerformed

    private void optselected_percentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optselected_percentageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optselected_percentageActionPerformed

    private void optselected_percentage1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optselected_percentage1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optselected_percentage1ActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JRadioButton optall_details;
    private javax.swing.JRadioButton optall_summary;
    private javax.swing.JRadioButton optallinvoice;
    private javax.swing.JRadioButton optpercentage;
    private javax.swing.JRadioButton optselect_details;
    private javax.swing.JRadioButton optselect_summary;
    private javax.swing.JRadioButton optselect_summary1;
    private javax.swing.JRadioButton optselected;
    private javax.swing.JRadioButton optselected_percentage;
    private javax.swing.JRadioButton optselected_percentage1;
    private javax.swing.JProgressBar pbar;
    private javax.swing.JTable tblfrom;
    private javax.swing.JTable tblto;
    private javax.swing.JTextField txtfrom;
    private de.wannawork.jcalendar.JCalendarComboBox txtfromDate;
    private de.wannawork.jcalendar.JCalendarComboBox txttoDate;
    // End of variables declaration//GEN-END:variables
}
