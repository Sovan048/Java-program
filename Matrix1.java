import java.util.*;
public class Matrix1 {
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrix");
        n=sc.nextInt();
        m=sc.nextInt();
        int p,q;
        System.out.println("Enter the size of second matrix");
        p=sc.nextInt();
        q=sc.nextInt();
        int a[][]=new int[n][m];
        int b[][]=new int[p][q];
        System.out.println("Enter the element of matrix");
          for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the element of second matrix");
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                b[i][j]=sc.nextInt();
            }
        }
        int c[][]=new int [m][q];
        for(int i=0;i<m;i++){
            for(int j=0;j<q;j++){
                c[i][j]=0;
                for(int k=0;k<m;k++){
                    c[i][j] += a[i][k]+b[k][j];
                }
            }
        }
        System.out.println("Mul of the matrix");
        for(int i=0;i<m;i++){
            for(int j=0;j<q;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
