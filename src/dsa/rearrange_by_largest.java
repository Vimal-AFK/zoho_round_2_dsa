package dsa;

/*
Given an array of integers, write a program to re-arrange the array in the given
form.
1st_largest, 1st_smallest, 2nd_largest, 2nd_smallest, 3rd_largest ……. Etc.
 */

import java.util.Arrays;

public class rearrange_by_largest {
    public static void rearrange_by_largest(int[] arr){
        Arrays.sort(arr);

        int n = arr.length;
        int[] ans = new int[n];
        int left = 0;
        int right = n - 1;
        int k = 0;

        while ( left <= right ) {
            if ( left != right ) {
                ans[k++] = arr[right--];
            }
            ans[k++] = arr[left++];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = ans[i];
        }

        for(int x : arr){
            System.out.print(x+" ");
        }
    }

    public static void rearrange_by_largest_2(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        int left = 0 ;
        int right = n - 1;

        int max = arr[right] + 1;

        for ( int i = 0 ; i < n ; i++ ) {
            if ( i % 2 == 0 ) {
                arr[i] += ( arr[right] % max ) * max;
                right--;
            } else {
                arr[i] += ( arr[left] % max ) * max;
                left++;
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] /= max;
        }

        for(int x : arr) {
            System.out.print(x+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,1,3,4,6,2,9,7,1};
        rearrange_by_largest_2(arr);
    }
}
