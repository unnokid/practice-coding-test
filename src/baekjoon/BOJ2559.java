package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2559 {
    public static void main(String[] args) throws IOException {
        //백준 2559 수열
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int len = Integer.parseInt(s[1]);

        String[] s1 = br.readLine().split(" ");
        int max =-100000000;
        int[] arr = new int[N];
        for (int i = 0; i <N ; i++) {
            arr[i] = Integer.parseInt(s1[i]);
        }
        int sum =0;
        for (int i = 0; i < len; i++) {
            sum+=arr[i];
        }
        max = Math.max(max,sum);
        for (int i = len; i <N ; i++) {
            sum+=arr[i];
            sum-=arr[i-len];
            max = Math.max(max,sum);
        }
        System.out.println(max);
    }
}
