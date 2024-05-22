package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ14656 {
    public static void main(String[] args) throws IOException {
        //백준 14656 조교는 새디스트야!!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] s = br.readLine().split(" ");
        int count =0;
        for (int i = 1; i <= N; i++) {
            int target = Integer.parseInt(s[i-1]);
            if(target !=i){
                count++;
            }
        }
        System.out.println(count);
    }
}
