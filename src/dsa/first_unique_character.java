package dsa;

public class first_unique_character {
    public static char first_unique_character_1(String s){
        int n = s.length();

        int[] freq = new int[26];

        for ( int i = 0 ; i < n ; i++ ) {
            freq[s.charAt(i) - 'a']++;
        }

        for ( int i = 0 ; i < n ; i++ ) {
            if ( freq[s.charAt(i)-'a'] == 1 ) {
                return s.charAt(i);
            }
        }

        return '\0';
    }

    public static char first_unique_character_2(String s) {
        int n = s.length();
        for ( int i = 0 ; i < n ; i++ ) {
            boolean foundDuplicate = true;
            for ( int j = 0 ; j < n ; j++ ) {
                if (i!=j && s.charAt(i) ==  s.charAt(j) ) {
                    foundDuplicate = false;
                    break;
                }
            }
            if (foundDuplicate) {
                return s.charAt(i);
            }

        }
        return '\0';
    }
}
