package dsa;

public class remove_duplicates_unsorted {
    public static void remove_duplicates_unsorted(int[] arr) {

        int max = Integer.MIN_VALUE;
        for ( int x : arr ) {
            max = max < x ? x : max;
        }
        int[] freq = new int[max+1];

        for ( int x : arr ) {
            freq[x]++;
        }
        int idx = 0;
        for ( int i = 0 ; i < arr.length ; i++ ) {
            int val = arr[i];
            if ( freq[val] != -1 ) {
                arr[idx++] = val;
                freq[val] = -1;
            }
        }

        for ( int i = 0 ; i < idx ; i++ ) {
            System.out.print(arr[i]+",");
        }
    }
}
