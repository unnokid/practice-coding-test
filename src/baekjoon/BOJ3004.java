package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ3004 {
    public static void main(String[] args) throws IOException {
        //백준 3004 체스판 조각
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        for(int i = 1; i <= N; i++) {
            if(i == 1) {
                result += 2;
            }else {
                result += ((i / 2) + 1);
            }
        }
        System.out.println(result);
    }
}
