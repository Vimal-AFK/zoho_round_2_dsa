package dsa;

public class subsets_sum {
    public static int sumGlobal ;
    public static void subsets_sum(int[] arr,int sum){
        int[] curr = new int[arr.length];
        sumGlobal = sum ;
        backtrack(arr,0,curr,0,0);
    }

    public static void backtrack(int[] arr, int index , int[] curr,int currIdx,int currSum) {


        if( currSum == sumGlobal ) {
            System.out.print("[");
            for(int i = 0 ; i < currIdx ; i++) System.out.print(curr[i] +" ");
            System.out.println("]");
        }

        for(int i = index ; i < arr.length ; i++ ) {
            curr[currIdx] = arr[i];
            backtrack(arr,i + 1 ,curr,currIdx+1,currSum+arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 8, 10};
        int sum = 10 ;
        subsets_sum(arr,sum);
    }
}
