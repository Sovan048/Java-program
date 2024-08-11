import java.util.Arrays;
import java.util.Scanner;

class Fibo {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = ob.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || i == 1)
                arr[i] = i;
            else
                arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println("The Fibonacci series is:");
        System.out.println(Arrays.toString(arr));

        ob.close();
    }
}