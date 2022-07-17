import java.io.*;
class Main
{
	public static int counter = 2;
	static boolean isLucky(int n)
	{
		if(counter > n)
			return true;
		if(n%counter == 0)
			return false;	
		int next_position = n - (n/counter);	
		counter++;
		return isLucky(next_position);
	}
 public static void main (String[] args)
	{	
    int x = 5;
		if( isLucky(x) )
			System.out.println(x+" is a lucky no.");
		else
			System.out.println(x+" is not a lucky no.");
	}
}
