package dsa;

public class quick_sort {

    public static void swap(int[] arr , int left , int right ) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
    }

    static int partition(int[] arr,int left , int right) {

        int pivot = arr[right];
        int i = left ;

        for (int j = left; j < right; j++) {

            if(arr[j] <= pivot ) {
                swap(arr,i,j);
                i++;
            }

        }
        swap(arr,i,right);
        return i ;
    }

    public static void quick_sort(int[] arr, int left, int right) {
        if ( left >= right ) return ;
        int pivotIndex = partition(arr,left,right);
        quick_sort(arr,left,pivotIndex-1);
        quick_sort(arr,pivotIndex+1,right);
    }

    public static void main(String[] args) {
        int[] arr = { 2,4,1,5,3 };
        quick_sort(arr,0,arr.length - 1);
        for(int x : arr) {
            System.out.printf("%2d",x);
        }
    }
}
