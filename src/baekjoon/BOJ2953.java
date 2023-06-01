package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2953 {
    public static void main(String[] args) throws IOException {
        //백준 2953 나는 요리사다

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[4];
        int result =0;
        int idx =0;
        for (int i = 0; i < 5; i++) {

            String[] s = br.readLine().split(" ");
            int sum =0;
            for (int j = 0; j < 4; j++) {
                sum+= Integer.parseInt(s[j]);
            }
            if(result< sum){
                result = sum;
                idx =i;
            }
        }
        System.out.println((idx+1)+" "+result);
    }
}
