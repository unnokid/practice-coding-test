package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2003 {

    public static void main(String[] args) throws IOException {
        //백준 2003 수들의 합2

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        int[] arr = new int[N];
        int result =0;
        String[] s1 = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(s1[i]);
        }

        int start = 0;
        int end = 0;
        int sum = 0;

        while(start < N) {
            if(sum > M || end == N){
                sum-=arr[start++];
            }
            else{
                sum+=arr[end++];
            }

            if(sum==M) {
                result++;
            }
        }

        System.out.println(result);
    }

}
