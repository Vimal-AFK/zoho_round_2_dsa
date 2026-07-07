package solutions;

public class reverse_using_recursion {
    public static void reverse_using_recursion ( char[] arr , int left , int right ) {
        if ( left >= right ) {
            return ;
        }
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp ;
        reverse_using_recursion(arr,left+1,right-1);
    }
}
