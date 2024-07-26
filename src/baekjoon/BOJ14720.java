package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ14720 {
    public static void main(String[] args) throws IOException {
        //백준 14720 우유 축제
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");

        int idx =0;
        int count =0;
        int[] arr =new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        for (int i = 0; i < N; i++) {
            if(arr[i] == idx){
                idx++;
                idx%=3;
                count++;
            }
        }
        System.out.println(count);


    }
}
