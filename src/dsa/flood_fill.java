package dsa;

/*

In MS-Paint, when we take the brush to a pixel and click, the color of the region of
that pixel is replaced with a new selected color. Following is the problem statement to
do this task.
Given a 2D screen, location of a pixel in the screen and a color, replace color of the
given pixel and all adjacent same colored pixels with the given color.
Example:
Input:
screen[M][N] = {
{1, 1, 1, 1, 1, 1, 1, 1},
{1, 1, 1, 1, 1, 1, 0, 0},
{1, 0, 0, 1, 1, 0, 1, 1},
{1, 2, 2, 2, 2, 0, 1, 0},
{1, 1, 1, 2, 2, 0, 1, 0},
{1, 1, 1, 2, 2, 2, 2, 0},
{1, 1, 1, 1, 1, 2, 1, 1},
{1, 1, 1, 1, 1, 2, 2, 1},
};
x = 4, y = 4, newColor = 3
The values in the given 2D screen indicate colors of the pixels.x and y are coordinates of the brush, newColor is the color that
should replace the previous color on screen[x][y] and all surrounding
pixels with same color.
Output:
Screen should be changed to following.
screen[M][N] = {{1, 1, 1, 1, 1, 1, 1, 1},
{1, 1, 1, 1, 1, 1, 0, 0},
{1, 0, 0, 1, 1, 0, 1, 1},
{1, 3, 3, 3, 3, 0, 1, 0},
{1, 1, 1, 3, 3, 0, 1, 0},
{1, 1, 1, 3, 3, 3, 3, 0},
{1, 1, 1, 1, 1, 3, 1, 1},
{1, 1, 1, 1, 1, 3, 3, 1},
};


 */

public class flood_fill {
    static int originalColor ;
    public static void flood_fill(int[][] image, int color , int sr, int sc) {
        if ( image == null || image.length == 0 || image[0].length == 0 ) {
            System.out.println("CANT IMPLEMENT THE FLOOD FILL");
        }

        originalColor = image[sr][sc];

        if ( originalColor != color ) {
            dfs(image,color,sr,sc);
        }

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                System.out.print(image[i][j]);
            }
            System.out.println();
        }
    }

    public static void dfs(int[][] image,int color,int sr,int sc) {
        int r = image.length;
        int c = image[0].length;

        // Boundary
        if (sr < 0 || sr >= r || sc < 0 || sc >= c)
            return;

        // Different color
        if (image[sr][sc] != originalColor)
            return;

        // Fill
        image[sr][sc] = color;

        dfs(image,color,sr+1,sc);
        dfs(image,color,sr-1,sc);
        dfs(image,color,sr,sc+1);
        dfs(image,color,sr,sc-1);

    }

    public static void main(String[] args) {

        int[][] image = {
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 0},
                {1, 0, 0, 1, 1, 0, 1, 1},
                {1, 2, 2, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 2, 2, 0},
                {1, 1, 1, 1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1, 2, 2, 1},
        };

        int sr = 4 ;
        int sc  = 4 ;
        int color = 3 ;

        flood_fill(image,color,sr,sc);
    }
}
