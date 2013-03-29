//Copyright (c) 2012, Provincial Department of Health Services, North western province, Sri Lanka
//All rights reserved.
package rmsd;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.Inet4Address;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPasswordField;

public class saf {

    public static void main(String[] args) {
        saf a = new saf();
        a.createsaf();
    }

    void createsaf() {
        try {
            File cfile = new File("D:\\letter\\SAF.DLL");
            try {
                cfile.createNewFile();
            } catch (IOException ex) {
            }

             String comname  = Inet4Address.getLocalHost().getHostName();
            FileWriter wfile = new FileWriter(cfile);
            wfile.write(comname);


            wfile.flush();
            wfile.close();
            System.exit(0);
            System.out.println("key is Created");
        } catch (IOException ex) {
            Logger.getLogger(frmsetdb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}