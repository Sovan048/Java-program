import java.util.Scanner;

public class Pattern_Q39 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        scanner.close();
        
        int num = 2;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(num + " ");
                num += 2;
            }
            System.out.println();
        }
    }
}
