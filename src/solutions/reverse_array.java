package solutions;

public class reverse_array {
    public static void reverse_array( int[] arr , int left , int right  ) {

        while ( left < right ) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
