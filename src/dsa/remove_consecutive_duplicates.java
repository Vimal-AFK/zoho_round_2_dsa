package dsa;

public class remove_consecutive_duplicates {
    public static void remove_consecutive_duplicates(int[] arr) {
        int n = arr.length;

        int i = 0 , j = 0;
        while( j < n ) {
            if ( arr[i] != arr[j] ) {
                arr[++i] = arr[j];
            } j++;
        }

        for (int k = 0; k <= i; k++) {
            System.out.print(arr[k]+" ");
        }
    }
}
