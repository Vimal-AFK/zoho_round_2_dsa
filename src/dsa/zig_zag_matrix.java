package dsa;

public class zig_zag_matrix {
    public static void zig_zag_matrix(int[][] arr){
        int r = arr.length;
        int c = arr[0].length;
        int num = 1;
        for (int k = 0; k <= r-1; k++) {
            int i = k;
            int j = 0;
            while (i >= 0 ) {
                System.out.print(arr[i][j]);
                i = i - 1;
                j = j + 1;  
            }
        }

        for (int k = 1; k < c-1; k++) {
            int i = r - 1;
            int j = k;
            while( j <= c - 1 ){
                System.out.print(arr[i][j]);
                i = i - 1;
                j = j + 1;
            }
        }
    }
}
