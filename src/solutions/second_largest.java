package solutions;

public class second_largest {
    public static void second_largest( int[] arr ) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for ( int x : arr ) {
            if ( x > firstMax ) {
                secondMax = firstMax;
                firstMax = x;
            }
            else if ( x > secondMax && firstMax != x )
                secondMax = x;
        }
        System.out.println("SECOND MAX IS :"+ secondMax );
    }
}
