package dsa;

public class binary_sum {
    public static void binary_sum(String a , String b){

        int last_a = a.length()-1;
        int last_b = b.length()-1;

        String ans = "";
        int carry = 0 ;

        while ( last_a >= 0 || last_b >= 0 ) {

            int x = last_a >= 0 ?  a.charAt(last_a--) - '0' : 0 ;
            int y = last_b >= 0 ?  b.charAt(last_b--) - '0' : 0 ;

            int sum = x + y + carry;

            ans = ( sum % 2 ) + ans;
            carry = sum / 2;
        }

        if(carry == 1) {
            ans = carry + ans;
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        binary_sum("111","1");
    }

}
