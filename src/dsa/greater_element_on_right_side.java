package dsa;

/*
1. Replace every element with the greatest element on right side

Given an array of integers, replace every element with the next greatest
element (greatest element on the right side) in the array.
Since there is no element next to the last element, replace it with -1.
For example, if the array is {16, 17, 4, 3, 5, 2}, then it should be
modified to {17, 5, 5, 5, 2, -1}.
 */

import java.util.Arrays;

public class greater_element_on_right_side {
    public static void greater_element_on_right_side(int[] arr){
        int n = arr.length;
        int currMax = arr[n-1];
        arr[n-1] = -1;

        for (int i = n-2; i >= 0 ; i--) {
            int temp = arr[i];
            arr[i] = currMax;
            currMax = Math.max(currMax,temp);
        }

        for(int x : arr) {
            System.out.print(x+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        greater_element_on_right_side(arr);
    }
}
