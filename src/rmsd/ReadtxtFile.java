//Copyright (c) 2012, Provincial Department of Health Services, North western province, Sri Lanka
//All rights reserved.

package rmsd;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import javax.swing.JOptionPane;


public class ReadtxtFile {

    public static void main(String[] args) {
        //H:\RMSD
        createDatabase("H:\\RMSD\\readFile.txt");
    }
    public static void createDatabase(String sqlTextFileName) {
        try {

            File f = new File(sqlTextFileName);
            FileReader r = new FileReader(f);
            FileInputStream inp = new FileInputStream(f);

            BufferedReader b = new BufferedReader(r);
            String sql = "";
            whileloop:
            while (inp.read() != -1) {

                String readLine = b.readLine();

                if (readLine == null) {
                    break;
                }
               // char charAt1;

                if (readLine.length() > 0) {
                    char charAt = readLine.charAt(0);
                    if (charAt != '#') {
                        System.out.println("" + readLine.trim());
//                        for (int i = 0; i < readLine.length(); i++) {
//                            charAt1 = readLine.charAt(i);
//                        }
                        // System.out.println("" + readLine.length());
                        //System.out.println("" + charAt);
                    }

                }

//                if (charAt != '#'){
//                    sql = readLine;
//                    System.out.println(""+readLine);
//                }


//                if (charAt == '#') {
//                    if ("".equals(sql)) {
//
//                        sql = readLine;
//
//                    } else {
//                        sql = sql + readLine;
//
//                    }
//                    //System.out.println(sql);
//             //       runsql(c sql);
//                    sql = "";
//                    continue whileloop;
//                }
//                if ("".equals(sql)) {
//
//                    sql = readLine;
//
//                } else {
//                    sql = sql + readLine;
//
//                }
                continue whileloop;
            }
        } catch (Exception ex) {
            //Logger.getLogger(MysqlConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, null, JOptionPane.WARNING_MESSAGE, null);
        }

    }
}
