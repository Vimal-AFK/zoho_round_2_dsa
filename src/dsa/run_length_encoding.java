package dsa;

public class run_length_encoding {
    public static void string_counter(String s) {
       int n = s.length();
       int count = 1 ;
       String ans = "";
       for( int i = 1 ; i < n ; i++ ) {
           if( s.charAt(i-1) == s.charAt(i) ) {
               count++;
           } else {
               ans = ans + s.charAt(i-1) + count;
               count = 1;
           }
       }
        ans = ans + s.charAt(n-1) + count;
        System.out.println(ans);


    }

    public static void main(String[] args) {
        string_counter("aabbbaaacc");
    }
}
