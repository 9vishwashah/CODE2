import java.util.*;
import java.math.*;
public class armstrong 
{
	static void armstrong(int l, int h)
	{
		for (int j = l + 1; j < h; ++j) 
        {
			int y = j;
			int N = 0;
			while (y != 0) 
            {
				y /= 10;
				++N;
			}
            int sum_power = 0;
			y = j;
			while (y != 0) 
            {
				int d = y % 10;
				sum_power += Math.pow(d, N);
				y /= 10;
			}
			if (sum_power == j)
				System.out.print(j + " ");
		}
	}
    public static void main(String args[])
	{
		try(Scanner sc=new Scanner(System.in))
        {
            System.out.println("Enter Start Range ");
            int n1 = sc.nextInt();
            System.out.println("Enter End Range ");
            int n2 = sc.nextInt();
		    armstrong(n1, n2);
		    System.out.println();
        }
	}
}  

