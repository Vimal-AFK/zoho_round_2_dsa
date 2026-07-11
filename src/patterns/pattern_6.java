package patterns;
/*

int n = 5;

    *
   **
  ***
 ****
*****

 */


import static patterns.star.star;

public class pattern_6 {
    public static void pattern_6(int n) {
        for (int i = 0; i < n; i++) {
            for (int space = 0; space < n-i+1; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < i+1; star++) {
                star();
            }
            System.out.println();
        }
    }
}
