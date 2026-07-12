package dsa;

public class next_greater_element {
    public static void next_greater_element(int[] arr){

        int len = arr.length;
        Stack s = new Stack(len);
        int[] res = new int[len];
        for (int i = len-1 ; i >= 0; i--) {
            while(!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }
            res[i] = s.isEmpty() ? -1 : s.peek();
            s.push(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};
        next_greater_element(arr);
    }
}
