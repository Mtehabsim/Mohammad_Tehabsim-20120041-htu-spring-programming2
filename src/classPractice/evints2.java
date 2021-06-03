package classPractice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class evints2 {
	static int count = 0;
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel("0");
		JButton btn = new JButton("+1");
		JButton btn2 = new JButton("-1");
		frame.setSize(250, 100);
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				++count;
				label.setText(""+count);
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				--count;
				label.setText(""+count);
			}
		});
		panel.add(btn);
		panel.add(label);
		panel.add(btn2);
		frame.add(panel);
		frame.setVisible(true);
	}
}
