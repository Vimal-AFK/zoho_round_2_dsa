package dsa;

public class DEMO {

    public static void main(String[] args) {
        zoho();
    }

    public static void zoho() {
        for (int i = 0; i <= 5; i++) {
            System.out.print(help(5, i) + " ");
        }
    }

    private static int help(int n, int k) {
        // Base case
        if (k == 0 || k == n) {
            return 1;
        }

        // Recursive case
        return help(n - 1, k - 1) + help(n - 1, k);
    }


}