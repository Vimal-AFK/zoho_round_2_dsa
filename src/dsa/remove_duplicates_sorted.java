package dsa;

public class remove_duplicates_sorted {
    public static void remove_duplicates_sorted(int[] arr){
        int n = arr.length;
        int i  = 0;
        int j = 0 ;

        while ( j < n ) {
            if ( arr[i] != arr[j] ) {
                arr[++i] = arr[j];
            }
            j++;
        }
        System.out.print("Duplicate Removed : ");
        for ( int k = 0 ; k <= i ; k++ ) {
            System.out.print(arr[k]);
        }
    }
}
