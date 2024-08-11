import java.util.Scanner;

/*
1 
6 2 
10 7 3 
13 11 8 4 
15 14 12 9 5
 */

public class Pattern_Q45 
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int row = in.nextInt();
        in.close();

        int n = row;
        for(int i = 1; n >= 1; i += n--) {
            for(int j=i, k=n; k <= row; j -= k++)
                System.out.print(j + " ");

            System.out.println();
        }
    }
}