package patterns;

public class binary_pattern {
    public static void binary_pattern(int n){
        
        int limit = n << 1 ;

        for (int i = 0; i < limit ; i++) {
            for (int j = n - 1; j >= 0 ; j--) {
                System.out.print((i >> j) & 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        binary_pattern(8);
    }
}
