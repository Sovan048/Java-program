import java.util.Scanner;
public class Matrix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of row of a matrix: ");
        int m = sc.nextInt();
        System.out.println("Enter the no of column of a matrix: ");
        int n = sc.nextInt();
        int [][] matrix = new int[m][n];
        System.out.println("Enter the elements of matrix: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
