package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2846 {
    public static void main(String[] args) throws IOException {
        //백준 2846 오르막길
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        String[] s = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        int max =0;
        int sum =0;
        int idx = arr[0];
        for (int i = 1; i < N; i++) {
            if(idx < arr[i]){
                sum+= (arr[i]-idx);
            }else{
                max = Math.max(max,sum);
                sum=0;
            }
            idx = arr[i];
        }

        if(sum !=0){
            max = Math.max(max,sum);
        }
        System.out.println(max);
    }
}
