package solutions;

public class bucket_sort {
    public static void bucket_sort(int[] arr){
        int len = arr.length;

        int max = arr[0];

        for ( int x : arr )
            if ( x > max )
                max = x;

        int[] bucket = new int[max+1];

        for ( int i = 0 ; i < len ; i++ )
            bucket[arr[i]]++;

        int index = 0;

        for ( int i = 0 ; i < max ; i++ ) {
            while ( bucket[index] > 0 ) {
                arr[index++] = i;
                bucket[i]--;
            }
        }


    }
}
