package patterns;

public class hollow_square {
    public static void hollow_square(int n){
        for ( int i = 0 ; i < n ; i++ ) {
            for ( int j = 0 ; j < n ; j ++ ) {
                if ( i > 0 && i < n-1 ) {
                    if ( j == 0 || j == n - 1 ) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
