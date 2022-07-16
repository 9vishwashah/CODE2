// Java program to check URL is valid or not
// using Regular Expression
import java.util.*;
import java.util.regex.*;

class Main {

	// Function to validate URL
	// using regular expression
	public static boolean
	isValidURL(String url)
	{
    
		// Regex to check valid URL
		String regex = "((http|https)://)(www.)?"
			+ "[a-zA-Z0-9@:%._\\+~#?&//=]"
			+ "{2,256}\\.[a-z]"
			+ "{2,6}\\b([-a-zA-Z0-9@:%"
			+ "._\\+~#?&//=]*)";

		// Compile the ReGex
		Pattern p = Pattern.compile(regex);

		// If the string is empty
		// return false
		if (url == null) {
			return false;
		}

		// Find match between given string
		// and regular expression
		// using Pattern.matcher()
		Matcher m = p.matcher(url);

		// Return if the string
		// matched the ReGex
		return m.matches();
	}

	// Driver code
	public static void main(String args[])
	{
        try(Scanner sc=new Scanner(System.in))
        {
        System.out.print("Enter a string: ");  
        String url= sc.nextLine();    
        }
		if (isValidURL(url) == true) {
			System.out.println("Yes");
		}
		else
			System.out.println("NO");
	}
}
