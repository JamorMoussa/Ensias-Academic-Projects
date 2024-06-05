package Exo3;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class HorlogeGraphique extends JFrame{

	private static final long serialVersionUID = 1L;

	public Timer timer;
	public JLabel horlogeLabel;
	
	public HorlogeGraphique() {
		this.setSize(200, 200);
		
		horlogeLabel = new JLabel();
		
		this.setContentPane(horlogeLabel);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}