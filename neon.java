import java.util.*;
public class neon 
{	
	public static boolean checkNeon(int n)
	{
		int square = n * n;
        int sum = 0;
        while (square > 0) 
        {
            int r = square % 10;
            sum += r;
            square = square / 10;
		}
        if (sum == n)
            return true;
		else

			return false;
	}
public static void main(String[] args)  
    {
    try(Scanner sc=new Scanner(System.in))
        {
        System.out.println("Enter The Number ");
        int n = sc.nextInt();
        if (checkNeon(n))
			System.out.println("Given number " + n + " is Neon number");
		else
			System.out.println("Given number " + n + " is not a Neon number");
	    }
    }
}

