import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class chapter9 extends Frame implements ActionListener {
	JButton button_1;
	JTextField textfield_1;
	JTextField textfield_2;
	JTextField textfield_3;
	JTextField textfield_4;
	JTextField textfield_5;
	JTextArea textarea_1;
	JScrollPane sp_textarea_1;
	
	int flagError = 0;
	Boolean isEven = false;

	int[] myArray = new int[5];

	public chapter9() {
		chapter9Layout customLayout = new chapter9Layout();

		setFont(new Font("Helvetica", Font.PLAIN, 12));
		setLayout(customLayout);

		button_1 = new JButton("Run");
		add(button_1);

		textfield_1 = new JTextField("");
		add(textfield_1);

		textfield_2 = new JTextField("");
		add(textfield_2);

		textfield_3 = new JTextField("");
		add(textfield_3);

		textfield_4 = new JTextField("");
		add(textfield_4);

		textfield_5 = new JTextField("");
		add(textfield_5);

		textarea_1 = new JTextArea("");
		sp_textarea_1 = new JScrollPane(textarea_1);
		add(sp_textarea_1);

		setSize(getPreferredSize());

		button_1.addActionListener(this);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public void actionPerformed(ActionEvent e) {
		readInData();
		evalArray();
		doBubbleSort();
		displayResult();
		flagError = 0;
	}

	private void evalArray() { // evaluates the array

		if (myArray[0] % 2 == 0 && myArray[1] % 2 == 0 && myArray[2] % 2 == 0  // checks array elements for even numbers
				&& myArray[3] % 2 == 0 && myArray[4] % 2 == 0) {
			isEven = true;
		} else if (myArray[0] % 2 != 0 && myArray[1] % 2 != 0 // checks array elements for odd numbers
				&& myArray[2] % 2 != 0 && myArray[3] % 2 != 0
				&& myArray[4] % 2 != 0) {
			isEven = false;
		} else {  // Array elements are mixed even & odd integers
			flagError = 3;
		}
	}

	public void doBubbleSort() {  // doBubbleSort sort on Even or Odd integers, uses method sort to perform the sorting
		int temp = 0;
		for (int counter = 0; counter < myArray.length - 1; counter++) {
			for (int index = 0; index < myArray.length - 1 - counter; index++) {
				if(isEven){
					if (myArray[index] > myArray[index + 1]) {
						sort(index);
					}
				} else{
					if (myArray[index] < myArray[index + 1]) {
						sort(index);
					}					
				}
			}
		}
	}

	private void sort(int index) { // sorts the array supplied moved from doBubbleSort to make code cleaner
		int temp;
		temp = myArray[index];
		myArray[index] = myArray[index + 1];
		myArray[index + 1] = temp;
	}

	public void readInData() {  //method calls readField requires textfield variable and array index variable
		readField(textfield_1, 0);
		readField(textfield_2, 1);
		readField(textfield_3, 2);
		readField(textfield_4, 3);
		readField(textfield_5, 4);
	}

	private void readField(JTextField textField, int index) {  // created method readField to cleanup readInData
		try {
			if (textField.getText().matches("^[-+]?\\d+(\\.\\d+)?$")) { // get the text field, match against regex for String data
				myArray[index] = Integer.parseInt(textField.getText());
			} else {
				flagError = 1; // errorFlag for string data entered
			}

		} catch (NumberFormatException nfe) {
			flagError = 2; // errorFlag for nfe, non integer

		}
	}

	public void displayResult() {
		// textarea_1.setText("\n");

		if (flagError == 1) {
			textarea_1.setText("Only Enter Whole Numbers" + "\n");
		} else if (flagError == 2) {
			textarea_1.setText("The number is not valid" + "\n");
		} else if (flagError == 3) {
			textarea_1.setText("Mixed values." + "\n");
		} else {

			textarea_1.setText("");
			for (int i = 0; i < myArray.length; i++) {
				textarea_1.append(myArray[i] + "\n");
			}
		}

	}

	public static void main(String args[]) {
		chapter9 window = new chapter9();

		window.setTitle("chapter9");
		window.pack();
		window.setVisible(true);  //changed from window.show to window.SetVisible(true) instead of suppress warnings on method 
	}
}

class chapter9Layout implements LayoutManager {

	public chapter9Layout() {
	}

	public void addLayoutComponent(String name, Component comp) {
	}

	public void removeLayoutComponent(Component comp) {
	}

	public Dimension preferredLayoutSize(Container parent) {
		Dimension dim = new Dimension(0, 0);

		Insets insets = parent.getInsets();
		dim.width = 187 + insets.left + insets.right;
		dim.height = 466 + insets.top + insets.bottom;

		return dim;
	}

	public Dimension minimumLayoutSize(Container parent) {
		Dimension dim = new Dimension(0, 0);
		return dim;
	}

	public void layoutContainer(Container parent) {
		Insets insets = parent.getInsets();

		Component c;
		c = parent.getComponent(0);
		if (c.isVisible()) {
			c.setBounds(insets.left + 96, insets.top + 136, 72, 24);
		}
		c = parent.getComponent(1);
		if (c.isVisible()) {
			c.setBounds(insets.left + 8, insets.top + 8, 72, 24);
		}
		c = parent.getComponent(2);
		if (c.isVisible()) {
			c.setBounds(insets.left + 8, insets.top + 40, 72, 24);
		}
		c = parent.getComponent(3);
		if (c.isVisible()) {
			c.setBounds(insets.left + 8, insets.top + 72, 72, 24);
		}
		c = parent.getComponent(4);
		if (c.isVisible()) {
			c.setBounds(insets.left + 8, insets.top + 104, 72, 24);
		}
		c = parent.getComponent(5);
		if (c.isVisible()) {
			c.setBounds(insets.left + 8, insets.top + 136, 72, 24);
		}
		c = parent.getComponent(6);
		if (c.isVisible()) {
			c.setBounds(insets.left + 8, insets.top + 176, 168, 280);
		}
	}
}
