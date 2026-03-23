package Array;

public class reverse_array {
    public static void main(String[] args) {

        int arr[] = {2, 3, 4, 5, 6, 7};
        int n = arr.length;

        int start = 0, end = n - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        // Print reversed array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}