
public class Chapter5Examples {


	public static void main(String[] args) {

		int option = 3; 

		switch(option)
		{
		case 1:
			System.out.println("You selected 1");
			break;
		case 2:
			System.out.println("You selected 2");
			break;
		case 3:
			System.out.println("you selected 3");
			break;
		default:
			System.out.println("out of range");
		}


		//print out just the even numbers
		for (int round = 50; round >=0; round--)
		{
			if ( (round % 2 ) == 0 ) 
				System.out.println(round);
		}

		
		//print out just the odd numbers
				for (int round = 50; round >=0; round--)
				{
					if ( (round % 2 ) != 0 ) 
						System.out.println(round);
				}
	}

}
