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
import javax.swing.JLabel;
import mymod.dbconnector;
import mymod.voidmodule;

public class frmStock extends javax.swing.JInternalFrame {

    public String user;
    public String a;

    public frmStock() {
        initComponents();
        this.setuser(null);
        this.lablindicate("SELECT * from dgs_surgicallist ORDER BY d_srno");




    }

    void setuser(String suser) {

        user = suser;
      
        a = voidmodule.readintitution(null);
        this.setTitle(a + "  - Invoice  -  User : " + user);

        voidmodule.fillcombo(cmbsection, "SELECT DISTINCT catagory from warehouse");
        voidmodule.fillcombo(cmbWhouse, "SELECT DISTINCT wh from warehouse");
        voidmodule.fillcombo(cmbunit, "SELECT DISTINCT d_unit from dgs_surgicallist");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbWhouse = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        lblOnhandstock = new javax.swing.JLabel();
        cmbsection = new javax.swing.JComboBox();
        txtIname = new javax.swing.JTextField();
        txtRolevel = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        txtIcode = new javax.swing.JFormattedTextField();
        cmbved = new javax.swing.JComboBox();
        cmbunit = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        lblunitprise = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblstock = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnsave = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        optremove = new javax.swing.JRadioButton();
        btnprint = new javax.swing.JButton();
        lblrecords = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setBackground(new java.awt.Color(241, 237, 230));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Stock1.jpg"))); // NOI18N
        jLabel8.setText("Image");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setText("VED");

        jLabel5.setText("Unit");

        jLabel6.setText("Re Oder Level");

        cmbWhouse.setEditable(true);
        cmbWhouse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbWhouseKeyPressed(evt);
            }
        });

        jLabel4.setText("Item Name");

        lblOnhandstock.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblOnhandstock.setText("Stock");

        cmbsection.setEditable(true);
        cmbsection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbsectionActionPerformed(evt);
            }
        });
        cmbsection.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbsectionKeyPressed(evt);
            }
        });

        txtIname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInameActionPerformed(evt);
            }
        });
        txtIname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtInameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtInameKeyReleased(evt);
            }
        });

        txtRolevel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtRolevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRolevelActionPerformed(evt);
            }
        });
        txtRolevel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRolevelKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("On Hand Stock");

        txtIcode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIcodeMouseClicked(evt);
            }
        });
        txtIcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIcodeActionPerformed(evt);
            }
        });
        txtIcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIcodeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIcodeKeyReleased(evt);
            }
        });

        cmbved.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "V", "E", "N" }));
        cmbved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbvedActionPerformed(evt);
            }
        });
        cmbved.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbvedKeyPressed(evt);
            }
        });

        cmbunit.setEditable(true);
        cmbunit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbunitActionPerformed(evt);
            }
        });
        cmbunit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbunitKeyPressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Unit Prise");

        lblunitprise.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblunitprise.setText("prise");

        jLabel2.setText("Item Code");

        jLabel1.setText("Section");

        jLabel3.setText("Warehouse");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbsection, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbWhouse, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(167, 167, 167))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIcode, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbunit, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(txtRolevel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbved, 0, 78, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(lblunitprise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblOnhandstock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(txtIname)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbsection, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(cmbWhouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOnhandstock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblunitprise)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRolevel)
                            .addComponent(cmbunit, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbved))
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.setBackground(new java.awt.Color(238, 215, 144));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        tblstock.setBackground(new java.awt.Color(240, 223, 170));
        tblstock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Name", "Unit", "W/House", "Re Oder Level", "VED", "Section"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblstock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblstockMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblstock);
        tblstock.getColumnModel().getColumn(0).setMinWidth(0);
        tblstock.getColumnModel().getColumn(0).setPreferredWidth(80);
        tblstock.getColumnModel().getColumn(0).setMaxWidth(80);
        tblstock.getColumnModel().getColumn(2).setMinWidth(0);
        tblstock.getColumnModel().getColumn(2).setPreferredWidth(50);
        tblstock.getColumnModel().getColumn(2).setMaxWidth(50);
        tblstock.getColumnModel().getColumn(3).setMinWidth(0);
        tblstock.getColumnModel().getColumn(3).setPreferredWidth(100);
        tblstock.getColumnModel().getColumn(3).setMaxWidth(100);
        tblstock.getColumnModel().getColumn(4).setMinWidth(0);
        tblstock.getColumnModel().getColumn(4).setPreferredWidth(120);
        tblstock.getColumnModel().getColumn(4).setMaxWidth(120);
        tblstock.getColumnModel().getColumn(5).setMinWidth(0);
        tblstock.getColumnModel().getColumn(5).setPreferredWidth(30);
        tblstock.getColumnModel().getColumn(5).setMaxWidth(30);
        tblstock.getColumnModel().getColumn(6).setMinWidth(0);
        tblstock.getColumnModel().getColumn(6).setPreferredWidth(0);
        tblstock.getColumnModel().getColumn(6).setMaxWidth(0);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
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

        optremove.setBackground(new java.awt.Color(255, 255, 255));
        optremove.setText("Remove Item");
        optremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optremoveActionPerformed(evt);
            }
        });

        btnprint.setText("Stock Report");
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
                .addComponent(btnprint, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(optremove, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnsave, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnprint, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(optremove)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        lblrecords.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblrecords.setText("records");

        jLabel9.setText("Number Of Records :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblrecords, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblrecords)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnexitActionPerformed

    private void tblstockMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblstockMouseReleased
        int SelectedRow = tblstock.getSelectedRow();
        String code = tblstock.getValueAt(SelectedRow, 0).toString();
        String name = tblstock.getValueAt(SelectedRow, 1).toString();
        String unit = tblstock.getValueAt(SelectedRow, 2).toString();
        String wh = tblstock.getValueAt(SelectedRow, 3).toString();
        String roleval = tblstock.getValueAt(SelectedRow, 4).toString();
        Object ved = tblstock.getValueAt(SelectedRow, 5).toString();
        String section = tblstock.getValueAt(SelectedRow, 6).toString();

        txtIcode.setText(code);
        cmbsection.setSelectedItem(section);
        txtIname.setText(name);
        cmbunit.setSelectedItem(unit);
        cmbWhouse.setSelectedItem(wh);
        txtRolevel.setText(roleval + "");
        cmbved.setSelectedItem(ved);

        btnsave.setText("Update");

        this.getonhand(lblOnhandstock,"SELECT SUM(g_qnty) FROM transaction  WHERE g_itemcode = '" + code + "'");
        this.getonhand(lblunitprise,"SELECT g_initprice FROM unit_price  WHERE g_itemcode = '" + code + "'");
   
    }//GEN-LAST:event_tblstockMouseReleased

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed

        dbconnector.conn();


        String icode = txtIcode.getText();
        Object section = cmbsection.getSelectedItem();
        String name = txtIname.getText();
        Object unit = cmbunit.getSelectedItem();
        Object wh = cmbWhouse.getSelectedItem();
        Object ved = cmbved.getSelectedItem();
        Integer roleval = Integer.parseInt(txtRolevel.getText());

        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String sysdate = df.format(date);

        try {
            if (optremove.isSelected() == true) {
                int i = MessageBox.yesno("Do You Want to Delete Item  " + icode);
                if (i == 0) {
                    dbconnector.insertquery("DELETE FROM dgs_surgicallist WHERE d_srno ='" + icode + "'");
                voidmodule.U_transaction(user, "Delete Stock  " + icode );
                }
            } else {


             
                int Count = voidmodule.RCount("SELECT d_srno from dgs_surgicallist WHERE d_srno ='" + icode + "'");
                if (Count > 0) {
                    int i = MessageBox.yesno("Records Already Exited. Do You Want to Update Records…? ");
                    if (i == 0) {
                        dbconnector.insertquery("UPDATE dgs_surgicallist SET d_name = '" + name + "', d_unit = '" + unit + "', d_section = '" + section + "', d_whno = '" + wh + "', d_reodrlevel = '" + roleval + "', d_ved = '" + ved + "', d_user = '" + user + "', d_sysdate = '" + sysdate + "'WHERE d_srno ='" + icode + "'");
                    voidmodule.U_transaction(user, "update Stock  " + icode );
                    } else {
                    }
                } else {


                    dbconnector.insertquery("INSERT INTO dgs_surgicallist VALUES ('" + icode + "','" + name + "','" + unit + "','" + section + "','" + wh + "','" + roleval + "','" + ved + "','" + user + "','" + sysdate + "')");
                   voidmodule.U_transaction(user, "insert Stock  " + icode );
                    JOptionPane.showMessageDialog(null, "Records Saved");

                }
            }
            this.lablindicate("SELECT * from dgs_surgicallist ORDER BY d_srno");

        } catch (SQLException ex) {
            Logger.getLogger(frmStock.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnsaveActionPerformed

    private void optremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optremoveActionPerformed
        btnsave.setText("Delete");
    }//GEN-LAST:event_optremoveActionPerformed

    private void cmbsectionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbsectionKeyPressed
        if (evt.getKeyCode() == 10) {
            cmbWhouse.requestFocus();
        }
    }//GEN-LAST:event_cmbsectionKeyPressed

    private void cmbWhouseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbWhouseKeyPressed
        if (evt.getKeyCode() == 10) {
            txtIname.requestFocus();
        }
    }//GEN-LAST:event_cmbWhouseKeyPressed

    private void txtInameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInameKeyPressed
        if (evt.getKeyCode() == 10) {
            cmbunit.requestFocus();
        }
    }//GEN-LAST:event_txtInameKeyPressed

    private void cmbunitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbunitKeyPressed
        if (evt.getKeyCode() == 10) {
            txtRolevel.requestFocus();
        }
    }//GEN-LAST:event_cmbunitKeyPressed

    private void txtIcodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIcodeKeyPressed
        if (evt.getKeyCode() == 10) {
            cmbsection.requestFocus();
        }
    }//GEN-LAST:event_txtIcodeKeyPressed

    private void txtIcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIcodeActionPerformed

    private void txtIcodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIcodeMouseClicked
        btnsave.setText("Save");
    }//GEN-LAST:event_txtIcodeMouseClicked

    private void txtIcodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIcodeKeyReleased

        String icode = txtIcode.getText();
        this.lablindicate("SELECT * from dgs_surgicallist WHERE d_srno LIKE'" + icode + "%'");

    }//GEN-LAST:event_txtIcodeKeyReleased

    private void txtRolevelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRolevelKeyPressed
        if (evt.getKeyCode() == 10) {
            cmbved.requestFocus();
        }
    }//GEN-LAST:event_txtRolevelKeyPressed

    private void txtRolevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRolevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRolevelActionPerformed

    private void txtInameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInameKeyReleased
        String iname = txtIname.getText();
        this.lablindicate("SELECT * from dgs_surgicallist WHERE d_name LIKE'" + iname + "%'");

    }//GEN-LAST:event_txtInameKeyReleased

    private void cmbsectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbsectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbsectionActionPerformed

    private void txtInameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInameActionPerformed

    private void cmbunitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbunitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbunitActionPerformed

    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed
        try {
            Map m = new HashMap();
            m.put("p_institute", a);


                voidmodule.generateReport("//Report//stock.jrxml", m);

        } catch (ArrayIndexOutOfBoundsException aiobe) {
            JOptionPane.showMessageDialog(null, "PLS SELCET CUSTOMER FROM TABLE ");
        }
    }//GEN-LAST:event_btnprintActionPerformed

    private void cmbvedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbvedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbvedActionPerformed

    private void cmbvedKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbvedKeyPressed
            if (evt.getKeyCode() == 10) {
            btnsave.requestFocus();
        }
    }//GEN-LAST:event_cmbvedKeyPressed

    void lablindicate(String query) {

        String code = null;
        Object section = null;
        String name = null;
        Object unit = null;
        Object wh = null;
        Object ved = null;
        int roleval = 0;
        int RC = 0;
    
        try {


            DefaultTableModel addabl = (DefaultTableModel) tblstock.getModel();
            while (tblstock.getRowCount() > 0) {
                addabl.removeRow(0);
            }


            Statement rss = dbconnector.conn().createStatement();
            ResultSet rs = rss.executeQuery(query);
            while (rs.next()) {
                code = rs.getString("d_srno");
                section = rs.getString("d_section");
                name = rs.getString("d_name");
                unit = rs.getString("d_unit");
                wh = rs.getString("d_whno");
                roleval = rs.getInt("d_reodrlevel");
                ved = rs.getString("d_ved");

                addabl.addRow(new Object[]{code, name, unit, wh, roleval,ved, section});

                    RC++;

            }
            lblrecords.setText(""+RC);
        } catch (SQLException ex) {
            Logger.getLogger(frmStock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void getonhand(JLabel lable,String query) {
     
        try {
            Statement rss = dbconnector.conn().createStatement();
            String onhand = null;
            ResultSet rs = rss.executeQuery(query);
            while (rs.next()) {
                onhand = rs.getString(1);
            }
            if (onhand == (null)) {
                lable.setText("0");
            } else {
                lable.setText(onhand);
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmgrn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnprint;
    private javax.swing.JButton btnsave;
    private javax.swing.JComboBox cmbWhouse;
    private javax.swing.JComboBox cmbsection;
    private javax.swing.JComboBox cmbunit;
    private javax.swing.JComboBox cmbved;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOnhandstock;
    private javax.swing.JLabel lblrecords;
    private javax.swing.JLabel lblunitprise;
    private javax.swing.JRadioButton optremove;
    private javax.swing.JTable tblstock;
    private javax.swing.JFormattedTextField txtIcode;
    private javax.swing.JTextField txtIname;
    private javax.swing.JFormattedTextField txtRolevel;
    // End of variables declaration//GEN-END:variables
}
