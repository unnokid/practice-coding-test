package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ14914 {
    public static void main(String[] args) throws IOException {
        //백준 14914 사과와 바나나 나눠주기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        int apple  = Integer.parseInt(s[0]);
        int banana  = Integer.parseInt(s[1]);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <=Math.min(apple,banana) ; i++) {
            if(apple %i ==0 && banana % i ==0){
                sb.append(i).append(" ").append(apple/i).append(" ").append(banana/i).append("\n");
            }
        }
        System.out.println(sb);
    }
}
