import java.util.*;
class largest_num
{
    static double biggestOfThree(double x, double y, double z)
	{
		return z > (x > y ? x : y) ? z : ((x > y) ? x : y);
	}
	public static void main(String[] args)
	{
		try(Scanner sc=new Scanner(System.in))
        {
        System.out.println("Enter First No ");
        double a = sc.nextDouble();
        System.out.println("Enter Second No ");
        double b = sc.nextDouble();
		System.out.println("Enter Third No ");
        double c = sc.nextDouble();
        double largest = biggestOfThree(a, b, c);
		System.out.println(largest + " is the largest number");
	    }
    }
}
