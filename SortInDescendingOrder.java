import java.util.*;

public class SortInDescendingOrder
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of elements in the list: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = in.nextInt();
        in.close();

        for(int i = 1; i < arr.length; i++) {
            for(int j = i; (j > 0) && (arr[j] > arr[j-1]); j--)
                arr[j-1] = arr[j] ^ arr[j-1] ^ (arr[j]=arr[j-1]);
        }

        System.out.println("\nSorting the list in descending order:\n" + Arrays.toString(arr));

    }

}