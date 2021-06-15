package part2.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EventsApp {
static int count = 18;
	public static void GUI() {
		JFrame frame = new JFrame();
		frame.setSize(200, 200);
		JTextField txt = new JTextField(6);
		JTextField txt2 = new JTextField(6);
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Your Name");
		JLabel label3 = new JLabel("18");
		
		JLabel label1 = new JLabel("Your Email");
		
		JLabel label2 = new JLabel("Your age");
		JButton button = new JButton("+1");
		JButton btn2 = new JButton("-1");
		JButton finalButton = new JButton("Submit");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				++count;
				label3.setText(""+count);
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				--count;
				label3.setText(""+count);
			}
		});
		
		finalButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = ""; 
				name = txt.getText();
				String email = txt2.getText();
				
				
				JOptionPane.showMessageDialog(null,"Hello " + name + "\nwe sent you a message on "+ email +"\n your age is "+count+"\n successfully submit");
				
			
			}
		});
		
		panel.add(label);
		panel.add(txt);
		panel.add(label1);
		panel.add(txt2);
		panel.add(label2);
		panel.add(button);
		panel.add(label3);
		panel.add(btn2);
		panel.add(finalButton);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("SignUp");
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		GUI();
		
		
		
	}
}
