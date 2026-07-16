package dsa;

public class shortest_path {
    public static void shortest_path(int[][] arr, int desX  ,int desY) {
        int distance = backtrack(arr,0,0,desX-1,desY-1);
        System.out.println(distance);
    }

    public static int backtrack(int[][] arr, int i , int j ,int x , int y) {

        int down = Integer.MAX_VALUE;
        int up = Integer.MAX_VALUE;
        int r = arr.length;
        int c = arr[0].length;
        if( i < r-1 && j < c && arr[i+1][j] != 0 ) {
            down = backtrack(arr,i+1,j,x,y);
        }

        if(  i < r && j < c-1 && arr[i][j+1] != 0 ) {
            up = backtrack(arr,i,j+1,x,y);
        }

        if( i == x && j == y ) {
            return Math.min(down,up);
        }

        return 0 ;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        shortest_path(arr,3,3);
    }
}
