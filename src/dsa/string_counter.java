package dsa;

public class string_counter {
    public static void string_counter(String s) {
        int[] freq = new int[26];

        for( int i = 0 ; i < s.length() ; i++ ) {
           freq[s.charAt(i) - 'a']++;
        }

        String ans = "";
        for( int i = 0 ; i < s.length() ; i++ ) {
            int f = freq[s.charAt(i) - 'a'];
            if( f != 0 ){
                ans += "" + s.charAt(i) + f + "";
            }
            freq[s.charAt(i) - 'a'] = 0 ;
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        string_counter("aaabbbbccgg");
    }
}
