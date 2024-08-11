import java.util.Scanner;  
public class TransposeMatrix   
{  
    public static void main(String args[])    
    {  
    int i, j;  
    System.out.println("Enter total rows and columns: ");  
    Scanner sc = new Scanner(System.in);  
    int m = sc.nextInt();  
    int n = sc.nextInt();  
    int matrix[][] = new int[m][n];  
    System.out.println("Enter matrix:");  
    for(i = 0; i < m; i++)  
    {  
        for(j = 0; j < n; j++)   
            {  
            matrix[i][j] = sc.nextInt();  
            System.out.print(" ");  
            }  
    }  
    System.out.println("The above matrix before Transpose is ");  
    for(i = 0; i < m; i++)  
        {  
            for(j = 0; j < n; j++)  
            {  
            System.out.print(matrix[i][j]+" ");  
            }  
            System.out.println(" ");  
        }  
    System.out.println("The above matrix after Transpose is ");  
    for(i = 0; i < n; i++)  
        {  
            for(j = 0; j < m; j++)  
            {  
                System.out.print(matrix[j][i]+" ");  
            }  
            System.out.println(" ");  
        }  
    }
}