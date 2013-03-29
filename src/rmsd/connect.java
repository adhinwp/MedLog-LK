/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rmsd;

import com.mysql.jdbc.Connection;
import wans_javalib.ConnectMySql;

/**
 *
 * @author wan
 */
public class connect {
static  String host;
static  String user;
static  String pass;
static  String dbname;
static int port;
public static Connection con1;

    public connect() {
       
       
    }
   public static void setConnection (){
        wans_javalib.ConnectMySql cm = new ConnectMySql(host, dbname,port,user,  pass);
        con1 = cm.getConnection();
      //return con1;
   }
   
}
