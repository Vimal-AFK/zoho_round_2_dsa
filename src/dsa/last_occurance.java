package dsa;

public class last_occurance {
    public static void last_occurance(int[] arr ,int target){
        int len = arr.length;
        int low = 0 ;
        int high = len - 1;

        while( low <= high ) {
            int mid = low + ( high - low ) / 2;
            if ( arr[mid] <= target ) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("LAST OCCURANCE:"+low);
    }
}
