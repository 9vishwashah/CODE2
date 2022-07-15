import java.util.*;
class swap 
{
    static void sw(float m,float n)
	{
		m = m - n;
    	n = m + n;
        m = n - m;
        System.out.println("After Swap: Value of m is " + m + " and Value of n is " + n);
	}
	public static void main(String[] args)
	{
        try(Scanner sc=new Scanner(System.in))
        {
        System.out.println("Enter Value at m ");
        float m = sc.nextFloat();
        System.out.println("Enter value at n ");
        float n = sc.nextFloat();
        sw(m, n);
        }
	}
}
