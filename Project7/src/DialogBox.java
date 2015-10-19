import javax.swing.*;
import java.awt.event.*;

public class DialogBox {
	JFrame frame;

	public static void main(String[] args) {
		DialogBox db = new DialogBox();
	}

	public DialogBox() {
		frame = new JFrame("Show Message");
		JButton button = new JButton("Click Me");
		button.addActionListener(new MyAction());
		frame.add(button);
		frame.setSize(200, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public class MyAction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(frame, "I like Java");
		}
	}
}