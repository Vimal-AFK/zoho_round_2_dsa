package dsa;

public class roman_integer {

    public static int valueOfRoman(char x) {
        switch (x) {
            case 'I':
                return 1 ;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }


    public static void roman_integer(String s) {
        int n = s.length();
        if ( n == 0 ) {
            System.out.println("NO INPUT");
            return ;
        }
        int prev = 0 ;
        int curr = 0;
        int sum = 0;
        for ( int i = 0 ; i < n ; i++ ) {
            curr = valueOfRoman(s.charAt(i));

            if ( prev > curr ) {
                sum-=curr;
            } else {
                sum+=curr;
            }

            prev = curr;
        }
        System.out.println("Integer:"+sum);
    }

}
