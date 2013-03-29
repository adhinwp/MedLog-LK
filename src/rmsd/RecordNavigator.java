/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rmsd;

import com.mysql.jdbc.*;
import java.sql.ResultSet;
import java.sql.SQLException;



import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author wan(W.M.S.P. Wanasinghe)
 */
public class RecordNavigator extends JSpinner{

    JSpinner spinner1;
    Connection con1;
    String sql1;
    SpinnerModel model;
    ResultSet rs;

    /**
     * 
     * @param spinner
     * @param con
     * @param sql
     */
    public RecordNavigator(JSpinner spinner, Connection con, String sql) {

        spinner1 = spinner;
        con1 = con;
        sql1 = sql;

        try {
            Statement createStatement = (Statement) con.createStatement();
            rs = createStatement.executeQuery(sql);
            int min;
            int initValue;
            int max;
            int step;
            boolean last = rs.last();
            int row = rs.getRow();



            if (row == 0) {
                min = 0;
                initValue = 0;
                max = 0;
                step = 0;
            } else if (row == 1) {

                min = 0;
                initValue = 1;
                max = 1;
                step = 1;
            } else {
                min = 1;
                initValue = 1;
                max = row;
                step = 1;
            }





            model = new SpinnerNumberModel(initValue, min, max, step);
            spinner1.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(RecordNavigator.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

    /**
     * 
     * @param con
     * @param sql
     */
    public RecordNavigator(Connection con, String sql) {
         con1 = con;
        sql1 = sql;
    }

    /**
     * 
     * @param field
     * @param val
     * @throws SQLException
     */
    public void setSpinnerValue(JTextField field, Object val) throws SQLException {


        spinner1.setValue(val);
    }

    /**
     * 
     * @return
     */
    public Object[] getRecord() {
        Object[] ob = null;

        try {
            if (spinner1.getValue() == "0") {
                ob = null;



            } else {






                Object value = spinner1.getValue();
                int parseInt = Integer.parseInt(value.toString());

                ResultSetMetaData metaData = (ResultSetMetaData) rs.getMetaData();
                int columnCount = metaData.getColumnCount();

                boolean absolute = rs.absolute(parseInt);
                ob = new Object[columnCount];

                for (int i = 0; i < columnCount; i++) {
                    //String columnTypeName = metaData.getColumnTypeName(i + 1);
                    int columnType = metaData.getColumnType(i + 1);
                    if (columnType == 91) {

                        ob[i] = rs.getDate(i + 1);


                    } else {


                        if (rs.getObject(i + 1) == null) {


                            ob[i] = "";
                        } else {
                            ob[i] = rs.getObject(i + 1);
                        }
                    }
                }
            }

        } catch (SQLException ex) {
           
        }
        return ob;
    }
    /**
     * 
     * @param row
     * @return
     */
    public Object[] getRecord(int row) {
        Object[] ob = null;

        try {
//            if (spinner1.getValue() == "0") {
//                ob = null;
//
//
//
//            } else {






                Object value = row;
                int parseInt = Integer.parseInt(value.toString());

                ResultSetMetaData metaData = (ResultSetMetaData) rs.getMetaData();
                int columnCount = metaData.getColumnCount();

                boolean absolute = rs.absolute(parseInt);
                ob = new Object[columnCount];

                for (int i = 0; i < columnCount; i++) {
                    String columnTypeName = metaData.getColumnTypeName(i + 1);
                    int columnType = metaData.getColumnType(i + 1);
                    if (columnType == 91) {

                        ob[i] = rs.getDate(i + 1);


                    } else {


                        if (rs.getObject(i + 1) == null) {


                            ob[i] = "";
                        } else {
                            ob[i] = rs.getObject(i + 1);
                        }
                    }
                }
//            }

        } catch (SQLException ex) {
            
        }
        return ob;
    }
}
