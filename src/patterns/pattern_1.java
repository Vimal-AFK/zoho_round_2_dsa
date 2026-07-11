package patterns;
import static patterns.star.star;

/*

int n = 5 ;

****
****
****
****

 */

public class pattern_1 {

    public static void pattern_1(int n){

        for ( int i = 0 ; i < n ; i++ ) {
            for( int j = 0 ; j < n ; j++ ) {
                star();
            }
            System.out.println();
        }
    }
}
