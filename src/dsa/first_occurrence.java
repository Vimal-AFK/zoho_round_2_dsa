package dsa;

public class first_occurrence {
    public static void first_occurrence(int[] arr,int target) {
        int n = arr.length;

        int low = 0 ;
        int high = n - 1;

        while ( low <= high ) {
            int mid = low + ( high - low ) / 2;
            if( arr[mid] < target ) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("FIRST OCCURANCE:"+low);
    }
}
