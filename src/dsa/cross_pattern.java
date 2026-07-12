package dsa;

/*

Print the word with odd letters – PROGRAM
Sample Output-
P      P
 R    R
  O  O
   G
  R  R
 A    A
M      M

 */

public class cross_pattern {
    public static void cross_pattern(String s) {
        int n = s.length();

        for(int i = 0 ; i < n ; i++) {
            for(int j = 0; j < n ; j++ ){
                if( j == i ) {
                    System.out.print(s.charAt(i));
                }

                else if( j == n - 1 - i ) {
                    System.out.print(s.charAt(n - 1 - i));
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        cross_pattern("PROGRAM");
    }
}
