
//Copyright (c) 2012, Provincial Department of Health Services, North western province, Sri Lanka
//All rights reserved.
package rmsd;


import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.Timer;

public class AppletTimer {
    Timer timer;
    int n;
    String s;
    SimpleDateFormat timef = new SimpleDateFormat("HH:mm:ss");

    public AppletTimer(final JLabel tf) {
        timer = new Timer(1000, new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                n = n + 1;
                s = timef.format(new Date(System.currentTimeMillis()));
                //ap.showStatus(s);
                tf.setText(s);

            }
        });
        timer.start();
    }

    public AppletTimer( final JProgressBar nn) {
        timer = new Timer(1000, new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (n == 99) {
                    timer.stop();
                }
                n = n + 1;

                nn.setValue(n);
            }
        });
        timer.start();
    }
    
    

}
