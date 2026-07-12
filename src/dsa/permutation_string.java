package dsa;

public class permutation_string {
    static boolean[] visited;
    public static void permutation_string(String s){
        visited = new boolean[s.length()];
        backtrack(s,"");
    }

    public static void backtrack(String s,String curr){

        if ( curr.length() == s.length() ) {
            System.out.println(curr);
            return;
        }

        for( int i = 0 ; i < s.length() ; i++ ) {

            if(visited[i]) continue;
            visited[i] = true;
            backtrack(s,curr + s.charAt(i));
            visited[i] = false;
        }
    }

    public static void main(String[] args) {
        permutation_string("AB");
    }
}
