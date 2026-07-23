package dsa;

public class wild_card_matching {
    public static void wild_card_matching(String text, String pattern) {
        boolean x = helper(text,pattern,text.length()-1,pattern.length()-1);
        System.out.println(x);
    }

    private static boolean helper(String text, String pattern, int strPoint, int patPoint) {

        if( strPoint < 0 && patPoint < 0 ) return true;
        if( strPoint >=0 && patPoint < 0 ) return false;
        if( strPoint < 0 && patPoint >= 0 ) {
            for(int k = 0 ; k <= patPoint ; k++ ) {
                if( pattern.charAt(patPoint) != '*' ) return false;
            }
            return true;
        }

        if( text.charAt(strPoint) == pattern.charAt(patPoint) || pattern.charAt(patPoint) == '?') {
            return helper(text,pattern,strPoint-1,patPoint-1);
        }
        if(pattern.charAt(patPoint) == '*') {
            return helper(text,pattern,strPoint-1,patPoint) ||
                    helper(text,pattern,strPoint,patPoint-1);
        }
        return false;
    }

    public static void main(String[] args) {
        wild_card_matching("XYXZZXY","X***X");
    }

}
