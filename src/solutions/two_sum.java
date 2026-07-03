package solutions;
//                 Classic Two Sum
//
//Find two indices whose values add up to the target.
//
//Input
//
//nums = [2,7,11,15]
//target = 9
//
//Output
//
//[0,1]

public class two_sum {

    public static void twoSum(int[] arr , int target) {
        int left = 0;
        int right = arr.length-1;

        while ( left < right ) {
            int localSum = arr[left] + arr[right];
            if ( localSum == target ) {
                System.out.println("["+ left +","+ right +"]");
                return ;
            }
            else if ( localSum < target )
                left++;
            else
                right--;
        }
        System.out.println("NOT FOUND");
    }
}