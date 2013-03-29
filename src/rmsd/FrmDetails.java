package rmsd;


import java.sql.ResultSet;
import java.sql.SQLException;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import mymod.dbconnector;
import mymod.voidmodule;

public class FrmDetails extends javax.swing.JInternalFrame {

    public String user;
    public String a;
    //..........
    public Double rmsdesmt;
    public Double ttlrcpt;
    public Double ttlissue;
    public Double inhand;
    public Double rcpypctg;
    public Double issuepctg;
    //..........
    public Double insesmt;
    public Double insissue;
    public Double lastissue;
    public Double insbal;
    public Date lastDate;
    public Double insissuepctg;
    //..........
    public Object itemcode;
    public Object inscode;
    public Object Cyear;
    public String lastqnty;
    public String dat1e;

    public FrmDetails() {
        initComponents();

    }

    void setuser(String suser) {
        user = suser;

        a = voidmodule.readintitution(null);
        this.setTitle(a + "  - Item Information  -  User : " + user);

        voidmodule.fillcombo(cmbinscode, "SELECT DISTINCT g_incode from transaction ORDER BY g_incode");
        voidmodule.fillcombo(cmbinsname, "SELECT DISTINCT name from institution ORDER BY name");
        voidmodule.fillcombo(cmbitmcode, "SELECT DISTINCT d_srno from dgs_surgicallist ORDER BY d_srno");
        voidmodule.fillcombo(cmbitmname, "SELECT DISTINCT d_name from dgs_surgicallist ORDER BY d_name");
        voidmodule.fillcombo(cmbyear, "SELECT DISTINCT g_year from transaction ORDER BY g_year");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cmbinscode = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        cmbinsname = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbitmcode = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        cmbitmname = new javax.swing.JComboBox();
        cmbyear = new javax.swing.JComboBox();
        btnApply = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblrmsdesmt = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblttlrcpt = new javax.swing.JLabel();
        lblttlissue = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblrcpypctg = new javax.swing.JLabel();
        lblinsesmt = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblinsissue = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblinsbal = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblinsissuepctg = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lbllastissue = new javax.swing.JLabel();
        lblissuedate = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        lblrmsdesmtVal = new javax.swing.JLabel();
        lblttlrcptVal = new javax.swing.JLabel();
        lblttlissueVal = new javax.swing.JLabel();
        lblrcpypctgVal = new javax.swing.JLabel();
        lblinsesmtVal = new javax.swing.JLabel();
        lblinsissueVal = new javax.swing.JLabel();
        lblinsbalVal = new javax.swing.JLabel();
        lblinsissuepctgVal = new javax.swing.JLabel();
        lbllastissueVal = new javax.swing.JLabel();
        lblissuedateVal = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblissuepctg = new javax.swing.JLabel();
        lblissuepctgVal = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        lblinhand = new javax.swing.JLabel();
        lblttlissueVal1 = new javax.swing.JLabel();
        lbluprice = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lblunit = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        btnexit = new javax.swing.JButton();
        btnprint = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);

        jLabel4.setBackground(new java.awt.Color(148, 172, 193));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Item Information");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel4.setOpaque(true);

        jPanel5.setBackground(new java.awt.Color(148, 163, 193));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setText("Institution Name");

        cmbinscode.setEditable(true);
        cmbinscode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbinscodeActionPerformed(evt);
            }
        });

        jLabel1.setText("Year");

        cmbinsname.setEditable(true);
        cmbinsname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbinsnameActionPerformed(evt);
            }
        });

        jLabel6.setText("Institution Code");

        jLabel8.setText("Item Code");

        cmbitmcode.setEditable(true);
        cmbitmcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbitmcodeActionPerformed(evt);
            }
        });
        cmbitmcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbitmcodeKeyPressed(evt);
            }
        });

        jLabel9.setText("Item Name");

        cmbitmname.setEditable(true);
        cmbitmname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbitmnameActionPerformed(evt);
            }
        });

        cmbyear.setEditable(true);
        cmbyear.setOpaque(false);
        cmbyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbyearActionPerformed(evt);
            }
        });

        btnApply.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnApply.setText("Apply");
        btnApply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbinscode, 0, 229, Short.MAX_VALUE)
                    .addComponent(cmbinsname, 0, 229, Short.MAX_VALUE)
                    .addComponent(cmbyear, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbitmcode, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbitmname, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnApply)
                .addGap(8, 8, 8))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbyear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8)))
                    .addComponent(cmbinscode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbinsname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9)))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(cmbitmcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbitmname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnApply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("RMSD Estiimate : ");

        lblrmsdesmt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblrmsdesmt.setForeground(new java.awt.Color(204, 51, 0));
        lblrmsdesmt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblrmsdesmt.setText("0");
        lblrmsdesmt.setMaximumSize(new java.awt.Dimension(9, 15));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Total Receipt  : ");

        lblttlrcpt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblttlrcpt.setForeground(new java.awt.Color(204, 51, 0));
        lblttlrcpt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblttlrcpt.setText("0");
        lblttlrcpt.setMaximumSize(new java.awt.Dimension(9, 15));

        lblttlissue.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblttlissue.setForeground(new java.awt.Color(204, 51, 0));
        lblttlissue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblttlissue.setText("0");
        lblttlissue.setMaximumSize(new java.awt.Dimension(9, 15));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Total Issued  : ");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Receipt Percentage :");

        lblrcpypctg.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblrcpypctg.setForeground(new java.awt.Color(204, 51, 0));
        lblrcpypctg.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblrcpypctg.setText("0");
        lblrcpypctg.setMaximumSize(new java.awt.Dimension(9, 15));

        lblinsesmt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblinsesmt.setForeground(new java.awt.Color(204, 51, 0));
        lblinsesmt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblinsesmt.setText("0");
        lblinsesmt.setMaximumSize(new java.awt.Dimension(9, 15));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Institute Estimate :");

        lblinsissue.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblinsissue.setForeground(new java.awt.Color(204, 51, 0));
        lblinsissue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblinsissue.setText("0");
        lblinsissue.setMaximumSize(new java.awt.Dimension(9, 15));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Total Issued  : ");

        lblinsbal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblinsbal.setForeground(new java.awt.Color(204, 51, 0));
        lblinsbal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblinsbal.setText("0");
        lblinsbal.setMaximumSize(new java.awt.Dimension(9, 15));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Balance to Issue : ");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setText("issued Percentage :");

        lblinsissuepctg.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblinsissuepctg.setForeground(new java.awt.Color(204, 51, 0));
        lblinsissuepctg.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblinsissuepctg.setText("0");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setText("Last Issued : ");

        lbllastissue.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbllastissue.setForeground(new java.awt.Color(204, 51, 0));
        lbllastissue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbllastissue.setText("0");

        lblissuedate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblissuedate.setForeground(new java.awt.Color(204, 51, 0));
        lblissuedate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblissuedate.setText("0");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel17.setText("Last Issued Date : ");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Quantity");

        lblrmsdesmtVal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblrmsdesmtVal.setForeground(new java.awt.Color(204, 51, 0));
        lblrmsdesmtVal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblrmsdesmtVal.setText("0");
        lblrmsdesmtVal.setMaximumSize(new java.awt.Dimension(9, 15));

        lblttlrcptVal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblttlrcptVal.setForeground(new java.awt.Color(204, 51, 0));
        lblttlrcptVal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblttlrcptVal.setText("0");
        lblttlrcptVal.setMaximumSize(new java.awt.Dimension(9, 15));

        lblttlissueVal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblttlissueVal.setForeground(new java.awt.Color(204, 51, 0));
        lblttlissueVal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblttlissueVal.setText("0");
        lblttlissueVal.setMaximumSize(new java.awt.Dimension(9, 15));

        lblrcpypctgVal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblrcpypctgVal.setForeground(new java.awt.Color(204, 51, 0));
        lblrcpypctgVal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblrcpypctgVal.setMaximumSize(new java.awt.Dimension(9, 15));

        lblinsesmtVal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblinsesmtVal.setForeground(new java.awt.Color(204, 51, 0));
        lblinsesmtVal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblinsesmtVal.setText("0");
        lblinsesmtVal.setMaximumSize(new java.awt.Dimension(9, 15));

        lblinsissueVal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblinsissueVal.setForeground(new java.awt.Color(204, 51, 0));
        lblinsissueVal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblinsissueVal.setText("0");
        lblinsissueVal.setMaximumSize(new java.awt.Dimension(9, 15));

        lblinsbalVal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblinsbalVal.setForeground(new java.awt.Color(204, 51, 0));
        lblinsbalVal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblinsbalVal.setText("0");
        lblinsbalVal.setMaximumSize(new java.awt.Dimension(9, 15));

        lblinsissuepctgVal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblinsissuepctgVal.setForeground(new java.awt.Color(204, 51, 0));
        lblinsissuepctgVal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lbllastissueVal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbllastissueVal.setForeground(new java.awt.Color(204, 51, 0));
        lbllastissueVal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbllastissueVal.setText("0");

        lblissuedateVal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblissuedateVal.setForeground(new java.awt.Color(204, 51, 0));
        lblissuedateVal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Value (RS)");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel19.setText("Issued Percentage :");

        lblissuepctg.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblissuepctg.setForeground(new java.awt.Color(204, 51, 0));
        lblissuepctg.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblissuepctg.setText("0");
        lblissuepctg.setMaximumSize(new java.awt.Dimension(9, 15));

        lblissuepctgVal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblissuepctgVal.setForeground(new java.awt.Color(204, 51, 0));
        lblissuepctgVal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblissuepctgVal.setMaximumSize(new java.awt.Dimension(9, 15));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel20.setText("Onhand : ");

        lblinhand.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblinhand.setForeground(new java.awt.Color(204, 51, 0));
        lblinhand.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblinhand.setText("0");
        lblinhand.setMaximumSize(new java.awt.Dimension(9, 15));

        lblttlissueVal1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblttlissueVal1.setForeground(new java.awt.Color(204, 51, 0));
        lblttlissueVal1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblttlissueVal1.setText("0");
        lblttlissueVal1.setMaximumSize(new java.awt.Dimension(9, 15));

        lbluprice.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lbluprice.setText("price");

        lblunit.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        lblunit.setText("unit");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                .addGap(174, 174, 174))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblissuedate, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(344, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbllastissueVal, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(lblissuedateVal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lbluprice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblinsesmt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblinsissue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                            .addComponent(lblinsbal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                            .addComponent(lblinsissuepctg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbllastissue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                            .addComponent(lblissuepctg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblrcpypctg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblinhand, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblttlissue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblttlrcpt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblrmsdesmt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblrmsdesmtVal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblttlrcptVal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblttlissueVal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblttlissueVal1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblrcpypctgVal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblissuepctgVal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblinsesmtVal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblinsissueVal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblinsbalVal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblinsissuepctgVal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblunit, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel12, jLabel13, jLabel14, jLabel15, jLabel16, jLabel17, jLabel2, jLabel3, jLabel5});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblrmsdesmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(lblrmsdesmtVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblttlrcpt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(lblttlrcptVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblttlissue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(lblttlissueVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblinhand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(lblttlissueVal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblrcpypctgVal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblrcpypctg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblissuepctgVal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblissuepctg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblinsesmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(lblinsesmtVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblinsissue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(lblinsissueVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblinsbal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(lblinsbalVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblinsissuepctgVal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblinsissuepctg)
                        .addComponent(jLabel15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbllastissue)
                    .addComponent(jLabel16)
                    .addComponent(lbllastissueVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblissuedateVal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblissuedate)
                        .addComponent(jLabel17)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbluprice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblunit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(200, 100));

        jDesktopPane2.setPreferredSize(new java.awt.Dimension(200, 100));

        btnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit.jpg"))); // NOI18N
        btnexit.setText("Exit");
        btnexit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        btnprint.setText("Print ");
        btnprint.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnprint, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnexit, btnprint});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jDesktopPane1, jDesktopPane2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnprint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jDesktopPane1, jDesktopPane2});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnexit, btnprint});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbinscodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbinscodeActionPerformed
        Object inscode = cmbinscode.getSelectedItem();
        voidmodule.AddItemToCombo(cmbinsname, "SELECT name from institution WHERE Incode = '" + inscode + "'");
    }//GEN-LAST:event_cmbinscodeActionPerformed

    private void cmbinsnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbinsnameActionPerformed
        Object insname = cmbinsname.getSelectedItem();
        voidmodule.AddItemToCombo(cmbinscode, "SELECT Incode from institution WHERE name = '" + insname + "'");
    }//GEN-LAST:event_cmbinsnameActionPerformed

    private void cmbitmcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbitmcodeActionPerformed
        Object inscode = cmbitmcode.getSelectedItem();
        voidmodule.AddItemToCombo(cmbitmname, "SELECT d_name from dgs_surgicallist WHERE d_srno = '" + inscode + "'");

        Runnable run = new Runnable() {

            public void run() {
            }
        };


        Thread tr = new Thread(run);
        tr.start();
    }//GEN-LAST:event_cmbitmcodeActionPerformed

    private void cmbitmnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbitmnameActionPerformed
        Object inscode = cmbitmname.getSelectedItem();
        voidmodule.AddItemToCombo(cmbitmcode, "SELECT d_srno from dgs_surgicallist WHERE d_name = '" + inscode + "'");
    }//GEN-LAST:event_cmbitmnameActionPerformed

    private void cmbyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbyearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbyearActionPerformed
    void genData() throws SQLException {
        itemcode = cmbitmcode.getSelectedItem();
        inscode = cmbinscode.getSelectedItem();
        Cyear = cmbyear.getSelectedItem();
        int inscount = voidmodule.RCount("SELECT Incode from institution WHERE Incode ='" + inscode + "'");
        int itmcount = voidmodule.RCount("SELECT d_srno from dgs_surgicallist WHERE d_srno ='" + itemcode + "'");

        if (itmcount > 0 && inscount > 0) {



            NumberFormat nf1 = new DecimalFormat("00");
            NumberFormat pricenf1 = new DecimalFormat("00.00");
            String st1 = null;

            rmsdesmt = voidmodule.getsumDouble("SELECT SUM(estimate_Qty) FROM all_estimate  WHERE ProductCode = '" + itemcode + "'AND year = '" + Cyear + "'");
            st1 = nf1.format(rmsdesmt);
            lblrmsdesmt.setText(st1);

            ttlrcpt = voidmodule.getsumDouble("SELECT SUM(g_Rqnty) FROM transaction  WHERE g_year = '" + Cyear + "'AND g_itemcode = '" + itemcode + "'");
            st1 = nf1.format(ttlrcpt);
            lblttlrcpt.setText(st1);

            ttlissue = voidmodule.getsumDouble("SELECT SUM(g_Iqnty) FROM transaction  WHERE g_year = '" + Cyear + "'AND g_itemcode = '" + itemcode + "'");
            st1 = nf1.format(ttlissue);
            lblttlissue.setText(st1);


            inhand = voidmodule.getsumDouble("SELECT SUM(g_qnty) FROM transaction  WHERE g_itemcode = '" + itemcode + "'");
            st1 = nf1.format(inhand);
            lblinhand.setText(st1 + "");

            insesmt = voidmodule.getsumDouble("SELECT estimate_Qty FROM all_estimate  WHERE Incode = '" + inscode + "'AND ProductCode = '" + itemcode + "'AND year = '" + Cyear + "'");
            st1 = nf1.format(insesmt);
            lblinsesmt.setText(st1 + "");

            insissue = voidmodule.getsumDouble("SELECT SUM(g_Iqnty) FROM transaction  WHERE g_itemcode = '" + itemcode + "'AND g_incode = '" + inscode + "'AND g_year = '" + Cyear + "'");
            st1 = nf1.format(insissue);
            lblinsissue.setText(st1 + "");


            rcpypctg = (ttlrcpt / rmsdesmt) * 100;
            st1 = nf1.format(rcpypctg);
            lblrcpypctg.setText(st1 + "%");


            issuepctg = (ttlissue / rmsdesmt) * 100;
            st1 = nf1.format(issuepctg);
            lblissuepctg.setText(st1 + "%");


            insissuepctg = (insissue / insesmt) * 100;
            st1 = nf1.format(insissuepctg);
            lblinsissuepctg.setText(st1 + "%");


            insbal = (insesmt - insissue);
            st1 = nf1.format(insbal);
            lblinsbal.setText(st1);


            Object dbMax = voidmodule.DbMax("transaction", "g_ordercode", "g_itemcode = '" + itemcode + "'AND g_incode = '" + inscode + "'AND g_year = '" + Cyear + "'");
            ResultSet rs = dbconnector.Sql_OutResultset("SELECT g_Iqnty,g_sysdate FROM transaction  WHERE g_itemcode = '" + itemcode + "'AND g_ordercode = '" + dbMax + "'AND g_year = '" + Cyear + "'");
            while (rs.next()) {
                lastqnty = rs.getString(1);
                dat1e = rs.getString(2);
            }

            lbllastissue.setText(lastqnty);
            lblissuedate.setText(dat1e);
            rs.close();
            unit = voidmodule.Out_fieldResulr("SELECT d_unit FROM dgs_surgicallist  WHERE d_srno = '" + itemcode + "'");
            lblunit.setText("Unit = " + unit);
            Uprice = voidmodule.Out_fieldResulr("SELECT g_initprice FROM unit_price  WHERE g_itemcode = '" + itemcode + "'");
            lbluprice.setText("Unit Price = " + Uprice);
            try {
                rmsdesmtVal = pricenf1.format((Double.parseDouble(Uprice)) * rmsdesmt);
                lblrmsdesmtVal.setText(rmsdesmtVal);
                ttlrcptVal = pricenf1.format((Double.parseDouble(Uprice)) * ttlrcpt);
                lblttlrcptVal.setText(ttlrcptVal);
                ttlissueVal = pricenf1.format((Double.parseDouble(Uprice)) * ttlissue);
                lblttlissueVal.setText(ttlissueVal);
                inhandval = pricenf1.format((Double.parseDouble(Uprice)) * inhand);
                lblttlissueVal1.setText(inhandval);
                insesmtVal = pricenf1.format((Double.parseDouble(Uprice)) * insesmt);
                lblinsesmtVal.setText(insesmtVal);
                insissueVal = pricenf1.format((Double.parseDouble(Uprice)) * insissue);
                lblinsissueVal.setText(insissueVal);
                insbalVal = pricenf1.format((Double.parseDouble(Uprice)) * insbal);
                lblinsbalVal.setText(insbalVal);
                lastissueVal = pricenf1.format((Double.parseDouble(Uprice)) * Double.parseDouble(lastqnty));
                lbllastissueVal.setText(lastissueVal);

            } catch (NullPointerException ex) {
                Logger.getLogger(FrmDetails.class.getName()).log(Level.SEVERE, null, ex);
                lblrmsdesmtVal.setText("0.00");
                lblttlrcptVal.setText("0.00");
                lblttlissueVal.setText("0.00");
                lblttlissueVal1.setText("0.00");
                lblinsesmtVal.setText("0.00");
                lblinsissueVal.setText("0.00");
                lblinsbalVal.setText("0.00");
                lbllastissueVal.setText("0.00");
            }

        } else {
            JOptionPane.showMessageDialog(null, "incorrect Item Code ");
        }

    }
    public String rmsdesmtVal;
    public String ttlrcptVal;
    public String ttlissueVal;
    public String inhandval;
    public String insesmtVal;
    public String insissueVal;
    public String insbalVal;
    public String lastissueVal;
    public String unit;
    public String Uprice;

    void transDta(String year, String itmcode, String inscode) {
        cmbyear.setSelectedItem(year);
        cmbitmcode.setSelectedItem(itmcode);
        cmbinscode.setSelectedItem(inscode);

        try {
            genData();
            ShowChart();

        } catch (SQLException ex) {
            Logger.getLogger(FrmDetails.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void btnApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyActionPerformed
        try {
            genData();
            ShowChart();

        } catch (SQLException ex) {
            Logger.getLogger(FrmDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnApplyActionPerformed

    private void cmbitmcodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbitmcodeKeyPressed
   }//GEN-LAST:event_cmbitmcodeKeyPressed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed
        try {
            Object insname = cmbinsname.getSelectedItem();
            int intrcpypctg = (rcpypctg.intValue());
            int intissuepctg = (issuepctg.intValue());
            int intinsissuepctg = (insissuepctg.intValue());
            Map m = new HashMap();
            m.put("Institution", a);

            m.put("itemcode", itemcode);
            m.put("inscode", inscode);
            m.put("insname", insname);
            m.put("Cyear", Cyear);

            m.put("rmsdesmt", rmsdesmt.toString());
            m.put("ttlrcpt", ttlrcpt.toString());
            m.put("ttlissue", ttlissue.toString());
            m.put("inhand", inhand.toString());
            m.put("rcpypctg", (intrcpypctg + ""));
            m.put("issuepctg", (intissuepctg + ""));

            m.put("rmsdesmtVal", rmsdesmtVal.toString());
            m.put("ttlrcptVal", ttlrcptVal.toString());
            m.put("ttlissueVal", ttlissueVal.toString());
            m.put("inhandval", inhandval.toString());



            m.put("insesmt", insesmt.toString());
            m.put("insissue", insissue.toString());
            m.put("insbal", insbal.toString());
            m.put("intinsissuepctg", (intinsissuepctg + ""));
            m.put("lastqnty", lastqnty);
            m.put("dat1e", dat1e);

            m.put("insesmtVal", insesmtVal.toString());
            m.put("insissueVal", insissueVal.toString());
            m.put("insbalVal", insbalVal.toString());
            m.put("lastissueVal", lastissueVal.toString());
            
            m.put("unit", unit);
            m.put("Uprice", Uprice);






            voidmodule.generateReport("//Report//Item_status.jrxml", m);

            voidmodule.U_transaction(user, "print  estimateAll report");
        } catch (ArrayIndexOutOfBoundsException aiobe) {
            JOptionPane.showMessageDialog(null, "PLS SELCET CUSTOMER FROM TABLE ");
        }
    }//GEN-LAST:event_btnprintActionPerformed

    private void ShowChart() {

        //RMSD  Frame1......
        JInternalFrame frame = new JInternalFrame();
        frame.setBorder(null);
        frame.setFrameIcon(null);
        frame.setSize(380, 190);


        double[] value = new double[4];
        String[] languages = new String[4];



        value[0] = Double.parseDouble(rmsdesmt.toString());
        languages[0] = "RMSD Estmt";

        value[1] = Double.parseDouble(ttlrcpt.toString());
        languages[1] = "TTL Rcpt";

        value[2] = Double.parseDouble(ttlissue.toString());
        languages[2] = "TTL Issue";

        value[3] = Double.parseDouble(inhand.toString());
        languages[3] = "On Hand";
        frame.getContentPane().add (new BarChart(value, languages, "Item Details for RMSD"));
        jDesktopPane1.add(frame);
        frame.setVisible(true);

//Institution Frame2......

        JInternalFrame frame2 = new JInternalFrame();
        frame2.setBorder(null);
        frame2.setFrameIcon(null);
        frame2.setSize(380, 190);

        double[] value2 = new double[3];
        String[] languages2 = new String[3];

        value2[0] = Double.parseDouble(insesmt.toString());
        languages2[0] = "Institute Estmt";

        value2[1] = Double.parseDouble(insissue.toString());
        languages2[1] = "TTL Issue";

        value2[2] = Double.parseDouble(insbal.toString());
        languages2[2] = "Balance to Issue";



        frame2.getContentPane().add(new BarChart(value2, languages2, "Item Details for Institution"));
        jDesktopPane2.add(frame2);
        frame2.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApply;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnprint;
    private javax.swing.JComboBox cmbinscode;
    private javax.swing.JComboBox cmbinsname;
    private javax.swing.JComboBox cmbitmcode;
    private javax.swing.JComboBox cmbitmname;
    private javax.swing.JComboBox cmbyear;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblinhand;
    private javax.swing.JLabel lblinsbal;
    private javax.swing.JLabel lblinsbalVal;
    private javax.swing.JLabel lblinsesmt;
    private javax.swing.JLabel lblinsesmtVal;
    private javax.swing.JLabel lblinsissue;
    private javax.swing.JLabel lblinsissueVal;
    private javax.swing.JLabel lblinsissuepctg;
    private javax.swing.JLabel lblinsissuepctgVal;
    private javax.swing.JLabel lblissuedate;
    private javax.swing.JLabel lblissuedateVal;
    private javax.swing.JLabel lblissuepctg;
    private javax.swing.JLabel lblissuepctgVal;
    private javax.swing.JLabel lbllastissue;
    private javax.swing.JLabel lbllastissueVal;
    private javax.swing.JLabel lblrcpypctg;
    private javax.swing.JLabel lblrcpypctgVal;
    private javax.swing.JLabel lblrmsdesmt;
    private javax.swing.JLabel lblrmsdesmtVal;
    private javax.swing.JLabel lblttlissue;
    private javax.swing.JLabel lblttlissueVal;
    private javax.swing.JLabel lblttlissueVal1;
    private javax.swing.JLabel lblttlrcpt;
    private javax.swing.JLabel lblttlrcptVal;
    private javax.swing.JLabel lblunit;
    private javax.swing.JLabel lbluprice;
    // End of variables declaration//GEN-END:variables
}
