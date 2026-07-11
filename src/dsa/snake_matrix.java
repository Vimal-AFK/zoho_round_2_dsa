package dsa;

public class snake_matrix {
    public static void snake_matrix(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;

        int bottom = r - 1;
        int left = 0 ;
        int right = c - 1;

        for (int top = 0; top <= bottom; top++) {

            if ( top % 2  == 0 ) {
                for (int i = left; i <= right; i++) {
                    System.out.print(arr[top][i]+" ");
                }
            } else {
                for (int i = right; i >= left ; i--) {
                    System.out.print(arr[top][i]+" ");
                }
            }
        }

    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        snake_matrix(arr);
    }
}
