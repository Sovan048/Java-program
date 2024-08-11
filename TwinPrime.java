import java.util.*;

public class TwinPrime
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Checking for twin prime numbers between a range~ \nEnter lower bound: ");
        int m = in.nextInt();
        System.out.print("Enter upper bound: ");
        int n = in.nextInt();
        in.close();

        if(m>n)
            throw new ArithmeticException("Enter a valid range!");

        Stack<Integer> primes = new Stack<>();
        primes.push(-1);

        System.out.println("\nTwin primes in the given range are: ");
        for (int i = m; i <= n; i++) {
            if(isPrime(i)) {
                int previous = primes.pop();
                if(i - previous == 2)
                    System.out.println(previous + ", " + i);
                primes.push(i);
            }
        }
    }

    static boolean isPrime(int n) {
        if(n<2)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0)
                return false;
        }

        return true;
    }
}