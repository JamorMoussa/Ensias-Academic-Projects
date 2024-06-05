package Exo3;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;


public class HorlogeThreadInterface implements Runnable{
	
	public HorlogeGraphique hg;

	@Override
	public void run() {
		
	    hg.timer = new Timer(1000, e -> {
            	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            	hg.horlogeLabel.setText(sdf.format(new Date()));
            });
		
	    hg.timer.start();
	}
}
