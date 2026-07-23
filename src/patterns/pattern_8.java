package patterns;

/*
      1
    2 1 2
  3 2 1 2 3
4 3 2 1 2 3 4
 */

public class pattern_8 {

    public static void pattern_8(int n) {

        for ( int i = 1 ; i <= n ; i++ ) {

            for(int space = n - i ; space > 0 ; space-- ) {
                System.out.print(" ");
            }
            int j = i;
            for( ; j > 1 ; j-- ) {
                System.out.print(j);
            }
            for( ; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern_8(4);
    }
}
