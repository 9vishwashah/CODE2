import java.util.*;
class lcm 
{
	static int GCD(int u, int v)
	{
		if (u == 0)
			return v;
		return GCD(v % u, u);
	}
	static int LCM(int u, int v)
	{
		return (u / GCD(u, v)) * v;
	}
	public static void main(String[] args)
	{
		try(Scanner sc=new Scanner(System.in))
        {
        System.out.println("Enter Value at m ");
        int u = sc.nextInt();
        System.out.println("Enter value at n ");
        int v = sc.nextInt();
		System.out.println("LCM of " + u + " and " + v+ " is " + LCM(u, v));
	    }
    }
}
