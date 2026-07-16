package patterns;

/*

    *
   ***
  *****
   ***
    *

n = 3

*/

public class diamond_pattern {

    public static void diamondPattern(int n) {

        // Upper Half
        for (int i = 1; i <= n; i++) {

            //Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            //Stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Half
        for (int i = n - 1; i >= 1; i--) {

            //Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            //Stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 3;
        diamondPattern(n);
    }
}