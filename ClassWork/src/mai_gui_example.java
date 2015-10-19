import java.awt.*; 
import java.awt.event.*;
 
public class mai_gui_example extends Frame{ 

  TextField textfield1; 
  TextField textfield2; 
  Button button;
  TextArea textarea = new TextArea ("blank",15,15,15);
  
  String temp; 
 
  public mai_gui_example() { 

    setSize(600, 400); 
    setLayout(new FlowLayout()); 
 
    textfield1 = new TextField("one", 4); 
    textfield2 = new TextField("two", 4); 

    button = new Button("Click Me");
	  
    add(textfield1);
	 add(button); 
    add(textfield2);
    add(textarea);
	 


    addWindowListener( new WindowAdapter() 
	 { 
      public void windowClosing(WindowEvent e) 
		{ 
        System.exit(0); 
      } 
    }
	 );

	  
    button.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent e) { 

			temp = textfield2.getText();
			textfield2.setText(textfield1.getText() );	
			textfield1.setText(temp);
			textarea.append("GUI is cool \n");
			
			
			
			
			
			

      } 
    }); 
  } 

  public static void main(String[] args) { 
    mai_gui_example myGuiExampleObject = new mai_gui_example(); 
    myGuiExampleObject.setVisible(true); 
  } 
} 
