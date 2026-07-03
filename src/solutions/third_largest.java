package solutions;

public class third_largest {
    public static void third_largest(int[] arr){
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for ( int x : arr ) {
            if ( x > firstMax ) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = x;
            }
            else if ( x > secondMax && firstMax != x ){
                thirdMax = secondMax;
                secondMax = x;
            } else if ( x > thirdMax && secondMax != x && firstMax != x ) {
                thirdMax = x;
            }

        }
        System.out.println("THIRD MAX IS :"+ thirdMax );
    }
}
