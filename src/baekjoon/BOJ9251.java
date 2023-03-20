package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9251 {

    public static void main(String[] args) throws IOException {
        //백준 9251 LCS

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();

        int[][] map = new int[A.length()+1][B.length()+1];

        for (int i = 1; i <=A.length() ; i++) {
            for (int j = 1; j <=B.length() ; j++) {
                if(A.charAt(i-1) == B.charAt(j-1)){
                    map[i][j] = map[i-1][j-1] +1;
                }else{
                    map[i][j] = Math.max(map[i-1][j], map[i][j-1]);
                }

            }
        }

        System.out.println(map[A.length()][B.length()]);
    }
}
