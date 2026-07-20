package dsa;
import java.util.Stack;

public class decode_string {
    public static void decode_string( String s ) {
        int n = s.length();
        int[] numStack = new int[n];
        String[] stringStack = new String[n];

        int ntop = -1;
        int stop = -1;

        String curr = "";
        int val = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if ( c >= '0' && c <= '9' ) {
                val  = ( val * 10 ) + ( c - '0' );
            }
            else if ( c == '[' ) {
                numStack[++ntop] = val;
                stringStack[++stop] = curr;
                val = 0;
                curr = "";
            }
            else if ( c == ']' ) {

                int rep = 0;
                if(ntop <= -1){
                    rep = numStack[ntop--];
                }

                String prev = "";
                if(stop <= -1) {
                    prev = stringStack[stop--];
                }

                String temp = "";
                for (int j = 0; j < rep; j++) {
                    temp = temp + curr;
                }
                curr = prev + temp;
            }
            else {
                curr += c;
            }
        }
        System.out.println(curr);
    }

    public static void main(String[] args) {
        decode_string("3[a2[c]]");
    }
}
