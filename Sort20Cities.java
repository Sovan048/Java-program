import java.util.Arrays;

public class Sort20Cities{

    public static void main(String[] args) {
        String[] arr = {"America", "Albania", "Afghanistan"};

        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(String[] arr)
    {
        int n = arr.length;

        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j].compareTo(arr[min_idx]) < 0)
                    min_idx = j;

            String temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}