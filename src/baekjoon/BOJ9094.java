package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9094 {
    public static void main(String[] args) throws IOException {
        //백준 9094 수학적 호기심
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String[] s = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int count =0;

            // 0< a,b < n 조건
            for (int j = 1; j < n -1; j++) {
                for (int k = j+1; k < n; k++) {
                    int target = (int) (Math.pow(j+k,2) + m);
                    int value = j*k;
                    if(target %(value) ==0){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
