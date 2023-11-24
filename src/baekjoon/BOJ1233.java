package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1233 {
    public static void main(String[] args) throws IOException {
        //백준 1233 주사위
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int S1 = Integer.parseInt(s[0]);
        int S2 = Integer.parseInt(s[1]);
        int S3 = Integer.parseInt(s[2]);

        int[] arr= new int[(S1 + S2 + S3) - 2];
        int max = 0;
        int result = 0;

        for(int i = 1; i <= S1; i++) {
            for(int j = 1; j <= S2; j++) {
                for(int k = 1; k <= S3; k++) {
                    int sum = i + j + k;
                    arr[sum - 3]++;
                }
            }
        }


        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
                result = i + 3;
            }
        }
        System.out.println(result);
    }
}
