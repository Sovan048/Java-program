import java.util.Scanner;

class Pattern_Q41 
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = in.nextInt();
        System.out.print("Enter number of columns: ");
        int col = in.nextInt();
        in.close();

        for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= col; j++) 
            {
                if(j%2 == 1) // when column number is odd
                    System.out.print(i + " ");
                else // when column number is even
                    System.out.print((j/2) + " ");
            }
            System.out.println();
        }
    }
}