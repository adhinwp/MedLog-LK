//Copyright (c) 2012, Provincial Department of Health Services, North western province, Sri Lanka
//All rights reserved.

package rmsd;



import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import mymod.dbconnector;
import mymod.voidmodule;

public class frmmovement extends javax.swing.JInternalFrame {

    public String user;
    frmInvoice object;
    frmInvoice_stores2 object1;

    public frmmovement() {
        initComponents();
        this.setuser(null);

    }

    public frmmovement(frmInvoice obj) {
        this.object = obj;
        initComponents();
        this.setuser(null);

    }
        public frmmovement(frmInvoice_stores2 obj) {
        this.object1 = obj;
        initComponents();
        this.setuser(null);

    }

    void setuser(String suser) {
  
        String a = voidmodule.readintitution(null);
        user = voidmodule.User_Name(null);
        this.setTitle(a + "  - Invoice  -  User : " + user);
    }

    void addtable(String dyear, String query) {

        String grnno = null;
        String invoseno = null;
        String lot = null;
        int Rqnty = 0;
        int RRqnty = 0;
        int Iqnty = 0;
        int IIqnty = 0;
        String name = null;
        String icode = null;
        String incode = null;
        String ocode = null;
        String itype = null;
        String section = null;
        Date idate = null;


     
        try {


            DefaultTableModel addabl = (DefaultTableModel) tblmovement.getModel();
            while (tblmovement.getRowCount() > 0) {
                addabl.removeRow(0);
            }


            Statement rss = dbconnector.conn().createStatement();
            ResultSet rs = rss.executeQuery(query);
            while (rs.next()) {
                grnno = rs.getString("T.g_grnno");
                invoseno = rs.getString("T.g_invoseno");
                lot = rs.getString("T.g_lot");
                Rqnty = Integer.parseInt(rs.getString("T.g_Rqnty"));
                Iqnty = Integer.parseInt(rs.getString("T.g_Iqnty"));
                IIqnty = IIqnty + (Integer.parseInt(rs.getString("T.g_Iqnty")));
                RRqnty = RRqnty + (Integer.parseInt(rs.getString("T.g_Rqnty")));
                name = rs.getString("S.d_name");
                icode = rs.getString("T.g_itemcode");
                incode = rs.getString("T.g_incode");
                ocode = rs.getString("T.g_ordercode");
                itype = rs.getString("T.g_transtype");
                section= rs.getString("T.g_section");
                 idate = (Date) rs.getDate("T.g_date");
                addabl.addRow(new Object[]{grnno, lot, invoseno,ocode, incode, idate, itype,section, Rqnty, Iqnty});
            }
            lblname.setText(name);
            lblitemcode.setText(icode);
            lbltitle.setText("Item Movements  - " + dyear);

               


            lblissue.setText(IIqnty + "");
            lblreceived.setText(RRqnty + "");
            lblbal.setText(RRqnty - IIqnty + "");




        } catch (SQLException ex) {
            Logger.getLogger(frmStock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblmovement = new javax.swing.JTable();
        TOTAL = new javax.swing.JLabel();
        lblissue = new javax.swing.JLabel();
        lblreceived = new javax.swing.JLabel();
        TOTAL1 = new javax.swing.JLabel();
        lblbal = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        lbltitle = new javax.swing.JLabel();
        lblitemcode = new javax.swing.JLabel();
        btnexit = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);

        tblmovement.setBackground(new java.awt.Color(0, 0, 0));
        tblmovement.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tblmovement.setForeground(new java.awt.Color(51, 255, 0));
        tblmovement.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "GRN No", "Lot No", "Invoice No", "OrderCode", "Ins Code", "GRN/Invoice Date", "Type", "Section", "Received Qnty", "Issue Qnty"
            }
        ));
        tblmovement.setRowHeight(25);
        jScrollPane1.setViewportView(tblmovement);
        tblmovement.getColumnModel().getColumn(0).setMinWidth(0);
        tblmovement.getColumnModel().getColumn(0).setPreferredWidth(150);
        tblmovement.getColumnModel().getColumn(0).setMaxWidth(150);
        tblmovement.getColumnModel().getColumn(1).setMinWidth(0);
        tblmovement.getColumnModel().getColumn(1).setPreferredWidth(150);
        tblmovement.getColumnModel().getColumn(1).setMaxWidth(150);
        tblmovement.getColumnModel().getColumn(2).setMinWidth(0);
        tblmovement.getColumnModel().getColumn(2).setPreferredWidth(150);
        tblmovement.getColumnModel().getColumn(2).setMaxWidth(150);
        tblmovement.getColumnModel().getColumn(3).setMinWidth(0);
        tblmovement.getColumnModel().getColumn(3).setPreferredWidth(100);
        tblmovement.getColumnModel().getColumn(3).setMaxWidth(100);
        tblmovement.getColumnModel().getColumn(4).setMinWidth(0);
        tblmovement.getColumnModel().getColumn(4).setPreferredWidth(100);
        tblmovement.getColumnModel().getColumn(4).setMaxWidth(100);
        tblmovement.getColumnModel().getColumn(5).setMinWidth(0);
        tblmovement.getColumnModel().getColumn(5).setPreferredWidth(150);
        tblmovement.getColumnModel().getColumn(5).setMaxWidth(150);
        tblmovement.getColumnModel().getColumn(6).setMinWidth(0);
        tblmovement.getColumnModel().getColumn(6).setPreferredWidth(50);
        tblmovement.getColumnModel().getColumn(6).setMaxWidth(50);
        tblmovement.getColumnModel().getColumn(7).setMinWidth(0);
        tblmovement.getColumnModel().getColumn(7).setPreferredWidth(50);
        tblmovement.getColumnModel().getColumn(7).setMaxWidth(50);
        tblmovement.getColumnModel().getColumn(8).setMinWidth(0);
        tblmovement.getColumnModel().getColumn(8).setPreferredWidth(150);
        tblmovement.getColumnModel().getColumn(8).setMaxWidth(150);
        tblmovement.getColumnModel().getColumn(9).setMinWidth(0);
        tblmovement.getColumnModel().getColumn(9).setPreferredWidth(150);
        tblmovement.getColumnModel().getColumn(9).setMaxWidth(150);

        TOTAL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        TOTAL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TOTAL.setText("TOTAL :");

        lblissue.setFont(new java.awt.Font("Times New Roman", 1, 18));
        lblissue.setText("issue");

        lblreceived.setFont(new java.awt.Font("Times New Roman", 1, 18));
        lblreceived.setText("received");

        TOTAL1.setFont(new java.awt.Font("Times New Roman", 1, 18));
        TOTAL1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TOTAL1.setText("BALANCE :");

        lblbal.setFont(new java.awt.Font("Times New Roman", 1, 18));
        lblbal.setText("Balance");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 837, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(462, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TOTAL1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblbal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblreceived, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblissue, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblissue, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblreceived)
                    .addComponent(TOTAL))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblbal)
                    .addComponent(TOTAL1))
                .addContainerGap())
        );

        lblname.setFont(new java.awt.Font("Times New Roman", 1, 14));
        lblname.setText("Name");

        lbltitle.setBackground(new java.awt.Color(153, 153, 153));
        lbltitle.setFont(new java.awt.Font("Times New Roman", 1, 24));
        lbltitle.setForeground(new java.awt.Color(51, 255, 255));
        lbltitle.setText("Item Movement Details");
        lbltitle.setOpaque(true);

        lblitemcode.setFont(new java.awt.Font("Times New Roman", 1, 14));
        lblitemcode.setText("Code");

        btnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit.jpg"))); // NOI18N
        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbltitle, javax.swing.GroupLayout.DEFAULT_SIZE, 837, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                        .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblitemcode, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblitemcode, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnexit)
                    .addComponent(lblname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        this.setVisible(false);
}//GEN-LAST:event_btnexitActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TOTAL;
    private javax.swing.JLabel TOTAL1;
    private javax.swing.JButton btnexit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblbal;
    private javax.swing.JLabel lblissue;
    private javax.swing.JLabel lblitemcode;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblreceived;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JTable tblmovement;
    // End of variables declaration//GEN-END:variables
}
