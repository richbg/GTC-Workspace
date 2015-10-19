import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
  public static void main(String[] a) throws Exception{

    DateFormat df = new SimpleDateFormat ("h:mm a");
    DateFormat df2 = new SimpleDateFormat ("yyyyy.MMMMM.dd GGG hh:mm aaa");


    Date d1 = df.parse("10:08 PM");
    Date d2 = df.parse("11:08 PM");

    Date d3 = df2.parse("02001.July.04 AD 12:08 PM");

    String relation = "unsure";
    if (d1.equals(d2))
      relation = "the same date as";
    else if (d1.before(d2))
      relation = "before";
    else if (d1.after(d2))
      relation = "after";
		
		
    System.out.println(d1.getHours() + ":" + d1.getMinutes() 
	  + " is " + relation + " " +
	  d2.getHours() + ":" + d2.getMinutes()  );

	 SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, MMM d, yyyy"); 
	 System.out.println("Ben " + d3.getTime());
 	 System.out.println( simpleDateFormat.format( d3.getTime() ) );

	 SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("h:mm a");
    System.out.println( simpleDateFormat2.format( d1.getTime() ) 
	  + " is " + relation + " " +
	 simpleDateFormat2.format( d2.getTime() )	 );

	 SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyyy.MMMMM.dd GGG hh:mm aaa"); 
 	 System.out.println( simpleDateFormat3.format( d3.getTime() ) );

  }
}