import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class guiTest3 extends Frame {

	TextField textfield1, textfield2;
	Button button;
	TextArea textarea = new TextArea("Palindrome Results: \n", 35, 35, 35);

	public guiTest3() {

		setSize(350, 350);
		setTitle("Test 3 Palindrome");
		setLayout(new FlowLayout());
		textfield1 = new TextField("", 10);
		textfield2 = new TextField("", 10);
		button = new Button("Click Me");
		add(textfield1);
		add(textfield2);
		add(button);
		add(textarea);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp1;
				String temp2;
				temp1 = textfield1.getText();
				temp2 = textfield2.getText();
				textarea.append("String 1 is a palindrome? "
						+ Palindrome_Rich.palindromeCheck(temp1));
				textarea.append("\n");
				textarea.append("String 2 is a palindrome? "
						+ Palindrome_Rich.palindromeCheck(temp2));
				textarea.append("\n");

			}
		});
	}

	public static void main(String[] args) {
		guiTest3 myGuiExampleObject = new guiTest3();
		myGuiExampleObject.setVisible(true);

	}
}
