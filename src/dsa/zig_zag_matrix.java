//package dsa;
//
//public class zig_zag_matrix {
//    public static void zig_zag_matrix(int[][] arr){
//        int r = arr.length;
//        int c = arr[0].length;
//
//        int row = 0;
//        int col = 0;
//        boolean up = true;
//
//        while(row < r && col < c){
//            if(up){
//                while(row > 0 && col < r - 1 ) {
//                    System.out.println(arr[row][col]);
//                    row = row - 1;
//                    col = col + 1;
//                }
//                System.out.println(arr[row][col]);
//                if (col == r-1){
//                    row++;
//                } else {
//                    col++;
//                }
//            } else {
//                while (col > 0)
//            }
//        }
//    }
//}
