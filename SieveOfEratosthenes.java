import java.util.*;
    public class SieveOfEratosthenes 
    {
        void sieveOfEratosthenes(int n)
        {
            boolean prime[] = new boolean[n + 1];
            for (int i = 0; i <= n; i++)
                prime[i] = true;
            for (int p = 2; p * p <= n; p++) 
            {
                if (prime[p] == true) 
                {
                    for (int i = p * p; i <= n; i += p)
                        prime[i] = false;
                }
            }
            for (int i = 2; i <= n; i++) 
            {
                if (prime[i] == true)
                    System.out.print(i + " ");
            }
        }
        public static void main(String args[])
        {
            try(Scanner sc=new Scanner(System.in))
            {
            System.out.println("Enter Range ");
            int N = sc.nextInt();
            System.out.println("All the Prime numbers within 1 and " + N + " are:");
            SieveOfEratosthenes g = new SieveOfEratosthenes();
            g.sieveOfEratosthenes(N);
            }
        }
    }
