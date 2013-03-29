/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rmsd;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import mymod.dbconnector;
import mymod.voidmodule;

/**
 *
 * @author acer
 */
public class frmsubstitute extends javax.swing.JInternalFrame {

    String grn;
    String lot;
    Integer packsize;
    Integer nopack;
    String wh;
    String section;
    String icode;
    Object Reptcode;
    String status = "temp";
    String rtype = "R";
    String itype = "I";
    String Snull = "-";
    int orderCode = 0;
    String cmmnts;
    double unitprize;
    double qnty;
    double dnull;
    String gmonth;
    String gday;
    String gyear;
    public static String user;
    public static String a;

    public frmsubstitute() {
        initComponents();
    }

    public void setuser(String suser) {
        user = suser;
        this.setTitle(a + "  - Substitute Quantity Transfer  -  User : " + user);


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtitemcode = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblselectlist = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldetailslist = new javax.swing.JTable();
        btnrmove = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        cmbstv = new javax.swing.JComboBox();
        lbllot3 = new javax.swing.JLabel();
        lblIcode = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbllot2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txttranIcode = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtqnty = new javax.swing.JTextField();
        btnnewstv = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lblgrn2 = new javax.swing.JLabel();
        lbllot = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setMinimumSize(new java.awt.Dimension(10, 33));

        jLabel1.setDisplayedMnemonic('A');
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 51));
        jLabel1.setText("You can make Substitute Same Item Quantise after Stock verification");
        jLabel1.setAutoscrolls(true);
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Selected Item List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(102, 0, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Item Code");

        txtitemcode.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtitemcode.setForeground(new java.awt.Color(0, 0, 204));
        txtitemcode.setEnabled(false);
        txtitemcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtitemcodeKeyReleased(evt);
            }
        });

        tblselectlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblselectlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblselectlistMouseReleased(evt);
            }
        });
        tblselectlist.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblselectlistKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblselectlist);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtitemcode, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtitemcode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Details List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(102, 0, 255))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(399, 187));

        tbldetailslist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbldetailslist);

        btnrmove.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnrmove.setText("Remove");

        jPanel4.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 204));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("STV No :");
        jPanel4.add(jLabel11);

        cmbstv.setEditable(true);
        cmbstv.setForeground(new java.awt.Color(0, 0, 204));
        jPanel4.add(cmbstv);

        lbllot3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbllot3.setForeground(new java.awt.Color(0, 0, 204));
        lbllot3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbllot3.setText("Item Code :");
        jPanel4.add(lbllot3);

        lblIcode.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblIcode.setForeground(new java.awt.Color(0, 0, 204));
        lblIcode.setText("Item Code :");
        jPanel4.add(lblIcode);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 204));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Lot No : ");
        jPanel4.add(jLabel13);

        lbllot2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbllot2.setForeground(new java.awt.Color(0, 0, 204));
        lbllot2.setText("Lot No : ");
        jPanel4.add(lbllot2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnrmove))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 928, Short.MAX_VALUE))
                        .addGap(18, 18, 18)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnrmove)
                .addContainerGap())
        );

        jPanel2.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Transfer Item Code");
        jPanel2.add(jLabel3);

        txttranIcode.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txttranIcode.setForeground(new java.awt.Color(0, 0, 204));
        jPanel2.add(txttranIcode);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Transfer Qnty");
        jPanel2.add(jLabel7);

        txtqnty.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtqnty.setForeground(new java.awt.Color(0, 0, 204));
        jPanel2.add(txtqnty);

        btnnewstv.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnnewstv.setText("Add New Transfer");
        btnnewstv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewstvActionPerformed(evt);
            }
        });
        jPanel2.add(btnnewstv);

        btnadd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnadd.setText("Save");
        jPanel2.add(btnadd);

        btnexit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        jPanel2.add(btnexit);

        jPanel7.setLayout(new java.awt.GridLayout(3, 0));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setText("GRN No :");
        jPanel7.add(jLabel4);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 0));
        jLabel5.setText("Lot No : ");
        jPanel7.add(jLabel5);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 0));
        jLabel6.setText("Item Name :");
        jPanel7.add(jLabel6);

        jPanel8.setLayout(new java.awt.GridLayout(3, 0));

        lblgrn2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblgrn2.setForeground(new java.awt.Color(102, 0, 0));
        jPanel8.add(lblgrn2);

        lbllot.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbllot.setForeground(new java.awt.Color(102, 0, 0));
        jPanel8.add(lbllot);

        lblname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblname.setForeground(new java.awt.Color(102, 0, 0));
        jPanel8.add(lblname);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        dispose();
    }//GEN-LAST:event_btnexitActionPerformed

    private void txtitemcodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitemcodeKeyReleased
        String icoce = txtitemcode.getText();
        Date sysdate = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String format = df.format(sysdate);
        String query = "SELECT g_grnno AS Grn_No,g_lot AS Lot_No ,sum(g_qnty) as Balance,g_transtype AS Type,g_expdate AS Expire from transaction "
                + " GROUP BY g_itemcode,g_grnno,g_lot  HAVING g_itemcode ='" + icoce + "'AND sum(g_qnty)<> 0 ORDER BY Datediff(g_expdate,'" + format + "')";

        try {
            settblmdl(tblselectlist, query);
        } catch (SQLException ex) {
            Logger.getLogger(frmsubstitute.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtitemcodeKeyReleased

    private void tblselectlistKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblselectlistKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblselectlistKeyReleased

    private void tblselectlistMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblselectlistMouseReleased
        int SelectedRow = tblselectlist.getSelectedRow();
        String icode = txtitemcode.getText();
       
        String grn = (tblselectlist.getValueAt(SelectedRow, 0).toString());
        String lot = (tblselectlist.getValueAt(SelectedRow, 1).toString());
         lblgrn2.setText(grn);
        lbllot.setText(lot);


        
        try {
            java.sql.Statement rss = dbconnector.conn().createStatement();
            ResultSet rs = rss.executeQuery("SELECT d_name from dgs_surgicallist WHERE d_srno ='" + icode + "'");

            while (rs.next()) {
                lblname.setText(rs.getString("d_name"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(voidmodule.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
        txttranIcode.requestFocus();
         this.variable("SELECT g_grnno,g_warehose,g_section,g_lot from transaction WHERE g_itemcode ='" + icode + "'AND g_grnno ='" + grn + "'AND g_lot ='" + lot + "'");
    }//GEN-LAST:event_tblselectlistMouseReleased

    private void btnnewstvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewstvActionPerformed
        txtitemcode.setEnabled(true);
        txtitemcode.requestFocus();
       
    }//GEN-LAST:event_btnnewstvActionPerformed
    void settblmdl(JTable table, String query) throws SQLException {

        Statement rss = dbconnector.conn().createStatement();
        String Tblmod = query;
        ResultSet executeQuery = rss.executeQuery(Tblmod);

        int columnWidth[] = {80, 80, 80, 30, 50};
        wans_javalib.Tables.setTableModel(executeQuery, table, Tblmod, columnWidth);
    }

    void variable(String query) {
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat dfmonth = new SimpleDateFormat("MM");
        DateFormat dfday = new SimpleDateFormat("dd");
        DateFormat dfyear = new SimpleDateFormat("yyyy");

        String sysdate = df.format(date);

        try {
            java.sql.Statement rss = dbconnector.conn().createStatement();
            ResultSet rs = rss.executeQuery(query);

            while (rs.next()) {

                grn = rs.getString("g_grnno");
                wh=(rs.getString("g_warehose"));
                section = (rs.getString("g_section"));
                lot = (rs.getString("g_lot"));
                packsize = Integer.parseInt(rs.getString("adr3"));
                nopack = Integer.parseInt(rs.getString("age_Y"));
                icode = (rs.getString("age_M"));
                status = (rs.getString("age_D"));
                rtype = (rs.getString("status"));
                Reptcode = (rs.getString("guardian"));
                unitprize = Double.parseDouble(rs.getString("police"));
                qnty = Double.parseDouble(rs.getString("w_num"));
                
                                String gmonth = dfmonth.format(date);
                String gday = dfday.format(date);
                String gyear = dfyear.format(date);
               }

        } catch (SQLException ex) {
            Logger.getLogger(voidmodule.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }




    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnnewstv;
    private javax.swing.JButton btnrmove;
    private javax.swing.JComboBox cmbstv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblIcode;
    private javax.swing.JLabel lblgrn2;
    private javax.swing.JLabel lbllot;
    private javax.swing.JLabel lbllot2;
    private javax.swing.JLabel lbllot3;
    private javax.swing.JLabel lblname;
    private javax.swing.JTable tbldetailslist;
    public static javax.swing.JTable tblselectlist;
    private javax.swing.JTextField txtitemcode;
    private javax.swing.JTextField txtqnty;
    private javax.swing.JTextField txttranIcode;
    // End of variables declaration//GEN-END:variables
}
