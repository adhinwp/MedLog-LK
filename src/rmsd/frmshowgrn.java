//Copyright (c) 2012, Provincial Department of Health Services, North western province, Sri Lanka
//All rights reserved.
package rmsd;

import java.awt.Color;
import java.awt.Component;
import java.sql.*;
import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import mymod.dbconnector;
import mymod.voidmodule;

public class frmshowgrn extends javax.swing.JInternalFrame {

    frmInvoice object;
    frmInvoice_stores2 object1;
    public String User;
    public boolean stores;

    public frmshowgrn() {
        initComponents();
    }

    public frmshowgrn(frmInvoice obj) {
        this.object = obj;
        initComponents();

    }

    public frmshowgrn(frmInvoice_stores2 obj) {
        this.object1 = obj;
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblqnty = new javax.swing.JLabel();
        lblicode = new javax.swing.JLabel();
        lblgrn = new javax.swing.JLabel();
        lblexpdate = new javax.swing.JLabel();
        lbllot = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnapply = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblgrn = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblexprd = new java.awt.Label();
        jLabel12 = new javax.swing.JLabel();
        lbl365 = new java.awt.Label();
        jLabel7 = new javax.swing.JLabel();
        lbl90 = new java.awt.Label();
        jLabel9 = new javax.swing.JLabel();
        lbl30 = new java.awt.Label();
        jLabel10 = new javax.swing.JLabel();
        lbl15 = new java.awt.Label();
        jLabel11 = new javax.swing.JLabel();
        lbl366 = new java.awt.Label();
        jLabel8 = new javax.swing.JLabel();
        lblselect = new java.awt.Label();

        setClosable(true);
        setMaximizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        lblqnty.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblqnty.setForeground(new java.awt.Color(51, 153, 255));
        lblqnty.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblqnty.setText("0");
        lblqnty.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Onhand Qnty", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel2.add(lblqnty);

        lblicode.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblicode.setForeground(new java.awt.Color(51, 153, 255));
        lblicode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblicode.setText("Item Code");
        lblicode.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Item Code", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel2.add(lblicode);

        lblgrn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblgrn.setForeground(new java.awt.Color(51, 153, 255));
        lblgrn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblgrn.setText("GRN No");
        lblgrn.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GRN No", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel2.add(lblgrn);

        lblexpdate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblexpdate.setForeground(new java.awt.Color(51, 153, 255));
        lblexpdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblexpdate.setText("0");
        lblexpdate.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Expire Date", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        lblexpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblexpdate.setPreferredSize(new java.awt.Dimension(77, 52));
        jPanel2.add(lblexpdate);

        lbllot.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbllot.setForeground(new java.awt.Color(51, 153, 255));
        lbllot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbllot.setText("Lot No");
        lbllot.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lot N0", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel2.add(lbllot);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        btnapply.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnapply.setText("Apply");
        btnapply.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnapply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnapplyActionPerformed(evt);
            }
        });
        jPanel3.add(btnapply);

        btnexit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnexit.setText("Exit");
        btnexit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        jPanel3.add(btnexit);

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Goods Received Note Details Viewer");

        tblgrn.setBackground(new java.awt.Color(255, 204, 255));
        tblgrn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tblgrn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblgrn.setRowHeight(20);
        tblgrn.setShowHorizontalLines(false);
        tblgrn.setShowVerticalLines(false);
        tblgrn.setUpdateSelectionOnSort(false);
        tblgrn.setVerifyInputWhenFocusTarget(false);
        tblgrn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblgrnMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblgrnMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblgrn);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Please Select GRN No that you want to issue and Click Apply Button.");

        lblexprd.setMinimumSize(new java.awt.Dimension(38, 20));
        lblexprd.setPreferredSize(new java.awt.Dimension(38, 20));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("< 15 Days");

        lbl365.setMinimumSize(new java.awt.Dimension(38, 20));
        lbl365.setPreferredSize(new java.awt.Dimension(38, 20));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText(">365 Days");

        lbl90.setMinimumSize(new java.awt.Dimension(38, 20));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("<365 Days");

        lbl30.setMinimumSize(new java.awt.Dimension(38, 20));
        lbl30.setPreferredSize(new java.awt.Dimension(38, 20));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("< 90 Days");

        lbl15.setMinimumSize(new java.awt.Dimension(38, 20));
        lbl15.setPreferredSize(new java.awt.Dimension(38, 20));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("< 30 Days");

        lbl366.setMinimumSize(new java.awt.Dimension(38, 20));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Selection");

        lblselect.setMinimumSize(new java.awt.Dimension(38, 20));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl90, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl366, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl365, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblselect, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblexprd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblexprd, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl15, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl30, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl90, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl365, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblselect, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(lbl366, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void ledger() {
        lbl365.setBackground(Color.white);
        lbl90.setBackground(Color.green);
        lbl30.setBackground(Color.orange);
        lbl15.setBackground(Color.PINK);
        lblexprd.setBackground(Color.red);
        lblselect.setBackground(Color.GRAY);

    }

    void selectcolor() {

        class CustomTableCellRenderer extends DefaultTableCellRenderer {

            public Component getTableCellRendererComponent(JTable table, Object obj, boolean isSelected, boolean hasFocus, int row, int column) {
                Component cell = super.getTableCellRendererComponent(table, obj, isSelected, hasFocus, row, column);
                int parseInt = Integer.parseInt(table.getValueAt(row, 6).toString());

                if (isSelected) {
                    cell.setBackground(Color.GRAY);
                } else {
                    if (parseInt > 365) {
                        cell.setBackground(Color.white);
                    } else if (parseInt > 90) {
                        cell.setBackground(Color.green);
                    } else if (parseInt > 30) {
                        cell.setBackground(Color.orange);
                    } else if (parseInt > 15) {
                        cell.setBackground(Color.PINK);
                    } else {
                        cell.setBackground(Color.red);
                    }
                }

                return cell;

            }
        }
        TableColumn column = tblgrn.getColumnModel().getColumn(0);
        column.setCellRenderer(new CustomTableCellRenderer());
        TableColumn column0 = tblgrn.getColumnModel().getColumn(1);
        column0.setCellRenderer(new CustomTableCellRenderer());
        TableColumn column1 = tblgrn.getColumnModel().getColumn(2);
        column1.setCellRenderer(new CustomTableCellRenderer());
        TableColumn column2 = tblgrn.getColumnModel().getColumn(3);
        column2.setCellRenderer(new CustomTableCellRenderer());
        TableColumn column3 = tblgrn.getColumnModel().getColumn(4);
        column3.setCellRenderer(new CustomTableCellRenderer());
        TableColumn column4 = tblgrn.getColumnModel().getColumn(5);
        column4.setCellRenderer(new CustomTableCellRenderer());
        TableColumn column5 = tblgrn.getColumnModel().getColumn(6);
        column5.setCellRenderer(new CustomTableCellRenderer());



        tblgrn.setRowSelectionAllowed(true);

    }

    private void tblgrnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblgrnMouseReleased
        lblqnty.setText("0");
        int SelectedRow = tblgrn.getSelectedRow();
        String icode = tblgrn.getValueAt(SelectedRow, 0).toString();
        String grn = tblgrn.getValueAt(SelectedRow, 1).toString();
        String lot = tblgrn.getValueAt(SelectedRow, 2).toString();
        String qnty = tblgrn.getValueAt(SelectedRow, 3).toString();


        //   lblexpdate.setText(expdate);
        lblgrn.setText(grn);
        lbllot.setText(lot);

        lblicode.setText(icode);
        lblqnty.setText(qnty);
    }//GEN-LAST:event_tblgrnMouseReleased

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed


        if (stores == true) {
            object.setfor();
            this.setVisible(false);
        } else {
            object1.setfor();
            this.setVisible(false);
        }



    }//GEN-LAST:event_btnexitActionPerformed

    private void btnapplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnapplyActionPerformed
        try {
            String grn = lblgrn.getText();
            String icode = lblicode.getText();
            String lot = lbllot.getText();
            Double OHbal = Double.parseDouble(lblqnty.getText());
            int Count = 0;
            Count = voidmodule.RCount("SELECT g_grnno FROM transaction WHERE g_status = '" + "temp" + "'AND g_grnno = '" + grn + "'AND g_itemcode = '" + icode + "'AND g_lot = '" + lot + "'AND g_transtype = '" + "R" + "'");
            if (Count > 0) {
                JOptionPane.showMessageDialog(null, "This is temporary issue");
           
            } else {
                if (stores == true) {
                    object.showinvoice(OHbal, "SELECT T.g_receipttype,T.g_grnno,T.g_date,T.g_lot,T.g_packsize,T.g_packs,T.g_warehose,T.g_section,T.g_itemcode,T.g_initprice,T.g_Iqnty,T.g_expdate,S.d_name,S.d_unit from transaction as T inner join dgs_surgicallist as S on S.d_srno = T.g_itemcode  WHERE g_grnno ='" + grn + "'AND g_itemcode ='" + icode + "'AND g_lot ='" + lot + "'AND g_transtype ='" + "R" + "'");
                } else {
                    object1.showinvoice(OHbal, "SELECT T.g_receipttype,T.g_invoseno,T.g_grnno,T.g_date,T.g_lot,T.g_packsize,T.g_packs,T.g_warehose,T.g_section,T.g_itemcode,T.g_initprice,T.g_Iqnty,T.g_expdate,S.d_name,S.d_unit from transaction_sub1 as T inner join dgs_surgicallist as S on S.d_srno = T.g_itemcode  WHERE g_grnno ='" + grn + "'AND g_itemcode ='" + icode + "'AND g_lot ='" + lot + "'AND g_transtype ='" + "R" + "'");
                }
                this.setVisible(false);

            }
        } catch (SQLException ex) {
            Logger.getLogger(frmshowgrn.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_btnapplyActionPerformed

    private void tblgrnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblgrnMouseClicked
        String grn = lblgrn.getText();
        String icode = lblicode.getText();
        String lot = lbllot.getText();
        Double qnty = Double.parseDouble(lblqnty.getText());

        this.showexp(grn, lot, icode);


    }//GEN-LAST:event_tblgrnMouseClicked

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        ledger();
    }//GEN-LAST:event_formInternalFrameOpened

    void settblmdl(String icode) {
        String Tblmod = null;

        String confim = "conf";
        Statement rss;
        try {
            rss = dbconnector.conn().createStatement();
            Date sysdate = new Date();
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String format = df.format(sysdate);

            // String Tblmod = "SELECT T.g_grnno,T.g_lot,T.g_itemcode,sum(T.g_qnty) as bal,T.g_transtype,S.d_name from transaction as T inner join dgs_surgicallist as S on S.d_srno = T.g_itemcode"
            //        + " GROUP BY T.g_itemcode,T.g_grnno,T.g_lot  HAVING T.g_itemcode ='" + icode + "'AND sum(T.g_qnty)<> 0 AND T.g_transtype ='" + "R" + "'ORDER BY T.g_grnno";
//               String Tblmod = "SELECT g_itemcode,g_grnno,g_lot,sum(g_qnty) as bal,g_transtype,g_expdate from transaction "
//               + " GROUP BY g_itemcode,g_grnno,g_lot  HAVING g_itemcode ='" + icode + "'AND sum(g_qnty)<> 0 AND g_transtype ='" + "R" + "'ORDER BY g_grnno";
            if (stores == true) {
                Tblmod = "SELECT g_itemcode AS Item_Code,g_grnno AS Grn_No,g_lot AS Lot_No ,sum(g_qnty) as Balance,g_transtype AS Type,g_expdate AS Expire ,Datediff(g_expdate,'" + format + "')as Dates_To_Expire from transaction "
                        + " GROUP BY g_itemcode,g_grnno,g_lot  HAVING g_itemcode ='" + icode + "'AND sum(g_qnty)<> 0 ORDER BY Datediff(g_expdate,'" + format + "')";
            } else {
                Tblmod = "SELECT g_itemcode AS Item_Code,g_grnno AS Grn_No,g_lot AS Lot_No ,sum(g_qnty) as Balance,g_transtype AS Type,g_expdate AS Expire ,Datediff(g_expdate,'" + format + "')as Dates_To_Expire from transaction_sub1 " //AND g_incode ='" + inscode + "'AND g_status ='" + confim + "'
                        + " GROUP BY g_itemcode,g_grnno,g_lot  HAVING g_itemcode ='" + icode + "'AND sum(g_qnty)<> 0 ORDER BY Datediff(g_expdate,'" + format + "')";

            }

            /*
             *
             *
             * DROP TABLE IF EXISTS `rmsd_db`.`transaction`; CREATE TABLE
             * `rmsd_db`.`transaction` ( `g_grnno` varchar(15) NOT NULL DEFAULT
             * '', `g_invoseno` varchar(15) NOT NULL DEFAULT '', `g_incode`
             * varchar(50) NOT NULL DEFAULT '', `g_ordercode` int(11) NOT NULL
             * DEFAULT '0', `g_date` date NOT NULL DEFAULT '0000-00-00',
             * `g_sysdate` date NOT NULL DEFAULT '0000-00-00', `g_year`
             * varchar(4) NOT NULL DEFAULT '0', `g_month` varchar(2) NOT NULL
             * DEFAULT '', `g_day` varchar(2) NOT NULL DEFAULT '', `g_warehose`
             * varchar(3) NOT NULL DEFAULT '', `g_section` varchar(5) NOT NULL
             * DEFAULT '', `g_lot` varchar(15) NOT NULL DEFAULT '', `g_packsize`
             * int(11) NOT NULL DEFAULT '0', `g_packs` int(11) NOT NULL DEFAULT
             * '0', `g_itemcode` varchar(8) NOT NULL DEFAULT '', `g_status`
             * varchar(10) NOT NULL DEFAULT '', `g_transtype` varchar(5) NOT
             * NULL DEFAULT '', `g_receipttype` varchar(5) NOT NULL DEFAULT '',
             * `g_initprice` double NOT NULL DEFAULT '0', `g_expdate` date NOT
             * NULL DEFAULT '0000-00-00', `g_qnty` double NOT NULL DEFAULT '0',
             * `g_Rqnty` double NOT NULL DEFAULT '0', `g_Iqnty` double NOT NULL
             * DEFAULT '0', `g_coment` varchar(250) NOT NULL DEFAULT '',
             * `g_user` varchar(10) NOT NULL DEFAULT '' ) ENGINE=MyISAM DEFAULT
             * CHARSET=latin1;
             */

            ResultSet executeQuery = rss.executeQuery(Tblmod);
            //  DefaultTableModel cvv = voidmodule.convertResultSetToTableMOdel(executeQuery);
            int columnWidth[] = {48, 75, 100, 75, 35, 100, 70};
            wans_javalib.Tables.setTableModel(executeQuery, tblgrn, Tblmod, columnWidth);
            //tblgrn.setModel(cvv);
            selectcolor();
        } catch (SQLException ex) {
            Logger.getLogger(frmshowgrn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void showgrn(String query) {
        Date grndate = null;
        Date expdate = null;
        String grn = null;
        String lot = null;
        String packsize = null;
        String nopack = null;
        String wh = null;
        String section = null;
        String icode = null;
        String name = null;
        String unit = null;
        double unitprize = 0;
        int qnty = 0;





        try {


            DefaultTableModel addabl = (DefaultTableModel) tblgrn.getModel();
            while (tblgrn.getRowCount() > 0) {
                addabl.removeRow(0);
            }


            Statement rss = dbconnector.conn().createStatement();
            ResultSet rs = rss.executeQuery(query);
            while (rs.next()) {

                // grndate = (Date) rs.getDate("dat");
                // expdate = (Date) rs.getDate("T.g_expdate");
                grn = rs.getString("T.g_grnno");
                lot = rs.getString("T.g_lot");
                // packsize = rs.getString("T.g_packsize");
                // nopack = rs.getString("T.g_packs");
                // wh = rs.getString("T.g_warehose");
                // section = rs.getString("T.g_section");
                icode = rs.getString("T.g_itemcode");
                name = rs.getString("S.d_name");
                // unit = rs.getString("S.d_unit");
                // unitprize = rs.getDouble("T.g_initprice");
                qnty = Integer.parseInt(rs.getString("bal"));

                //  addabl.addRow(new Object[]{icode, name, grndate, grn, lot, unitprize, qnty, packsize, nopack, expdate, unit});
                addabl.addRow(new Object[]{icode, name, null, grn, lot, null, qnty, null, null, null, null});
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmStock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void showexp(String Egrn, String Elot, String Eicode) {

        int expdate = 0;
        Double qnty = 0.0;

        try {



            String grn = null;
            String lot = null;
            Integer packsize = 0;
            Integer nopack = 0;
            String wh = null;
            String section = null;
            String icode = null;
            String temp = null;
            String rcpttype = null;
            String rtype = null;
            String itype = null;
            String Snull = null;
            int orderCode = 0;
            String cmmnts = null;
            double unitprize = 0;
            double dnull = 0;



            String grndate = null;
            String sysdate1 = null;
            String gmonth = null;
            String gday = null;
            String gyear = null;
            String expirddate = null;
            ResultSet rs = null;
            ResultSet rsx = null;

            Statement rss = dbconnector.conn().createStatement();
            Statement rssall = dbconnector.conn().createStatement();
            if (stores == true) {
                rs = rss.executeQuery("SELECT g_expdate,sum(g_qnty) as bal from transaction WHERE g_grnno ='" + Egrn + "'AND g_itemcode ='" + Eicode + "'AND g_lot ='" + Elot + "'");
                rsx = rssall.executeQuery("SELECT * from transaction WHERE g_grnno ='" + Egrn + "'AND g_itemcode ='" + Eicode + "'AND g_lot ='" + Elot + "'");
            } else {
                rs = rss.executeQuery("SELECT g_expdate,sum(g_qnty) as bal from transaction_sub1 WHERE g_grnno ='" + Egrn + "'AND g_itemcode ='" + Eicode + "'AND g_lot ='" + Elot + "'");
                rsx = rssall.executeQuery("SELECT * from transaction_sub1 WHERE g_grnno ='" + Egrn + "'AND g_itemcode ='" + Eicode + "'AND g_lot ='" + Elot + "'");
            }
            while (rs.next()) {


                DateFormat df = new SimpleDateFormat("yyyyMMdd");
                expdate = Integer.valueOf(df.format(rs.getDate("g_expdate")));
                qnty = Double.parseDouble(rs.getString("bal"));
            }
            lblexpdate.setText(expdate + "");

            while (rsx.next()) {
                grndate = rsx.getDate("g_date").toString();
                sysdate1 = rsx.getDate("g_sysdate").toString();
                grn = rsx.getString("g_grnno");
                lot = rsx.getString("g_lot");
                packsize = rsx.getInt("g_packsize");
                nopack = rsx.getInt("g_packs");
                wh = rsx.getString("g_warehose");
                section = rsx.getString("g_section");
                icode = rsx.getString("g_itemcode");
                unitprize = rsx.getDouble("g_initprice");
                gmonth = rsx.getString("g_month");
                gday = rsx.getString("g_day");
                gyear = rsx.getString("g_year");
                DateFormat dff = new SimpleDateFormat("yyyy-MM-dd");
                expirddate = dff.format(rsx.getDate("g_expdate"));
                Snull = "-";
                temp = "temp";
                rcpttype = rsx.getString("g_receipttype");
                rtype = "R";
                itype = "I";
                Snull = "-";
                orderCode = 0;

            }






            int SelectedRow = tblgrn.getSelectedRow();
            Date date = new Date();
            DateFormat df = new SimpleDateFormat("yyyyMMdd");
            int sysdate = Integer.valueOf(df.format(date).toString());




            if (expdate <= (sysdate)) {
                frmExpired open = new frmExpired();
                MDI.jDesktopPane1.add(open);
                open.setVisible(true);
                if (stores == true) {
                    open.stores = true;
                } else {
                    open.stores = false;
                }
                open.ob_Enable();
                open.setuser(User, expirddate);
                open.getexpsave(grn, Snull, orderCode, grndate, sysdate1, gyear, gmonth, gday, wh, section, lot, packsize, nopack, icode, rtype, rcpttype, unitprize, expirddate, qnty, dnull, cmmnts);

            } else {
                //  jLabel1.setText("No");
            }

        } catch (SQLException ex) {
            Logger.getLogger(frmStock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnapply;
    private javax.swing.JButton btnexit;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label lbl15;
    private java.awt.Label lbl30;
    private java.awt.Label lbl365;
    private java.awt.Label lbl366;
    private java.awt.Label lbl90;
    private javax.swing.JLabel lblexpdate;
    private java.awt.Label lblexprd;
    private javax.swing.JLabel lblgrn;
    private javax.swing.JLabel lblicode;
    private javax.swing.JLabel lbllot;
    private javax.swing.JLabel lblqnty;
    private java.awt.Label lblselect;
    private javax.swing.JTable tblgrn;
    // End of variables declaration//GEN-END:variables
}
