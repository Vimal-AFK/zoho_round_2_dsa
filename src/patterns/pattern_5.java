package patterns;

public class pattern_5 {
    public static void pattern_5(int n) {
        for (int i = 1; i <= n*2-1; i++) {

            int stars = ( i <= n ) ? i : n*2-i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        pattern_5(5);
    }
}
