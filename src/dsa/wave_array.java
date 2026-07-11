package dsa;

public class wave_array {

    public static void swap( int[] arr , int x , int y ) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void wave_array(int[] arr) {
        int n = arr.length;

        for( int i = 0 ; i < n ; i+=2 ) {

            if ( i > 0 && arr[i] < arr[i-1] ) {
                swap(arr,i,i-1);
            }

            if ( i < n - 1 && arr[i] < arr[i+1] ) {
                swap(arr,i,i+1);
            }
        }

        for ( int x : arr ) System.out.print(x+" ");
    }
}
