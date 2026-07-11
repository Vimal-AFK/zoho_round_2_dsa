package dsa;

public class first_repeating_character {

    public static char first_repeating_character(String s) {
        int n  = s.length();

        int[] freq = new int[26];
        for( int i = 0 ; i < n ; i++ ) {
            freq[s.charAt(i)-'a']++;
        }

        for ( int i = 0 ; i < n ; i++ ) {
            if( freq[s.charAt(i)-'a'] > 1 ) {
                return s.charAt(i);
            }
        }

        return '\0';
    }
}
