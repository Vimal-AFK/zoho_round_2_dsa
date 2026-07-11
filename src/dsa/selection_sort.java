package dsa;

public class selection_sort {
    public static void selection_sort(int[] arr) {
         int n = arr.length;

         for( int i = 0 ; i < n ; i++ ) {
             for ( int j = i + 1 ; j < n ; j++ ) {
                 if( arr[i] > arr[j] ) {
                     int temp = arr[i];
                     arr[i] = arr[j];
                     arr[j] = temp;
                 }
             }
         }

         for(int x : arr) {
             System.out.print(x+" ");
         }
    }
}
