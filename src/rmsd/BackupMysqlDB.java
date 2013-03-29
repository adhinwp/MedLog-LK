//Copyright (c) 2012, Provincial Department of Health Services, North western province, Sri Lanka
//All rights reserved.
package rmsd;

import java.io.IOException;
import javax.swing.JOptionPane;
import mymod.dbconnector;

public class BackupMysqlDB {

    static String xmysqlPath;
    static String xuser;
    static String xpassword;
    static String xdatabaseName;
    static String xbackupFileName;

    public BackupMysqlDB() {
    }

    void backup(String mysqlPath, String user, String password, String databaseName, String backupFileName) {


        try {
            Runtime rt = Runtime.getRuntime();

            rt.exec(mysqlPath + "\\bin\\mysqldump -u" + user + " -p" + password + " " + databaseName + " -r  " + backupFileName + "\\" + databaseName + ".sql");
            xmysqlPath = mysqlPath;
            xuser = user;
            xpassword = password;
            xdatabaseName = databaseName;
            xbackupFileName = backupFileName;

            JOptionPane.showMessageDialog(null, "Backup completed successfully !!!");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    static void restore() {
    }

    public static void main(String[] args) {
        try {
            Runtime rt = Runtime.getRuntime();
            String setdb = dbconnector.db;

            String resre[] = new String[]{"mysql", setdb, "--user=root", "--password=weeranimal", "-e", " source D:/Backup/20111208surgical_db.sql"};
            rt.exec(resre);
            //rt.exec("C:\\Program Files\\MySQL\\MySQL Server 5.0\\bin\\mysql -uroot -pnimal " + setdb + " <  D:/Backup/sqlbackup/20111208surgical_db.sql");
            // rt.exec("C:\\Program Files (x86)\\MySQL\\MySQL Server 5.1\\bin\\mysql -uroot -p123 payroll <  c:/backupdb/payroll.sql");

        } catch (IOException ioe) {
        } catch (Exception e) {
        }
    }
}
