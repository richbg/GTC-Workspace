
public class test {
	
 	public static void main(String[] args) {
		

		//System.out.println(  "String has 10 digits: " +  matchResult("1234567890123", ".*[0-9]{10,11}.*" )    );



/*
			^[a-z0-9_-]{3,15}$
			^                    # Start of the line
			[a-z0-9_-]			   # Match characters and symbols in the list, a-z, 0-9 , underscore , hyphen
         {3,15}               # Length at least 3 characters and maximum length of 15 
			$                    # End of the line
*/

	//System.out.println(   "User name is valid: " +  matchResult("123456", "^[a-z0-9_-]{3,5}$" )    );						



/*
			((?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})

			(					# Start of group
			(?=.*\d)			#   must contains one digit from 0-9
		   (?=.*[a-z])		#   must contains one lowercase characters
		   (?=.*[A-Z])		#   must contains one uppercase characters
		   (?=.*[@#$%])	#   must contains one special symbols in the list "@#$%"
			.					#   match anything with previous condition checking
         {6,20}			#   length at least 6 characters and maximum of 20	
			)					# End of group		
		
*/

		System.out.println(   "Password is valid: " +  matchResult("paD8%", "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{3,6})"  ) );				

/*
			^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$

			^							#start of the line
			[_A-Za-z0-9-]+			#  must start with string in the bracket [ ], must contains one or more (+)
			(							#  start of group #1
			\\.[_A-Za-z0-9-]+		#     follow by a dot "." and string in the bracket [ ], must contains one or more (+)
			)*							#  end of group #1, this group is optional (*)
			@							#     must contains a "@" symbol
	      [A-Za-z0-9]+       	#        follow by string in the bracket [ ], must contains one or more (+)
	      (							#	   start of group #2 - first level TLD checking
	      \\.[A-Za-z0-9]+  		#	     follow by a dot "." and string in the bracket [ ], must contains one or more (+)
      	)*							#	   end of group #2, this group is optional (*)
      	(							#	   start of group #3 - second level TLD checking
       	\\.[A-Za-z]{2,}  		#	     follow by a dot "." and string in the bracket [ ], with minimum length of 2
      	)							#	   end of group #3
			$							#end of the line
*/
		//System.out.println(  "Email address is valid: " +  matchResult("df5@abc.com", "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$" )    );
				 
	}

	public static boolean matchResult(String str, String re) {
	  return str.matches(re);
	}	
}
