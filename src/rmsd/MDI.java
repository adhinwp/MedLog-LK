//Copyright (c) 2012, Provincial Department of Health Services, North western province, Sri Lanka
//All rights reserved.
package rmsd;

import java.awt.Component;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import mymod.dbconnector;
import mymod.voidmodule;

public final class MDI extends javax.swing.JFrame {

    public String User = null;
    public String a;
    public String dblable;

    public MDI() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setuser(null);
        //lblttle.setText(this.database_name());
        //lblttle1.setText(this.database_name());
        lblttle1.setText(dbconnector.dbname);

        jLabel2.setText("Version 3.5.0");
        
        
        String reportDir = System.getProperty("user.dir");
        System.out.println(reportDir);
        String filename = "\\icons\\Icon24_24.png";
        setIconImage(Toolkit.getDefaultToolkit().getImage(reportDir + filename));
        
    }

    void setuser(String suser) {
        User = suser;

        a = voidmodule.readintitution(null);
        this.setTitle(a + "    - Log in =  " + User);
    }
//
//    public String database_name() {
//        String readdb = null;
//        File ff = new File("Database.txt");
//        try {
//            FileReader fr = new FileReader(ff);
//            BufferedReader br = new BufferedReader(fr);
//            readdb = br.readLine();
//
//        } catch (IOException ex) {
//            Logger.getLogger(dbconnector.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return readdb;
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblttle = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btngrn = new javax.swing.JButton();
        btnInvoice = new javax.swing.JButton();
        btnmainstock = new javax.swing.JButton();
        btnestmt = new javax.swing.JButton();
        btnquit = new javax.swing.JButton();
        lblttle1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuword = new javax.swing.JMenu();
        mnumainstock = new javax.swing.JMenuItem();
        mnuwarehouse = new javax.swing.JMenuItem();
        mnuInstitution = new javax.swing.JMenuItem();
        mnurcvgstition = new javax.swing.JMenuItem();
        mnubackup = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuloging = new javax.swing.JMenuItem();
        mnumainstock1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnugrn1 = new javax.swing.JCheckBoxMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnuMainstores1 = new javax.swing.JCheckBoxMenuItem();
        mnuSubstores2 = new javax.swing.JMenuItem();
        mnuItminfo = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnugrn = new javax.swing.JCheckBoxMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mnuMainstores = new javax.swing.JMenuItem();
        mnuSubstores1 = new javax.swing.JMenuItem();
        munudbdetails = new javax.swing.JMenu();
        mnuImEstimate = new javax.swing.JMenuItem();
        mnuexp = new javax.swing.JMenuItem();
        mnuchangepass = new javax.swing.JMenuItem();
        mnuusercreation = new javax.swing.JMenuItem();
        mnusubtitute = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        mnucdb = new javax.swing.JMenuItem();
        mnucdb1 = new javax.swing.JMenuItem();
        mnustockreport = new javax.swing.JMenu();
        mnumainsts = new javax.swing.JMenu();
        mnuitemissue = new javax.swing.JMenuItem();
        mnureceipt = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuImEstimate2 = new javax.swing.JMenuItem();
        mnuImEstimate1 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mnuledger = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mnuInsti = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        mnuannuest = new javax.swing.JMenuItem();
        mnuSTVlist = new javax.swing.JMenuItem();
        mnusubsts1 = new javax.swing.JMenu();
        mnuitemissue_sub1 = new javax.swing.JMenuItem();
        mnureceipt_sub1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem_sub1 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuledger_sub1 = new javax.swing.JMenuItem();
        jMenuItem4_sub1 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnuInsti_sub1 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        mnuannuest1 = new javax.swing.JMenuItem();
        mnuanalyzing = new javax.swing.JMenu();
        mnuabc = new javax.swing.JMenuItem();
        mnuved = new javax.swing.JMenuItem();
        mnurmlims = new javax.swing.JMenu();
        mnulicense = new javax.swing.JMenuItem();
        mnucontribts = new javax.swing.JMenuItem();
        mnuverson = new javax.swing.JMenu();
        mnuV350 = new javax.swing.JMenuItem();
        mnuV351 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Version 3X");
        jLabel2.setBounds(370, 490, 200, 30);
        jDesktopPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Copyright (c) 2012, Provincial Department of Health Services, North western province, Sri Lanka.");
        jLabel1.setBounds(680, 580, 680, 14);
        jDesktopPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lblttle.setBackground(new java.awt.Color(162, 162, 255));
        lblttle.setFont(new java.awt.Font("Tahoma", 0, 80)); // NOI18N
        lblttle.setForeground(new java.awt.Color(204, 204, 255));
        lblttle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1366x650.jpg"))); // NOI18N
        lblttle.setText("Version 3.0.0");
        lblttle.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblttle.setOpaque(true);
        lblttle.setBounds(0, 0, 1380, 640);
        jDesktopPane1.add(lblttle, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setRollover(true);

        btngrn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/STVF.jpg"))); // NOI18N
        btngrn.setFocusable(false);
        btngrn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btngrn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btngrn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngrnActionPerformed(evt);
            }
        });
        jToolBar1.add(btngrn);

        btnInvoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/orderformf.jpg"))); // NOI18N
        btnInvoice.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/orderformf.jpg"))); // NOI18N
        btnInvoice.setFocusable(false);
        btnInvoice.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInvoice.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvoiceActionPerformed(evt);
            }
        });
        jToolBar1.add(btnInvoice);

        btnmainstock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/StockF.jpg"))); // NOI18N
        btnmainstock.setFocusable(false);
        btnmainstock.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnmainstock.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnmainstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmainstockActionPerformed(evt);
            }
        });
        jToolBar1.add(btnmainstock);

        btnestmt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/EstimateF.jpg"))); // NOI18N
        btnestmt.setFocusable(false);
        btnestmt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnestmt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnestmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnestmtActionPerformed(evt);
            }
        });
        jToolBar1.add(btnestmt);

        btnquit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/QuitF.jpg"))); // NOI18N
        btnquit.setFocusable(false);
        btnquit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnquit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnquit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquitActionPerformed(evt);
            }
        });
        jToolBar1.add(btnquit);

        lblttle1.setBackground(new java.awt.Color(255, 255, 255));
        lblttle1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblttle1.setForeground(new java.awt.Color(6, 12, 107));
        lblttle1.setText("########");
        jToolBar1.add(lblttle1);

        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        mnuword.setText("Home");
        mnuword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuwordActionPerformed(evt);
            }
        });

        mnumainstock.setText("Item Master File");
        mnumainstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnumainstockActionPerformed(evt);
            }
        });
        mnuword.add(mnumainstock);

        mnuwarehouse.setText("Warehouse");
        mnuwarehouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuwarehouseActionPerformed(evt);
            }
        });
        mnuword.add(mnuwarehouse);

        mnuInstitution.setText("Institution/Section");
        mnuInstitution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuInstitutionActionPerformed(evt);
            }
        });
        mnuword.add(mnuInstitution);

        mnurcvgstition.setText("Supply list");
        mnurcvgstition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnurcvgstitionActionPerformed(evt);
            }
        });
        mnuword.add(mnurcvgstition);

        mnubackup.setText("Backup");
        mnubackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnubackupActionPerformed(evt);
            }
        });
        mnuword.add(mnubackup);
        mnuword.add(jSeparator1);

        mnuloging.setText("Login");
        mnuloging.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnulogingActionPerformed(evt);
            }
        });
        mnuword.add(mnuloging);

        mnumainstock1.setText("Department Info");
        mnumainstock1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnumainstock1ActionPerformed(evt);
            }
        });
        mnuword.add(mnumainstock1);

        jMenuBar1.add(mnuword);

        jMenu3.setText("Transaction");

        mnugrn1.setText("GRN Entry (STV)");
        mnugrn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/process.jpg"))); // NOI18N
        mnugrn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnugrn1ActionPerformed(evt);
            }
        });
        jMenu3.add(mnugrn1);

        jMenu4.setText("Invoice/Order Form");

        mnuMainstores1.setSelected(true);
        mnuMainstores1.setText("Main Sotres");
        mnuMainstores1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMainstores1ActionPerformed(evt);
            }
        });
        jMenu4.add(mnuMainstores1);

        mnuSubstores2.setText("Sub Stores 1");
        mnuSubstores2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSubstores2ActionPerformed(evt);
            }
        });
        jMenu4.add(mnuSubstores2);

        jMenu3.add(jMenu4);

        mnuItminfo.setText("Item Information");
        mnuItminfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItminfoActionPerformed(evt);
            }
        });
        jMenu3.add(mnuItminfo);

        jMenuBar1.add(jMenu3);

        mnugrn.setText("GRN Entry (STV)");
        mnugrn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/process.jpg"))); // NOI18N
        mnugrn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnugrnActionPerformed(evt);
            }
        });
        jMenu2.add(mnugrn);

        mnuMainstores.setText("Main Sotres");
        mnuMainstores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMainstoresActionPerformed(evt);
            }
        });
        jMenu1.add(mnuMainstores);

        mnuSubstores1.setText("Sub Stores 1");
        mnuSubstores1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSubstores1ActionPerformed(evt);
            }
        });
        jMenu1.add(mnuSubstores1);

        jMenu2.add(jMenu1);

        jMenuBar1.add(jMenu2);

        munudbdetails.setText("Administrator");

        mnuImEstimate.setText("Import Annual Estimate");
        mnuImEstimate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuImEstimateActionPerformed1(evt);
            }
        });
        munudbdetails.add(mnuImEstimate);

        mnuexp.setText("Expired Item List");
        mnuexp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuexpActionPerformed(evt);
            }
        });
        munudbdetails.add(mnuexp);

        mnuchangepass.setText("Change User Password");
        mnuchangepass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuchangepassActionPerformed(evt);
            }
        });
        munudbdetails.add(mnuchangepass);

        mnuusercreation.setText("New User Creation/Edit");
        mnuusercreation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuusercreationActionPerformed(evt);
            }
        });
        munudbdetails.add(mnuusercreation);

        mnusubtitute.setText("Substitute Quantity Transfer ");
        mnusubtitute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnusubtituteActionPerformed(evt);
            }
        });
        munudbdetails.add(mnusubtitute);
        munudbdetails.add(jSeparator8);

        mnucdb.setText("Change Database");
        mnucdb.setEnabled(false);
        mnucdb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnucdbActionPerformed(evt);
            }
        });
        munudbdetails.add(mnucdb);

        mnucdb1.setText("Database Details");
        mnucdb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnucdb1ActionPerformed(evt);
            }
        });
        munudbdetails.add(mnucdb1);

        jMenuBar1.add(munudbdetails);

        mnustockreport.setText("Reports");
        mnustockreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnustockreportActionPerformed(evt);
            }
        });

        mnumainsts.setText("Main Stores");

        mnuitemissue.setText("Issue Details By Item Wise");
        mnuitemissue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitemissueActionPerformed(evt);
            }
        });
        mnumainsts.add(mnuitemissue);

        mnureceipt.setText("Issue Details By Institution Wise");
        mnureceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnureceiptActionPerformed(evt);
            }
        });
        mnumainsts.add(mnureceipt);

        jMenuItem3.setText("Issue Details By Institution & Item Wise");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mnumainsts.add(jMenuItem3);

        jMenuItem1.setText("Receipt Details By Item Wise");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnumainsts.add(jMenuItem1);

        mnuImEstimate2.setText("Estimate");
        mnuImEstimate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuImEstimate2ActionPerformed1(evt);
            }
        });
        mnumainsts.add(mnuImEstimate2);

        mnuImEstimate1.setText("Item Status ");
        mnuImEstimate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuImEstimate1ActionPerformed1(evt);
            }
        });
        mnumainsts.add(mnuImEstimate1);
        mnumainsts.add(jSeparator4);

        mnuledger.setText("Main Ledger");
        mnuledger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuledgerActionPerformed(evt);
            }
        });
        mnumainsts.add(mnuledger);

        jMenuItem2.setText("Main Stock Report");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mnumainsts.add(jMenuItem2);
        mnumainsts.add(jSeparator5);

        mnuInsti.setText("Institution List");
        mnuInsti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuInstiActionPerformed(evt);
            }
        });
        mnumainsts.add(mnuInsti);
        mnumainsts.add(jSeparator6);

        mnuannuest.setText("Annual Estimate");
        mnuannuest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuannuestActionPerformed(evt);
            }
        });
        mnumainsts.add(mnuannuest);

        mnuSTVlist.setText("STV List");
        mnuSTVlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSTVlistActionPerformed(evt);
            }
        });
        mnumainsts.add(mnuSTVlist);

        mnustockreport.add(mnumainsts);

        mnusubsts1.setText("Sub Stores 1");
        mnusubsts1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnusubsts1ActionPerformed(evt);
            }
        });

        mnuitemissue_sub1.setText("Issue Details By Item Wise");
        mnuitemissue_sub1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitemissue_sub1ActionPerformed(evt);
            }
        });
        mnusubsts1.add(mnuitemissue_sub1);

        mnureceipt_sub1.setText("Issue Details By Institution Wise");
        mnureceipt_sub1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnureceipt_sub1ActionPerformed(evt);
            }
        });
        mnusubsts1.add(mnureceipt_sub1);

        jMenuItem4.setText("Issue Details By Institution & Item Wise");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        mnusubsts1.add(jMenuItem4);

        jMenuItem_sub1.setText("Receipt Details By Item Wise");
        jMenuItem_sub1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_sub1ActionPerformed(evt);
            }
        });
        mnusubsts1.add(jMenuItem_sub1);
        mnusubsts1.add(jSeparator2);

        mnuledger_sub1.setText("Main Ledger");
        mnuledger_sub1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuledger_sub1ActionPerformed(evt);
            }
        });
        mnusubsts1.add(mnuledger_sub1);

        jMenuItem4_sub1.setText("Main Stock Report");
        jMenuItem4_sub1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4_sub1ActionPerformed(evt);
            }
        });
        mnusubsts1.add(jMenuItem4_sub1);
        mnusubsts1.add(jSeparator3);

        mnuInsti_sub1.setText("Institution List");
        mnuInsti_sub1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuInsti_sub1ActionPerformed(evt);
            }
        });
        mnusubsts1.add(mnuInsti_sub1);
        mnusubsts1.add(jSeparator7);

        mnuannuest1.setText("Annual Estimate");
        mnuannuest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuannuest1ActionPerformed(evt);
            }
        });
        mnusubsts1.add(mnuannuest1);

        mnustockreport.add(mnusubsts1);

        jMenuBar1.add(mnustockreport);

        mnuanalyzing.setText("Analyzing ");

        mnuabc.setText("ABC Analysis");
        mnuabc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuabcActionPerformed(evt);
            }
        });
        mnuanalyzing.add(mnuabc);

        mnuved.setText("VEN");
        mnuved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuvedActionPerformed(evt);
            }
        });
        mnuanalyzing.add(mnuved);

        jMenuBar1.add(mnuanalyzing);

        mnurmlims.setText("About RMLIMS");
        mnurmlims.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnurmlimsActionPerformed(evt);
            }
        });

        mnulicense.setText("License agreement");
        mnulicense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnulicenseActionPerformed(evt);
            }
        });
        mnurmlims.add(mnulicense);

        mnucontribts.setText("Contributors");
        mnucontribts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnucontribtsActionPerformed(evt);
            }
        });
        mnurmlims.add(mnucontribts);

        jMenuBar1.add(mnurmlims);

        mnuverson.setText("Version UpData");
        mnuverson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuversonActionPerformed(evt);
            }
        });

        mnuV350.setText("Version 3.5.0");
        mnuV350.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuV350ActionPerformed(evt);
            }
        });
        mnuverson.add(mnuV350);

        mnuV351.setText("Price Update to new table");
        mnuV351.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuV351ActionPerformed(evt);
            }
        });
        mnuverson.add(mnuV351);

        jMenuBar1.add(mnuverson);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1391, Short.MAX_VALUE)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1391, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuwarehouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuwarehouseActionPerformed
        frmwarehouse open = new frmwarehouse();
        addFrame(open);
//        jDesktopPane1.add(open);
//        open.setVisible(true);
        open.setuser(User);
}//GEN-LAST:event_mnuwarehouseActionPerformed

    private void mnuInstitutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuInstitutionActionPerformed

        frminstitution open = new frminstitution();
        addFrame(open);
//        jDesktopPane1.add(open);
//        open.setVisible(true);
        open.setuser(User);
}//GEN-LAST:event_mnuInstitutionActionPerformed

    private void mnulogingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnulogingActionPerformed
}//GEN-LAST:event_mnulogingActionPerformed

    private void mnuwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuwordActionPerformed
        frmbackup open = new frmbackup();
        addFrame(open);
//        jDesktopPane1.add(open);
//        open.setVisible(true);
        open.setuser(User);
}//GEN-LAST:event_mnuwordActionPerformed

    private void mnuImEstimateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuImEstimateActionPerformed
        String user = User;

        String admin = voidmodule.admin(user);
        String xy = "Administrator";

        try {
            if (admin.equals(xy)) {
                frmimportEstmate open = new frmimportEstmate();
                addFrame(open);
//        jDesktopPane1.add(open);
//        open.setVisible(true);
                open.setuser(User);

            } else {
                JOptionPane.showMessageDialog(this, "You do not have permission to Access ");
                System.exit(0);
            }

        } catch (Exception ex) {
            Logger.getLogger(dbconnector.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);

        }
}//GEN-LAST:event_mnuImEstimateActionPerformed

    private void mnumainstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnumainstockActionPerformed
        frmStock open = new frmStock();
        addFrame(open);
//        jDesktopPane1.add(open);
//        open.setVisible(true);
        open.setuser(User);
    }//GEN-LAST:event_mnumainstockActionPerformed

    private void mnugrnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnugrnActionPerformed
        frmgrn open = new frmgrn();
        addFrame(open);
//        jDesktopPane1.add(open);
//        open.setVisible(true);
        open.setuser(User);

    }//GEN-LAST:event_mnugrnActionPerformed

    private void mnuexpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuexpActionPerformed
        frmExpired open = new frmExpired();
        addFrame(open);
//        jDesktopPane1.add(open);
//        open.setVisible(true);
        open.setuser(User, null);
    }//GEN-LAST:event_mnuexpActionPerformed

    private void mnuledgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuledgerActionPerformed
        rptledger open = new rptledger();
        addFrame(open);
//        jDesktopPane1.add(open);
//        open.setVisible(true);
        open.setuser(User);
    }//GEN-LAST:event_mnuledgerActionPerformed

    private void mnuchangepassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuchangepassActionPerformed
        frmchangepassword open = new frmchangepassword();
        addFrame(open);
//        jDesktopPane1.add(open);
//        open.setVisible(true);
        open.setuser(User);
    }//GEN-LAST:event_mnuchangepassActionPerformed

    private void mnuusercreationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuusercreationActionPerformed
        String user = User;

        String admin = voidmodule.admin(user);
        String xy = "Administrator";

        try {
            if (admin.equals(xy)) {
                frmUser open = new frmUser();
                addFrame(open);
//        jDesktopPane1.add(open);
//        open.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "You do not have permission to Access ");
                System.exit(0);
            }

        } catch (Exception ex) {
            Logger.getLogger(dbconnector.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);

        }
    }//GEN-LAST:event_mnuusercreationActionPerformed

    private void mnuitemissueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitemissueActionPerformed
        rptissue_item open = new rptissue_item();
        addFrame(open);
        open.stores = true;
        open.setuser(User);
    }//GEN-LAST:event_mnuitemissueActionPerformed
    public static void addFrame(Component f) {

        int des_Height = jDesktopPane1.getHeight();
        int des_Width = jDesktopPane1.getWidth();
        int frame_Height = f.getHeight();
        int frame_Width = f.getWidth();
        int locX = (des_Width - frame_Width) / 2;
        int locY = (des_Height - frame_Height) / 2;
        f.setLocation(locX, 0);
        MDI.jDesktopPane1.add(f);
        f.setVisible(true);
    }

    private void mnureceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnureceiptActionPerformed

        rptissue_institute open = new rptissue_institute();
        addFrame(open);
        open.stores = true;
//        jDesktopPane1.add(open);
//        open.setVisible(true);
        open.setuser(User);
    }//GEN-LAST:event_mnureceiptActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        rptreceipt open = new rptreceipt();
        addFrame(open);
//        jDesktopPane1.add(open);
//        open.setVisible(true);
        open.setuser(User);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mnustockreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnustockreportActionPerformed
        frmStock open = new frmStock();
        addFrame(open);
//        jDesktopPane1.add(open);
//        open.setVisible(true);
        open.setuser(User);
    }//GEN-LAST:event_mnustockreportActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        frmStock open = new frmStock();
        addFrame(open);
//        jDesktopPane1.add(open);
//        open.setVisible(true);
        open.setuser(User);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void mnuannuestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuannuestActionPerformed
        rptestimate open = new rptestimate();
        jDesktopPane1.add(open);
        open.setVisible(true);
        open.setuser(User);
}//GEN-LAST:event_mnuannuestActionPerformed

    private void mnucdbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnucdbActionPerformed
        frmsetdb open = new frmsetdb();
        addFrame(open);


//        jDesktopPane1.add(open);
//        open.setVisible(true);

    }//GEN-LAST:event_mnucdbActionPerformed

    private void btngrnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngrnActionPerformed
        frmgrn open = new frmgrn();
        addFrame(open);
//        jDesktopPane1.add(open);
//        open.setVisible(true);
        open.setuser(User);
    }//GEN-LAST:event_btngrnActionPerformed

    private void btnInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvoiceActionPerformed
        frmInvoice open = new frmInvoice();
        addFrame(open);
//        jDesktopPane1.add(open);
//        open.setVisible(true);

        open.setuser(User);
    }//GEN-LAST:event_btnInvoiceActionPerformed

    private void btnmainstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmainstockActionPerformed
        frmStock open = new frmStock();
        addFrame(open);
//        jDesktopPane1.add(open);
//        open.setVisible(true);
        open.setuser(User);
    }//GEN-LAST:event_btnmainstockActionPerformed

    private void btnestmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnestmtActionPerformed
        String user = User;

        String admin = voidmodule.admin(user);
        String xy = "Administrator";

        try {
            if (admin.equals(xy)) {
                frmimportEstmate open = new frmimportEstmate();
                addFrame(open);
                open.setuser(User);

            } else {
                JOptionPane.showMessageDialog(this, "You do not have permission to Access ");
                System.exit(0);
            }

        } catch (Exception ex) {
            Logger.getLogger(dbconnector.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);

        }
    }//GEN-LAST:event_btnestmtActionPerformed

    private void btnquitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnquitActionPerformed

    private void mnubackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnubackupActionPerformed

        frmbackup open = new frmbackup();
        addFrame(open);
//        jDesktopPane1.add(open);
//        open.setVisible(true);
        open.setuser(User);
    }//GEN-LAST:event_mnubackupActionPerformed

    private void mnuabcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuabcActionPerformed

        rptabc open = new rptabc();
        addFrame(open);
//        jDesktopPane1.add(open);
//        open.setVisible(true);
        open.setuser(User);
}//GEN-LAST:event_mnuabcActionPerformed

    private void mnuvedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuvedActionPerformed
        try {
            Map m = new HashMap();
            m.put("p_institute", a);
            voidmodule.generateReport("//Report//report3.jrxml", m);

        } catch (ArrayIndexOutOfBoundsException aiobe) {
        }
}//GEN-LAST:event_mnuvedActionPerformed

    private void mnurmlimsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnurmlimsActionPerformed
    }//GEN-LAST:event_mnurmlimsActionPerformed

    private void mnulicenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnulicenseActionPerformed
        rmlims open = new rmlims();
        addFrame(open);
//        jDesktopPane1.add(open);
//        open.setVisible(true);
        open.setuser(User);
    }//GEN-LAST:event_mnulicenseActionPerformed

    private void mnucontribtsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnucontribtsActionPerformed


        frmcontbtrs open = new frmcontbtrs();
        addFrame(open);
//        jDesktopPane1.add(open);
//        open.setVisible(true);
        open.setuser(User);
    }//GEN-LAST:event_mnucontribtsActionPerformed

    private void mnuInstiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuInstiActionPerformed
        try {
            Map m = new HashMap();
            m.put("p_institute", a);
            voidmodule.generateReport("//Report//Institution.jrxml", m);

        } catch (ArrayIndexOutOfBoundsException aiobe) {
        }
    }//GEN-LAST:event_mnuInstiActionPerformed

    private void mnuSubstores1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSubstores1ActionPerformed
        frmInvoice_stores2 open = new frmInvoice_stores2();
        addFrame(open);
//        jDesktopPane1.add(open);
//        open.setVisible(true);
        //  String grn = txtgrn.getText();
    }//GEN-LAST:event_mnuSubstores1ActionPerformed

    private void mnuMainstoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMainstoresActionPerformed
        frmInvoice open = new frmInvoice();
        addFrame(open);
//        jDesktopPane1.add(open);
//        open.setVisible(true);
        //  String grn = txtgrn.getText();
    }//GEN-LAST:event_mnuMainstoresActionPerformed

    private void mnuImEstimateActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuImEstimateActionPerformed1
        String user = User;

        String admin = voidmodule.admin(user);
        String xy = "Administrator";

        try {
            if (admin.equals(xy)) {
                frmimportEstmate open = new frmimportEstmate();
                addFrame(open);
                open.setuser(User);

            } else {
                JOptionPane.showMessageDialog(this, "You do not have permission to Access ");
                System.exit(0);
            }

        } catch (Exception ex) {
            Logger.getLogger(dbconnector.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);

        }
    }//GEN-LAST:event_mnuImEstimateActionPerformed1

    private void mnurcvgstitionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnurcvgstitionActionPerformed
        frmreceiptinsti open = new frmreceiptinsti();
        addFrame(open);
//        jDesktopPane1.add(open);
//        open.setVisible(true);
        open.setuser(User);
    }//GEN-LAST:event_mnurcvgstitionActionPerformed

    private void mnuitemissue_sub1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitemissue_sub1ActionPerformed
        rptissue_item open = new rptissue_item();
        addFrame(open);
        open.stores = false;
        open.setuser(User);
    }//GEN-LAST:event_mnuitemissue_sub1ActionPerformed

    private void mnureceipt_sub1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnureceipt_sub1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnureceipt_sub1ActionPerformed

    private void jMenuItem_sub1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_sub1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_sub1ActionPerformed

    private void mnuledger_sub1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuledger_sub1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuledger_sub1ActionPerformed

    private void jMenuItem4_sub1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4_sub1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4_sub1ActionPerformed

    private void mnuInsti_sub1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuInsti_sub1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuInsti_sub1ActionPerformed

    private void mnusubsts1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnusubsts1ActionPerformed
        rptissue_item open = new rptissue_item();
        open.stores = false;
    }//GEN-LAST:event_mnusubsts1ActionPerformed

    private void mnumainstsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnumainstsActionPerformed
        rptissue_item open = new rptissue_item();
        open.stores = true;
    }//GEN-LAST:event_mnumainstsActionPerformed

    private void mnuannuest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuannuest1ActionPerformed
        rptestimate open = new rptestimate();
        jDesktopPane1.add(open);
        open.setVisible(true);
        open.setuser(User);
}//GEN-LAST:event_mnuannuest1ActionPerformed

    private void mnugrn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnugrn1ActionPerformed
        frmgrn open = new frmgrn();
        addFrame(open);
        //        jDesktopPane1.add(open);
        //        open.setVisible(true);
        open.setuser(User);
    }//GEN-LAST:event_mnugrn1ActionPerformed

    private void mnuMainstores1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMainstores1ActionPerformed
        frmInvoice open = new frmInvoice();
        addFrame(open);
        //        jDesktopPane1.add(open);
        //        open.setVisible(true);
        //  String grn = txtgrn.getText();
}//GEN-LAST:event_mnuMainstores1ActionPerformed

    private void mnuSubstores2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSubstores2ActionPerformed
        frmInvoice_stores2 open = new frmInvoice_stores2();
        addFrame(open);
        //        jDesktopPane1.add(open);
        //        open.setVisible(true);
        //  String grn = txtgrn.getText();
}//GEN-LAST:event_mnuSubstores2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        rptissue_institute_Item open = new rptissue_institute_Item();
        addFrame(open);
        open.setuser(User);
        open.stores = true;
}//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        rptissue_institute_Item open = new rptissue_institute_Item();
        addFrame(open);
        open.setuser(User);
        open.stores = false;
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void mnucdb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnucdb1ActionPerformed

        frmDBDetails open = new frmDBDetails();
        addFrame(open);
        open.setuser(User);
    }//GEN-LAST:event_mnucdb1ActionPerformed

    private void mnuV350ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuV350ActionPerformed
        String user = User;

        String admin = voidmodule.admin(user);
        String xy = "Administrator";

        try {
            if (admin.equals(xy)) {
                frmDBUpdate open = new frmDBUpdate();
                addFrame(open);
                open.setuser(User);

            } else {
                JOptionPane.showMessageDialog(this, "You do not have permission to Access ");
                System.exit(0);
            }

        } catch (Exception ex) {
            Logger.getLogger(dbconnector.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);

        }
    }//GEN-LAST:event_mnuV350ActionPerformed

    private void mnuversonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuversonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuversonActionPerformed

    private void mnuItminfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItminfoActionPerformed
        FrmDetails open = new FrmDetails();
        addFrame(open);
        open.setuser(User);

    }//GEN-LAST:event_mnuItminfoActionPerformed

    private void mnuImEstimate1ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuImEstimate1ActionPerformed1
        RptIemStatus open = new RptIemStatus();
        addFrame(open);
//        jDesktopPane1.add(open);
//        open.setVisible(true);
        open.setuser(User);
    }//GEN-LAST:event_mnuImEstimate1ActionPerformed1

    private void mnuImEstimate2ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuImEstimate2ActionPerformed1
        rptestimateDetails open = new rptestimateDetails();
        addFrame(open);
//        jDesktopPane1.add(open);
//        open.setVisible(true);
        open.stores = true;
        open.setuser(User);
    }//GEN-LAST:event_mnuImEstimate2ActionPerformed1

    private void mnuV351ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuV351ActionPerformed
        String user = User;

        String admin = voidmodule.admin(user);
        String xy = "Administrator";

        try {
            if (admin.equals(xy)) {
                frmaddprice open = new frmaddprice();
                addFrame(open);
                open.setuser(User);

            } else {
                JOptionPane.showMessageDialog(this, "You do not have permission to Access ");
                System.exit(0);
            }

        } catch (Exception ex) {
            Logger.getLogger(dbconnector.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);

        }
    }//GEN-LAST:event_mnuV351ActionPerformed

    private void mnuSTVlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSTVlistActionPerformed

        rptSTVNum open = new rptSTVNum();
        addFrame(open);
//        jDesktopPane1.add(open);
//        open.setVisible(true);
        open.setuser(User);
    }//GEN-LAST:event_mnuSTVlistActionPerformed

    private void mnumainstock1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnumainstock1ActionPerformed
        addFrame(new DeptInfo());
    }//GEN-LAST:event_mnumainstock1ActionPerformed

    private void mnusubtituteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnusubtituteActionPerformed
               String user = User;

        String admin = voidmodule.admin(user);
        String xy = "Administrator";

        try {
            if (admin.equals(xy)) {
                frmsubstitute open = new frmsubstitute();
                addFrame(open);
                open.setuser(user);

            } else {
                JOptionPane.showMessageDialog(this, "You do not have permission to Access ");
                System.exit(0);
            }

        } catch (Exception ex) {
            Logger.getLogger(dbconnector.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);

        }
    }//GEN-LAST:event_mnusubtituteActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MDI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInvoice;
    private javax.swing.JButton btnestmt;
    private javax.swing.JButton btngrn;
    private javax.swing.JButton btnmainstock;
    private javax.swing.JButton btnquit;
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem4_sub1;
    private javax.swing.JMenuItem jMenuItem_sub1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblttle;
    private javax.swing.JLabel lblttle1;
    private javax.swing.JMenuItem mnuImEstimate;
    private javax.swing.JMenuItem mnuImEstimate1;
    private javax.swing.JMenuItem mnuImEstimate2;
    private javax.swing.JMenuItem mnuInsti;
    private javax.swing.JMenuItem mnuInsti_sub1;
    private javax.swing.JMenuItem mnuInstitution;
    private javax.swing.JMenuItem mnuItminfo;
    private javax.swing.JMenuItem mnuMainstores;
    private javax.swing.JCheckBoxMenuItem mnuMainstores1;
    private javax.swing.JMenuItem mnuSTVlist;
    private javax.swing.JMenuItem mnuSubstores1;
    private javax.swing.JMenuItem mnuSubstores2;
    private javax.swing.JMenuItem mnuV350;
    private javax.swing.JMenuItem mnuV351;
    private javax.swing.JMenuItem mnuabc;
    private javax.swing.JMenu mnuanalyzing;
    private javax.swing.JMenuItem mnuannuest;
    private javax.swing.JMenuItem mnuannuest1;
    private javax.swing.JMenuItem mnubackup;
    private javax.swing.JMenuItem mnucdb;
    private javax.swing.JMenuItem mnucdb1;
    private javax.swing.JMenuItem mnuchangepass;
    private javax.swing.JMenuItem mnucontribts;
    private javax.swing.JMenuItem mnuexp;
    private javax.swing.JCheckBoxMenuItem mnugrn;
    private javax.swing.JCheckBoxMenuItem mnugrn1;
    private javax.swing.JMenuItem mnuitemissue;
    private javax.swing.JMenuItem mnuitemissue_sub1;
    private javax.swing.JMenuItem mnuledger;
    private javax.swing.JMenuItem mnuledger_sub1;
    private javax.swing.JMenuItem mnulicense;
    private javax.swing.JMenuItem mnuloging;
    private javax.swing.JMenuItem mnumainstock;
    private javax.swing.JMenuItem mnumainstock1;
    private javax.swing.JMenu mnumainsts;
    private javax.swing.JMenuItem mnurcvgstition;
    private javax.swing.JMenuItem mnureceipt;
    private javax.swing.JMenuItem mnureceipt_sub1;
    private javax.swing.JMenu mnurmlims;
    private javax.swing.JMenu mnustockreport;
    private javax.swing.JMenu mnusubsts1;
    private javax.swing.JMenuItem mnusubtitute;
    private javax.swing.JMenuItem mnuusercreation;
    private javax.swing.JMenuItem mnuved;
    private javax.swing.JMenu mnuverson;
    private javax.swing.JMenuItem mnuwarehouse;
    private javax.swing.JMenu mnuword;
    private javax.swing.JMenu munudbdetails;
    // End of variables declaration//GEN-END:variables
}
