import java.util.Scanner;

class ThreeDigit
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a three digit number: ");
        int num = in.nextInt();
        in.close();

        while((int)Math.log10(num) != 0) {
            int sum = 0, n = num;
            while(n != 0) {
                sum += n %10;
                n /= 10;
            }
            num = sum;
        }

        System.out.println("After converting into single digit: " + num);
    }
}