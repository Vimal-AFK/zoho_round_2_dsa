package dsa;

public class string_compression {
    public static void string_compression(char[] arr){
        int read = 0 ;
        int write = 0;

        while( read < arr.length ) {
            char c = arr[read++];
            int count = 0;
            while( read < arr.length && arr[read] == c ) {
                read++;
                count++;
            }

            arr[write++] = c;

            if ( count > 1 ) {
                int start = write;
                while ( count > 0 ) {
                    int digit = (count % 10);
                    arr[write++] = (char)digit;
                    count /= 10;
                }
                int end = write - 1;

                while ( start < end) {
                    char temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                    start++;
                    end--;
                }
            }
        }

        System.out.println(write);
        for(char x : arr) {
            System.out.print(x+" ");
        }
    }

    public static void main(String[] args) {
        char[] arr = {'a','a','a','b','b','c','c','c'};
        string_compression(arr);
    }
}
