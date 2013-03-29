//Copyright (c) 2012, Provincial Department of Health Services, North western province, Sri Lanka
//All rights reserved.
package rmsd;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import mymod.dbconnector;
import mymod.voidmodule;

public class frmInvoice_stores2 extends javax.swing.JInternalFrame {

    public String User;
    public int stmax;
    public String gyear;
    public int grnbal;
    public String a;
    public String psection;

    public frmInvoice_stores2() {
        initComponents();
        this.setuser(null);
        this.setOrderCode();
        new AppletTimer(currenttime);
    }

    void setuser(String suser) {
        User = suser;
   
        a = voidmodule.readintitution(null);
        this.setTitle(a + "  - Invoice  -  User : " + User);


        this.setincode();

    }

   void setincode() {
        //  try {


        String codeltr = voidmodule.Out_fieldResulr("SELECT incode_leter from incodeltr ");
        txtInscode.setText(codeltr);
        //txtInscode.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter(codeltr + "AAAA")));
        //  cmbinsltr.requestFocus();
        //    } catch (java.text.ParseException ex) {
        //  }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEstimate = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        txtsearchName = new javax.swing.JTextField();
        btnshowAll = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblgrn = new javax.swing.JTable();
        lblins = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnexit = new javax.swing.JButton();
        optremove = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        txtcmmnts = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        btnexecute = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txticode = new javax.swing.JFormattedTextField();
        txtInvoiceDate = new de.wannawork.jcalendar.JCalendarComboBox();
        btnshowitem = new javax.swing.JButton();
        txtInscode = new javax.swing.JFormattedTextField();
        txtqnty = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtOderCode = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lblinvoice = new javax.swing.JLabel();
        btnshowitem1 = new javax.swing.JButton();
        cmbinvoce = new javax.swing.JComboBox();
        cmbsection = new javax.swing.JComboBox();
        jLabel26 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnNewOcode = new javax.swing.JButton();
        btninvoce = new javax.swing.JButton();
        btnoderform = new javax.swing.JButton();
        btnmovement = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblinstitution = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        lblunit = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblgrn = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbllot = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblwh = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblsection = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblgrnDate = new javax.swing.JLabel();
        lblexpDate = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblunitp = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        lblttlissue = new javax.swing.JLabel();
        lblonhand = new javax.swing.JLabel();
        lblbaltoissue = new javax.swing.JLabel();
        lblestimate = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lblpacksize = new javax.swing.JLabel();
        lblrcptcode = new javax.swing.JLabel();
        currenttime = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setText("Order List");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setText("Annual Estimate ");

        tblEstimate.setForeground(new java.awt.Color(140, 54, 54));
        tblEstimate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item Name", "GRN Date", "GRNNo", "Lot", "Unit Prize", "Qnty", "Unit per i pack", "No Of Pack", "Expired Date", "Unit", "wh", "section", "Ins Code"
            }
        ));
        tblEstimate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblEstimateMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblEstimate);
        tblEstimate.getColumnModel().getColumn(0).setMinWidth(0);
        tblEstimate.getColumnModel().getColumn(0).setPreferredWidth(70);
        tblEstimate.getColumnModel().getColumn(0).setMaxWidth(70);
        tblEstimate.getColumnModel().getColumn(1).setMinWidth(0);
        tblEstimate.getColumnModel().getColumn(1).setPreferredWidth(300);
        tblEstimate.getColumnModel().getColumn(1).setMaxWidth(300);
        tblEstimate.getColumnModel().getColumn(2).setMinWidth(0);
        tblEstimate.getColumnModel().getColumn(2).setPreferredWidth(0);
        tblEstimate.getColumnModel().getColumn(2).setMaxWidth(0);
        tblEstimate.getColumnModel().getColumn(4).setMinWidth(0);
        tblEstimate.getColumnModel().getColumn(4).setPreferredWidth(30);
        tblEstimate.getColumnModel().getColumn(4).setMaxWidth(30);
        tblEstimate.getColumnModel().getColumn(5).setMinWidth(0);
        tblEstimate.getColumnModel().getColumn(5).setPreferredWidth(0);
        tblEstimate.getColumnModel().getColumn(5).setMaxWidth(0);
        tblEstimate.getColumnModel().getColumn(7).setMinWidth(0);
        tblEstimate.getColumnModel().getColumn(7).setPreferredWidth(0);
        tblEstimate.getColumnModel().getColumn(7).setMaxWidth(0);
        tblEstimate.getColumnModel().getColumn(8).setMinWidth(0);
        tblEstimate.getColumnModel().getColumn(8).setPreferredWidth(0);
        tblEstimate.getColumnModel().getColumn(8).setMaxWidth(0);
        tblEstimate.getColumnModel().getColumn(9).setMinWidth(0);
        tblEstimate.getColumnModel().getColumn(9).setPreferredWidth(0);
        tblEstimate.getColumnModel().getColumn(9).setMaxWidth(0);
        tblEstimate.getColumnModel().getColumn(10).setMinWidth(0);
        tblEstimate.getColumnModel().getColumn(10).setPreferredWidth(0);
        tblEstimate.getColumnModel().getColumn(10).setMaxWidth(0);
        tblEstimate.getColumnModel().getColumn(11).setMinWidth(0);
        tblEstimate.getColumnModel().getColumn(11).setPreferredWidth(0);
        tblEstimate.getColumnModel().getColumn(11).setMaxWidth(0);
        tblEstimate.getColumnModel().getColumn(12).setMinWidth(0);
        tblEstimate.getColumnModel().getColumn(12).setPreferredWidth(0);
        tblEstimate.getColumnModel().getColumn(12).setMaxWidth(0);
        tblEstimate.getColumnModel().getColumn(13).setMinWidth(0);
        tblEstimate.getColumnModel().getColumn(13).setPreferredWidth(100);
        tblEstimate.getColumnModel().getColumn(13).setMaxWidth(100);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setText("Search By Item Name");

        txtsearchName.setBackground(new java.awt.Color(255, 204, 204));
        txtsearchName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtsearchName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtsearchNameMouseReleased(evt);
            }
        });
        txtsearchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchNameActionPerformed(evt);
            }
        });
        txtsearchName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchNameKeyReleased(evt);
            }
        });

        btnshowAll.setText("Show All");
        btnshowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowAllActionPerformed(evt);
            }
        });

        tblgrn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item Name", "GRN Date", "GRNNo", "Lot", "Unit Prize", "Qnty", "Unit per i pack", "No Of Pack", "Expired Date", "Unit", "wh", "section", "Ins Code", "recptcode", "comments", "Invoice No", "O Code"
            }
        ));
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
        tblgrn.getColumnModel().getColumn(1).setPreferredWidth(300);
        tblgrn.getColumnModel().getColumn(1).setMaxWidth(300);
        tblgrn.getColumnModel().getColumn(2).setMinWidth(0);
        tblgrn.getColumnModel().getColumn(2).setPreferredWidth(0);
        tblgrn.getColumnModel().getColumn(2).setMaxWidth(0);
        tblgrn.getColumnModel().getColumn(4).setMinWidth(0);
        tblgrn.getColumnModel().getColumn(4).setPreferredWidth(30);
        tblgrn.getColumnModel().getColumn(4).setMaxWidth(30);
        tblgrn.getColumnModel().getColumn(5).setMinWidth(0);
        tblgrn.getColumnModel().getColumn(5).setPreferredWidth(0);
        tblgrn.getColumnModel().getColumn(5).setMaxWidth(0);
        tblgrn.getColumnModel().getColumn(7).setMinWidth(0);
        tblgrn.getColumnModel().getColumn(7).setPreferredWidth(0);
        tblgrn.getColumnModel().getColumn(7).setMaxWidth(0);
        tblgrn.getColumnModel().getColumn(8).setMinWidth(0);
        tblgrn.getColumnModel().getColumn(8).setPreferredWidth(0);
        tblgrn.getColumnModel().getColumn(8).setMaxWidth(0);
        tblgrn.getColumnModel().getColumn(9).setMinWidth(0);
        tblgrn.getColumnModel().getColumn(9).setPreferredWidth(0);
        tblgrn.getColumnModel().getColumn(9).setMaxWidth(0);
        tblgrn.getColumnModel().getColumn(10).setMinWidth(0);
        tblgrn.getColumnModel().getColumn(10).setPreferredWidth(0);
        tblgrn.getColumnModel().getColumn(10).setMaxWidth(0);
        tblgrn.getColumnModel().getColumn(11).setMinWidth(0);
        tblgrn.getColumnModel().getColumn(11).setPreferredWidth(0);
        tblgrn.getColumnModel().getColumn(11).setMaxWidth(0);
        tblgrn.getColumnModel().getColumn(12).setMinWidth(0);
        tblgrn.getColumnModel().getColumn(12).setPreferredWidth(0);
        tblgrn.getColumnModel().getColumn(12).setMaxWidth(0);
        tblgrn.getColumnModel().getColumn(13).setMinWidth(0);
        tblgrn.getColumnModel().getColumn(13).setPreferredWidth(0);
        tblgrn.getColumnModel().getColumn(13).setMaxWidth(0);
        tblgrn.getColumnModel().getColumn(14).setMinWidth(0);
        tblgrn.getColumnModel().getColumn(14).setPreferredWidth(0);
        tblgrn.getColumnModel().getColumn(14).setMaxWidth(0);
        tblgrn.getColumnModel().getColumn(15).setMinWidth(0);
        tblgrn.getColumnModel().getColumn(15).setPreferredWidth(0);
        tblgrn.getColumnModel().getColumn(15).setMaxWidth(0);
        tblgrn.getColumnModel().getColumn(16).setMinWidth(0);
        tblgrn.getColumnModel().getColumn(16).setPreferredWidth(0);
        tblgrn.getColumnModel().getColumn(16).setMaxWidth(0);

        lblins.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblins.setText("0");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Records :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblins, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtsearchName, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnshowAll))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 274, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnshowAll)
                            .addComponent(lblins))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(jLabel20)
                            .addComponent(txtsearchName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit.jpg"))); // NOI18N
        btnexit.setText("Exit");
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

        jLabel14.setText("Comments");

        txtcmmnts.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtcmmnts.setForeground(new java.awt.Color(0, 0, 255));
        txtcmmnts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcmmntsActionPerformed(evt);
            }
        });

        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save.jpg"))); // NOI18N
        btnsave.setText("Save");
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

        btnexecute.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/process1.jpg"))); // NOI18N
        btnexecute.setText("Execute");
        btnexecute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexecuteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(txtcmmnts, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optremove, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnexecute)
                .addGap(2, 2, 2)
                .addComponent(btnexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optremove)
                    .addComponent(txtcmmnts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(btnexit)
                    .addComponent(btnsave)
                    .addComponent(btnexecute))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Invoice Date");

        txticode.setForeground(new java.awt.Color(153, 0, 0));
        try {
            txticode.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("**AAAA")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txticode.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txticode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txticodeFocusGained(evt);
            }
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

        btnshowitem.setText("jButton1");
        btnshowitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowitemActionPerformed(evt);
            }
        });

        txtInscode.setForeground(new java.awt.Color(153, 0, 0));
        txtInscode.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtInscode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInscodeActionPerformed(evt);
            }
        });
        txtInscode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtInscodeFocusLost(evt);
            }
        });
        txtInscode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtInscodeKeyPressed(evt);
            }
        });

        txtqnty.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtqnty.setForeground(new java.awt.Color(153, 0, 0));
        txtqnty.setText("0");
        txtqnty.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtqntyFocusLost(evt);
            }
        });
        txtqnty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtqntyKeyPressed(evt);
            }
        });

        jLabel2.setText("Item Code");

        txtOderCode.setForeground(new java.awt.Color(153, 0, 0));
        try {
            txtOderCode.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtOderCode.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtOderCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOderCodeActionPerformed(evt);
            }
        });
        txtOderCode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtOderCodeFocusLost(evt);
            }
        });
        txtOderCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOderCodeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtOderCodeKeyReleased(evt);
            }
        });

        jLabel8.setText("Quantity");

        jLabel3.setText("Order Code");

        jLabel5.setText("Issueu To");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(52, 52, 52))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(191, 191, 191))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(txtInvoiceDate, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtInscode, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtOderCode)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtqnty)
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                                        .addComponent(txticode, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, Short.MAX_VALUE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnshowitem, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(19, 19, 19)))
                        .addContainerGap())))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtInvoiceDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtInscode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnshowitem)
                        .addComponent(txticode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtOderCode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtqnty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap())
        );

        jPanel8Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtOderCode, txticode});

        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblinvoice.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblinvoice.setText("Invoce No");

        btnshowitem1.setText("jButton1");
        btnshowitem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowitem1ActionPerformed(evt);
            }
        });

        cmbinvoce.setEditable(true);
        cmbinvoce.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cmbinvocePopupMenuWillBecomeVisible(evt);
            }
        });
        cmbinvoce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbinvoceActionPerformed(evt);
            }
        });

        cmbsection.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cmbsection.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cmbsectionPopupMenuWillBecomeVisible(evt);
            }
        });
        cmbsection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbsectionActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel26.setText("View Invoce");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblinvoice, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbsection, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnshowitem1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmbinvoce, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblinvoice)
                    .addComponent(cmbsection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbinvoce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(btnshowitem1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel23.setText("Invoice No");

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel25.setText("Section");

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton1.setText("Special Deduction");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnNewOcode.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnNewOcode.setText("New Order Code");
        btnNewOcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewOcodeActionPerformed(evt);
            }
        });

        btninvoce.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btninvoce.setText("Print Invoice");
        btninvoce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninvoceActionPerformed(evt);
            }
        });

        btnoderform.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnoderform.setText("Print Order Form");
        btnoderform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnoderformActionPerformed(evt);
            }
        });

        btnmovement.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnmovement.setText("Show movement");
        btnmovement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmovementActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                    .addComponent(btninvoce, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnoderform, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                    .addComponent(btnNewOcode, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                    .addComponent(btnmovement, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnmovement)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNewOcode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnoderform)
                .addGap(7, 7, 7)
                .addComponent(btninvoce)
                .addGap(7, 7, 7)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(76, 187, 116));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblinstitution.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblinstitution.setText("Institute");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Institution :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Item Name :");

        lblname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblname.setText("Item Name");

        lblunit.setText("Unit");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Unit :");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("GRN No :");

        lblgrn.setText("GRN no");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Lot No :");

        lbllot.setText("Lot No");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Warehouse :");

        lblwh.setText("warehouse");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Section :");

        lblsection.setText("Section");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("GRN Date :");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Expired Date :");

        lblgrnDate.setText("GRN Date");

        lblexpDate.setText("EXpDate");

        jLabel16.setText("Unit Prize :");

        lblunitp.setText("0");

        jPanel5.setBackground(new java.awt.Color(63, 144, 92));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblttlissue.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblttlissue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblttlissue.setText("0");
        lblttlissue.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total Issue", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N

        lblonhand.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblonhand.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblonhand.setText("0");
        lblonhand.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Onhand Qnty", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        lblonhand.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblbaltoissue.setBackground(new java.awt.Color(255, 153, 102));
        lblbaltoissue.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblbaltoissue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblbaltoissue.setText("0");
        lblbaltoissue.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Balance to issue", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N

        lblestimate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblestimate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblestimate.setText("0");
        lblestimate.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estimate", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblonhand, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblestimate, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblttlissue, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblbaltoissue, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblonhand, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblestimate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblttlissue, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblbaltoissue, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel19))
                .addContainerGap())
        );

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(140, 54, 54));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Sub 1");

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Pack Size :");

        lblpacksize.setText("0");

        lblrcptcode.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblrcptcode.setText("lrcptcode");

        currenttime.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        currenttime.setForeground(new java.awt.Color(140, 54, 54));
        currenttime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        currenttime.setText("Time");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblunit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblgrn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbllot, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11))
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblunitp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblsection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblwh))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblpacksize, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblrcptcode, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblgrnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblexpDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(currenttime, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblname, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblinstitution, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblinstitution, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblname)
                            .addComponent(jLabel4))))
                .addComponent(currenttime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lblunit, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(lblgrn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(lbllot)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(lblwh)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(lblsection)
                                    .addComponent(jLabel15)
                                    .addComponent(lblexpDate)))
                            .addComponent(lblgrnDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16)
                                .addComponent(lblunitp))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel22)
                                .addComponent(lblrcptcode)
                                .addComponent(lblpacksize, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        this.Invoicesave();
    }//GEN-LAST:event_btnsaveActionPerformed

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
        String expdate = tblgrn.getValueAt(SelectedRow, 9).toString();
        String unit = tblgrn.getValueAt(SelectedRow, 10).toString();
        String wh = tblgrn.getValueAt(SelectedRow, 11).toString();
        String section = tblgrn.getValueAt(SelectedRow, 12).toString();
        String incodeltr = tblgrn.getValueAt(SelectedRow, 13).toString();
        String incode = tblgrn.getValueAt(SelectedRow, 13).toString();
        String rcptcode = tblgrn.getValueAt(SelectedRow, 14).toString();
        String cmmnts = tblgrn.getValueAt(SelectedRow, 15).toString();
        String invoiceno = tblgrn.getValueAt(SelectedRow, 16).toString();
        int ordercode = Integer.valueOf(tblgrn.getValueAt(SelectedRow, 17).toString());


        lblgrnDate.setText(grndate.toString());
        lblexpDate.setText(expdate);
        txtInvoiceDate.setDate(grndate);
        lblgrn.setText(grn);
        lblinvoice.setText(invoiceno);
        lbllot.setText(lot);
        //   txtperpack.setText(packsize);
        //  txtNopack.setText(nopack);
        lblwh.setText(wh);
        lblsection.setText(section);
        txticode.setText(icode);
        lblname.setText(name);
        lblunitp.setText(unitprize + "");
        txtqnty.setText(qnty + "");
        lblunit.setText(unit);

        txtInscode.setText(incode);
        lblrcptcode.setText(rcptcode);
        txtcmmnts.setText(cmmnts);

        NumberFormat nf1 = new DecimalFormat("000000");
        String st1 = nf1.format(ordercode);
        txtOderCode.setText(st1);


        optremove.setSelected(false);
        btnsave.setText("Update");

        this.getintitutionname();

    }//GEN-LAST:event_tblgrnMouseReleased

    private void btnexecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexecuteActionPerformed
        String savetext = btnsave.getText();
        Object invose = lblinvoice.getText();
        if (invose.equals("-")) {
            JOptionPane.showMessageDialog(this, " No Invoice No..");
        } else {

            if (savetext.equals("Update") || savetext.equals("Save")) {
                int ii = MessageBox.yesno("Do You Want to Execute  " + invose);
                if (ii == 0) {

                    String inscode = txtInscode.getText();

                    if (inscode.equals("")) {
                        JOptionPane.showMessageDialog(this, " No Institution....");
                    } else {

                       
                        dbconnector.conn();
                        try {
                            String odcode = txtOderCode.getText();
                            DateFormat dfyear = new SimpleDateFormat("yyyy");
                            gyear = dfyear.format(txtInvoiceDate.getDate());
                            Object sec = cmbsection.getSelectedItem();
                            String invoice = (String) lblinvoice.getText();
                            int invoice1 = Integer.parseInt(invoice.substring(invoice.length() - 6, invoice.length()));

                            String conf = "conf";
                            String Temp = "temp";
                            int i = MessageBox.yesno("Do You Want to Execute  " + odcode + " & Section " + sec + ".  Please be make sure to cannot Do any Update after Execute…? ");
                            if (i == 0) {

                                dbconnector.insertquery("UPDATE transaction_sub1 SET g_status = '" + conf + "',g_invoseno = '" + invoice + "'WHERE g_ordercode ='" + odcode + "'"
                                        + "AND g_year ='" + gyear + "'AND g_section ='" + sec + "'AND g_status ='" + Temp + "'ORDER BY g_itemcode LIMIT 13");




                              
                                int Count = voidmodule.RCount("SELECT invoceNo from invoceno_sub1 WHERE invoceNo ='" + invoice1 + "'AND inyear ='" + gyear + "'AND section ='" + sec + "'");
                                if (Count > 0) {
                                    dbconnector.insertquery("UPDATE invoceno_sub1 SET section = '" + sec + "'WHERE invoceNo ='" + invoice1 + "'AND inyear ='" + gyear + "'");
                                } else {
                                    dbconnector.insertquery("INSERT INTO invoceno_sub1 VALUES ('" + sec + "','" + gyear + "','" + invoice1 + "')");
                                }


                                JOptionPane.showMessageDialog(this, " Execute Completed…..");
                                this.btninvoceActionPerformed(evt);
                                this.addtogrid("SELECT T.g_ordercode,T.g_coment,T.g_receipttype,T.g_grnno,T.g_invoseno,T.g_date,T.g_lot,T.g_packsize,T.g_packs,T.g_warehose,T.g_section,T.g_itemcode,T.g_initprice,T.g_Iqnty,T.g_expdate,T.g_year,T.g_incode,S.d_name,S.d_unit from transaction as T inner join dgs_surgicallist as S on S.d_srno = T.g_itemcode  WHERE T.g_ordercode ='" + odcode + "'AND T.g_year ='" + gyear + "'AND T.g_section ='" + sec + "' ORDER BY T.g_itemcode");

                                voidmodule.U_transaction(User, "Excecute " + invoice1);

                            } else {
                            }

                        } catch (SQLException ex) {
                            Logger.getLogger(frmgrn.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnexecuteActionPerformed

    private void btnsaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnsaveKeyPressed
        if (evt.getKeyCode() == 10) {
            this.Invoicesave();
        }

    }//GEN-LAST:event_btnsaveKeyPressed

    private void txticodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txticodeFocusLost
        this.icodelostf();
        optremove.setSelected(false);


    }//GEN-LAST:event_txticodeFocusLost
    void icodelostf() {
        try {
            String icode = txticode.getText();
            Object ic = "      ";
            Object ic1 = "";
          
            int Count = voidmodule.RCount("SELECT d_srno from dgs_surgicallist WHERE d_srno ='" + icode + "'");
            if (Count > 0) {
                this.addname("SELECT d_name,d_unit FROM dgs_surgicallist  WHERE d_srno = '" + icode + "'");
            } else {
                if (icode.equals(ic) || icode.equals(ic1)) {
                    txticode.setText(null);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Item Code");

                    lblname.setText(null);
                    lblunit.setText(null);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmInvoice_stores2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void txticodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txticodeKeyPressed
        if (evt.getKeyCode() == 10) {
            try {
                String icode = txticode.getText();
                Object ic = "      ";
                Object ic1 = "";
              
                int Count = voidmodule.RCount("SELECT d_srno from dgs_surgicallist WHERE d_srno ='" + icode + "'");
                if (Count > 0) {
                    frmshowgrn open = new frmshowgrn(this);
                    MDI.jDesktopPane1.add(open);
                    open.stores = false;
                    open.setVisible(true);
                    open.settblmdl(icode);
                } else {
                    if (icode.equals(ic) || icode.equals(ic1)) {
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrect Item Code");

                    }

                }
            } catch (SQLException ex) {
                Logger.getLogger(frmInvoice_stores2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txticodeKeyPressed

    private void btnNewOcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewOcodeActionPerformed
        this.setOrderCode();
        Date tddate = new Date();
        txtInvoiceDate.setDate(tddate);

        btnsave.setEnabled(true);
        btnexecute.setEnabled(true);
        tblgrn.setForeground(Color.BLACK);
        txticode.setEditable(true);
        btnshowitem.setEnabled(true);
        tblEstimate.setEnabled(true);
        txtInscode.requestFocus();

    }//GEN-LAST:event_btnNewOcodeActionPerformed

    private void txtqntyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtqntyKeyPressed
        if (evt.getKeyCode() == 10) {
            btnsave.requestFocus();
        }
    }//GEN-LAST:event_txtqntyKeyPressed

    private void tblEstimateMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEstimateMouseReleased
        int SelectedRow = tblEstimate.getSelectedRow();

        String icode = tblEstimate.getValueAt(SelectedRow, 1).toString();
        String estimate = tblEstimate.getValueAt(SelectedRow, 3).toString();
        String inscode = txtInscode.getText();
        DateFormat dfyear = new SimpleDateFormat("yyyy");
        gyear = dfyear.format(txtInvoiceDate.getDate());



        txticode.setText(icode);
        lblestimate.setText(estimate);
        txticode.requestFocus();

        this.getsum("SELECT SUM(g_Iqnty) FROM transaction  WHERE g_itemcode = '" + icode + "'AND g_incode = '" + inscode + "'AND g_year = '" + gyear + "'");
        this.getonhand("SELECT SUM(g_qnty) FROM transaction  WHERE g_itemcode = '" + icode + "'");

        int E = Integer.parseInt(lblestimate.getText());
        int I = Integer.parseInt(lblttlissue.getText());
        int EI = E - I;
        if (I < (1)) {
            lblbaltoissue.setText("0");
        } else {
            lblbaltoissue.setText(EI + "");
        }


        if (I > E) {
            lblbaltoissue.setBackground(Color.red);
            lblbaltoissue.setOpaque(true);
        } else {
            lblbaltoissue.setOpaque(false);
        }
    }//GEN-LAST:event_tblEstimateMouseReleased
    void getsum(String query) {
      
        try {
            Statement rss = dbconnector.conn().createStatement();

            String issueqnty = null;
            ResultSet rs = rss.executeQuery(query);
            while (rs.next()) {
                issueqnty = rs.getString(1);
            }
            if (issueqnty == (null)) {
                lblttlissue.setText("0");
            } else {
                lblttlissue.setText(issueqnty);
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmgrn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void getonhand(String query) {

        try {
            Statement rss = dbconnector.conn().createStatement();
            String onhand = null;
            ResultSet rs = rss.executeQuery(query);
            while (rs.next()) {
                onhand = rs.getString(1);
            }
            if (onhand == (null)) {
                lblonhand.setText("0");
            } else {
                lblonhand.setText(onhand);
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmgrn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void getonhand1(String query) {
       
        try {
            Statement rss = dbconnector.conn().createStatement();
            String onhand = null;
            ResultSet rs = rss.executeQuery(query);
            while (rs.next()) {
                onhand = rs.getString(1);
            }
            if (onhand == (null)) {
                grnbal = Integer.parseInt("0");
            } else {
                grnbal = Integer.parseInt(onhand);
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmgrn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void getestimate(String query) {
 
        try {
            Statement rss = dbconnector.conn().createStatement();

            String estimate = null;
            ResultSet rs = rss.executeQuery(query);
            while (rs.next()) {
                estimate = rs.getString(1);
            }
            if (estimate == (null)) {
                lblestimate.setText("0");
            } else {
                lblestimate.setText(estimate);
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmgrn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnmovementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmovementActionPerformed
        String icode = txticode.getText();
        DateFormat dfyear = new SimpleDateFormat("yyyy");
        gyear = dfyear.format(txtInvoiceDate.getDate());
        if (icode.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Select the Item Cobe  ");

        } else {

            frmmovement open = new frmmovement(this);
            MDI.jDesktopPane1.add(open);
            open.setVisible(true);
            open.addtable(gyear, "SELECT T.g_section,T.g_grnno,T.g_lot,T.g_ordercode,T.g_incode,T.g_itemcode,T.g_Iqnty,T.g_Rqnty,T.g_transtype,T.g_invoseno,T.g_date,S.d_name from transaction_sub1 as T inner join dgs_surgicallist as S on S.d_srno = T.g_itemcode WHERE T.g_itemcode ='" + icode + "'AND T.g_year ='" + gyear + "'ORDER BY T.g_grnno AND T.g_date ");


        }
    }//GEN-LAST:event_btnmovementActionPerformed

    private void txtOderCodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOderCodeFocusLost
        this.checkstatus();


        String odcode = txtOderCode.getText();
        String Conf = "conf";
        DateFormat dfyear = new SimpleDateFormat("yyyy");
        gyear = dfyear.format(txtInvoiceDate.getDate());

   
        voidmodule.fillcombo(cmbinvoce, "SELECT DISTINCT g_invoseno from transaction_sub1 WHERE g_ordercode = '" + odcode + "'AND g_year = '" + gyear + "'AND g_status = '" + Conf + "'ORDER BY g_section");
    }//GEN-LAST:event_txtOderCodeFocusLost

    private void txtOderCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOderCodeKeyPressed
        if (evt.getKeyCode() == 10) {
            this.txticodeFocusLost(null);
            txtqnty.requestFocus();
        }
    }//GEN-LAST:event_txtOderCodeKeyPressed

    private void txtOderCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOderCodeKeyReleased
        DateFormat dfyear = new SimpleDateFormat("yyyy");
        gyear = dfyear.format(txtInvoiceDate.getDate());
        String Ocode = txtOderCode.getText();
        this.addtogrid("SELECT T.g_ordercode,T.g_coment,T.g_receipttype,T.g_grnno,T.g_invoseno,T.g_date,T.g_lot,T.g_packsize,T.g_packs,T.g_warehose,T.g_section,T.g_itemcode,T.g_initprice,T.g_Iqnty,T.g_expdate,T.g_year,T.g_incode,S.d_name,S.d_unit from transaction_sub1 as T inner join dgs_surgicallist as S on S.d_srno = T.g_itemcode  WHERE T.g_ordercode LIKE'" + Ocode + "%'AND T.g_year ='" + gyear + "' ORDER BY T.g_itemcode");

        // this.checkstatus();
        this.cmbsectionPopupMenuWillBecomeVisible(null);
    }//GEN-LAST:event_txtOderCodeKeyReleased

    private void txticodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txticodeFocusGained
        String icode = txticode.getText();
        if (icode == (null)) {
            txticode.setText(null);
        } else {
        }    //   txticode.setText(icode);

    }//GEN-LAST:event_txticodeFocusGained

    private void txticodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txticodeKeyReleased
        String icode = txticode.getText();
        String inscode = txtInscode.getText();
        DateFormat dfyear = new SimpleDateFormat("yyyy");
        gyear = dfyear.format(txtInvoiceDate.getDate());


        this.getsum("SELECT SUM(g_qnty) FROM transaction_sub1  WHERE g_itemcode = '" + icode + "'AND g_incode = '" + inscode + "'AND g_year = '" + gyear + "'");
        this.getonhand("SELECT SUM(g_qnty) FROM transaction_sub1  WHERE g_itemcode = '" + icode + "'");
        this.getestimate("SELECT estimate_Qty FROM estimate  WHERE Incode = '" + inscode + "'AND ProductCode = '" + icode + "'");

        int E = Integer.parseInt(lblestimate.getText());
        int I = Integer.parseInt(lblttlissue.getText());
        int EI = E - I;
        lblbaltoissue.setText(EI + "");
        if (I > E) {
            lblbaltoissue.setBackground(Color.red);
            lblbaltoissue.setOpaque(true);
        } else {
            lblbaltoissue.setOpaque(false);
        }


        lblgrnDate.setText(null);
        lblexpDate.setText(null);
        lblgrn.setText(null);
        lbllot.setText(null);
        //   txtperpack.setText(packsize);
        //  txtNopack.setText(nopack);
        lblwh.setText(null);
        lblsection.setText(null);
        lblunitp.setText("0.0");



    }//GEN-LAST:event_txticodeKeyReleased

    private void cmbsectionPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbsectionPopupMenuWillBecomeVisible

        String odcode = txtOderCode.getText();
        String Temp = "temp";
        DateFormat dfyear = new SimpleDateFormat("yyyy");
        gyear = dfyear.format(txtInvoiceDate.getDate());


       voidmodule.fillcombo(cmbsection, "SELECT DISTINCT g_section from transaction_sub1 WHERE g_ordercode = '" + odcode + "'AND g_year = '" + gyear + "'AND g_status = '" + Temp + "'ORDER BY g_section");
    }//GEN-LAST:event_cmbsectionPopupMenuWillBecomeVisible

    private void cmbsectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbsectionActionPerformed

        String Ocode = txtOderCode.getText();
        DateFormat dfyear = new SimpleDateFormat("yyyy");
        gyear = dfyear.format(txtInvoiceDate.getDate());
        Object sec = cmbsection.getSelectedItem();
        gyear = dfyear.format(txtInvoiceDate.getDate());



        this.addtogrid("SELECT T.g_ordercode,T.g_coment,T.g_receipttype,T.g_grnno,T.g_invoseno,T.g_date,T.g_lot,T.g_packsize,T.g_packs,T.g_warehose,T.g_section,T.g_itemcode,T.g_initprice,T.g_Iqnty,T.g_expdate,T.g_year,T.g_incode,S.d_name,S.d_unit from transaction_sub1 as T inner join dgs_surgicallist as S on S.d_srno = T.g_itemcode  WHERE T.g_ordercode ='" + Ocode + "'AND T.g_year ='" + gyear + "'AND T.g_section ='" + sec + "' ORDER BY T.g_itemcode");
        this.setinvoice();
        btnsave.setText("Save");

        Object invoice = lblinvoice.getText();
        cmbinvoce.setSelectedItem(invoice);
        btnexecute.setEnabled(true);


    }//GEN-LAST:event_cmbsectionActionPerformed

    private void txtqntyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtqntyFocusLost
        try {
            String grn = lblgrn.getText();
            String icode = txticode.getText();
            String lot = lbllot.getText();
            String OderCode = txtOderCode.getText();
            DateFormat dfyear = new SimpleDateFormat("yyyy");
            gyear = dfyear.format(txtInvoiceDate.getDate());

            int issqnty = Integer.parseInt(txtqnty.getText());
            this.getonhand1("SELECT SUM(g_qnty) FROM transaction_sub1  WHERE g_itemcode = '" + icode + "'AND g_grnno = '" + grn + "'AND g_lot = '" + lot + "'");

    //        String save = btnsave.getText();
    //        String updat = "Update";
    //        if (save.equals(updat)) {
    //        } else {
            if (issqnty > grnbal) {
                JOptionPane.showMessageDialog(null, "Stock is lower than issue Quantity");
                txtqnty.setText("0");
                txtqnty.requestFocus();
            }
            //}

             int Count =voidmodule.RCount("SELECT g_grnno from transaction_sub1 WHERE g_ordercode ='" + OderCode + "'AND g_year ='" + gyear + "'AND g_section ='" + "EX" + "'");
            if (Count > 0) {
                setOrderCode();
            } else {
            }
            optremove.setSelected(false);
        } catch (SQLException ex) {
            Logger.getLogger(frmInvoice_stores2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtqntyFocusLost

    private void txtsearchNameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsearchNameMouseReleased
    }//GEN-LAST:event_txtsearchNameMouseReleased

    private void txtsearchNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchNameKeyReleased

        String inscode = txtInscode.getText();
        String Sname = txtsearchName.getText();


        try {
            this.settblmdl1(Sname, inscode);
        } catch (SQLException ex) {
            Logger.getLogger(frmInvoice_stores2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtsearchNameKeyReleased

    private void btnshowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowAllActionPerformed
        try {                                           

            String inscode = txtInscode.getText();
       
            int Count = voidmodule.RCount("SELECT Incode from institution WHERE Incode ='" + inscode + "'");
            try {
                if (Count > 0) {


                    this.getintitutionname();
                    this.settblmdl(inscode);

                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Institute Code");
                    this.settblmdl(inscode);
                    txtInscode.setText(null);
                }
            } catch (SQLException ex) {
                Logger.getLogger(frmInvoice_stores2.class.getName()).log(Level.SEVERE, null, ex);

            }
        } catch (SQLException ex) {
            Logger.getLogger(frmInvoice_stores2.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_btnshowAllActionPerformed

    private void btnshowitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowitemActionPerformed


        String icode = txticode.getText();
        frmshowgrn open = new frmshowgrn(this);
        open.stores = false;
        MDI.jDesktopPane1.add(open);
        open.setVisible(true);
        open.settblmdl(icode);

    }//GEN-LAST:event_btnshowitemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


        frmdeduction open = new frmdeduction(this);
        open.stores = false;
        MDI.jDesktopPane1.add(open);
        open.stores=false;
        open.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnoderformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnoderformActionPerformed
        try {


            String ocode = txtOderCode.getText();
            Object sec = psection;
            DateFormat dfyear = new SimpleDateFormat("yyyy");
            gyear = dfyear.format(txtInvoiceDate.getDate());
            Map m = new HashMap();
            m.put("p", ocode);
            m.put("p_year", gyear);
            m.put("p_institute", a);

            if (sec == (null)) {
                JOptionPane.showMessageDialog(null, "Please Select the One of Section ");
            } else if (sec.equals("RJ")) {
                voidmodule.generateReport("//Report//reject_sub1.jrxml", m);
            } else if (sec.equals("DG")) {
                voidmodule.generateReport("//Report//reject_sub1.jrxml", m);
            } else if (sec.equals("EX")) {
                voidmodule.generateReport("//Report//reject_sub1.jrxml", m);
            } else {
                voidmodule.generateReport("//Report//orderform_sub1.jrxml", m);


            }
            voidmodule.U_transaction(User, "Print Oder form  " + ocode);
        } catch (ArrayIndexOutOfBoundsException aiobe) {
            JOptionPane.showMessageDialog(null, "PLS SELCET CUSTOMER FROM TABLE ");
        }
    }//GEN-LAST:event_btnoderformActionPerformed

    private void btninvoceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninvoceActionPerformed
        try {
            String ocode = txtOderCode.getText();
            Object invoce = lblinvoice.getText();
            DateFormat dfyear = new SimpleDateFormat("yyyy");
            gyear = dfyear.format(txtInvoiceDate.getDate());
            String orderCode = txtOderCode.getText();
            Object sec = cmbsection.getSelectedItem();



          
            int Count = voidmodule.RCount("SELECT g_grnno from transaction WHERE g_ordercode ='" + orderCode + "'AND g_invoseno ='" + invoce + "'AND g_section ='" + sec + "'AND g_year ='" + gyear + "'AND g_status ='" + "temp" + "'");
            if (Count > 0) {
                JOptionPane.showMessageDialog(null, "Awaiting Execute...");
            } else {
                Map m = new HashMap();
                m.put("p_invoice", invoce);
                m.put("p_year", gyear);
                m.put("p_institute", a);
                voidmodule.generateReport("//Report//invoice_sub1.jrxml", m);

                //Print Transaction
                voidmodule.U_transaction(User, "Print Invoce " + ocode);
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmInvoice_stores2.class.getName()).log(Level.SEVERE, null, ex);
        }



    }//GEN-LAST:event_btninvoceActionPerformed

    private void txtsearchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchNameActionPerformed

    private void txtcmmntsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcmmntsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcmmntsActionPerformed

    private void txtOderCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOderCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOderCodeActionPerformed

    private void btnshowitem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowitem1ActionPerformed
        try {
            String Ocode = txtOderCode.getText();
            Object invoce = cmbinvoce.getSelectedItem();
            String orderCode = txtOderCode.getText();
            Object sec = cmbsection.getSelectedItem();
            DateFormat dfyear = new SimpleDateFormat("yyyy");
            gyear = dfyear.format(txtInvoiceDate.getDate());


            this.addtogrid("SELECT T.g_ordercode,T.g_coment,T.g_receipttype,T.g_grnno,T.g_invoseno,T.g_date,T.g_lot,T.g_packsize,T.g_packs,T.g_warehose,T.g_section,T.g_itemcode,T.g_initprice,T.g_Iqnty,T.g_expdate,T.g_year,T.g_incode,S.d_name,S.d_unit from transaction_sub1 as T inner join dgs_surgicallist as S on S.d_srno = T.g_itemcode  WHERE T.g_ordercode ='" + Ocode + "'AND T.g_year ='" + gyear + "'AND T.g_invoseno ='" + invoce + "' ORDER BY T.g_itemcode");

          
            int Count = voidmodule.RCount("SELECT g_grnno from transaction_sub1 WHERE g_ordercode ='" + orderCode + "'AND g_invoseno ='" + invoce + "'AND g_section ='" + sec + "'AND g_year ='" + gyear + "'AND g_status ='" + "temp" + "'");
            if (Count > 0) {
                btnexecute.setEnabled(true);
            } else {
                btnexecute.setEnabled(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmInvoice_stores2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnshowitem1ActionPerformed

    private void cmbinvoceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbinvoceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbinvoceActionPerformed

    private void cmbinvocePopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbinvocePopupMenuWillBecomeVisible
        String odcode = txtOderCode.getText();
        String Conf = "conf";
        DateFormat dfyear = new SimpleDateFormat("yyyy");
        gyear = dfyear.format(txtInvoiceDate.getDate());

       
        voidmodule.fillcombo(cmbinvoce, "SELECT DISTINCT g_invoseno from transaction_sub1 WHERE g_ordercode = '" + odcode + "'AND g_year = '" + gyear + "'AND g_status = '" + Conf + "'ORDER BY g_section");
    }//GEN-LAST:event_cmbinvocePopupMenuWillBecomeVisible

    private void txtInscodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInscodeActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtInscodeActionPerformed

    private void txtInscodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtInscodeFocusLost
        try {
            String inscode = txtInscode.getText();
            txtInscode.setText(inscode.toUpperCase());
     
            int Count = voidmodule.RCount("SELECT Incode from institution WHERE Incode ='" + inscode + "'");
            try {
                if (Count > 0) {
                    this.getintitutionname();
                    this.settblmdl(inscode);

                } else {


                    JOptionPane.showMessageDialog(null, "Incorrect Institute Code");
                    this.settblmdl(inscode);
                    txtInscode.setText(null);
                    lblinstitution.setText(null);


                }
            } catch (SQLException ex) {
                Logger.getLogger(frmInvoice.class.getName()).log(Level.SEVERE, null, ex);

            }
            this.setOrderCode();
        } catch (SQLException ex) {
            Logger.getLogger(frmInvoice_stores2.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_txtInscodeFocusLost

    private void txtInscodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInscodeKeyPressed
        if (evt.getKeyCode() == 10) {
            this.txtInscodeFocusLost(null);
            txticode.requestFocus();
        }
}//GEN-LAST:event_txtInscodeKeyPressed

    void settblmdl1(String Sname, String inscode) throws SQLException {
        DateFormat dfyear = new SimpleDateFormat("yyyy");
        gyear = dfyear.format(txtInvoiceDate.getDate());
      
        Statement rss = dbconnector.conn().createStatement();
        String Tblmod = "SELECT E.ProductCode,S.d_name,E.estimate_Qty from estimate as E inner join dgs_surgicallist as S on S.d_srno = E.ProductCode WHERE S.d_name LIKE '" + Sname + "%'AND E.Incode = '" + inscode + "'ORDER BY S.d_name";
        ResultSet executeQuery = rss.executeQuery(Tblmod);
        DefaultTableModel cvv = voidmodule.convertResultSetToTableMOdel(executeQuery);

        tblEstimate.setModel(cvv);
    }

    void setOrderCode() {

        DateFormat dfyear = new SimpleDateFormat("yyyy");
        gyear = dfyear.format(txtInvoiceDate.getDate());

        this.getmax(stmax, "SELECT MAX(g_ordercode) FROM transaction_sub1 WHERE g_year = '" + gyear + "'");
        NumberFormat nf1 = new DecimalFormat("000000");
        String st1 = nf1.format(stmax);
        txtOderCode.setText((String) st1);
        optremove.setSelected(false);
        btnsave.setText("Save");

    }

    void deductCode(Object subject, Object code) {

        DateFormat dfyear = new SimpleDateFormat("yyyy");
        gyear = dfyear.format(txtInvoiceDate.getDate());
        lblsection.setText(code.toString());

        this.getmax(stmax, "SELECT MAX(g_ordercode) FROM transaction_sub1 WHERE g_year = '" + gyear + "'AND g_section = '" + code + "'");
        NumberFormat nf1 = new DecimalFormat("00000");
        String st1 = nf1.format(stmax);
        lblinvoice.setText(code + (String) st1);



    }

    void setinvoice() {
        Object sec = cmbsection.getSelectedItem();
        DateFormat dfyear = new SimpleDateFormat("yyyy");
        gyear = dfyear.format(txtInvoiceDate.getDate());

        this.getmax(stmax, "SELECT MAX(invoceNo) FROM invoceno_sub1 WHERE inyear = '" + gyear + "'AND section = '" + sec + "'");

        NumberFormat nf1 = new DecimalFormat(sec + "000000");
        String st1 = nf1.format(stmax);
        lblinvoice.setText((String) st1);
    }

    void getmax(int lable, String query) {
     
        try {
            Statement rss = dbconnector.conn().createStatement();
            ResultSet rs = rss.executeQuery(query);
            int b = 0;

            while (rs.next()) {
                b = rs.getInt(1);
            }
            b++;
            lable = b;
            stmax = lable;


        } catch (SQLException ex) {
            Logger.getLogger(frmInvoice_stores2.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    void getintitutionname() {

        String inscode = txtInscode.getText();
        String name = null;

        try {
            Statement rss = dbconnector.conn().createStatement();


            ResultSet rs = rss.executeQuery("SELECT name FROM institution  WHERE Incode = '" + inscode + "'");
            while (rs.next()) {
                name = rs.getString(1);
            }
            lblinstitution.setText(name);

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

           int Count = voidmodule.RCount(query);
            if (Count > 0) {
                ResultSet rs = rss.executeQuery(query);

                while (rs.next()) {
                    name = rs.getString(1);
                    unit = rs.getString(2);
                }
                lblname.setText(name);
                lblunit.setText(unit);

            } else {
                JOptionPane.showMessageDialog(null, "Incorrect Item Code");

            }
        } catch (SQLException ex) {
            Logger.getLogger(frmgrn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void addtogrid(String query) {
        String incode = null;
        Date grndate = null;
        String expdate = null;
        String invoice = null;
        String grn = null;
        String lot = null;
        String packsize = null;
        String nopack = null;
        String wh = null;
        String section = null;
        String icode = null;
        String name = null;
        String unit = null;
        String cmmnts = null;
        String rcptcode = null;
        String ordercode = null;
        double unitprize = 0;
        int qnty = 0;
        int RC = 0;





        try {


            DefaultTableModel addabl = (DefaultTableModel) tblgrn.getModel();
            while (tblgrn.getRowCount() > 0) {
                addabl.removeRow(0);
            }


            Statement rss = dbconnector.conn().createStatement();
            ResultSet rs = rss.executeQuery(query);
            while (rs.next()) {
                incode = rs.getString("T.g_incode");
                grndate = (Date) rs.getDate("T.g_date");
                expdate = rs.getString("T.g_expdate");
                invoice = rs.getString("T.g_invoseno");
                grn = rs.getString("T.g_grnno");
                lot = rs.getString("T.g_lot");
                packsize = rs.getString("T.g_packsize");
                nopack = rs.getString("T.g_packs");
                wh = rs.getString("T.g_warehose");
                section = rs.getString("T.g_section");
                icode = rs.getString("T.g_itemcode");
                name = rs.getString("S.d_name");
                unit = rs.getString("S.d_unit");
                unitprize = rs.getDouble("T.g_initprice");
                qnty = Integer.parseInt(rs.getString("T.g_Iqnty"));
                rcptcode = rs.getString("T.g_receipttype");
                cmmnts = rs.getString("T.g_coment");
                ordercode = rs.getString("T.g_ordercode");




                addabl.addRow(new Object[]{icode, name, grndate, grn, lot, unitprize, qnty, packsize, nopack, expdate, unit, wh, section, incode, rcptcode, cmmnts, invoice, ordercode});
                RC++;
            }
            lblins.setText("" + RC);
            txtInscode.setText(incode);
            lblinvoice.setText(invoice);
            psection = section;
            //   txticode.setText(null);
            rss.close();

        } catch (SQLException ex) {
            Logger.getLogger(frmStock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void setfor() {
        txticode.requestFocus();
    }

    void showinvoice(Double bal, String query) {
        String grndate = null;
        String expdate = null;
        String grn = null;
        String lot = null;
        String packsize = null;
        String nopack = null;
        String wh = null;
        String section = null;
        String icode = null;
        String name = null;
        String unit = null;
        String recptcode = null;
        double unitprize = 0;
        int qnty = 0;




  
        try {





            Statement rss = dbconnector.conn().createStatement();
            ResultSet rs = rss.executeQuery(query);
            while (rs.next()) {

                grndate = rs.getString("T.g_date");
                expdate = rs.getString("T.g_expdate");
                grn = rs.getString("T.g_grnno");
                lot = rs.getString("T.g_lot");
                packsize = rs.getString("T.g_packsize");
                nopack = rs.getString("T.g_packs");
                wh = rs.getString("T.g_warehose");
                section = rs.getString("T.g_section");
                icode = rs.getString("T.g_itemcode");
                name = rs.getString("S.d_name");
                unit = rs.getString("S.d_unit");
                recptcode = rs.getString("T.g_receipttype");
                unitprize = rs.getDouble("T.g_initprice");



            }

            lblgrnDate.setText(grndate);
            lblexpDate.setText(expdate);
            lblgrn.setText(grn);
            lbllot.setText(lot);
            lblpacksize.setText(packsize);
            //  txtNopack.setText(nopack);
            lblwh.setText(wh);
            lblsection.setText(section);
            txticode.setText(icode);
            lblname.setText(name);
            lblunitp.setText(unitprize + "");
            txtqnty.setText(bal + "");
            lblunit.setText(unit);
            lblrcptcode.setText(recptcode);
            txtqnty.requestFocus();

        } catch (SQLException ex) {
            Logger.getLogger(frmStock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void Invoicesave() {

        String icode = txticode.getText();
        String OderCode = txtOderCode.getText();
        int orderCode = Integer.parseInt(txtOderCode.getText().toString());
        String lot = lbllot.getText();
        String section = lblsection.getText();
        String rcptcode = lblrcptcode.getText();
        String packsize = lblpacksize.getText();
        Object sec = cmbsection.getSelectedItem();





        if (icode.equals("") || OderCode.equals("")) {
            JOptionPane.showMessageDialog(null, "Can not keep emty field. please Check Institution Code, OrderCode or Item code ");
        } else {
          
            dbconnector.conn();

            String grn = lblgrn.getText();
            String invoice = lblgrn.getText();
            String wh = lblwh.getText();
            String Inscode = txtInscode.getText();
            String temp = "temp";
            String rtype = "R";
            String itype = "I";
            String Snull = "-";

            String cmmnts = txtcmmnts.getText();
            double unitprize = Double.parseDouble(lblunitp.getText().toString());
            double qnty = Double.parseDouble(txtqnty.getText().toString());
            double dnull = Double.parseDouble("0.0");

            Date date = new Date();
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            DateFormat dfmonth = new SimpleDateFormat("MM");
            DateFormat dfday = new SimpleDateFormat("dd");
            DateFormat dfyear = new SimpleDateFormat("yyyy");


            String sysdate = df.format(date);
            String grndate = df.format(txtInvoiceDate.getDate());
            String gmonth = dfmonth.format(txtInvoiceDate.getDate());
            String gday = dfday.format(txtInvoiceDate.getDate());
            gyear = dfyear.format(txtInvoiceDate.getDate());
            String expirddate = lblexpDate.getText();


            try {
                if (optremove.isSelected() == true) {
                    int i = MessageBox.yesno("Do You Want to Delete Item  " + icode);
                    if (i == 0) {
                        dbconnector.insertquery("DELETE FROM transaction_sub1 WHERE g_ordercode ='" + orderCode + "'AND g_itemcode ='" + icode + "'AND g_lot ='" + lot + "'AND g_year ='" + gyear + "'AND g_transtype ='" + itype + "'");
                        voidmodule.U_transaction(User, "Delete " + icode);

                    }
                } else {



                    int Count = voidmodule.RCount("SELECT g_grnno from transaction_sub1 WHERE g_ordercode ='" + orderCode + "'AND g_grnno ='" + grn + "'AND g_itemcode ='" + icode + "'AND g_lot ='" + lot + "'AND g_year ='" + gyear + "'");
                    if (Count > 0) {
                        int i = MessageBox.yesno("Records Already Exited. Do You Want to Update Records…? ");
                        if (i == 0) {
                            dbconnector.insertquery("UPDATE transaction_sub1 SET g_status = '" + temp + "'WHERE g_ordercode ='" + OderCode + "'AND g_year ='" + gyear + "'AND g_section ='" + sec + "'AND g_itemcode ='" + icode + "'");
                            dbconnector.insertquery("UPDATE transaction_sub1 SET g_incode = '" + Inscode + "',g_date = '" + grndate + "',g_sysdate = '" + sysdate + "',g_year = '" + gyear + "',g_month = '" + gmonth + "',g_warehose = '" + wh + "',g_section = '" + section + "',g_lot = '" + lot + "',g_packsize = '" + packsize + "',g_packs = '" + dnull + "',g_itemcode = '" + icode + "',g_status = '" + temp + "',g_transtype = '" + "I" + "',g_receipttype = '" + rcptcode + "',g_initprice = '" + unitprize + "',g_expdate = '" + expirddate + "',g_qnty = '" + -qnty + "',g_iqnty = '" + qnty + "',g_coment = '" + cmmnts + "',g_user = '" + User + "'WHERE g_ordercode ='" + orderCode + "'AND g_itemcode ='" + icode + "'AND g_lot ='" + lot + "'AND g_year ='" + gyear + "'AND g_transtype ='" + itype + "'");

                            voidmodule.U_transaction(User, "Update " + icode);
                        } else {
                        }
                    } else {



                         int Count1 = voidmodule.RCount("SELECT g_grnno from transaction_sub1 WHERE g_grnno ='" + grn + "'AND g_itemcode ='" + icode + "'AND g_lot ='" + lot + "'AND g_status ='" + temp + "'AND g_transtype ='" + "R" + "'");
                        if (Count1 > 0) {
                            JOptionPane.showMessageDialog(null, "This is not a Confirmed Order.... ");

                        } else {
                            dbconnector.insertquery("INSERT INTO transaction_sub1 VALUES ('" + grn + "','" + Snull + "','" + Inscode + "','" + orderCode + "','" + grndate + "','" + sysdate + "','" + gyear + "','" + gmonth + "','" + gday + "','" + wh + "','" + section + "','" + lot + "','" + packsize + "','" + dnull + "','" + icode + "','" + temp + "','" + itype + "','" + rcptcode + "','" + unitprize + "','" + expirddate + "','" + -qnty + "','" + dnull + "','" + qnty + "','" + cmmnts + "','" + User + "')");
                            txticode.requestFocus();
                            txticode.setText("");
                            txtqnty.setText("");


                        }
                    }
                }

                String Ocode = txtOderCode.getText();
                this.addtogrid("SELECT T.g_ordercode,T.g_coment,T.g_receipttype,T.g_incode,T.g_grnno,T.g_invoseno,T.g_date,T.g_lot,T.g_packsize,T.g_packs,T.g_warehose,T.g_section,T.g_itemcode,T.g_initprice,T.g_Iqnty,T.g_expdate, T.g_year,T.g_incode,S.d_name,S.d_unit from transaction_sub1 as T inner join dgs_surgicallist as S on S.d_srno = T.g_itemcode  WHERE T.g_ordercode ='" + Ocode + "'AND T.g_year ='" + gyear + "' ORDER BY T.g_itemcode");




            } catch (SQLException ex) {
                Logger.getLogger(frmStock.class.getName()).log(Level.SEVERE, null, ex + "Illegal Process. ");
            }

        }


    }

    void checkstatus() {
        try {
            DateFormat dfyear = new SimpleDateFormat("yyyy");
            gyear = dfyear.format(txtInvoiceDate.getDate());
            String ODcode = txtOderCode.getText();
            Object sec = cmbsection.getSelectedItem();
            String temp = "conf";
           
            int Count = voidmodule.RCount("SELECT g_ordercode from transaction WHERE g_ordercode ='" + ODcode + "'AND g_status ='" + temp + "'AND g_year ='" + gyear + "'AND g_section ='" + sec + "'");
            if (Count > 0) {
                btnsave.setEnabled(false);
                btnexecute.setEnabled(false);
                tblgrn.setForeground(Color.red);
                txticode.setEditable(false);
                txticode.setText(null);
                btnshowitem.setEnabled(false);
                tblEstimate.setEnabled(false);

                this.Privilege();

            } else {
                btnsave.setEnabled(true);
                btnexecute.setEnabled(true);
                tblgrn.setForeground(Color.BLACK);
                txticode.setEditable(true);
                btnshowitem.setEnabled(true);
                tblEstimate.setEnabled(true);


            }
        } catch (SQLException ex) {
            Logger.getLogger(frmInvoice_stores2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void Privilege() {
    
        String admin = voidmodule.admin(User);
        String xy = "Administrator";

        try {
            if (admin.equals(xy)) {

                btnsave.setEnabled(true);
                btnexecute.setEnabled(true);
                tblgrn.setForeground(Color.BLUE);
                txticode.setEditable(true);
                btnshowitem.setEnabled(true);
                tblEstimate.setEnabled(true);



            } else {
                JOptionPane.showMessageDialog(this, "You do not have permission to Adbconnectoress ");

            }

        } catch (Exception ex) {
            Logger.getLogger(dbconnector.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);

        }
    }

    void settblmdl(String inscode) throws SQLException {
        DateFormat dfyear = new SimpleDateFormat("yyyy");
        gyear = dfyear.format(txtInvoiceDate.getDate());
        
        Statement rss = dbconnector.conn().createStatement();
        String Tblmod = "SELECT E.ProductCode,S.d_name,E.estimate_Qty from estimate as E inner join dgs_surgicallist as S on S.d_srno = E.ProductCode WHERE E.Incode = '" + inscode + "'ORDER BY S.d_name";
        ResultSet executeQuery = rss.executeQuery(Tblmod);
        DefaultTableModel cvv = voidmodule.convertResultSetToTableMOdel(executeQuery);

        tblEstimate.setModel(cvv);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNewOcode;
    private javax.swing.JButton btnexecute;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btninvoce;
    private javax.swing.JButton btnmovement;
    private javax.swing.JButton btnoderform;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnshowAll;
    private javax.swing.JButton btnshowitem;
    private javax.swing.JButton btnshowitem1;
    private javax.swing.JComboBox cmbinvoce;
    private javax.swing.JComboBox cmbsection;
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
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblbaltoissue;
    private javax.swing.JLabel lblestimate;
    private javax.swing.JLabel lblexpDate;
    private javax.swing.JLabel lblgrn;
    private javax.swing.JLabel lblgrnDate;
    private javax.swing.JLabel lblins;
    private javax.swing.JLabel lblinstitution;
    private javax.swing.JLabel lblinvoice;
    private javax.swing.JLabel lbllot;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblonhand;
    private javax.swing.JLabel lblpacksize;
    private javax.swing.JLabel lblrcptcode;
    private javax.swing.JLabel lblsection;
    private javax.swing.JLabel lblttlissue;
    private javax.swing.JLabel lblunit;
    private javax.swing.JLabel lblunitp;
    private javax.swing.JLabel lblwh;
    private javax.swing.JRadioButton optremove;
    private javax.swing.JTable tblEstimate;
    private javax.swing.JTable tblgrn;
    private javax.swing.JFormattedTextField txtInscode;
    private de.wannawork.jcalendar.JCalendarComboBox txtInvoiceDate;
    private javax.swing.JFormattedTextField txtOderCode;
    private javax.swing.JTextField txtcmmnts;
    private javax.swing.JFormattedTextField txticode;
    private javax.swing.JTextField txtqnty;
    private javax.swing.JTextField txtsearchName;
    // End of variables declaration//GEN-END:variables
}
