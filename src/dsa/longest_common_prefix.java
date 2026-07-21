package dsa;



//Example 1:
//
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
//Example 2:
//
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.

import java.nio.charset.StandardCharsets;

public class longest_common_prefix {

    public static void mergeSort(String[] s , int left , int right) {
        if(left >= right) return ;
        int mid = ( right + left) / 2;
        mergeSort(s,left,mid);
        mergeSort(s,mid+1,right);
        merge(s,left,mid,right);
    }

    public static void merge(String[] s, int left , int mid , int right) {
        int i = left ;
        int j = mid + 1 ;
        int idx = 0;
        String[] temp = new String[right - left + 1];

        while ( i <= mid && j <= right ) {
            if ( compare(s[i],s[i]) <= 0 ) {
                temp[idx++] = s[i++];
            } else {
                temp[idx++] = s[j++];
            }
        }

        while ( i <= mid ) temp[idx++] = s[i++];
        while ( j <= right ) temp[idx++] = s[j++];

        for( int a = left , k = 0 ; a <= right ; a++ ) {
            s[a] = temp[k++];
        }
    }

    public static int compare (String s1 ,String s2) {
        int min = Math.min(s1.length(),s2.length());
        for(int i = 0 ; i < min ; i++){
            if( s1.charAt(i) != s2.charAt(i) ) {
                return s1.charAt(i) - s2.charAt(i);
            }
        }
        return s1.length() - s2.length();
    }

    public static void longest_common_prefix(String[] s) {
        int n = s.length;
        mergeSort(s,0,n-1);
        String s1 = s[0];
        String s2 = s[n-1];

        int i = 0 ;
        while( i < s1.length() && i < s2.length() && s1.charAt(i) == s2.charAt(i) ) i++;
        System.out.println("LONGEST COMMON PREFIX : "+i);
    }


    public static void longest_common_prefix_2(String[] s) {

        String first = s[0];

        for ( int i = 0 ; i < first.length() ; i++ ) {
            char c = first.charAt(i);
            for(int j =  1 ; j < s.length ; j++ ) {
                if(i >= s[j].length() || s[j].charAt(i) != c) {
                    System.out.println(i);
                    return;
                }
            }
        }
        System.out.println(first.length());
    }

    public static void main(String[] args) {
        String[] input = {
                "flower",
                "flow",
                "floght"
        };
        longest_common_prefix_2(input);
    }
}
