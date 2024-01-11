package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ27110 {
    public static void main(String[] args) throws IOException {
        //백준 27110 특식 배부
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int sum =0;
        String[] s = br.readLine().split(" ");
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            int target = Integer.parseInt(s[i]);
            sum+=Math.min(target,A);
        }
        System.out.println(sum);
    }
}
