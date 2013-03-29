//Copyright (c) 2012, Provincial Department of Health Services, North western province, Sri Lanka
//All rights reserved.
package rmsd;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;

import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import mymod.dbconnector;
import mymod.voidmodule;
import wans_javalib.RecordManipulator;

public class frmimportEstmate extends javax.swing.JInternalFrame {

    public String inputFile;
    public String user;
    public String sec;
    static int intpb;
    //  dbconnector cc;
    JTextField san;

    public frmimportEstmate() {
        initComponents();
        this.setuser(null);
    }

    void setuser(String suser) {
        user = suser;

        String a = voidmodule.readintitution(null);
        this.setTitle(a + "  - Inport Existing Data  -  User : " + user);

        //   cc = new dbconnector();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtfilename = new javax.swing.JTextField();
        txtfileparth = new javax.swing.JTextField();
        btnbrowse = new javax.swing.JButton();
        btnimport = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pbar = new javax.swing.JProgressBar();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtwh = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtqntycolno = new javax.swing.JTextField();
        txtincolno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txticolno = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtgrn = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        optestmate = new javax.swing.JRadioButton();
        optinstitution = new javax.swing.JRadioButton();
        optstock = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblestimate = new javax.swing.JTable();
        lblcount = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setClosable(true);
        setMaximizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Annual Estimates Import to the System");

        jLabel2.setText("File Name  (*.xls)");

        jLabel3.setText("File Parth");

        btnbrowse.setText("Browse");
        btnbrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbrowseActionPerformed(evt);
            }
        });

        btnimport.setText("Import");
        btnimport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimportActionPerformed(evt);
            }
        });

        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Please Enter Columns Numbers of  Excel File ");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("You Can import Data to mysql tables from Existing xls file. ");

        pbar.setForeground(new java.awt.Color(51, 0, 0));
        pbar.setStringPainted(true);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Import Type...");

        txtwh.setText("13");
        txtwh.setEnabled(false);
        txtwh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtwhActionPerformed(evt);
            }
        });

        jLabel4.setText("Institution Col No (0)");

        jLabel6.setText("Quantity (2) ");

        txtqntycolno.setText("11");

        txtincolno.setText("5");

        jLabel5.setText("Item Col no (1)");

        jLabel10.setText("GRN No Col No (4)");
        jLabel10.setEnabled(false);

        txticolno.setText("0");

        jLabel9.setText("Warehouse Col No (3)");
        jLabel9.setEnabled(false);

        txtgrn.setText("18");
        txtgrn.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txticolno)
                    .addComponent(txtincolno)
                    .addComponent(txtqntycolno, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(txtwh)
                    .addComponent(txtgrn))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtincolno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txticolno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtqntycolno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtwh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtgrn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap())
        );

        buttonGroup1.add(optestmate);
        optestmate.setSelected(true);
        optestmate.setText("Annual Estimate");
        optestmate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optestmateActionPerformed(evt);
            }
        });

        buttonGroup1.add(optinstitution);
        optinstitution.setText("Institution");
        optinstitution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optinstitutionActionPerformed(evt);
            }
        });

        buttonGroup1.add(optstock);
        optstock.setText("Main Stock");
        optstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optstockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optstock)
                    .addComponent(optinstitution)
                    .addComponent(optestmate, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(optestmate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optstock)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optinstitution)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtfileparth, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                                    .addComponent(txtfilename, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                                .addComponent(btnbrowse))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(36, 177, Short.MAX_VALUE)
                        .addComponent(btnimport, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pbar, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtfilename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtfileparth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(btnbrowse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(4, 4, 4)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pbar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnexit)
                    .addComponent(btnimport))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tblestimate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblestimate);

        lblcount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblcount.setText("Counter");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblcount, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblcount)
                .addContainerGap())
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("WARNNIG: Please Be Make sure When you Import Annual Estimate, Stock or Institution Data  aready existing  will be losed.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnimportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimportActionPerformed

        Runnable run = new Runnable() {

            public void run() {

                int i = MessageBox.yesno("WARNNING: Please be make sure Before import the Stock all transaction will be deleted   ");
                if (i == 0) {


                    String filename = txtfilename.getText();
                    String fileparh = txtfileparth.getText();
                    // frmimportEstmate test = new frmimportEstmate();
                    setInputFile(fileparh + "\\" + filename);

                    final int inscodecell = Integer.valueOf(txtincolno.getText());
                    final int icodescell = Integer.valueOf(txticolno.getText());
                    final int qntycell = Integer.valueOf(txtqntycolno.getText());


                    final int iwh = Integer.valueOf(txtwh.getText());
                    final int igrn = Integer.valueOf(txtgrn.getText());



                    try {
                        if (optestmate.isSelected() == true) {
                            read(inscodecell, icodescell, qntycell);
                        } else if (optstock.isSelected() == true) {
                            readstock(inscodecell, icodescell, qntycell, iwh, igrn);
                        } else if (optinstitution.isSelected() == true) {
                            readinstitution(inscodecell, icodescell, qntycell);
                        }
                        //  readstock
                    } catch (IOException ex) {
                        Logger.getLogger(frmimportEstmate.class.getName()).log(Level.SEVERE, null, ex);
                    }
    }//GEN-LAST:event_btnimportActionPerformed
            }
        };



        Thread tr = new Thread(run);
        tr.start();
    }
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
            txtfilename.setText(fileName);
            txtfileparth.setText(path);
        }

    }//GEN-LAST:event_btnbrowseActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnexitActionPerformed

    private void optstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optstockActionPerformed
        jLabel4.setText("Unit Prize Col No (0)");
        jLabel5.setText("Item Code Col No (0)");
        jLabel6.setText("Quantity Col No (0)");
        jLabel9.setEnabled(true);
        txtwh.setEnabled(true);
        jLabel10.setEnabled(true);
        txtgrn.setEnabled(true);
        jLabel1.setText("Main Stock Import to the System");

        try {
            String Tblmod = "SELECT g_itemcode as ItemCode,g_Rqnty as Qnty,g_initprice as UnitPrice,g_warehose as WareHouse from transaction";
            this.settblmdl(Tblmod);
        } catch (SQLException ex) {
            Logger.getLogger(frmimportEstmate.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_optstockActionPerformed

    private void optestmateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optestmateActionPerformed

        jLabel4.setText("Institution Code Col No (0)");
        jLabel5.setText("Item Code Col No (0)");
        jLabel6.setText("Quantity Col No (0)");
        jLabel9.setEnabled(false);
        txtwh.setEnabled(false);
        jLabel10.setEnabled(false);
        txtgrn.setEnabled(false);
        jLabel1.setText("Annual Estimates Import to the System");
        String Tblmod = "SELECT Incode,ProductCode,estimate_Qty from estimate";
        try {
            this.settblmdl(Tblmod);
        } catch (SQLException ex) {
            Logger.getLogger(frmimportEstmate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_optestmateActionPerformed

    private void optinstitutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optinstitutionActionPerformed
        jLabel4.setText("Institution Code Col No (0)");
        jLabel5.setText("Catagory Col No (0)");
        jLabel6.setText("Name Col No (0)");
        jLabel9.setEnabled(false);
        txtwh.setEnabled(false);
        jLabel10.setEnabled(false);
        txtgrn.setEnabled(false);
        jLabel1.setText("Institution Details Import to the System");
        try {
            String Tblmod = "SELECT Incode,catagory,name from institution";
            this.settblmdl(Tblmod);
        } catch (SQLException ex) {
            Logger.getLogger(frmimportEstmate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_optinstitutionActionPerformed

    private void txtwhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtwhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtwhActionPerformed

    public void readstock(int inscodecellq, int icodescellq, int qntycellq, int iwhq, int igrnq) throws IOException {
        int m;
        String grn = null;
        String Snull = "-";
        int orderCode = 0;
        String wh = null;
        String lot = "1";
        Double packsize = 0.0;
        Double nopack = 0.0;
        String icode = null;
        String temp = "temp";
        String Reptcode = "MSD";
        String rtype = "R";
        String itype = "I";
        Double unitprize = null;
        Double qnty = null;
        Double dnull = 0.0;
        String cmmnts = "transfered Stock";



        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat dfmonth = new SimpleDateFormat("MM");
        DateFormat dfday = new SimpleDateFormat("dd");
        DateFormat dfyear = new SimpleDateFormat("yyyy");


        String sysdate = df.format(date);
        String grndate = df.format(date);
        String gmonth = dfmonth.format(date);
        String gday = dfday.format(date);
        String gyear = dfyear.format(date);
        String expirddate = "2100-12-31";



        // dbconnector cc = new dbconnector();
        dbconnector.conn();
        try {
            dbconnector.insertquery("DELETE FROM transaction ");
        } catch (SQLException ex) {
            Logger.getLogger(frmimportEstmate.class.getName()).log(Level.SEVERE, null, ex);
        }




        File inputWorkbook = new File(inputFile);
        Workbook w;
        try {
            w = Workbook.getWorkbook(inputWorkbook);
            // Get the first sheet
            Sheet sheet = w.getSheet(0);
            // Loop over first 10 column and lines
            try {
                //   for (int j = 0; j < sheet.getColumns(); j++) {
                int x = sheet.getRows();
                pbar.setString("");
                pbar.setMaximum(sheet.getRows());
                for (int i = 0; i < sheet.getRows(); i++) {
                    intpb = i;

                    Cell cell0 = sheet.getCell(icodescellq, i);
                    icode = cell0.getContents();

                    Cell cell1 = sheet.getCell(inscodecellq, i);
                    unitprize = Double.valueOf(cell1.getContents());

                    Cell cell2 = sheet.getCell(qntycellq, i);
                    qnty = Double.valueOf(cell2.getContents());

                    Cell cell3 = sheet.getCell(iwhq, i);
                    wh = cell3.getContents();

                    Cell cell4 = sheet.getCell(igrnq, i);
                    grn = cell4.getContents();



                    this.addcatgory("SELECT catagory from warehouse WHERE wh = '" + wh + "'");
                    dbconnector.insertquery("INSERT INTO transaction VALUES ('" + grn + "','" + Snull + "','" + Snull + "','" + orderCode + "','" + grndate + "','" + sysdate + "','" + gyear + "','" + gmonth + "','" + gday + "','" + wh + "','" + sec + "','" + lot + "','" + packsize + "','" + nopack + "','" + icode + "','" + temp + "','" + rtype + "','" + Reptcode + "','" + unitprize + "','" + expirddate + "','" + qnty + "','" + qnty + "','" + dnull + "','" + cmmnts + "','" + user + "')");





                    Runnable run2 = new Runnable() {

                        public void run() {
                            pbar.setValue(intpb + 1);
                        }
                    };


                    Thread tr2 = new Thread(run2);
                    tr2.start();



                }
                pbar.setString("Copmpleted...");
                JOptionPane.showMessageDialog(null, "Records Saved");
                voidmodule.U_transaction(user, "import Stock file");

                String Tblmod = "SELECT g_itemcode as ItemCode,g_Rqnty as Qnty,g_initprice as UnitPrice,g_warehose as WareHouse from transaction";
                this.settblmdl(Tblmod);



            } catch (SQLException ex) {
                Logger.getLogger(frmimportEstmate.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (BiffException e) {
            e.printStackTrace();
        }
    }

    public void setInputFile(String inputF) {
        this.inputFile = inputF;
    }

    public void read(int inscodecell, int icodescell, int qntycell) throws IOException {

        String showInputDialog = JOptionPane.showInputDialog("Please Enter Current Year to Save");

        try {

            int Count = voidmodule.RCount("SELECT year from All_Estimate WHERE year = '" + showInputDialog + "'");
            if (Count > 0) {
            } else {
                dbconnector.insertquery("DELETE FROM All_Estimate WHERE year = '" + showInputDialog + "'");
                dbconnector.insertquery("INSERT INTO All_Estimate SELECT Incode,ProductCode,estimate_Qty,'" + showInputDialog + "' FROM estimate ");

            }
        } catch (SQLException ex) {
            Logger.getLogger(frmimportEstmate.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            dbconnector.insertquery("DELETE FROM estimate ");
        } catch (SQLException ex) {
            Logger.getLogger(frmimportEstmate.class.getName()).log(Level.SEVERE, null, ex);
        }


        File inputWorkbook = new File(inputFile);
        Workbook w;
        try {
            w = Workbook.getWorkbook(inputWorkbook);
            // Get the first sheet
            Sheet sheet = w.getSheet(0);
            // Loop over first 10 column and lines
            try {
                //   for (int j = 0; j < sheet.getColumns(); j++) {
                pbar.setString("");
                pbar.setMaximum(sheet.getRows());

                for (int i = 0; i < sheet.getRows(); i++) {
                    intpb = i;


                    Cell cell = sheet.getCell(inscodecell, i);
                    CellType type = cell.getType();
                    //   if (cell.getType() == CellType.LABEL) {
                    String inscode = cell.getContents();

                    Cell cell1 = sheet.getCell(icodescell, i);
                    String icode = cell1.getContents();

                    Cell cell4 = sheet.getCell(qntycell, i);
                    String esqnty = cell4.getContents();



                    dbconnector.insertquery("INSERT INTO estimate VALUES ('" + inscode + "','" + icode + "','" + 0.0 + "','" + "" + "','" + esqnty + "')");


                    Runnable run1 = new Runnable() {

                        public void run() {
                            pbar.setValue(intpb + 1);
                        }
                    };


                    Thread tr1 = new Thread(run1);
                    tr1.start();







                }
            } catch (SQLException ex) {
                Logger.getLogger(frmimportEstmate.class.getName()).log(Level.SEVERE, null, ex);
            }
            pbar.setString("Copmpleted...");
            JOptionPane.showMessageDialog(null, "Records Saved");
            voidmodule.U_transaction(user, "import extimate file");

            try {
                String Tblmod = "SELECT Incode,ProductCode,estimate_Qty from estimate";
                this.settblmdl(Tblmod);
            } catch (SQLException ex) {
                Logger.getLogger(frmimportEstmate.class.getName()).log(Level.SEVERE, null, ex);
            }




        } catch (BiffException e) {
            e.printStackTrace();
        }
    }

    public void readinstitution(int inscodecell, int icodescell, int qntycell) throws IOException {
        //  dbconnector cc = new dbconnector();
        dbconnector.conn();

        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String sysdate = df.format(date);

        try {
            dbconnector.insertquery("DELETE FROM institution ");
        } catch (SQLException ex) {
            Logger.getLogger(frmimportEstmate.class.getName()).log(Level.SEVERE, null, ex);
        }


        File inputWorkbook = new File(inputFile);
        Workbook w;
        try {
            w = Workbook.getWorkbook(inputWorkbook);
            // Get the first sheet
            Sheet sheet = w.getSheet(0);
            // Loop over first 10 column and lines

            try {
                //   for (int j = 0; j < sheet.getColumns(); j++) {
                pbar.setString("");
                pbar.setMaximum(sheet.getRows());
                for (int i = 0; i < sheet.getRows(); i++) {
                    intpb = i;
                    Cell cell = sheet.getCell(inscodecell, i);
                    //CellType type = cell.getType();
                    //   if (cell.getType() == CellType.LABEL) {
                    String inscode = cell.getContents();

                    Cell cell1 = sheet.getCell(icodescell, i);
                    String catagory = cell1.getContents();

                    Cell cell4 = sheet.getCell(qntycell, i);
                    String name = cell4.getContents();
                    dbconnector.insertquery("INSERT INTO institution VALUES ('" + inscode + "','" + catagory + "','" + name + "','" + user + "','" + sysdate + "')");

                    Runnable run3 = new Runnable() {

                        public void run() {
                            pbar.setValue(intpb + 1);
                        }
                    };


                    Thread tr3 = new Thread(run3);
                    tr3.start();



                }
            } catch (SQLException ex) {
                Logger.getLogger(frmimportEstmate.class.getName()).log(Level.SEVERE, null, ex);
            }
            pbar.setString("Copmpleted...");
            JOptionPane.showMessageDialog(null, "Records Saved");
            voidmodule.U_transaction(user, "import extimate file");



            try {
                String Tblmod = "SELECT Incode,catagory,name from institution";
                this.settblmdl(Tblmod);
            } catch (SQLException ex) {
                Logger.getLogger(frmimportEstmate.class.getName()).log(Level.SEVERE, null, ex);
            }



        } catch (BiffException e) {
            e.printStackTrace();
        }
    }

    void settblmdl(String sql) throws SQLException {
        Statement rss = dbconnector.conn().createStatement();
        ResultSet executeQuery = rss.executeQuery(sql);
        DefaultTableModel convertResultSetToTableMOdel = RecordManipulator.convertResultSetToTableMOdel(executeQuery);

        tblestimate.setModel(convertResultSetToTableMOdel);
        int rcount = voidmodule.RCount(sql);
        lblcount.setText("Records = " + rcount);
        rss.close();
    }

    void addcatgory(String query) {
        //   dbconnector cc = new dbconnector();

        try {

            String ssec = null;
            Statement rss = dbconnector.conn().createStatement();
            ResultSet rs = rss.executeQuery(query);

            while (rs.next()) {
                ssec = rs.getString(1);
            }
            sec = ssec;
        } catch (SQLException ex) {
            Logger.getLogger(frmgrn.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbrowse;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnimport;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel lblcount;
    private javax.swing.JRadioButton optestmate;
    private javax.swing.JRadioButton optinstitution;
    private javax.swing.JRadioButton optstock;
    private javax.swing.JProgressBar pbar;
    private javax.swing.JTable tblestimate;
    private javax.swing.JTextField txtfilename;
    private javax.swing.JTextField txtfileparth;
    private javax.swing.JTextField txtgrn;
    private javax.swing.JTextField txticolno;
    private javax.swing.JTextField txtincolno;
    private javax.swing.JTextField txtqntycolno;
    private javax.swing.JTextField txtwh;
    // End of variables declaration//GEN-END:variables
}
