//Copyright (c) 2012, Provincial Department of Health Services, North western province, Sri Lanka
//All rights reserved.
package rmsd;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import mymod.dbconnector;
import mymod.voidmodule;

public class rptabc extends javax.swing.JInternalFrame {

    public String user;
    public String a;
    public Object RRyear;
    public int n;
    static int pb;
    static int intpb1;

    public rptabc() {
        initComponents();

        this.setuser(null);

    }

    void setuser(String suser) {
        user = suser;

        a = voidmodule.readintitution(null);
        this.setTitle(a + "  - ABC Analasis  -  User : " + user);
        voidmodule.fillcombo(cmdyear, "SELECT DISTINCT g_year from transaction ORDER BY g_year");


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnremove = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblfrom = new javax.swing.JTable();
        pb1 = new javax.swing.JProgressBar();
        jPanel3 = new javax.swing.JPanel();
        btnexit = new javax.swing.JButton();
        btnprint = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        cmdyear = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        btnremove.setText("<<<");
        btnremove.setEnabled(false);
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });

        tblfrom.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        tblfrom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code List"
            }
        ));
        tblfrom.setEnabled(false);
        tblfrom.setGridColor(new java.awt.Color(255, 255, 255));
        tblfrom.setShowHorizontalLines(false);
        jScrollPane1.setViewportView(tblfrom);

        pb1.setForeground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(pb1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnremove, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(btnremove))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit.jpg"))); // NOI18N
        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        btnprint.setText("Print");
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
                .addComponent(btnprint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnprint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cmdyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdyearActionPerformed(evt);
            }
        });

        jLabel1.setText("Select Analysis Year :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdyear, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmdyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel4.setBackground(new java.awt.Color(153, 153, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ABC Analysis Report");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel4.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        this.setVisible(false);

}//GEN-LAST:event_btnexitActionPerformed

    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed


        Runnable run2 = new Runnable() {

            public void run() {
                Print_btaction();
            }
        };


        Thread tr = new Thread(run2);
        tr.start();

    }//GEN-LAST:event_btnprintActionPerformed

    void Print_btaction() {
        try {
            DateFormat dfyear = new SimpleDateFormat("yyyy");
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            Object year = cmdyear.getSelectedItem();






            double uPrise;

    //        dbconnector cc = new dbconnector();
    //        cc.conn();


            try {
                dbconnector.insertquery("DELETE FROM abc_analysis");
                int Rcount = tblfrom.getRowCount();
                pb1.setMaximum(Rcount);
                for (int xx = 0; xx < Rcount; xx++) {
                    pb = xx;
                    Double issuevalue = 0.0;


                    String icode = tblfrom.getValueAt(xx, 0).toString();
                    String ved = voidmodule.Out_fieldResulr("SELECT d_ved FROM dgs_surgicallist WHERE d_srno ='" + icode + "'");
                    if (ved == null) {
                        ved = "";
                    }

                    uPrise = Double.valueOf(voidmodule.Out_fieldResulr("SELECT g_initprice FROM transaction WHERE g_itemcode ='" + icode + "' AND g_year ='" + year + "'"));
    //                issue = voidmodule.get_intsum("SELECT sum(g_Iqnty) FROM transaction WHERE g_itemcode ='" + icode + "'AND g_year ='" + year + "'");
    //                issuevalue = issue * uPrise;




                    Double bb = 0.0;

                    String strsql = "SELECT g_Iqnty, g_initprice FROM transaction WHERE g_itemcode ='" + icode + "'AND g_year ='" + year + "'";
                    ResultSet rs = dbconnector.Sql_OutResultset(strsql);
                    while (rs.next()) {
                        Double issueqnty = 0.0;
                        Double Uprize = 0.0;
                        Double ival = 0.0;

                        issueqnty = Double.parseDouble(rs.getString(1));

                        Uprize = Double.parseDouble(rs.getString(2));
                        ival = issueqnty * Uprize;
                        bb = ival + bb;

                    }


                    issuevalue = bb;

                    dbconnector.insertquery("INSERT INTO abc_analysis VALUES ('" + icode + "','" + ved + "','" + uPrise + "','" + 0 + "','" + "-" + "',0,'" + issuevalue + "')");



                    Runnable run1 = new Runnable() {

                        public void run() {
                            pb1.setValue(pb);
                        }
                    };


                    Thread tr1 = new Thread(run1);
                    tr1.start();



                }

            } catch (SQLException ex) {
                Logger.getLogger(rptledger.class.getName()).log(Level.SEVERE, null, ex);
            }

            Double ttlissue = Double.valueOf(voidmodule.getsumDouble("SELECT sum(d_issueval) FROM abc_analysis"));
            //   BigDecimal Bttlissue = new BigDecimal(ttlissue);
            try {
                //cc.insertquery("UPDATE temp_estimate SET d_cumu = d_issueval/" + ttlissue + "*100,d_abc = '" + bal + "'WHERE d_srno ='" + icode + "'");


                Connection conn = dbconnector.conn();
                String strsql = "UPDATE abc_analysis SET d_cumu = d_issueval/" + ttlissue + "*100";
                dbconnector.conn().createStatement().executeUpdate(strsql);

                strsql = "Select * from  abc_analysis order by d_issueval desc";
                Statement createStatement = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet rs = createStatement.executeQuery(strsql);

                int Count = voidmodule.RCount(strsql);
                intpb1 = Count;
                pb1.setMaximum(intpb1);
                pb1.setMinimum(0);

                double totcount = 0;
                while (rs.next()) {
                    double aDouble = rs.getDouble("d_cumu");
                    totcount = totcount + aDouble;
                    rs.updateDouble("d_cumu1", totcount);
                    rs.updateRow();
                    int row = rs.getRow();
                    pb = row;
                    Runnable run3 = new Runnable() {

                        public void run() {
                            pb1.setValue(pb);
                        }
                    };


                    Thread tr3 = new Thread(run3);
                    tr3.start();

                }





                strsql = "Select * from  abc_analysis";
                createStatement = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                rs = createStatement.executeQuery(strsql);
                int Count1 = voidmodule.RCount(strsql);
                intpb1 = Count1;
                pb1.setMaximum(intpb1);
                pb1.setMinimum(0);


                while (rs.next()) {

                    double aDouble = rs.getDouble("d_cumu1");
                    if (aDouble >= 90) {
                        rs.updateString("d_abc", "C");
                        rs.updateRow();
                    } else if (aDouble >= 80) {
                        rs.updateString("d_abc", "B");
                        rs.updateRow();
                    } else {
                        rs.updateString("d_abc", "A");
                        rs.updateRow();
                    }



                    int row = rs.getRow();
                    pb = row;
                    Runnable run4 = new Runnable() {

                        public void run() {
                            pb1.setValue(pb);
                        }
                    };


                    Thread tr4 = new Thread(run4);
                    tr4.start();



                }



            } catch (SQLException ex) {
                Logger.getLogger(rptledger.class.getName()).log(Level.SEVERE, null, ex);
            }


            pb1.setString("Generating Completed");
            int Count = voidmodule.RCount("SELECT d_abc from abc_analysis WHERE d_abc ='" + "A" + "'");
            String aa = Count + "";
            int Count1 = voidmodule.RCount("SELECT d_abc from abc_analysis WHERE d_abc ='" + "B" + "'");
            String bb = Count1 + "";
            int Count2 = voidmodule.RCount("SELECT d_abc from abc_analysis WHERE d_abc ='" + "C" + "'");
            String ccc = Count2 + "";



            Map m = new HashMap();
            m.put("p_institute", a);
            m.put("Tissue", ttlissue);
            m.put("Ryear", RRyear);
            m.put("aa", aa);
            m.put("bb", bb);
            m.put("ccc", ccc);


            voidmodule.generateReport("//Report//abc_analysis.jrxml", m);
            voidmodule.generateReport("//Report//abc_analysis_graph.jrxml", m);
        } catch (SQLException ex) {
            Logger.getLogger(rptabc.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
    }//GEN-LAST:event_btnremoveActionPerformed

    private void cmdyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdyearActionPerformed
        RRyear = cmdyear.getSelectedItem();
        this.additemcode("SELECT DISTINCT g_itemcode from transaction WHERE g_year ='" + RRyear + "' ORDER BY g_itemcode ");
    }//GEN-LAST:event_cmdyearActionPerformed
    void additemcode(String query) {
        String icode;

        try {


            DefaultTableModel addabl = (DefaultTableModel) tblfrom.getModel();
            while (tblfrom.getRowCount() > 0) {
                addabl.removeRow(0);
            }
            Statement rss = dbconnector.conn().createStatement();
            ResultSet rs = rss.executeQuery(query);
            while (rs.next()) {
                icode = rs.getString(1);
                addabl.addRow(new Object[]{icode});
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmStock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnprint;
    private javax.swing.JButton btnremove;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox cmdyear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JProgressBar pb1;
    private javax.swing.JTable tblfrom;
    // End of variables declaration//GEN-END:variables
}
