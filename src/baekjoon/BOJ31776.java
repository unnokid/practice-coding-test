package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ31776 {
    public static void main(String[] args) throws IOException {
        //백준 31776 예비 소집 결과 보고서
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count =0;
        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            int[] arr = new int[3];
            boolean pass = false;
            boolean solved = false;
            int sum =0;
            for (int j = 0; j < arr.length; j++) {
                arr[j] = Integer.parseInt(s[j]);
                sum+=arr[j];
                if(arr[j] == -1){
                    arr[j] =Integer.MAX_VALUE;
                }
            }
            if(sum ==-3){
                continue;
            }

            if(arr[0] <= arr[1] && arr[1] <= arr[2]){
                count++;
            }
        }
        System.out.println(count);

    }
}
