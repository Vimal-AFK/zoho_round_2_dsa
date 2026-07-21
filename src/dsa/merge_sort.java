package dsa;

public class merge_sort {
    public static void merge_sort(int[] arr,int left , int right) {
        if ( left >= right ) return ;
        int mid = ( right + left ) / 2 ;
        merge_sort(arr,left,mid);
        merge_sort(arr,mid+1,right);
        merge(arr,left,mid,right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {

        int[] temp = new int[right - left + 1 ];
        int idx = 0 ;
        int i = left ;
        int j = mid + 1 ;

        while ( i <= mid &&  j <= right ) {
            temp[idx++] = ( arr[i] <= arr[j] ) ? arr[i++] : arr[j++];
        }

        while ( i <= mid ) {
            temp[idx++] = arr[i++];
        }

        while( j <= right ) {
            temp[idx++] = arr[j++];
        }

        for(int a = left , k = 0 ; a <= right ; a++ ) {
            arr[a] = temp[k++];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3,2,5,1,4,7 };

        merge_sort(arr,0,arr.length-1);
        for( int x : arr) {
            System.out.print(x+" ");
        }
    }
}
