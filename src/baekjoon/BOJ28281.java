package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ28281 {
    public static void main(String[] args) throws IOException {
        //백준 28281 선물
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int X = Integer.parseInt(s[1]);

        String[] prices = br.readLine().split(" ");
        int sum = Integer.parseInt(prices[0]);
        int before = 0;
        int result = Integer.MAX_VALUE;
        for (int i = 1; i <N ; i++) {
            int next = Integer.parseInt(prices[i]);
            sum-=before;
            before = sum;
            sum+=next;
            result = Math.min(sum,result);
        }
        System.out.println(result*X);
    }
}
