import java.util.Scanner;
/*
 5 
 9 4 
 12 8 3 
 14 11 7 2 
 15 13 10 1
 */

public class Pattern_Q46
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int row = in.nextInt();
        in.close();

        int n = row;
        for(int i = n; n>=1; i += --n) {
            for(int j=i, k=n; k <= row; j -= ++k)
                System.out.print(j + " ");

            System.out.println();
        }
    }
}