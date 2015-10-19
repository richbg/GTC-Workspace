/* Assignment: Test 1 
 * Author: Benjamin G. Rich
 * 
 * Class Customer
 * 
 */

public class Customer {
	
	private String firstName = "none";
	private String lastName = "none";
	private String emailAddress = "none";
	private String phoneNumber = "none";
	private  int age = 0;
	
	
	public Customer()
	{
		
		
	}
	
	public Customer(String nName, String nLastName, String nAddress, String nEmail, String nPhone, int nAge)
	{
		firstName = nName;
		lastName = nLastName;
		emailAddress = nEmail;
		phoneNumber = nPhone;
		age = nAge;	
	
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}
	
	
	public  int calculateRetirementYears ( int retireOption ){
	   if ( retireOption == 1)
	   {
		   retireOption = 62 - getAge();
		   
	   }else if (retireOption == 2)
	   {
		   retireOption = 65 - getAge();
	   }
		   
	return retireOption;

		
	}
	




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public String getEmailAddress() {
		return emailAddress;
	}




	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}




	public String getPhoneNumber() {
		return phoneNumber;
	}




	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}




	public  int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}
	
	
}
