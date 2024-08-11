import java.util.Scanner;

public class PrimeFactors 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        
        System.out.println("Prime factors of " + num + " are: ");
        for (int i = 2; i <= num; i++) 
        {
            while (num % i == 0) {
                System.out.print(i + " ");
                num = num/i;
            }
        }
    }
}
