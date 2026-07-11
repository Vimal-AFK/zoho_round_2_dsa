package dsa;

public class fibonacci {
    public static int fibonacci_1(int x) {
        int p1 = 1 ;
        int p2 = 0 ;
        for ( int i = 2 ; i <= x ; i++ ) {  
            int ans  = p1 + p2 ;
            p2 = p1 ;
            p1 = ans ;
        } return p2;
    }

    public static int fibonacci_2(int x){
        if ( x == 0 ) return 0;
        if ( x == 1 ) return 1 ;
        return fibonacci_2(x-1)+fibonacci_2(x-2);
    }
}
