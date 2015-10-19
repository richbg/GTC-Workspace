import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class chapter9 extends Frame implements ActionListener{
    JButton button_1;
    JTextField textfield_1;
    JTextField textfield_2;
    JTextField textfield_3;
    JTextField textfield_4;
    JTextField textfield_5;
    JTextArea textarea_1;
    JScrollPane sp_textarea_1;
    
    int[] myArray = new int[5];
    int[] oddArray = {0,0,0,0,0};
    int[] evenArray = {0,0,0,0,0};
    String temp = "";
    
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

    public void actionPerformed(ActionEvent e) 
    {
    	readInData();
    	doBubbleSortAscending();
    	doBubbleSortDescending();
    	displayResult();	
	}

    public void doBubbleSortAscending() 
    {
    	int temp = 0;
    	
    	for(int counter=0; counter<myArray.length-1; counter++)
    	{ 
            for(int index=0; index<myArray.length-1-counter; index++) 
            { 
                if(myArray[index] > myArray[index+1]) 
                { 
                    temp = myArray[index]; 
                    myArray[index] = myArray[index+1];
                    myArray[index+1] = temp;
                }
            }
        }
	}
    
    public void doBubbleSortDescending() 
    {
    	int temp = 0;
    	
    	for(int counter=0; counter<myArray.length-1; counter++)
    	{ 
            for(int index=0; index<myArray.length-1-counter; index++) 
            { 
                if(myArray[index] < myArray[index+1]) 
                { 
                    temp = myArray[index]; 
                    myArray[index] = myArray[index+1];
                    myArray[index+1] = temp;
                }
            }
        }
	}


	
    public void readInData()  {
    	try{  	
    		myArray[0] = Integer.parseInt(textfield_1.getText());
    	}
    	catch(NumberFormatException nfe)
    	{
    		System.out.println("The first number is not valid");
    	}
    	if(myArray[0] % 2 == 0)
    		evenArray[0] = myArray[0];
    	else
    		oddArray[0] = myArray[0];
    	try{  	
    		myArray[1] = Integer.parseInt(textfield_2.getText());
    	}
    	catch(NumberFormatException nfe)
    	{
    		System.out.println("The second number is not valid");
    	}
    	if(myArray[1] % 2 == 0)
    		evenArray[1] = myArray[1];
    	else
    		oddArray[1] = myArray[1];
    	try{  	
    		myArray[2] = Integer.parseInt(textfield_3.getText());
    	}
    	catch(NumberFormatException nfe)
    	{
    		System.out.println("The third number is not valid");
    	}
    	if(myArray[2] % 2 == 0)
    		evenArray[2] = myArray[2];
    	else
    		oddArray[2] = myArray[2];
    	try{  	
    		myArray[3] = Integer.parseInt(textfield_4.getText());
    	}
    	catch(NumberFormatException nfe)
    	{
    		System.out.println("The fourth number is not valid");
    	}
    	if(myArray[3] % 2 == 0)
    		evenArray[3] = myArray[3];
    	else
    		oddArray[3] = myArray[3];
    	try{  	
    		myArray[4]= Integer.parseInt(textfield_5.getText());
    	}
    	catch(NumberFormatException nfe)
    	{
    		System.out.println("The fifth number is not valid");
    	}
    	if(myArray[4] % 2 == 0)
    		evenArray[4] = myArray[4];
    	else
    		oddArray[4] = myArray[4];

    	for(int i = 0 ; i < 5 ; i++)
    	{
    		if(evenArray[i] != 0)
    		{
    			doBubbleSortAscending();
    		}

    		if(oddArray[i] != 0)
    		{
    			doBubbleSortDescending();
    		}

    	}
    }

    public void displayResult() 
    {
    	textarea_1.setText("\n");
    	
		for (int i = 0; i < myArray.length; i++) 
		{
    		textarea_1.append(myArray[i] + "\n");
		}    	  	
	}

   	
    @SuppressWarnings("deprecation")
	public static void main(String args[]) {
        chapter9 window = new chapter9();

        window.setTitle("chapter9");
        window.pack();
        window.show();
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
        if (c.isVisible()) {c.setBounds(insets.left+96,insets.top+136,72,24);}
        c = parent.getComponent(1);
        if (c.isVisible()) {c.setBounds(insets.left+8,insets.top+8,72,24);}
        c = parent.getComponent(2);
        if (c.isVisible()) {c.setBounds(insets.left+8,insets.top+40,72,24);}
        c = parent.getComponent(3);
        if (c.isVisible()) {c.setBounds(insets.left+8,insets.top+72,72,24);}
        c = parent.getComponent(4);
        if (c.isVisible()) {c.setBounds(insets.left+8,insets.top+104,72,24);}
        c = parent.getComponent(5);
        if (c.isVisible()) {c.setBounds(insets.left+8,insets.top+136,72,24);}
        c = parent.getComponent(6);
        if (c.isVisible()) {c.setBounds(insets.left+8,insets.top+176,168,280);}
    }
}

