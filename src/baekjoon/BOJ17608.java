package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ17608 {
    public static void main(String[] args) throws IOException {
        //백준 17608 막대기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i <N ; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int result = 0;
        int idx =0;
        for (int i = N-1; i >=0 ; i--) {
            if(idx < arr[i]){
                result++;
                idx = arr[i];
            }
        }
        System.out.println(result);
    }

}
