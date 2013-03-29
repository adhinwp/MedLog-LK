package rmsd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mymod.dbconnector;
import mymod.voidmodule;
import wans_javalib.wans_MetaData;

public class frmDBUpdate extends javax.swing.JInternalFrame {

    Connection conn;
    static Connection statcon;
    String DBName;
    public String user;

    public frmDBUpdate() {
        initComponents();
        conn = dbconnector.conn();
        statcon = conn;
        setcatlog();
    }

    void setuser(String suser) {
        user = suser;

        String a = voidmodule.readintitution(null);
        this.setTitle(a + "  - New Version Update  -  User : " + user);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnupdateDB = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstcatlog = new javax.swing.JList();
        LbldbName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 206, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Medical Logistics IMS for RMSD & Hospitals");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Version 3.5.0 Updates");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(334, 334, 334))
        );

        jPanel1.setBackground(new java.awt.Color(244, 223, 222));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnupdateDB.setText("Update Database");
        btnupdateDB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnupdateDB.setEnabled(false);
        btnupdateDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateDBActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnupdateDB, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnupdateDB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnexit, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 221, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lstcatlog.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        lstcatlog.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstcatlog.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstcatlogValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstcatlog);

        LbldbName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LbldbName.setText("Select the Database ");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Please Select the Database and Click Update button");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(LbldbName, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LbldbName)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnupdateDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateDBActionPerformed
        try {



            dbconnector.insertquery("CREATE TABLE IF NOT EXISTS `" + DBName + "`.`unit_price` ("
                    + "`g_itemcode` VARCHAR(8) NOT NULL,"
                    + "`g_initprice` DOUBLE NOT NULL DEFAULT 0.0,"
                    + "`g_user` VARCHAR(10) NOT NULL)");

            dbconnector.insertquery("CREATE TABLE IF NOT EXISTS `" + DBName + "`.`abc_analysis` ("
                    + "`d_srno` VARCHAR(8) NOT NULL,"
                    + "`d_ved` VARCHAR(1) NOT NULL,"
                    + "`d_uPrise` DOUBLE NOT NULL DEFAULT 0.0,"
                    + "`d_cumu` DOUBLE NOT NULL DEFAULT 0.0,"
                    + "`d_abc` VARCHAR(1) NOT NULL,"
                    + "`d_cumu1` DOUBLE NOT NULL DEFAULT 0.0,"
                    + "`d_issueval` DOUBLE NOT NULL DEFAULT 0.0,"
                    + "PRIMARY KEY (`d_srno`))");


            dbconnector.insertquery("CREATE TABLE IF NOT EXISTS `" + DBName + "`.`incodeltr`(`incode_leter` VARCHAR(2) NOT NULL)");

            dbconnector.insertquery("CREATE TABLE IF NOT EXISTS `" + DBName + "`.`transaction_sub1` ("
                    + "`g_grnno` VARCHAR(15) NOT NULL,"
                    + "`g_invoseno` VARCHAR(15) NOT NULL,"
                    + "`g_incode` VARCHAR(50) NOT NULL,"
                    + "`g_ordercode` INTEGER NOT NULL DEFAULT 0,"
                    + "`g_date` DATE NOT NULL DEFAULT '0000-00-00',"
                    + "`g_sysdate` DATE NOT NULL DEFAULT '0000-00-00',"
                    + "`g_year` VARCHAR(4) NOT NULL DEFAULT 0,"
                    + "`g_month` VARCHAR(2) NOT NULL,"
                    + "`g_day` VARCHAR(2) NOT NULL,"
                    + "`g_warehose` VARCHAR(3) NOT NULL,"
                    + "`g_section` VARCHAR(5) NOT NULL,"
                    + "`g_lot` VARCHAR(15) NOT NULL,"
                    + "`g_packsize` INTEGER NOT NULL DEFAULT 0,"
                    + "`g_packs` INTEGER NOT NULL DEFAULT 0,"
                    + "`g_itemcode` VARCHAR(8) NOT NULL,"
                    + "`g_status` VARCHAR(10) NOT NULL,"
                    + "`g_transtype` VARCHAR(5) NOT NULL,"
                    + "`g_receipttype` VARCHAR(5) NOT NULL,"
                    + "`g_initprice` DOUBLE NOT NULL DEFAULT 0.0,"
                    + "`g_expdate` DATE NOT NULL DEFAULT '0000-00-00',"
                    + "`g_qnty` DOUBLE NOT NULL DEFAULT 0.0,"
                    + "`g_Rqnty` DOUBLE NOT NULL DEFAULT 0.0,"
                    + "`g_Iqnty` DOUBLE NOT NULL DEFAULT 0.0,"
                    + "`g_coment` VARCHAR(250) NOT NULL,"
                    + "`g_user` VARCHAR(10) NOT NULL)");

            dbconnector.insertquery("CREATE TABLE IF NOT EXISTS `" + DBName + "`.`deptinfo` ("
                    + "`DEPCODE` VARCHAR(8) NOT NULL,"
                    + "`DEPNAME` VARCHAR(60) NOT NULL DEFAULT 0,"
                    + "`ADDRESS1` VARCHAR(30) NOT NULL,"
                    + "`ADDRESS2` VARCHAR(30) NOT NULL,"
                    + "`BANKCODE` VARCHAR(3) NOT NULL,"
                    + "`HEADOFDEPT` VARCHAR(100) NOT NULL,"
                    + "`BANKNAME` VARCHAR(30) NOT NULL,"
                    + "`UNITNAME` VARCHAR(60) NOT NULL,"
                    + "`UNITHEAD` VARCHAR(60) NOT NULL,"
                    + "`UNITHEADNAME` VARCHAR(60) NOT NULL,"
                    + "`CHEQUES` VARCHAR(70) NOT NULL,"
                    + "`contact` VARCHAR(36) NOT NULL,"
                    + "`Name_HOD` VARCHAR(60) NOT NULL)");

            dbconnector.insertquery("CREATE TABLE IF NOT EXISTS `" + DBName + "`.`all_estimate` ("
                    + "`Incode` VARCHAR(16) NOT NULL,"
                    + "`ProductCode` VARCHAR(8) NOT NULL,"
                    + "`estimate_Qty` DOUBLE NOT NULL DEFAULT 0.0,"
                    + "`year` VARCHAR(4) NOT NULL)");


            dbconnector.insertquery("CREATE TABLE IF NOT EXISTS `" + DBName + "`.`invoceno_sub1` ("
                    + "`section` VARCHAR(2) NOT NULL,"
                    + "`inyear` VARCHAR(4) NOT NULL,"
                    + "`invoceNo` INTEGER NOT NULL DEFAULT 0)");


            dbconnector.insertquery("CREATE TABLE IF NOT EXISTS `" + DBName + "`.`temp_all_estimate` ("
                    + "`Incode` VARCHAR(7) NOT NULL,"
                    + "`ProductCode` VARCHAR(8) NOT NULL,"
                    + "`estimate_Qty` DOUBLE NOT NULL DEFAULT 0.0,"
                    + "`year` VARCHAR(4) NOT NULL)");


            dbconnector.insertquery("CREATE TABLE IF NOT EXISTS `" + DBName + "`.`substitute` ("
                    + "`invoceNo` INTEGER NOT NULL DEFAULT 0)"
                    + "`g_grnno` VARCHAR(15) NOT NULL,"
                    + "`g_lot` VARCHAR(15) NOT NULL,"
                    + "`g_itemcode` VARCHAR(8) NOT NULL,"
                    + "`g_qnty` DOUBLE NOT NULL DEFAULT 0.0,"
                    + "`tran_grnno` VARCHAR(15) NOT NULL,"
                    + "`tran_lot` VARCHAR(15) NOT NULL,"
                    + "`tran_itemcode` VARCHAR(8) NOT NULL,"
                    + "`g_sysdate` DATE NOT NULL DEFAULT '0000-00-00'");




            dbconnector.insertquery("ALTER TABLE `" + DBName + "`.`dgs_surgicallist` MODIFY COLUMN "
                    + "`d_srno` VARCHAR(8) NOT NULL;");

            dbconnector.insertquery("ALTER TABLE `" + DBName + "`.`estimate` MODIFY COLUMN "
                    + "`ProductCode` VARCHAR(8) NOT NULL;");

            dbconnector.insertquery("ALTER TABLE `" + DBName + "`.`temp_estimate` MODIFY COLUMN "
                    + "`icode` VARCHAR(8) NOT NULL;");

            dbconnector.insertquery("ALTER TABLE `" + DBName + "`.`temp_ledger` MODIFY COLUMN "
                    + "`g_itemcode` VARCHAR(8) NOT NULL;");

            dbconnector.insertquery("ALTER TABLE `" + DBName + "`.`temp_transaction` MODIFY COLUMN "
                    + "`g_itemcode` VARCHAR(8) NOT NULL;");

            dbconnector.insertquery("ALTER TABLE `" + DBName + "`.`transaction` MODIFY COLUMN "
                    + "`g_itemcode` VARCHAR(8) NOT NULL;");

            dbconnector.insertquery("CREATE OR REPLACE VIEW `" + DBName + "`.`ttl_estimate` AS SELECT `" + DBName + "`.`estimate`.`ProductCode` AS `estimate_ProductCode`,sum(`" + DBName + "`.`estimate`.`estimate_Qty`) AS `estimate_estimate_Qty` from `" + DBName + "`.`estimate` group by `" + DBName + "`.`estimate`.`ProductCode` ");

            //   dbconnector.insertquery("ALTER TABLE `rmsd_db_pu`.`invoceno` ADD COLUMN `incoce` VARCHAR(6) NOT NULL AFTER `invoceNo`");

        } catch (SQLException ex) {
            Logger.getLogger(frmDBUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnupdateDBActionPerformed

    private void lstcatlogValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstcatlogValueChanged
        try {
            String rd = dbconnector.host;
            String pw = dbconnector.pword;
            DBName = lstcatlog.getSelectedValue().toString();
            LbldbName.setText("Selected DataBase : " + DBName);
            btnupdateDB.setEnabled(true);

        } catch (Exception ex) {
            Logger.getLogger(frmDBDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lstcatlogValueChanged

    void setcatlog() {

        try {
            Object[] catelogNames = wans_MetaData.catelogNames((com.mysql.jdbc.Connection) statcon);
            lstcatlog.setListData(catelogNames);
        } catch (Exception ex) {
            Logger.getLogger(dbconnector.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex + " Because of Database.txt file is missing or SQL password is not mach.");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbldbName;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnupdateDB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstcatlog;
    // End of variables declaration//GEN-END:variables
}
