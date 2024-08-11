import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter an integer number:");
        int n = ob.nextInt();
        if (isArmstrong(n))
            System.out.println("The number is an Armstrong number");
        else
            System.out.println("The number is not an Armstrong number");
        ob.close();
    }

    static boolean isArmstrong(int n) {
        int c = (int) (Math.log10(n) + 1);
        int p = n;
        int s = 0;
        while (n != 0) {
            int r = n % 10;
            s += (int) (Math.pow(r, c));
            n /= 10;
        }
        return p == s;
    }
}

