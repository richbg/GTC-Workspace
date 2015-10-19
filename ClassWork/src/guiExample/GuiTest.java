package guiExample;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GuiTest extends JFrame {
	
	GuiTest() {
		JLabel label = new JLabel("Hi There");
		
		add(label);
		setSize(100, 100);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		GuiTest myBox = new GuiTest();

	}

}
