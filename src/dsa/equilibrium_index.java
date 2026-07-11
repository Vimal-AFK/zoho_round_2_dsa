package dsa;

public class equilibrium_index {
    public static void equilibrium_index_1( int[] arr ) {
        int n = arr.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        prefix[0] = arr[0];
        for ( int i = 1 ; i < n ; i++ ) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        suffix[n-1] = arr[n - 1];
        for ( int i = n-2 ; i >= 0 ; i-- ) {
            suffix[i] = suffix[i+1] + arr[i];
        }

        for ( int i = 0 ; i < n ; i++ ) {

            int left = ( i == 0 ) ? 0 : prefix[i];
            int right = ( i == n-1 ) ? 0 : suffix[i];

            if ( left == right ){
                System.out.println("EQU INDEX:"+i);
                return ;
            }

        }

        System.out.println("EQU NOT FOUND");
    }

    public static void equilibrium_index_2(int[] arr ) {
        int totalSum = 0 ;
        for ( int val : arr ) totalSum+=val;

        int left = 0;
        int right = totalSum;

        for ( int i = 0 ; i < arr.length ; i++ ) {
            right-=arr[i];
            if ( left == right ) {
                System.out.println("EQUIL INDEX:"+i);
                return ;
            }
            left+=arr[i];
        }

        System.out.println("EQUIl INDEX NOT FOUND");
    }
}
