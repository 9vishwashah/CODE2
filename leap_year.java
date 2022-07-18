import java.util.*;
public class leap_year 
{
	public static void main(String[] args)
	{
	try(Scanner sc=new Scanner(System.in))
        {
             System.out.println("Enter Year ");
             int year = sc.nextInt();
		    //  year = sc.nextInt();
		     if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) 
             {
		     	System.out.println(year + " : Leap Year");
		     }
		     else 
             {
		     	System.out.println(year + " : Non - Leap Year");
		     }
	    }
    }
}
