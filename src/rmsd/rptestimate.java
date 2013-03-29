//Copyright (c) 2012, Provincial Department of Health Services, North western province, Sri Lanka
//All rights reserved.
package rmsd;

import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import mymod.dbconnector;
import mymod.voidmodule;

public class rptestimate extends javax.swing.JInternalFrame {

    public String user;
    public String a;
    public String warehouse;
    public Double Uprize;
    //   public dbconnector c;
    static int intpb1;
    static int pb;
    Object RRyear;

    public rptestimate() {
        initComponents();
        this.setuser(null);
        this.additemcode(tblitemlist, "SELECT d_name, d_srno from dgs_surgicallist ORDER BY d_name ");

        // c = new dbconnector();

    }

    void setuser(String suser) {

        user = suser;

        a = voidmodule.readintitution(null);
        this.setTitle(a + "  - Annual Estimate Reports Generator  -  User : " + user);
        voidmodule.fillcombo(cmbcode, "SELECT DISTINCT Incode from institution");
        voidmodule.fillcombo(cmdyear2, "SELECT DISTINCT year from all_estimate ORDER BY year");
        DateFormat df = new SimpleDateFormat("yyyy");
        String year = df.format(new java.util.Date());
        cmdyear2.setSelectedItem(year);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtfromDate = new de.wannawork.jcalendar.JCalendarComboBox();
        jLabel6 = new javax.swing.JLabel();
        txttoDate = new de.wannawork.jcalendar.JCalendarComboBox();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        optgrptogether = new javax.swing.JRadioButton();
        optgrponepage = new javax.swing.JRadioButton();
        btngendata = new javax.swing.JButton();
        btnaddall = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnremoveone = new javax.swing.JButton();
        optAestimate = new javax.swing.JRadioButton();
        btnaddone = new javax.swing.JButton();
        btnremoveall = new javax.swing.JButton();
        optall = new javax.swing.JRadioButton();
        opesmtins = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblitemlist = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txticode = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblselectlist = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        cmbcode = new javax.swing.JComboBox();
        lblinsname = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cmdyear2 = new javax.swing.JComboBox();
        selectList = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblgenerate = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnexit = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btnprint = new javax.swing.JButton();
        pbar = new javax.swing.JProgressBar();

        setClosable(true);
        setMaximizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setText("From");

        jLabel6.setText("To");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 255));
        jLabel8.setText("Requisition for Urgent Pharmaceuticals....");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        buttonGroup1.add(optgrptogether);
        optgrptogether.setText("Group by Warehouse with together");
        optgrptogether.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optgrptogetherActionPerformed(evt);
            }
        });

        buttonGroup1.add(optgrponepage);
        optgrponepage.setText("Group by Warehouse One by one Page");
        optgrponepage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optgrponepageActionPerformed(evt);
            }
        });

        btngendata.setText("Generate Data");
        btngendata.setEnabled(false);
        btngendata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngendataActionPerformed(evt);
            }
        });

        btnaddall.setText("Add All");
        btnaddall.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnaddall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddallActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Reports.........");

        btnremoveone.setText("Remove");
        btnremoveone.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnremoveone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveoneActionPerformed(evt);
            }
        });

        buttonGroup1.add(optAestimate);
        optAestimate.setText("Annual Estimate");
        optAestimate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optAestimateActionPerformed(evt);
            }
        });

        btnaddone.setText("Add>>");
        btnaddone.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnaddone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddoneActionPerformed(evt);
            }
        });

        btnremoveall.setText("Remove All");
        btnremoveall.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnremoveall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveallActionPerformed(evt);
            }
        });

        buttonGroup1.add(optall);
        optall.setText("Without Group with all");
        optall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optallActionPerformed(evt);
            }
        });

        buttonGroup1.add(opesmtins);
        opesmtins.setText("Estimated Institution by Item");
        opesmtins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opesmtinsActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optall, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optgrponepage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(optgrptogether, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(opesmtins, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optAestimate, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnaddone, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnremoveone, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnaddall, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnremoveall, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btngendata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnaddall, btnaddone, btngendata, btnremoveall, btnremoveone});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnaddone, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnremoveone, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnaddall, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnremoveall, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optgrponepage, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(optgrptogether, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(optall, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opesmtins, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(optAestimate, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(btngendata, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {optAestimate, optall, optgrponepage, optgrptogether});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btngendata, btnremoveall});

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tblitemlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Code"
            }
        ));
        tblitemlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblitemlistMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblitemlist);
        tblitemlist.getColumnModel().getColumn(1).setMinWidth(0);
        tblitemlist.getColumnModel().getColumn(1).setPreferredWidth(100);
        tblitemlist.getColumnModel().getColumn(1).setMaxWidth(100);

        jLabel2.setText("Select Item Code");

        txticode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txticodeActionPerformed(evt);
            }
        });
        txticode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txticodeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txticodeKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(txticode, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txticode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setText("Selected List");

        tblselectlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Code"
            }
        ));
        jScrollPane2.setViewportView(tblselectlist);
        tblselectlist.getColumnModel().getColumn(1).setMinWidth(0);
        tblselectlist.getColumnModel().getColumn(1).setPreferredWidth(100);
        tblselectlist.getColumnModel().getColumn(1).setMaxWidth(100);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 150, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel9.setText("RMSD Code :");

        cmbcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbcodeActionPerformed(evt);
            }
        });

        lblinsname.setText("jLabel10");

        jLabel10.setText("Reqst Year :");

        cmdyear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdyear2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttoDate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblinsname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbcode, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdyear2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtfromDate, txttoDate});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtfromDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addComponent(txttoDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cmbcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(cmdyear2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblinsname))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Select Items", jPanel2);

        selectList.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tblgenerate.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tblgenerate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Receipt Qnty", "Estimate Qnty", "Percentage", "Balance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Double.class, java.lang.Double.class, java.lang.Object.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblgenerate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblgenerateKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tblgenerate);
        tblgenerate.getColumnModel().getColumn(0).setMinWidth(0);
        tblgenerate.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblgenerate.getColumnModel().getColumn(0).setMaxWidth(100);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("Note :-If you Need to change the values of Balance Please Click On the Balance colum and Enter New value and Save");

        javax.swing.GroupLayout selectListLayout = new javax.swing.GroupLayout(selectList);
        selectList.setLayout(selectListLayout);
        selectListLayout.setHorizontalGroup(
            selectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(selectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        selectListLayout.setVerticalGroup(
            selectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Change values of Balance", selectList);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnexit.setText("Exit");
        btnexit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        btnsave.setText("Save");
        btnsave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnsave.setEnabled(false);
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnprint.setText("Print");
        btnprint.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnprint.setEnabled(false);
        btnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintActionPerformed(evt);
            }
        });

        pbar.setForeground(new java.awt.Color(204, 0, 0));
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
                .addComponent(btnprint, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnprint, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnremoveallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveallActionPerformed
        DefaultTableModel addabl = (DefaultTableModel) tblselectlist.getModel();
        while (tblselectlist.getRowCount() > 0) {
            addabl.removeRow(0);
        }
        this.additemcode(tblitemlist, "SELECT d_name, d_srno from dgs_surgicallist ORDER BY d_name ");
    }//GEN-LAST:event_btnremoveallActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnaddallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddallActionPerformed
        DefaultTableModel addabl = (DefaultTableModel) tblitemlist.getModel();
        while (tblitemlist.getRowCount() > 0) {
            addabl.removeRow(0);
        }
        this.additemcode(tblselectlist, "SELECT d_name, d_srno from dgs_surgicallist ORDER BY d_name ");
    }//GEN-LAST:event_btnaddallActionPerformed

    private void tblitemlistMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblitemlistMouseReleased
        int SelectedRow = tblitemlist.getSelectedRow();
        String icode = tblitemlist.getValueAt(SelectedRow, 1).toString();
        txticode.setText(icode);

    }//GEN-LAST:event_tblitemlistMouseReleased

    private void btnaddoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddoneActionPerformed
        int SelectedRow = tblitemlist.getSelectedRow();
        String name = tblitemlist.getValueAt(SelectedRow, 0).toString();
        String icode = tblitemlist.getValueAt(SelectedRow, 1).toString();

        DefaultTableModel to = (DefaultTableModel) tblselectlist.getModel();
        to.addRow(new Object[]{name, icode});
        DefaultTableModel from = (DefaultTableModel) tblitemlist.getModel();
        from.removeRow(SelectedRow);
    }//GEN-LAST:event_btnaddoneActionPerformed

    private void btnremoveoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveoneActionPerformed
        int SelectedRow = tblselectlist.getSelectedRow();
        String name = tblselectlist.getValueAt(SelectedRow, 0).toString();
        String icode = tblselectlist.getValueAt(SelectedRow, 1).toString();

        DefaultTableModel from = (DefaultTableModel) tblitemlist.getModel();
        from.addRow(new Object[]{name, icode});
        DefaultTableModel to = (DefaultTableModel) tblselectlist.getModel();
        to.removeRow(SelectedRow);
    }//GEN-LAST:event_btnremoveoneActionPerformed

    private void txticodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txticodeKeyReleased
        Object icode = txticode.getText();
        this.additemcode(tblitemlist, "SELECT d_name, d_srno from dgs_surgicallist WHERE d_srno LIKE '" + icode + "%' ORDER BY d_name ");

    }//GEN-LAST:event_txticodeKeyReleased

    private void txticodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txticodeKeyPressed
        if (evt.getKeyCode() == 10) {
            int SelectedRow = 0;
            String name = tblitemlist.getValueAt(SelectedRow, 0).toString();
            String icode = tblitemlist.getValueAt(SelectedRow, 1).toString();

            DefaultTableModel to = (DefaultTableModel) tblselectlist.getModel();
            to.addRow(new Object[]{name, icode});
            DefaultTableModel from = (DefaultTableModel) tblitemlist.getModel();
            from.removeRow(SelectedRow);
        }
    }//GEN-LAST:event_txticodeKeyPressed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        try {
            int tblRcount = tblgenerate.getRowCount();
            for (int xx = 0; xx < tblRcount; xx++) {
                String icode = tblgenerate.getValueAt(xx, 0).toString();
                String bal = tblgenerate.getValueAt(xx, 4).toString();
                dbconnector.insertquery("UPDATE temp_estimate SET bal = '" + bal + "'WHERE icode ='" + icode + "'");
            }

        } catch (Exception ex) {
            Logger.getLogger(rptledger.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);

        }

    }//GEN-LAST:event_btnsaveActionPerformed

    private void tblgenerateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblgenerateKeyReleased
        btnsave.setEnabled(true);
    }//GEN-LAST:event_tblgenerateKeyReleased

    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed
        try {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String fromdate = df.format(txtfromDate.getDate()).toString();
            String todate = df.format(txttoDate.getDate()).toString();
            DateFormat dfyear = new SimpleDateFormat("yyyy");
            String gyear = dfyear.format(txtfromDate.getDate());
            Object inscode = cmbcode.getSelectedItem();
            Map m = new HashMap();
            m.put("p_institute", a);
            m.put("fromdate", fromdate);
            m.put("todate", todate);
            m.put("YYear", gyear);
            m.put("inscode", inscode);

            if (optgrponepage.isSelected() == true) {
                voidmodule.generateReport("//Report//estimate.jrxml", m);
            } else if (optgrptogether.isSelected() == true) {
                voidmodule.generateReport("//Report//estimate1.jrxml", m);
            } else if (optall.isSelected() == true) {
                voidmodule.generateReport("//Report//estimateAll.jrxml", m);
            } else if (opesmtins.isSelected() == true) {
                voidmodule.generateReport("//Report//estimate_ins_list.jrxml", m);
            } else if (optAestimate.isSelected() == true) {
                voidmodule.generateReport("//Report//annua_esimatel.jrxml", m);
            }
            voidmodule.U_transaction(user, "print  estimateAll report");
        } catch (ArrayIndexOutOfBoundsException aiobe) {
            JOptionPane.showMessageDialog(null, "PLS SELCET CUSTOMER FROM TABLE ");
        }
    }//GEN-LAST:event_btnprintActionPerformed

    private void optallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optallActionPerformed
        btngendata.setEnabled(true);
        txtfromDate.setEnabled(true);
        txttoDate.setEnabled(true);
        cmdyear2.setEnabled(true);
        jLabel10.setEnabled(false);
        cmbcode.setEnabled(true);
        jLabel5.setEnabled(true);
        jLabel6.setEnabled(true);
        jLabel9.setEnabled(true);

    }//GEN-LAST:event_optallActionPerformed
    void optallset() {
        try {
            btnprint.setEnabled(false);
            pbar.setString("");
            pbar.setMinimum(0);
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String fromDate = df.format(txtfromDate.getDate());
            String toDate = df.format(txttoDate.getDate());
            int Rcount = tblselectlist.getRowCount();
            RRyear = cmdyear2.getSelectedItem();



            if (opesmtins.isSelected() == true) {
                dbconnector.insertquery("DELETE FROM temp_all_estimate");
                String Incode = null;
                String ProductCode = null;
                Double estimate_Qty = null;
                String year = null;
                for (int xx = 0; xx < Rcount; xx++) {
                    String icode = tblselectlist.getValueAt(xx, 1).toString();


                    Double Rsum = null;
                    //    String strsql = "SELECT g_Rqnty,g_warehose,g_initprice FROM transaction   WHERE g_itemcode = '" + icode + "'AND g_transtype = '" + "R" + "'AND g_date BETWEEN '" + (fromDate) + "' AND '" + (toDate) + "'";
                    String strsql = "SELECT * FROM all_estimate WHERE ProductCode = '" + icode + "'AND year = '" + RRyear + "'";
                    ResultSet rs = dbconnector.Sql_OutResultset(strsql);
                    while (rs.next()) {

                        int Count = voidmodule.RCount(strsql);
                        intpb1 = Count;
                        pbar.setMaximum(intpb1);
                        pbar.setMinimum(0);

                        Incode = rs.getString(1);
                        ProductCode = rs.getString(2);
                        estimate_Qty = rs.getDouble(3);
                        year = rs.getString(4);

                        dbconnector.insertquery("INSERT INTO temp_all_estimate VALUES ('" + Incode + "','" + ProductCode + "','" + estimate_Qty + "','" + year + "')");
                        int row = rs.getRow();
                        pb = row;
                        Runnable run = new Runnable() {

                            public void run() {
                                pbar.setValue(pb);

                            }
                        };


                        Thread tr = new Thread(run);
                        tr.start();

                    }

                    rs.close();
                    //  rss.close();
                }
                pbar.setString("Generating Completed");
                this.addselettbl("SELECT * FROM temp_estimate ORDER BY icode");
                JOptionPane.showMessageDialog(null, "Generating Completed");
            }

            if (optgrponepage.isSelected() || (optgrptogether.isSelected() || (optall.isSelected())) == true) {

                dbconnector.insertquery("DELETE FROM temp_estimate");
                for (int xx = 0; xx < Rcount; xx++) {
                    String icode = tblselectlist.getValueAt(xx, 1).toString();
                    Double Rsum = null;
                    //    String strsql = "SELECT g_Rqnty,g_warehose,g_initprice FROM transaction   WHERE g_itemcode = '" + icode + "'AND g_transtype = '" + "R" + "'AND g_date BETWEEN '" + (fromDate) + "' AND '" + (toDate) + "'";
                    // String strsql = "SELECT sum(g_Rqnty)as bal,g_warehose,g_initprice,g_transtype,g_date FROM transaction GROUP BY g_itemcode HAVING g_itemcode = '" + icode + "' AND g_transtype = '" + "R" + "' AND g_date BETWEEN '" + (fromDate) + "' AND '" + (toDate) + "'";
                    String strsql = "SELECT sum(g_Rqnty)as bal,g_warehose,g_initprice,g_transtype,g_date FROM transaction WHERE g_itemcode = '" + icode + "' AND g_transtype = '" + "R" + "' AND g_date BETWEEN '" + (fromDate) + "' AND '" + (toDate) + "'";
                    ResultSet rs = dbconnector.Sql_OutResultset(strsql);
                    while (rs.next()) {

                        int Count = voidmodule.RCount(strsql);
                        intpb1 = Count;
                        pbar.setMaximum(intpb1);
                        pbar.setMinimum(0);

                        Rsum = rs.getDouble(1);
                        warehouse = rs.getString(2);
                        Uprize = rs.getDouble(3);


                        // Double estmtsum = this.getreceip1(0, "SELECT estimate_Qty FROM estimate  WHERE ProductCode = '" + icode + "'");
                        Double estmtsum = this.getreceip1(0, "SELECT SUM(estimate_Qty) FROM all_estimate  WHERE ProductCode = '" + icode + "'AND year = '" + RRyear + "'");
                        Double pstg = 0.0;
                        if (estmtsum == 0) {
                            pstg = 0.0;
                        } else {
                            pstg = ((Rsum / estmtsum) * 100);
                        }
                        Double bal = estmtsum - Rsum;


                        dbconnector.insertquery("INSERT INTO temp_estimate VALUES ('" + icode + "','" + Rsum + "','" + estmtsum + "','" + pstg + "','" + bal + "','" + warehouse + "','" + Uprize + "')");
                        int row = rs.getRow();
                        pb = row;
                        Runnable run = new Runnable() {

                            public void run() {
                                pbar.setValue(pb);

                            }
                        };


                        Thread tr = new Thread(run);
                        tr.start();

                    }

                    rs.close();
                    //  rss.close();
                }
                pbar.setString("Generating Completed");
                this.addselettbl("SELECT * FROM temp_estimate ORDER BY icode");
                JOptionPane.showMessageDialog(null, "Generating Completed");
            }

            btnprint.setEnabled(true);

        } catch (Exception ex) {
            Logger.getLogger(rptledger.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    private void btngendataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngendataActionPerformed

        Runnable run1 = new Runnable() {

            public void run() {
                optallset();
            }
        };


        Thread tr = new Thread(run1);
        tr.start();
    }//GEN-LAST:event_btngendataActionPerformed

    private void optgrponepageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optgrponepageActionPerformed
        btngendata.setEnabled(true);
        txtfromDate.setEnabled(true);
        txttoDate.setEnabled(true);
        cmdyear2.setEnabled(true);
        jLabel10.setEnabled(false);
        cmbcode.setEnabled(true);
        jLabel5.setEnabled(true);
        jLabel6.setEnabled(true);
        jLabel9.setEnabled(true);
    }//GEN-LAST:event_optgrponepageActionPerformed

    private void optgrptogetherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optgrptogetherActionPerformed
        btngendata.setEnabled(true);
        txtfromDate.setEnabled(true);
        txttoDate.setEnabled(true);
        cmdyear2.setEnabled(true);
        jLabel10.setEnabled(false);
        cmbcode.setEnabled(true);
        jLabel5.setEnabled(true);
        jLabel6.setEnabled(true);
        jLabel9.setEnabled(true);
    }//GEN-LAST:event_optgrptogetherActionPerformed

    private void txticodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txticodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txticodeActionPerformed

    private void optAestimateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optAestimateActionPerformed
        btngendata.setEnabled(false);
        jLabel6.setEnabled(false);
        btnprint.setEnabled(false);
        txtfromDate.setEnabled(false);
        jLabel5.setEnabled(false);
        jLabel9.setEnabled(false);
        txttoDate.setEnabled(false);
        cmdyear2.setEnabled(false);
        jLabel10.setEnabled(false);
        cmbcode.setEnabled(false);




    }//GEN-LAST:event_optAestimateActionPerformed

    private void cmbcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbcodeActionPerformed
        Object inscode = cmbcode.getSelectedItem();
        String insname = voidmodule.Out_fieldResulr("SELECT name from institution WHERE Incode = '" + inscode + "'");
        lblinsname.setText(insname);

    }//GEN-LAST:event_cmbcodeActionPerformed

    private void opesmtinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opesmtinsActionPerformed
        btngendata.setEnabled(true);
        txtfromDate.setEnabled(false);
        txttoDate.setEnabled(false);
        jLabel5.setEnabled(false);
        jLabel6.setEnabled(false);
        jLabel9.setEnabled(false);
        cmdyear2.setEnabled(true);
        jLabel10.setEnabled(true);
        cmbcode.setEnabled(false);
    }//GEN-LAST:event_opesmtinsActionPerformed

    private void cmdyear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdyear2ActionPerformed
        RRyear = cmdyear2.getSelectedItem();
    }//GEN-LAST:event_cmdyear2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String fromDate = df.format(txtfromDate.getDate());
        System.out.println(fromDate);
        String toDate = df.format(txttoDate.getDate());
        int Rcount = tblselectlist.getRowCount();

        for (int xx = 0; xx < Rcount; xx++) {
            try {
                String icode = tblselectlist.getValueAt(xx, 1).toString();
                Double Rsum = null;
                //    String strsql = "SELECT g_Rqnty,g_warehose,g_initprice FROM transaction   WHERE g_itemcode = '" + icode + "'AND g_transtype = '" + "R" + "'AND g_date BETWEEN '" + (fromDate) + "' AND '" + (toDate) + "'";
                String strsql = "SELECT sum(g_Rqnty)as bal,g_warehose,g_initprice,g_transtype,g_date FROM transaction GROUP BY g_itemcode HAVING g_itemcode = '" + icode + "' AND g_transtype = '" + "R" + "'AND g_date = '" + fromDate + "'";
                ResultSet rs = dbconnector.Sql_OutResultset(strsql);
                while (rs.next()) {



                    Rsum = rs.getDouble(1);
                    warehouse = rs.getString(2);
                    Uprize = rs.getDouble(3);

                    System.out.println(Rsum);


                }
            } catch (SQLException ex) {
                Logger.getLogger(rptestimate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        DateFormat df = new SimpleDateFormat("yyyy");
        String year = df.format(new java.util.Date());
        cmdyear2.setSelectedItem(year);
    }//GEN-LAST:event_formInternalFrameOpened
    Double getreceip(double sumreceipt, String query) {

        try {
            Statement rss = dbconnector.conn().createStatement();
            String onhand = null;
            ResultSet rs = rss.executeQuery(query);
            while (rs.next()) {
                onhand = rs.getString(1);
                warehouse = rs.getString(2);
                Uprize = rs.getDouble(3);
            }
            if (onhand == (null)) {
                sumreceipt = 0;
            } else {
                sumreceipt = Double.parseDouble(onhand);
            }

        } catch (Exception ex) {
            Logger.getLogger(frmgrn.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }


        return sumreceipt;
    }

    Double getreceip1(double sumestmt, String query) {

        try {
            Statement rse = dbconnector.conn().createStatement();
            String onhand = null;
            ResultSet rs = rse.executeQuery(query);
            while (rs.next()) {
                onhand = rs.getString(1);

            }
            if (onhand == (null)) {
                sumestmt = 0;
            } else {
                sumestmt = Double.parseDouble(onhand);
            }
        } catch (Exception ex) {
            Logger.getLogger(frmgrn.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }


        return sumestmt;
    }

    void additemcode(JTable tblitem, String query) {
        String icode = null;
        String name = null;
        try {
            DefaultTableModel addabl = (DefaultTableModel) tblitem.getModel();
            while (tblitem.getRowCount() > 0) {
                addabl.removeRow(0);
            }
            Statement rss = dbconnector.conn().createStatement();
            ResultSet rs = rss.executeQuery(query);
            while (rs.next()) {
                name = rs.getString(1);
                icode = rs.getString(2);
                addabl.addRow(new Object[]{name, icode});
            }

        } catch (Exception ex) {
            Logger.getLogger(frmStock.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    void addselettbl(String query) {
        String icode = null;
        Double Rsum = 0.0;
        Double estmtsum = 0.0;
        Double pstg = 0.0;
        Double bal = 0.0;

        try {


            DefaultTableModel addabl = (DefaultTableModel) tblgenerate.getModel();
            while (tblgenerate.getRowCount() > 0) {
                addabl.removeRow(0);
            }
            Statement rss = dbconnector.conn().createStatement();
            ResultSet rs = rss.executeQuery(query);
            while (rs.next()) {
                icode = rs.getString(1);
                Rsum = rs.getDouble(2);
                estmtsum = rs.getDouble(3);
                pstg = rs.getDouble(4);
                bal = rs.getDouble(5);
                addabl.addRow(new Object[]{icode, Rsum, estmtsum, pstg + " %", bal});
            }
        } catch (Exception ex) {
            Logger.getLogger(frmStock.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddall;
    private javax.swing.JButton btnaddone;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btngendata;
    private javax.swing.JButton btnprint;
    private javax.swing.JButton btnremoveall;
    private javax.swing.JButton btnremoveone;
    private javax.swing.JButton btnsave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbcode;
    private javax.swing.JComboBox cmdyear2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblinsname;
    private javax.swing.JRadioButton opesmtins;
    private javax.swing.JRadioButton optAestimate;
    private javax.swing.JRadioButton optall;
    private javax.swing.JRadioButton optgrponepage;
    private javax.swing.JRadioButton optgrptogether;
    private javax.swing.JProgressBar pbar;
    private javax.swing.JPanel selectList;
    private javax.swing.JTable tblgenerate;
    private javax.swing.JTable tblitemlist;
    private javax.swing.JTable tblselectlist;
    private de.wannawork.jcalendar.JCalendarComboBox txtfromDate;
    private javax.swing.JTextField txticode;
    private de.wannawork.jcalendar.JCalendarComboBox txttoDate;
    // End of variables declaration//GEN-END:variables
}
