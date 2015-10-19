import java.util.*;

public class ArraySorting
{
  public static void main(String[] args)
  {
  
    String [] myArr = new String[5];
	 
    myArr[0] = "Tom";
    myArr[1] = "Lisa";
    myArr[2] = "Bob";
    myArr[3] = "Mike";
    myArr[4] = "Jennifer";

    System.out.println( myArr[4] );

    int [] myIntArr;
    myIntArr = new int[20];

    for( int i = 0; i < 20; i++ )
    {
      myIntArr[i] = i * 2;
      System.out.println( myIntArr[i] );
    }


    int numArr[] = {3,6,9,12,15,18,21,24,27,30};

    int len = numArr.length;
	
	System.out.println( "\n\n Separator ...." );

    for ( int i = 0; i < len; i++ )
    {
     	if(  (numArr[i] % 2) == 0  )
		{
			System.out.println( numArr[i] );
		}
    }
    
	 	int [] myArray =  {16,9,122,6,18,7}; // 9,16,6,18,7,122

	   int temp = 0;
    	
		// Sort the array
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
		 
	 System.out.println( "\n\n After sorting:" );

    for (int i = 0; i < myArray.length; i++ )
    {
			System.out.println( myArray[i] );
    }


  }
} 