import java.util.Scanner;

class DiagonalSum
{
    public static void main(String[] args) {
        try (Scanner ob = new Scanner(System.in)) 
        {
            System.out.println("Enter dimensions of the matrix:");
            int m = ob.nextInt();
            int n = ob.nextInt();
            
            if(m != n)
                throw new IllegalArgumentException("Please enter a square matrix.");

            int[][] arr= new int[n][n];
            System.out.println("Enter elements of the matrix:");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) 
                    arr[i][j]=ob.nextInt();
            }
            
            int sum=0;

            // for (int i = 0; i < n; i++)                    // if we want to find diagonal like this: 
            // {                                              // [ *         ]
            //     sum += arr[i][i];                          // [     *     ]
            // }                                              // [         * ]

            for (int i = 0; i < arr.length; i++) {
                int j=arr.length-1-i;                      // if we want to find diagonal like this: 
                if(i==j)                                   // [ *       * ]
                    sum += arr[i][j];                      // [     *     ]
                else                                       // [ *       * ]
                    sum += arr[i][i]+arr[i][j];
            }
            System.out.println("The diagonal sum of this matrix is: " + sum);
        }
    }
}