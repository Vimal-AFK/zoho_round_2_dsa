package dsa;

public class binary_search {
    public static boolean binary_search(int[] arr, int target) {
        int low = 0 ;
        int high = arr.length - 1;

        while ( low <= high ) {
            int mid = low + ( high - low ) / 2 ;
            if ( arr[mid] == target ) {
                System.out.println("ELEMENT FOUND AT "+mid+" INDEX");
                return true;
            }
            else if ( arr[mid] < target )
                low = mid + 1;
            else
                high = mid - 1;
        }
        System.out.println("ELEMENT NOT FOUND");
        return false;
    }
}
