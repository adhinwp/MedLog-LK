//Copyright (c) 2012, Provincial Department of Health Services, North western province, Sri Lanka
//All rights reserved.
package rmsd;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import mymod.dbconnector;
import mymod.voidmodule;

public class frmgrn extends JInternalFrame {

    public String user;
    public String a;
    public String gyear;

    public frmgrn() {
        initComponents();
        this.setuser(null);
        new AppletTimer(currenttime);



    }

    void setuser(String suser) {
        user = suser;

        a = voidmodule.readintitution(null);
        this.setTitle(a + "  - Invoice  -  User : " + user);

        voidmodule.fillcombo(cmbreceiptype, "SELECT DISTINCT rcptname from rcpttype ORDER BY rcptname");
        voidmodule.fillcombo(cmbReptcode, "SELECT DISTINCT rcptcode from rcpttype");
        Object sets = "Medical Supplies Division-Colombo";
        cmbreceiptype.setSelectedItem(sets);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtgrndate = new de.wannawork.jcalendar.JCalendarComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtgrn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtlot = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtperpack = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNopack = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtqnty = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txticode = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtunitprize = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lblunit = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblwh = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblsection = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtexpieddate = new de.wannawork.jcalendar.JCalendarComboBox();
        optexpyes = new javax.swing.JRadioButton();
        optexpno = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblgrn = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        optremove = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        txtcmmnts = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btnsave = new javax.swing.JButton();
        btnprint = new javax.swing.JButton();
        btnexecute = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        cmbreceiptype = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cmbReptcode = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        currenttime = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Icon24_24.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(215, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtgrndate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtgrndateFocusLost(evt);
            }
        });
        txtgrndate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtgrndateKeyPressed(evt);
            }
        });

        jLabel1.setText("GRN Date");

        jLabel2.setText("GRN No");

        txtgrn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgrnActionPerformed(evt);
            }
        });
        txtgrn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtgrnFocusLost(evt);
            }
        });
        txtgrn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtgrnKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtgrnKeyReleased(evt);
            }
        });

        jLabel3.setText("Lot No");

        txtlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlotActionPerformed(evt);
            }
        });
        txtlot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtlotKeyPressed(evt);
            }
        });

        jLabel4.setText("Units per Pack");

        txtperpack.setText("0");
        txtperpack.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtperpackFocusLost(evt);
            }
        });
        txtperpack.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtperpackKeyPressed(evt);
            }
        });

        jLabel5.setText("No of Pack");

        txtNopack.setText("0");
        txtNopack.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNopackFocusLost(evt);
            }
        });
        txtNopack.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNopackKeyPressed(evt);
            }
        });

        jLabel6.setText("Qnty");

        txtqnty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtqntyActionPerformed(evt);
            }
        });
        txtqnty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtqntyKeyPressed(evt);
            }
        });

        jLabel7.setText("Item Code");

        txticode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txticodeFocusLost(evt);
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

        jLabel8.setText("Unit Prize");

        txtunitprize.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtunitprizeKeyPressed(evt);
            }
        });

        jLabel9.setText("Unit");

        lblunit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblunit.setText("Unit");

        jLabel10.setForeground(new java.awt.Color(255, 153, 153));
        jLabel10.setText("Name");

        lblname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblname.setForeground(new java.awt.Color(255, 153, 153));
        lblname.setText("name");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Warehouse");

        lblwh.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblwh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblwh.setText("wh");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Section");

        lblsection.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblsection.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsection.setText("Section");

        jLabel13.setText("Expired Date");

        txtexpieddate.setEnabled(false);
        txtexpieddate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtexpieddateKeyPressed(evt);
            }
        });

        optexpyes.setBackground(new java.awt.Color(227, 200, 200));
        buttonGroup1.add(optexpyes);
        optexpyes.setText("Exp Date Yes");
        optexpyes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optexpyesActionPerformed(evt);
            }
        });

        optexpno.setBackground(new java.awt.Color(227, 200, 200));
        buttonGroup1.add(optexpno);
        optexpno.setSelected(true);
        optexpno.setText("Exp Date No");
        optexpno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optexpnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txticode)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtunitprize, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel6))
                            .addComponent(txtqnty))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(optexpno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(optexpyes, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtexpieddate, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(txtgrndate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtgrn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtlot, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtperpack, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(txtNopack, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblunit, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblwh, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblsection, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4))
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtgrn, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(txtlot, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtgrndate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNopack, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtperpack)))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblunit))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addGap(7, 7, 7)
                            .addComponent(lblwh))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblsection))))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txticode, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtqnty, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtunitprize)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(optexpno)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(optexpyes)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtexpieddate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(5, 5, 5))
        );

        jPanel2.setBackground(new java.awt.Color(215, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        tblgrn.setBackground(new java.awt.Color(204, 204, 255));
        tblgrn.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        tblgrn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tblgrn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item Name", "GRN Date", "GRNNo", "Lot", "Unit Prize", "Qnty", "Unit per i pack", "No Of Pack", "Expired Date", "Unit", "rcptcode"
            }
        ));
        tblgrn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblgrn.setRowHeight(30);
        tblgrn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblgrnMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblgrn);
        tblgrn.getColumnModel().getColumn(0).setMinWidth(0);
        tblgrn.getColumnModel().getColumn(0).setPreferredWidth(70);
        tblgrn.getColumnModel().getColumn(0).setMaxWidth(70);
        tblgrn.getColumnModel().getColumn(1).setMinWidth(0);
        tblgrn.getColumnModel().getColumn(1).setPreferredWidth(400);
        tblgrn.getColumnModel().getColumn(1).setMaxWidth(400);
        tblgrn.getColumnModel().getColumn(2).setMinWidth(0);
        tblgrn.getColumnModel().getColumn(2).setPreferredWidth(0);
        tblgrn.getColumnModel().getColumn(2).setMaxWidth(0);
        tblgrn.getColumnModel().getColumn(3).setMinWidth(0);
        tblgrn.getColumnModel().getColumn(3).setPreferredWidth(100);
        tblgrn.getColumnModel().getColumn(3).setMaxWidth(100);
        tblgrn.getColumnModel().getColumn(4).setMinWidth(0);
        tblgrn.getColumnModel().getColumn(4).setPreferredWidth(100);
        tblgrn.getColumnModel().getColumn(4).setMaxWidth(100);
        tblgrn.getColumnModel().getColumn(7).setMinWidth(0);
        tblgrn.getColumnModel().getColumn(7).setPreferredWidth(0);
        tblgrn.getColumnModel().getColumn(7).setMaxWidth(0);
        tblgrn.getColumnModel().getColumn(8).setMinWidth(0);
        tblgrn.getColumnModel().getColumn(8).setPreferredWidth(0);
        tblgrn.getColumnModel().getColumn(8).setMaxWidth(0);
        tblgrn.getColumnModel().getColumn(9).setMinWidth(0);
        tblgrn.getColumnModel().getColumn(9).setPreferredWidth(100);
        tblgrn.getColumnModel().getColumn(9).setMaxWidth(100);
        tblgrn.getColumnModel().getColumn(10).setMinWidth(0);
        tblgrn.getColumnModel().getColumn(10).setPreferredWidth(0);
        tblgrn.getColumnModel().getColumn(10).setMaxWidth(0);
        tblgrn.getColumnModel().getColumn(11).setMinWidth(0);
        tblgrn.getColumnModel().getColumn(11).setPreferredWidth(0);
        tblgrn.getColumnModel().getColumn(11).setMaxWidth(0);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(215, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        optremove.setText("Remove Item");
        optremove.setOpaque(false);
        optremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optremoveActionPerformed(evt);
            }
        });

        jLabel14.setText("Comments");

        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save.jpg"))); // NOI18N
        btnsave.setText("Save");
        btnsave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        btnsave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnsaveKeyPressed(evt);
            }
        });
        jPanel5.add(btnsave);

        btnprint.setText("Print STV");
        btnprint.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintActionPerformed(evt);
            }
        });
        jPanel5.add(btnprint);

        btnexecute.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/process1.jpg"))); // NOI18N
        btnexecute.setText("Execute");
        btnexecute.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnexecute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexecuteActionPerformed(evt);
            }
        });
        jPanel5.add(btnexecute);

        btnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit.jpg"))); // NOI18N
        btnexit.setText("Exit");
        btnexit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        jPanel5.add(btnexit);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(txtcmmnts, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(optremove, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(txtcmmnts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(optremove)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(227, 200, 200));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cmbreceiptype.setEditable(true);
        cmbreceiptype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbreceiptypeActionPerformed(evt);
            }
        });
        cmbreceiptype.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbreceiptypeKeyPressed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setText("Receipt Type");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setText("Receipt Code");

        cmbReptcode.setEditable(true);
        cmbReptcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbReptcodeActionPerformed(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/stv.jpg"))); // NOI18N
        jLabel17.setText("jLabel17");

        currenttime.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        currenttime.setForeground(new java.awt.Color(140, 54, 54));
        currenttime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        currenttime.setText("Time");

        jButton1.setBackground(new java.awt.Color(227, 200, 200));
        jButton1.setText("Add Institution");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbreceiptype, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbReptcode, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(currenttime, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(currenttime))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(jLabel15)
                        .addComponent(cmbreceiptype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)
                        .addComponent(cmbReptcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        this.Stocksave();

    }//GEN-LAST:event_btnsaveActionPerformed
    void Stocksave() {

        dbconnector.conn();



        String grn = txtgrn.getText();
        String lot = txtlot.getText();
        Integer packsize = Integer.parseInt(txtperpack.getText().toString());
        Integer nopack = Integer.parseInt(txtNopack.getText().toString());
        String wh = lblwh.getText();
        String section = lblsection.getText();
        String icode = txticode.getText();
        Object Reptcode = cmbReptcode.getSelectedItem();
        String temp = "temp";
        String rtype = "R";
        String itype = "I";
        String Snull = "-";
        int orderCode = 0;
        String cmmnts = txtcmmnts.getText();
        double unitprize = Double.parseDouble(txtunitprize.getText());
        double qnty = Double.parseDouble(txtqnty.getText());
        double dnull = Double.parseDouble("0.0");


        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat dfmonth = new SimpleDateFormat("MM");
        DateFormat dfday = new SimpleDateFormat("dd");
        DateFormat dfyear = new SimpleDateFormat("yyyy");


        String sysdate = df.format(date);
        String grndate = df.format(txtgrndate.getDate());
        String gmonth = dfmonth.format(txtgrndate.getDate());
        String gday = dfday.format(txtgrndate.getDate());
        String gyear = dfyear.format(txtgrndate.getDate());
        String expirddate = null;
        if (optexpno.isSelected() == true) {
            expirddate = "2100-12-31";
        } else if (optexpyes.isSelected() == true) {
            expirddate = df.format(txtexpieddate.getDate());
        }

        try {
            if (optremove.isSelected() == true) {
                int i = MessageBox.yesno("Do You Want to Delete Item  " + icode);
                if (i == 0) {
                    dbconnector.insertquery("DELETE FROM transaction WHERE g_grnno ='" + grn + "'AND g_itemcode ='" + icode + "'AND g_lot ='" + lot + "'AND g_year ='" + gyear + "'AND g_transtype ='" + rtype + "'");
                    voidmodule.U_transaction(user, "GRN deleted " + grn);
                }
            } else {


                int Count = voidmodule.RCount("SELECT g_grnno from transaction WHERE g_grnno ='" + grn + "'AND g_itemcode ='" + icode + "'AND g_lot ='" + lot + "'AND g_year ='" + gyear + "'");
                if (Count > 0) {
                    int i = MessageBox.yesno("Records Already Exited. Do You Want to Update Records…? ");
                    if (i == 0) {
                        dbconnector.insertquery("UPDATE transaction SET g_date = '" + grndate + "',g_sysdate = '" + sysdate + "',g_year = '" + gyear + "',g_month = '" + gmonth + "',g_warehose = '" + wh + "',g_section = '" + section + "',g_lot = '" + lot + "',g_packsize = '" + packsize + "',g_packs = '" + nopack + "',g_itemcode = '" + icode + "',g_status = '" + temp + "',g_transtype = '" + rtype + "',g_receipttype = '" + Reptcode + "',g_initprice = '" + unitprize + "',g_expdate = '" + expirddate + "',g_qnty = '" + qnty + "',g_Rqnty = '" + qnty + "',g_coment = '" + cmmnts + "',g_user = '" + user + "'WHERE g_grnno ='" + grn + "'AND g_itemcode ='" + icode + "'AND g_lot ='" + lot + "'AND g_year ='" + gyear + "'AND g_transtype ='" + rtype + "'");
                        //Print Transaction
                        voidmodule.U_transaction(user, "Update GRN " + grn);
                    } else {
                    }
                } else {
                    dbconnector.insertquery("INSERT INTO transaction VALUES ('" + grn + "','" + Snull + "','" + Snull + "','" + orderCode + "','" + grndate + "','" + sysdate + "','" + gyear + "','" + gmonth + "','" + gday + "','" + wh + "','" + section + "','" + lot + "','" + packsize + "','" + nopack + "','" + icode + "','" + temp + "','" + rtype + "','" + Reptcode + "','" + unitprize + "','" + expirddate + "','" + qnty + "','" + qnty + "','" + dnull + "','" + cmmnts + "','" + user + "')");
                    // JOptionPane.showMessageDialog(null, "Records Saved");
                    txtlot.requestFocus();

                    txtlot.setText(null);
                    txtperpack.setText(null);
                    txtNopack.setText(null);
                    txticode.setText(null);
                    txtunitprize.setText(null);
                    txtqnty.setText(null);




                }
            }
            this.lablindicate("SELECT T.g_grnno,T.g_date,T.g_receipttype,T.g_lot,T.g_packsize,T.g_packs,T.g_warehose,T.g_section,T.g_itemcode,T.g_initprice,T.g_Rqnty,T.g_expdate,S.d_name,S.d_unit from transaction as T inner join dgs_surgicallist as S on S.d_srno = T.g_itemcode  WHERE T.g_grnno ='" + grn + "'AND T.g_transtype ='" + "R" + "'AND T.g_year ='" + gyear + "'ORDER BY T.g_grnno");
            dbconnector.insertquery("DELETE FROM unit_price WHERE g_itemcode ='" + icode + "'");
            dbconnector.insertquery("INSERT INTO unit_price VALUES ('" + icode + "','" + unitprize + "','" + user + "')");
        } catch (SQLException ex) {
            Logger.getLogger(frmStock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        this.setVisible(false);
}//GEN-LAST:event_btnexitActionPerformed

    private void optremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optremoveActionPerformed
        if (optremove.isSelected() == true) {
            btnsave.setText("Delete");
        } else {
            btnsave.setText("Save");
        }
}//GEN-LAST:event_optremoveActionPerformed

    private void txticodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txticodeFocusLost
        String icode = txticode.getText();
        this.addname("SELECT d_name,d_unit FROM dgs_surgicallist  WHERE d_srno = '" + icode + "'");
        this.checkstatus();
    }//GEN-LAST:event_txticodeFocusLost

    private void txticodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txticodeKeyPressed
        if (evt.getKeyCode() == 10) {
            String icode = txticode.getText();
            this.addname("SELECT d_name,d_unit FROM dgs_surgicallist  WHERE d_srno = '" + icode + "'");
        }
    }//GEN-LAST:event_txticodeKeyPressed

    private void txtgrndateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtgrndateKeyPressed
        if (evt.getKeyCode() == 10) {
            txtgrn.requestFocus();
        }
    }//GEN-LAST:event_txtgrndateKeyPressed

    private void txtgrnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtgrnKeyPressed

        if (evt.getKeyCode() == 10) {
            txtlot.requestFocus();
        }
    }//GEN-LAST:event_txtgrnKeyPressed

    private void txtlotKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlotKeyPressed
        if (evt.getKeyCode() == 10) {
            txtperpack.requestFocus();
        }
    }//GEN-LAST:event_txtlotKeyPressed

    private void txtperpackKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtperpackKeyPressed
        if (evt.getKeyCode() == 10) {
            txtNopack.requestFocus();
        }
    }//GEN-LAST:event_txtperpackKeyPressed

    private void txtNopackKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNopackKeyPressed
        if (evt.getKeyCode() == 10) {
            txticode.requestFocus();
        }
    }//GEN-LAST:event_txtNopackKeyPressed

    private void txtunitprizeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtunitprizeKeyPressed
        if (evt.getKeyCode() == 10) {
            txtqnty.requestFocus();
        }
    }//GEN-LAST:event_txtunitprizeKeyPressed

    private void txtqntyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtqntyKeyPressed
        if (evt.getKeyCode() == 10) {
            txtexpieddate.requestFocus();
        }
    }//GEN-LAST:event_txtqntyKeyPressed

    private void txtexpieddateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtexpieddateKeyPressed
        if (evt.getKeyCode() == 10) {
            btnsave.requestFocus();
        }
    }//GEN-LAST:event_txtexpieddateKeyPressed

    private void txtgrnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtgrnFocusLost
        try {
            String a = txtgrn.getText();
            String wh = a.substring(0, 3);

            DateFormat dfyear = new SimpleDateFormat("yyyy");
            gyear = dfyear.format(txtgrndate.getDate());
            lblwh.setText(wh);


            int Count = voidmodule.RCount("SELECT wh FROM warehouse  WHERE wh = '" + wh + "'");


            if (Count < 0) {
                JOptionPane.showMessageDialog(null, "Incorrect Werehouse No..");
                txtgrn.setText(null);
                DefaultTableModel addabl = (DefaultTableModel) tblgrn.getModel();
                while (tblgrn.getRowCount() > 0) {
                    addabl.removeRow(0);
                }
                txtgrn.requestFocus();
            } else {


                String grn = txtgrn.getText();
                this.lablindicate("SELECT T.g_grnno,T.g_date,T.g_receipttype,T.g_lot,T.g_packsize,T.g_packs,T.g_warehose,T.g_section,T.g_itemcode,T.g_initprice,T.g_Rqnty,T.g_expdate,S.d_name,S.d_unit from transaction as T inner join dgs_surgicallist as S on S.d_srno = T.g_itemcode  WHERE T.g_grnno ='" + grn + "'AND T.g_transtype ='" + "R" + "'AND T.g_year ='" + gyear + "'ORDER BY T.g_grnno");
                this.addcatgory();
                this.checkstatus();
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmgrn.class.getName()).log(Level.SEVERE, null, ex);
        }




    }//GEN-LAST:event_txtgrnFocusLost

    private void tblgrnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblgrnMouseReleased
        int SelectedRow = tblgrn.getSelectedRow();
        String icode = tblgrn.getValueAt(SelectedRow, 0).toString();
        String name = tblgrn.getValueAt(SelectedRow, 1).toString();
        Date grndate = (Date) tblgrn.getValueAt(SelectedRow, 2);
        String grn = tblgrn.getValueAt(SelectedRow, 3).toString();
        String lot = tblgrn.getValueAt(SelectedRow, 4).toString();
        String unitprize = tblgrn.getValueAt(SelectedRow, 5).toString();
        String qnty = tblgrn.getValueAt(SelectedRow, 6).toString();
        String packsize = tblgrn.getValueAt(SelectedRow, 7).toString();
        String nopack = tblgrn.getValueAt(SelectedRow, 8).toString();
        Date expdate = (Date) tblgrn.getValueAt(SelectedRow, 9);
        String unit = tblgrn.getValueAt(SelectedRow, 10).toString();
        String Reptcode = tblgrn.getValueAt(SelectedRow, 11).toString();


        txtgrndate.setDate(grndate);
        txtexpieddate.setDate(expdate);
        txtgrn.setText(grn);
        txtlot.setText(lot);
        txtperpack.setText(packsize);
        txtNopack.setText(nopack);
        //   lblwh.setText(wh);
        //  lblsection.setText(section);
        txticode.setText(icode);
        lblname.setText(name);
        txtunitprize.setText(unitprize + "");
        txtqnty.setText(qnty + "");
        lblunit.setText(unit);
        cmbReptcode.setSelectedItem(Reptcode);

        optremove.setSelected(false);
        btnsave.setText("Update");
    }//GEN-LAST:event_tblgrnMouseReleased

    private void txtNopackFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNopackFocusLost
        int x = Integer.parseInt(txtNopack.getText());
        int y = Integer.parseInt(txtperpack.getText());
        int m = x * y;
        txtqnty.setText(m + "");


    }//GEN-LAST:event_txtNopackFocusLost

    private void txtperpackFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtperpackFocusLost
        int x = Integer.parseInt(txtNopack.getText());
        int y = Integer.parseInt(txtperpack.getText());
        int m = x * y;
        txtqnty.setText(m + "");
    }//GEN-LAST:event_txtperpackFocusLost

    private void btnexecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexecuteActionPerformed



        dbconnector.conn();
        try {
            String grn = txtgrn.getText();
            String conf = "conf";
            int i = MessageBox.yesno("Do You Want to Execute  " + grn + ".  Please be make sure to cannot Do any Update after Execute…? ");
            if (i == 0) {

                dbconnector.insertquery("UPDATE transaction SET g_status = '" + conf + "'WHERE g_grnno ='" + grn + "'AND g_year ='" + gyear + "'");
                voidmodule.U_transaction(user, "GRN Update " + grn);
                this.checkstatus();
                this.btnprintActionPerformed(evt);
            } else {
            }

        } catch (SQLException ex) {
            Logger.getLogger(frmgrn.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnexecuteActionPerformed

    private void btnsaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnsaveKeyPressed
        if (evt.getKeyCode() == 10) {
            this.Stocksave();
        }
    }//GEN-LAST:event_btnsaveKeyPressed

    private void txtqntyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtqntyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtqntyActionPerformed

    private void txtlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlotActionPerformed

    private void optexpnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optexpnoActionPerformed
        txtexpieddate.setEnabled(false);
    }//GEN-LAST:event_optexpnoActionPerformed

    private void optexpyesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optexpyesActionPerformed
        txtexpieddate.setEnabled(true);
    }//GEN-LAST:event_optexpyesActionPerformed

    private void txtgrnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtgrnKeyReleased
    }//GEN-LAST:event_txtgrnKeyReleased

    private void txticodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txticodeKeyReleased
        optexpno.setSelected(true);
        txtexpieddate.setEnabled(false);
    }//GEN-LAST:event_txticodeKeyReleased

    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed
        try {
            String grn = txtgrn.getText();
            String pR = "R";
            DateFormat dfyear = new SimpleDateFormat("yyyy");
            gyear = dfyear.format(txtgrndate.getDate());


            int Count = voidmodule.RCount("SELECT g_ordercode from transaction WHERE g_grnno ='" + grn + "'AND g_transtype ='" + "R" + "'AND g_status ='" + "temp" + "'AND g_year ='" + gyear + "'");
            if (Count > 0) {
                JOptionPane.showMessageDialog(null, "Awaiting Execute...");
            } else {


                try {


                    Map m = new HashMap();
                    m.put("p_grn", grn);
                    m.put("p_R", pR);
                    m.put("p_year", gyear);
                    m.put("p_institute", a);

                    voidmodule.generateReport("//Report//stv.jrxml", m);


                } catch (ArrayIndexOutOfBoundsException aiobe) {
                    JOptionPane.showMessageDialog(null, "PLS SELCET CUSTOMER FROM TABLE ");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmgrn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnprintActionPerformed

    private void txtgrndateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtgrndateFocusLost
        DateFormat dfyear = new SimpleDateFormat("yyyy");
        gyear = dfyear.format(txtgrndate.getDate());
    }//GEN-LAST:event_txtgrndateFocusLost

    private void cmbReptcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbReptcodeActionPerformed
        Object Reptcode = cmbReptcode.getSelectedItem();
        this.addrcpttype(cmbreceiptype, "SELECT rcptname from rcpttype WHERE rcptcode ='" + Reptcode + "'");


    }//GEN-LAST:event_cmbReptcodeActionPerformed

    private void cmbreceiptypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbreceiptypeActionPerformed
        Object receiptype = cmbreceiptype.getSelectedItem();
        this.addrcpttype(cmbReptcode, "SELECT rcptcode from rcpttype WHERE rcptname ='" + receiptype + "'");

    }//GEN-LAST:event_cmbreceiptypeActionPerformed

    private void txtgrnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgrnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgrnActionPerformed

    private void cmbreceiptypeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbreceiptypeKeyPressed
        if (evt.getKeyCode() == 10) {
            txtgrndate.requestFocus();
        }
    }//GEN-LAST:event_cmbreceiptypeKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        frmreceiptinsti open = new frmreceiptinsti();
        MDI.jDesktopPane1.add(open);
        open.setVisible(true);
        open.setuser(user);
    }//GEN-LAST:event_jButton1ActionPerformed

    void lablindicate(String query) {
        Date grndate = null;
        Date expdate = null;
        String grn = null;
        String lot = null;
        String packsize = null;
        String nopack = null;
        String wh = null;
        String section = null;
        String icode = null;
        String name = null;
        String unit = null;
        String rcptcode = null;
        double unitprize = 0;
        int qnty = 0;




        try {


            DefaultTableModel addabl = (DefaultTableModel) tblgrn.getModel();
            while (tblgrn.getRowCount() > 0) {
                addabl.removeRow(0);
            }


            Statement rss = dbconnector.conn().createStatement();
            ResultSet rs = rss.executeQuery(query);
            while (rs.next()) {

                grndate = (Date) rs.getDate("T.g_date");
                expdate = (Date) rs.getDate("T.g_expdate");
                grn = rs.getString("T.g_grnno");
                lot = rs.getString("T.g_lot");
                packsize = rs.getString("T.g_packsize");
                nopack = rs.getString("T.g_packs");
                wh = rs.getString("T.g_warehose");
                section = rs.getString("T.g_section");
                icode = rs.getString("T.g_itemcode");
                name = rs.getString("S.d_name");
                unit = rs.getString("S.d_unit");
                rcptcode = rs.getString("T.g_receipttype");
                unitprize = rs.getDouble("T.g_initprice");
                qnty = Integer.parseInt(rs.getString("T.g_Rqnty"));

                addabl.addRow(new Object[]{icode, name, grndate, grn, lot, unitprize, qnty, packsize, nopack, expdate, unit, rcptcode});

            }
        } catch (SQLException ex) {
            Logger.getLogger(frmStock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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

    void addname(String query) {

        try {
            Statement rss = dbconnector.conn().createStatement();
            String icode = txticode.getText();

            String name = null;
            String unit = null;


            int Count = voidmodule.RCount("SELECT d_name,d_unit FROM dgs_surgicallist  WHERE d_srno = '" + icode + "'");
            if (Count > 0) {
                ResultSet rs = rss.executeQuery(query);

                while (rs.next()) {
                    name = rs.getString(1);
                    unit = rs.getString(2);
                }
                lblname.setText(name);
                lblunit.setText(unit);
                txtunitprize.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect Item Code");
                txticode.setText(null);
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmgrn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void addcatgory() {

        String grnno = txtgrn.getText();
        // String incode = a.substring(a.length()-2, a.length());
        String setwh = grnno.substring(0, 3);




        try {
            Statement rss = dbconnector.conn().createStatement();
            String wh = null;
            String sec = null;

            int Count = voidmodule.RCount("SELECT wh FROM warehouse  WHERE wh = '" + setwh + "'");
            if (Count > 0) {
                ResultSet rs = rss.executeQuery("SELECT * FROM warehouse  WHERE wh = '" + setwh + "'");

                while (rs.next()) {
                    wh = rs.getString("wh");
                    sec = rs.getString("catagory");
                }
                lblwh.setText(wh);
                lblsection.setText(sec);


                Date date = new Date();
                Date tddate = (date);
                txtexpieddate.setDate(tddate);
                txtgrndate.setDate(tddate);
                txtlot.setText(null);
                txtperpack.setText("0");
                txtNopack.setText("0");
                //lblwh.setText(null);
                //lblsection.setText(null);
                txticode.setText(null);
                lblname.setText(null);
                txtunitprize.setText(null);
                txtqnty.setText(null);
                lblunit.setText(null);

                btnsave.setText("Save");


            } else {
                JOptionPane.showMessageDialog(null, "Incorrect Warehouse Code");
                txtgrn.setText(null);
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmgrn.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void checkstatus() {

        try {

            String grn = txtgrn.getText();
            DateFormat dfyear = new SimpleDateFormat("yyyy");
            gyear = dfyear.format(txtgrndate.getDate());

            int Count = voidmodule.RCount("SELECT g_ordercode from transaction WHERE g_grnno ='" + grn + "'AND g_transtype ='" + "R" + "'AND g_status ='" + "conf" + "'AND g_year ='" + gyear + "'");
            if (Count > 0) {
                btnsave.setEnabled(false);
                btnexecute.setEnabled(false);
                tblgrn.setForeground(Color.red);
            } else {
                btnsave.setEnabled(true);
                btnexecute.setEnabled(true);
                tblgrn.setForeground(Color.BLACK);
            }





            String admin = voidmodule.admin(user);
            String xy = "Administrator";

            try {
                if (admin.equals(xy)) {
                    btnsave.setEnabled(true);
                    btnexecute.setEnabled(true);
                    tblgrn.setForeground(Color.BLUE);
                } else {
                    // JOptionPane.showMessageDialog(this, "You do not have permission to Access ");
                    //  System.exit(0);
                }

            } catch (Exception ex) {
                Logger.getLogger(dbconnector.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, ex);

            }

        } catch (SQLException ex) {
            Logger.getLogger(frmgrn.class.getName()).log(Level.SEVERE, null,ex);

        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexecute;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnprint;
    private javax.swing.JButton btnsave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbReptcode;
    private javax.swing.JComboBox cmbreceiptype;
    private javax.swing.JLabel currenttime;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblsection;
    private javax.swing.JLabel lblunit;
    private javax.swing.JLabel lblwh;
    private javax.swing.JRadioButton optexpno;
    private javax.swing.JRadioButton optexpyes;
    private javax.swing.JRadioButton optremove;
    private javax.swing.JTable tblgrn;
    private javax.swing.JTextField txtNopack;
    private javax.swing.JTextField txtcmmnts;
    private de.wannawork.jcalendar.JCalendarComboBox txtexpieddate;
    private javax.swing.JTextField txtgrn;
    private de.wannawork.jcalendar.JCalendarComboBox txtgrndate;
    private javax.swing.JTextField txticode;
    private javax.swing.JTextField txtlot;
    private javax.swing.JTextField txtperpack;
    private javax.swing.JTextField txtqnty;
    private javax.swing.JTextField txtunitprize;
    // End of variables declaration//GEN-END:variables
}
