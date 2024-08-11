import MyPackage.MTable;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        ob.close();
        System.out.println("Multiplication table is:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(n + "\t");
        }
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.print(MTable.mul(i, n) + "\t");
        }
    }

}