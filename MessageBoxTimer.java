import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.event.*;

public class MessageBoxTimer {
	JFrame frame;

	public static void main(String[] args) {
		MessageBoxTimer db = new MessageBoxTimer();
	}

	public MessageBoxTimer() {
		frame = new JFrame("Krishna");
		JButton button = new JButton("Click");
		//button.setAlignmentX((float) 100.00);

		//button.addActionListener(new MyAction());
		frame.add(button);
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//	public class MyAction implements ActionListener {
	//public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(frame, "HEllo your time is Up");
		//}
	//}}}
}
	}