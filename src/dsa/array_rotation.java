package dsa;

public class array_rotation {

    public static void reverseArray( int[] arr , int low , int high ) {
        while ( low < high ) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void array_rotation ( int[] arr , int k ) {
        int n = arr.length;
        k = k % n ;
        reverseArray(arr,0,n-k);
        reverseArray(arr,n-k+1,n-1);
        reverseArray(arr,0,n-1);
        for ( int x : arr ) System.out.print(x);
    }
}
