import java.util.*;
public class gcd 
{
	static int GCD(int x, int y) 
	{ 
		if (y == 0) 
			return x; 
		return GCD(y, x % y); 
	} 
	public static void main(String[] args) 
	{ 
		try(Scanner sc=new Scanner(System.in))
        {
        System.out.println("Enter First Number ");
        int x = sc.nextInt();
        System.out.println("Enter Second Number ");
        int y = sc.nextInt();
		System.out.println("The GCD of " + x + " and " + y + " is: " + GCD(x, y)); 
	    } 
    }
}
