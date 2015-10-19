
public class ArrayExample {

	
	public static void main(String[] args) {
		
		String [] myArr = new String[5];
		
		myArr[0] = "Tom";
		myArr[1] = "Lisa";
		myArr[2] = "Bob";
		myArr[3] = "Mike";
		myArr[4] = "Jennifer";
		
		int i = 4;
		while (i >= 0) {
			System.out.println( myArr[i]);
			i = i - 1;
		}		
		System.out.println( myArr[0]);
		
		
		int [] myIntArr;
		myIntArr = new int[21];
		
		for ( int j = 1; j < 21; j++ )
		{
			myIntArr[j] = j * 2; 
			System.out.println(myIntArr[j]);
		}
		
		
		System.out.println("\n\n\n Part 3");
		int numArr[] = {3,6,9,12,15,18,21,27,30};
		int len = numArr.length;
		
		for ( int k = 0; k < len; k++ )
		{
			if ( (numArr[k] % 5) == 0 )
			{
				System.out.println(numArr[k]);
			}
		}
		
		
		System.out.println("\n\n\n Part 4");
		double t = Math.pow(15,77);
		System.out.println( (long)t );
		
		String s = "1949";
		int is = Integer.parseInt(s) + 1;
		System.out.println( is);
				
	}

}
