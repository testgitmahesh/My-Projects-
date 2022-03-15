package emailvalidation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emailvalidation {
	

		public static boolean isValidEmail(String email)
			{
			String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z.-]+$";//"^(.+)@(.+)$";
			// initialize the Pattern object
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(email);
			return matcher.matches();
			}

		

	public static void main(String[] args)
	{
		
		List<String> email = new ArrayList<String>();
        // valid email addresses
        email.add("mahesh.kumar123@example.com");
        email.add("mk276143@example.com");
        email.add("mahesh.kumar@example.me.org");
        email.add("mahesh123kumar@example.com");
        email.add("maheshkumar.123@.example.com");
        

        //invalid email addresses
        
        email.add("kumar.example.com");
        email.add("@kumar_example.com");
        email.add("-123kumar_example.com");
        email.add("kumar.123@.134example.com");
       
        
        for (String value : email)
        {
        	
            System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));
            
        }System.out.println("--------------------------------------------");
       

        System.out.println("Enter an email address");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));
	}
}
