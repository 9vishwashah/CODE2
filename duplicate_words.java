import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class GFG 
{
	public static String
	removeDuplicateWords(String input)
	{
		String regex
			= "\\b(\\w+)(?:\\W+\\1\\b)+";
		Pattern p
			= Pattern.compile(
				regex,
				Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(input);
		while (m.find()) {
			input
				= input.replaceAll(
					m.group(),
					m.group(1));
	 }
 return input;
}
public static void main(String args[])
  {
   try(Scanner sc=new Scanner(System.in))
        {
        System.out.println("Enter the sentence ");
        String str1 = sc.nextLine();
        }
		System.out.println(removeDuplicateWords(str1));
	}
}
