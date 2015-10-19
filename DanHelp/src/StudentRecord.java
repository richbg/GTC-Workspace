// Dan Fratiloiu
// StudentRecord class maintains information for one assignment 




public class StudentRecord
{

   private String assignmentName;
   private double sGrade;

   // default values
   public StudentRecord()
   {
      this(  "", 0 ); // call two-argument constructor
   } 

   // initialize a record
   public StudentRecord( String assignmentName, double sGrade )
   {
      setName(  assignmentName );
      setstudentGrade( sGrade );
   } 
   public void setName( String name )
   {
      assignmentName = name;
   } 
	 
	public void setstudentGrade( double studentGrade )
   {
      sGrade = studentGrade;
   } 
	public String getName()
   {
       return assignmentName;
   } 
		public double getstudentGrade()
   {
       return sGrade;
   } 
   public String toString()
	 {
    return (assignmentName +  " " + sGrade);
	 }
 }