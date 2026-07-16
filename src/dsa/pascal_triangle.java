package dsa;

public class pascal_triangle {
    public static void pascal_triangle_n_rows(int n){

        for (int row = 0; row < n; row++) {
            int val = 1 ;
            for (int col = 0; col <= row; col++) {
                val = val * ( row - col ) / ( col + 1 );
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void pascal_triangle_nth_row(int row){
        int val = 1;
        for (int col = 0; col < row; col++) {
            System.out.print(val+" ");
            val = val * ( row - col - 1 ) / ( col + 1 );
        }
    }

    public static void pascal_triangle_specific(int row , int col) {
        int ans = 1;

        for (int r = 0; r < col; r++) {
            ans = ans * ( row - r - 1 ) / ( r + 1 );
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        pascal_triangle_specific(3,3);
    }
}
