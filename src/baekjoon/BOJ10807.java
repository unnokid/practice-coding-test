package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BOJ10807 {
    public static void main(String[] args) throws IOException {
        //백준 10807 개수 세기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            int target = Integer.parseInt(s[i]);
            arr[i] =target;
        }
        int V = Integer.parseInt(br.readLine());
        int count =0;
        for (int i = 0; i < N; i++) {
            if(V == arr[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
