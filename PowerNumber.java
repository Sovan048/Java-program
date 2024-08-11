import java.util.Scanner;

public class PowerNumber 
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter base: ");
        int n = in.nextInt();
        System.out.print("Enter exponent: ");
        int p = in.nextInt();
        in.close();

        int ans = power(n, p);
        System.out.println(n + "^" + p + " = " + ans);
    }    

    static int power(int n, int p) {
        int ans = 1;
        for (int i = 1; i <= p; i++) {
            ans *= n;
        }

        return ans;
    }
}