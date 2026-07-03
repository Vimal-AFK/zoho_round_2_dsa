package solutions;

public class sum_of_elements_based_on_occurance {
    public static void sum_of_elements_based_on_occurance_method_1(int[] arr) {
        int n = arr.length;

        int[] sumFreq = new int[n+1];


        int max = 0 ;
        for ( int x : arr ) if ( max < x ) max = x;

        boolean[] seen = new boolean[max+1];
        for (int i = 0; i < max + 1; i++) {
            seen[i] = false;
        }

        for ( int i = 0 ; i < n ; i++ ) {
            int count = 1 ;
            if ( seen[arr[i]] ) continue;
            for (int j = i+1; j < n; j++) {
                if ( arr[j] == arr[i] ) count++;
            }
            seen[arr[i]] = true;
            sumFreq[count] = sumFreq[count] + arr[i] * count;
        }

        for (int i = 0; i < n+1; i++) {
            if ( sumFreq[i] > 0 ) {
                System.out.println(i + "-->" + sumFreq[i]);
            }

        }

    }

    public static void sum_of_elements_based_on_occurance_method_2(int[] arr) {
        int n = arr.length;

        int max = arr[0];
        for ( int x : arr ) max = max < x ? x : max;

        int[] bucket = new int[max+1];

        for (int i = 0; i < n; i++) {
            bucket[arr[i]]++;
        }

        int[] sum = new int[n+1];

        for ( int i = 0 ; i < max + 1 ; i++ ) {
            if ( bucket[i] > 0 ) {
                sum[bucket[i]] += i * bucket[i];
            }
        }

        for (int i = 0; i < n+1; i++) {
            if ( sum[i] > 0 ) {
                System.out.println(i + "-->" + sum[i]);
            }

        }


    }

}
