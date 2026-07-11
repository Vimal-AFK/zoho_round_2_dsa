package dsa;

public class kth_largest_element {
    public static int kthLargestElementMethod1(int[] arr , int k) {

        //essentials
        int len = arr.length;

        //edge cases
        if ( k >= len || k <= 0 ) return -1 ;

        //find
        for ( int i = 0 ; i < k ; i++ ) {
            int maxIndex =  i ;

            for ( int j = i+1 ; j < len ; j++ ) {
                if ( arr[j] > arr[maxIndex] ) {
                    maxIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }


        //T : O(n*k)
        //S : O(1)
        return arr[k-1] ;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low ;
        for ( int j = low ; j < high ; j++ ) {
            if ( arr[j] <= pivot ) {
                swap(arr, i,j);
                i++;
            }
        }
        swap(arr,i,high);
        return i;
    }


    public static int quickselect(int[] arr, int low, int high, int target) {
        if ( low <= high ) {
            int pivotIndex = partition(arr, low, high);
            if ( pivotIndex == target )
                return arr[pivotIndex];
            else if ( pivotIndex > target )
                return quickselect(arr, low, pivotIndex - 1, target);
            else
                return quickselect(arr, pivotIndex + 1, high, target);
        }
        return -1;
    }

    public static int kthLargestElementMethod2(int[] arr , int k) {
        return quickselect(arr,0,arr.length-1,k-1);
    }
}
