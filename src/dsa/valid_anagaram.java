package dsa;

public class valid_anagaram {
    public static void valid_anagaram(String s,String t){

        int n_s = s.length();
        int n_t = t.length();

        int[] freq_s = new int[26];

        for ( int i = 0 ; i < n_s ; i++ ) {
            freq_s[s.charAt(i)-'a']++;

        }

        for ( int i = 0 ; i < n_t ; i++ ) {
            freq_s[t.charAt(i)-'a']--;
        }

        for ( int x : freq_s ) if ( x != 0 ) {
            System.out.println("NO ANAGRAM");
            return;
        }
        System.out.println("VALID ANAGRAM");

    }
}
