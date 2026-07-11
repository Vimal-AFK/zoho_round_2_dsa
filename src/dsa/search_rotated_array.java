package dsa;

public class search_rotated_array {
    public static int search_rotated_array(int[] arr , int target){
        int low = 0 ;
        int high = arr.length - 1;


        while ( low <=  high ) {
            int mid  = low + ( high - low ) / 2 ;

            if( arr[mid] == target ) return mid;

            if ( arr[low] < arr[mid] ) {
                if ( arr[low] <= target && arr[mid] > target ) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if ( arr[mid] < target && arr[high] >= target ) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
