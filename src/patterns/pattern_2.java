package patterns;
import static patterns.star.star;
/*

int n = 5;

*
**
***
****
*****

 */

public class pattern_2 {
    public static void pattern_2(int n) {
        for ( int i = 0 ; i < n ; i++ ) {
            for ( int j = 0 ; j < i+1 ; j++ ) {
                star();
            }
            System.out.println();
        }
    }
}
