//Copyright (c) 2012, Provincial Department of Health Services, North western province, Sri Lanka
//All rights reserved.
package rmsd;

import java.sql.*;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import mymod.dbconnector;
import mymod.voidmodule;

public class frmExpired extends javax.swing.JInternalFrame {

    String user;
    public String grn;
    public String Snull;
    public int orderCode;
    public String grndate;
    public String sysdate;
    public String gyear;
    public String gmonth;
    public String gday;
    public String wh;
    public String section;
    public String lot;
    public Integer packsize;
    public Integer nopack;
    public String icode;
    public String temp;
    public String cnf;
    public String rtype;
    public String rcpttype;
    public double unitprize;
    public String expirddate;
    public Double qnty;
    public Double dnull;
    public String cmmnts;
    public int stmax;
    public String a;
    public boolean stores;
    static Connection statcon;

    public frmExpired() {
        initComponents();

    }

    void setuser(String suser, String expdate) {
        lblexplist.setText("Expired Items List  On  " + expdate);
        user = suser;

        a = voidmodule.readintitution(null);
        this.setTitle(a + "  - Expired Items List  -  User : " + user);
        this.setOrderCode();
        voidmodule.fillcombo(cmbinscode, "SELECT DISTINCT Incode from institution");
    }

    void getexpsave(String grn1, String Snull1, int orderCode1, String grndate1, String sysdate1, String gyear1, String gmonth1, String gday1, String wh1, String section1, String lot1, int packsize1, int nopack1, String icode1, String rtype1, String rcpttype1, double unitprize1, String expirddate1, Double qnty1, Double dnull1, String cmmnts1) {
        String user;
        grn = grn1;
        Snull = Snull1;
        grndate = grndate1;
        sysdate = sysdate1;
        gyear = gyear1;
        gmonth = gmonth1;
        gday = gday1;
        wh = wh1;
        section = "EX";
        lot = lot1;
        packsize = packsize1;
        nopack = nopack1;
        icode = icode1;
        rtype = "E";
        temp = "temp";
        rcpttype = rcpttype1;
        unitprize = unitprize1;
        expirddate = "2100-12-31";
        qnty = qnty1;
        dnull = dnull1;
        cmmnts = cmmnts1;

        this.shoeexplist();
    }

    void ob_Enable() {
        txtfromdate.setEnabled(false);
        txttodate.setEnabled(false);
        btnprint.setEnabled(false);
        btnrepresh.setEnabled(false);


    }

    void shoeexplist() {
        lblicode.setText(icode);
        lbleqnty.setText(qnty + "");

        if (qnty == (null)) {
            btnyes.setEnabled(false);
        } else {
            btnyes.setEnabled(true);
        }



        lbldeduct.setText("Do you Want to Remove above quantity  as Expired From the Stock ");

    
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String expirddate = df.format(txtfromdate.getDate());
        String Toexpirddate = df.format(txttodate.getDate());
        String Tblmod = "SELECT g_itemcode,g_grnno,g_lot,sum(g_qnty) as qnty,g_transtype,g_expdate from transaction" //AND g_incode ='" + inscode + "'AND g_status ='" + confim + "'
                + " GROUP BY g_itemcode,g_grnno,g_lot  HAVING g_expdate BETWEEN '" + (expirddate) + "' AND '" + (Toexpirddate) + "' AND sum(g_qnty)<> 0 AND g_transtype ='" + "R" + "'ORDER BY g_itemcode";

        this.expiredList(Tblmod);

        //      this.expiredList("SELECT g_itemcode,g_grnno,g_lot,g_qnty,g_expdate from transaction WHERE g_expdate BETWEEN '" + (expirddate) + "' AND '" + (Toexpirddate) + "' AND g_transtype ='" + "R" + "'ORDER BY g_itemcode");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblexp = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblexplist = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnprint = new javax.swing.JButton();
        txttodate = new de.wannawork.jcalendar.JCalendarComboBox();
        jLabel3 = new javax.swing.JLabel();
        btnrepresh = new javax.swing.JButton();
        txtfromdate = new de.wannawork.jcalendar.JCalendarComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        lblicode = new javax.swing.JLabel();
        lbleqnty = new javax.swing.JLabel();
        lbldeduct = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbinscode = new javax.swing.JComboBox();
        btnyes = new javax.swing.JButton();
        btnno = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setClosable(true);
        setMaximizable(true);

        tblexp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Item Code", "GRN No", "Lot No", "GRN Quantity", "EXP Date"
            }
        ));
        tblexp.setAlignmentX(1.0F);
        jScrollPane1.setViewportView(tblexp);

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblexplist.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblexplist.setForeground(new java.awt.Color(255, 255, 255));
        lblexplist.setText("Expired Items List");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblexplist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(239, 239, 239))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblexplist, javax.swing.GroupLayout.PREFERRED_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnprint.setText("Print");
        btnprint.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintActionPerformed(evt);
            }
        });

        jLabel3.setText("The Expire Items list for within the Range");

        btnrepresh.setText("Represh");
        btnrepresh.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnrepresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrepreshActionPerformed(evt);
            }
        });

        jLabel4.setText("To");

        jLabel2.setText("Select Date Range From");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfromdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttodate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(147, 147, 147))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(186, 186, 186)
                        .addComponent(btnprint, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnrepresh, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnprint, btnrepresh});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txttodate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfromdate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnrepresh, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnprint, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnprint, btnrepresh});

        jSeparator1.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblicode.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblicode.setForeground(new java.awt.Color(204, 0, 0));
        lblicode.setText("icodce");

        lbleqnty.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbleqnty.setForeground(new java.awt.Color(204, 0, 0));
        lbleqnty.setText("qnty");

        lbldeduct.setText("deduct");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Default Item Code :");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("Default Expired Qnty :");

        jLabel7.setText("Select the institution Code");

        cmbinscode.setEditable(true);

        btnyes.setText("Yes");
        btnyes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnyes.setEnabled(false);
        btnyes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnyesActionPerformed(evt);
            }
        });

        btnno.setText("No");
        btnno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblicode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbleqnty, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbldeduct, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(cmbinscode, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnyes, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnno, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnno, btnyes});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblicode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbinscode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(lbleqnty)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldeduct, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnyes)
                    .addComponent(btnno))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jSeparator1)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnoActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnnoActionPerformed

    private void btnyesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnyesActionPerformed
        this.expsave();
    }//GEN-LAST:event_btnyesActionPerformed

    private void btnrepreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrepreshActionPerformed
        this.shoeexplist();
    }//GEN-LAST:event_btnrepreshActionPerformed

    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed
        try {
            Date todate = txttodate.getDate();
            Date fromdate = txtfromdate.getDate();

            Map m = new HashMap();
            m.put("todate", todate);
            m.put("fromdate", fromdate);
            m.put("transtype", "R");
            m.put("institution", a);

            voidmodule.generateReport("//Report//ExpiredList.jrxml", m);


        } catch (ArrayIndexOutOfBoundsException aiobe) {
            JOptionPane.showMessageDialog(null, "PLS SELCET CUSTOMER FROM TABLE ");
        }
    }//GEN-LAST:event_btnprintActionPerformed

    void expsave() {

        dbconnector.conn();

        Date date = new Date();
        DateFormat dfyear = new SimpleDateFormat("yyyy");
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat dfmonth = new SimpleDateFormat("MM");
        DateFormat dfday = new SimpleDateFormat("dd");


        String sysdate = df.format(date);
        String grndate = df.format(date);
        String gmonth = dfmonth.format(date);
        String gday = dfday.format(date);
        gyear = dfyear.format(date);
        Object incode = cmbinscode.getSelectedItem();

        try {

            if (stores == true) {
                int Count = voidmodule.RCount("SELECT g_grnno from transaction WHERE g_grnno ='" + grn + "'AND g_itemcode ='" + icode + "'AND g_lot ='" + lot + "'AND g_transtype ='" + rtype + "'");
                if (Count > 0) {
                    int i = MessageBox.yesno("Records Already Exited. Do You Want to Update Records…? ");
                    if (i == 0) {
                        dbconnector.insertquery("UPDATE transaction SET g_date = '" + grndate + "',g_sysdate = '" + sysdate + "',g_year = '" + gyear + "',g_month = '" + gmonth + "',g_warehose = '" + wh + "',g_section = '" + section + "',g_lot = '" + lot + "',g_packsize = '" + packsize + "',g_packs = '" + nopack + "',g_itemcode = '" + icode + "',g_status = '" + temp + "',g_transtype = '" + rtype + "',g_receipttype = '" + rcpttype + "',g_initprice = '" + unitprize + "',g_expdate = '" + expirddate + "',g_qnty = '" + -qnty + "',g_iqnty = '" + qnty + "',g_coment = '" + cmmnts + "',g_user = '" + user + "'WHERE g_grnno ='" + grn + "'AND g_itemcode ='" + icode + "'AND g_lot ='" + lot + "'AND g_transtype ='" + rtype + "'");
                        voidmodule.U_transaction(user, "update expired item  " + icode + " -" + qnty);
                    }
                } else {
                    int i = MessageBox.yesno("Do you Want to Remove Expired Lot from the Stock ? ");
                    if (i == 0) {
                        dbconnector.insertquery("INSERT INTO transaction VALUES ('" + grn + "','" + Snull + "','" + incode + "','" + orderCode + "','" + grndate + "','" + sysdate + "','" + gyear + "','" + gmonth + "','" + gday + "','" + wh + "','" + section + "','" + lot + "','" + packsize + "','" + nopack + "','" + icode + "','" + temp + "','" + rtype + "','" + rcpttype + "','" + unitprize + "','" + expirddate + "','" + -qnty + "','" + dnull + "','" + qnty + "','" + cmmnts + "','" + user + "')");
                        voidmodule.U_transaction(user, "remove expired item  " + icode + " -" + qnty);
                        JOptionPane.showMessageDialog(null, "Records Saved");
                        JOptionPane.showMessageDialog(null, "Expired deduction Completed. Please be make sure to generate the Deduction  report from Invoice form...");
                        this.setVisible(false);

                    }
                }
            } else {
                int Count = voidmodule.RCount("SELECT g_grnno from transaction_sub1 WHERE g_grnno ='" + grn + "'AND g_itemcode ='" + icode + "'AND g_lot ='" + lot + "'AND g_transtype ='" + rtype + "'");
                if (Count > 0) {
                    int i = MessageBox.yesno("Records Already Exited. Do You Want to Update Records…? ");
                    if (i == 0) {
                        dbconnector.insertquery("UPDATE transaction_sub1 SET g_date = '" + grndate + "',g_sysdate = '" + sysdate + "',g_year = '" + gyear + "',g_month = '" + gmonth + "',g_warehose = '" + wh + "',g_section = '" + section + "',g_lot = '" + lot + "',g_packsize = '" + packsize + "',g_packs = '" + nopack + "',g_itemcode = '" + icode + "',g_status = '" + temp + "',g_transtype = '" + rtype + "',g_receipttype = '" + rcpttype + "',g_initprice = '" + unitprize + "',g_expdate = '" + expirddate + "',g_qnty = '" + -qnty + "',g_iqnty = '" + qnty + "',g_coment = '" + cmmnts + "',g_user = '" + user + "'WHERE g_grnno ='" + grn + "'AND g_itemcode ='" + icode + "'AND g_lot ='" + lot + "'AND g_transtype ='" + rtype + "'");
                        voidmodule.U_transaction(user, "update expired item  " + icode + " -" + qnty);
                    }
                } else {
                    int i = MessageBox.yesno("Do you Want to Remove Expired Lot from the Stock ? ");
                    if (i == 0) {
                        dbconnector.insertquery("INSERT INTO transaction_sub1 VALUES ('" + grn + "','" + Snull + "','" + incode + "','" + orderCode + "','" + grndate + "','" + sysdate + "','" + gyear + "','" + gmonth + "','" + gday + "','" + wh + "','" + section + "','" + lot + "','" + packsize + "','" + nopack + "','" + icode + "','" + temp + "','" + rtype + "','" + rcpttype + "','" + unitprize + "','" + expirddate + "','" + -qnty + "','" + dnull + "','" + qnty + "','" + cmmnts + "','" + user + "')");
                        voidmodule.U_transaction(user, "remove expired item  " + icode + " -" + qnty);
                        JOptionPane.showMessageDialog(null, "Records Saved");
                        JOptionPane.showMessageDialog(null, "Expired deduction Completed. Please be make sure to generate the Deduction  report from Invoice form...");
                        this.setVisible(false);

                    }
                }

            }


        } catch (SQLException ex) {
            Logger.getLogger(frmExpired.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void expiredList(String query) {

        String icode;
        String grn;
        String lot;
        Integer qnty;
        Date expdate;


        try {

            DefaultTableModel addabl = (DefaultTableModel) tblexp.getModel();
            while (tblexp.getRowCount() > 0) {
                addabl.removeRow(0);
            }
            Statement rss = dbconnector.conn().createStatement();
            ResultSet rs = rss.executeQuery(query);
            while (rs.next()) {
                icode = rs.getString("g_itemcode");
                grn = rs.getString("g_grnno");
                lot = rs.getString("g_lot");
                qnty = Integer.parseInt(rs.getString("qnty"));
                expdate = (Date) rs.getDate("g_expdate");


                addabl.addRow(new Object[]{icode, grn, lot, qnty, expdate});
            }



        } catch (SQLException ex) {
            Logger.getLogger(frmStock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void setOrderCode() {
        Date date = new Date();
        DateFormat dfyear = new SimpleDateFormat("yyyy");
        gyear = dfyear.format(date);
        if (stores == true) {
            this.getmax(stmax, "SELECT MAX(g_ordercode) FROM transaction WHERE g_year = '" + gyear + "'");
        } else {
            this.getmax(stmax, "SELECT MAX(g_ordercode) FROM transaction_sub1 WHERE g_year = '" + gyear + "'");

        }
        NumberFormat nf1 = new DecimalFormat("000000");
        String st1 = nf1.format(stmax);
        orderCode = Integer.parseInt((String) st1);

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
            Logger.getLogger(frmInvoice.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnno;
    private javax.swing.JButton btnprint;
    private javax.swing.JButton btnrepresh;
    private javax.swing.JButton btnyes;
    private javax.swing.JComboBox cmbinscode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbldeduct;
    private javax.swing.JLabel lbleqnty;
    private javax.swing.JLabel lblexplist;
    private javax.swing.JLabel lblicode;
    private javax.swing.JTable tblexp;
    private de.wannawork.jcalendar.JCalendarComboBox txtfromdate;
    private de.wannawork.jcalendar.JCalendarComboBox txttodate;
    // End of variables declaration//GEN-END:variables
}
