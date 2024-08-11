import java.util.Scanner;
public class PalindromeRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the range to check palindrome numbers\nEnter the lower bound: ");
        int m = in.nextInt();
        System.out.print("Enter the upper bound: ");
        int n = in.nextInt();
        in.close();

        if(m>n)
            throw new ArithmeticException("Enter a valid range");
        
        System.out.println("Palindrome numbers in the given range are:");
        for (int i = m; i <= n; i++) {
            if (isPalindrome(i))
                System.out.print(i + "  ");
        }

        in.close();
    }

    static boolean isPalindrome(int n) {
        String str = String.valueOf(n);
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-i-1))
                return false;
        }
        return true;
    }
}
