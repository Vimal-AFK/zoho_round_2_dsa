package patterns;

public class pattern_4 {
    public static void pattern_4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
