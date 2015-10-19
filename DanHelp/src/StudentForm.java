// StudentGradeForm.java
// Dan Fratiloiu
// A file record.txt will be generated 




import java.io.*;
import java.util.*;

public class StudentForm extends javax.swing.JFrame
	{
    // Creates new StudentGradeForm 
    public StudentForm()
	 {
        initComponents();
    }
    // Initialize the form.
    @SuppressWarnings("unchecked")
    
    private void initComponents() 
	 {
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        assignmentName = new javax.swing.JTextField();
        sGrade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        clearFormButton = new javax.swing.JButton();
        calculateButton = new javax.swing.JButton();
        printToFileButton = new javax.swing.JButton();
        enterDataButton = new javax.swing.JButton();

        jLabel1.setText("jLabel1");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jLabel2.setText("Student Grade Form");
        jLabel3.setText("Assignment Name:");
        jLabel5.setText("Student's Grade:");
        clearFormButton.setText("Clear Form");
        clearFormButton.addActionListener(new java.awt.event.ActionListener()
		   {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
				{
                clearFormButtonActionPerformed(evt);
            }
         });
        calculateButton.setText("Calculate/prints out");
        calculateButton.addActionListener(new java.awt.event.ActionListener()
		   {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
				{
      			File file = new File("record.txt");
        			StringBuffer contents = new StringBuffer();
        			BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(file));
            String text = null;

            // repeat until for all lines 
            while ((text = reader.readLine()) != null) {
                contents.append(text)
                    .append(System.getProperty(
                        "line.separator"));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        // show file contents here
        System.out.println(contents.toString());
    }
          
					
         });

        printToFileButton.setText("Save to record.txt");
        printToFileButton.addActionListener(new java.awt.event.ActionListener() 
		  {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
				{
                printToFileButtonActionPerformed(evt);
            }
         });

        enterDataButton.setText("New entry");
        enterDataButton.addActionListener(new java.awt.event.ActionListener() 
		  {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
				{
                enterDataButtonActionPerformed(evt);
            }
         });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(assignmentName, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(sGrade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(clearFormButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(calculateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(printToFileButton))
                .addGap(58, 58, 58))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(233, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(212, 212, 212))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addComponent(enterDataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignmentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(clearFormButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignmentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(calculateButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(printToFileButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(enterDataButton)
                .addContainerGap())
        );

        pack();
    }
	 private void clearFormButtonActionPerformed(java.awt.event.ActionEvent evt) 
	 {                                         
        assignmentName.setText("");
        //lName.setText("");
        sGrade.setText("");

    }                                        
	 private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) 
	 {                                         
          System.exit(0);
    }                                        
 	// Save data to file record.txt
    private void printToFileButtonActionPerformed(java.awt.event.ActionEvent evt) 
	 {                                         
        FileOutputStream out; // declare a file output object
        PrintStream p; // declare a print stream object

        try
                {
                        // Create a new file output stream
                        out = new FileOutputStream("record.txt");

                        // Connect print stream to the output stream
                        p = new PrintStream( out );

                        p.println ("Assignment Name and Grade");
                        for (StudentRecord rec : studentRecordList) {
                            p.println(rec);

                        }


                        p.close();
                }
                        catch (Exception e)
                {
                        System.err.println ("Error writing to file");
                }


    }                                        

    private void enterDataButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        String AssigName;
       // String lastName;
        double gradeStudent;
        AssigName = assignmentName.getText();
       // lastName = lName.getText();
        gradeStudent = Double.parseDouble(sGrade.getText());

        // create a Student Record object
        
			StudentRecord studentRecord = new StudentRecord(AssigName, gradeStudent);
        // Add elements to array list
        studentRecordList.add(studentRecord);

        assignmentName.setText("");
       // lName.setText("");
        sGrade.setText("");    }                                        

    // Create an array list that can grow as data is input by user
    ArrayList<StudentRecord> studentRecordList = new ArrayList<StudentRecord>();
   
      public static void main(String args[]) {
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() 
				{
                new StudentForm().setVisible(true);
            }
        });

    }

    // Variables declaration     
	 private javax.swing.JTextField assignmentName;
    private javax.swing.JButton clearFormButton;
    private javax.swing.JButton enterDataButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField sGrade;
    private javax.swing.JButton printToFileButton;
    private javax.swing.JButton calculateButton;
    private javax.swing.JTextField lName;
    
	 // End of variables declaration

}