package solutions;

public class Longest_palindromic_length_formation {
    public static int Longest_palindromic_length_formation(String s) {
        int[] hash = new int[26];
        for ( int i = 0 ; i < s.length() ; i++ ) hash[s.charAt(i)-'a']++;

        boolean oddFound = false ;
        int count = 0 ;
        for ( int x : hash ) {
            if ( x % 2  == 0 ) {
                count += x;
            } else {
                count += x - 1;
                oddFound = true;
            }
        }
        if ( oddFound ) count++;

        return count;

    }
}
