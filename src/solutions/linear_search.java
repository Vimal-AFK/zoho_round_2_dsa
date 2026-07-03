package solutions;

public class linear_search {
    public static int linear_search( int[] arr , int target ) {
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] == target ) return i;
        }
        return -1;
    }
}
