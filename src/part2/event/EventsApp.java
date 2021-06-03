package part2.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EventsApp {
public static int counter = 1;
	/**
	 * 
	 */
	public static void GUI() {
		JFrame frame = new JFrame();
		frame.setSize(800, 400);
		JLabel label = new JLabel("NUMBER OF CLICKS 0");
		JPanel panel = new JPanel();
		
		
		
		JButton button = new JButton("Number of clicks: ");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("NUMBER OF CLICKS "+ counter);
				counter++;
			}
		});
		
		
		
		panel.add(button);
		panel.add(label);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("RandomSHit");
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		GUI();
		
		
		
	}
}
