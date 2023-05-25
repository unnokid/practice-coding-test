package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10797 {
    public static void main(String[] args) throws IOException {
        //백준 10797 10부제
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result =0;
        int[] arr = new int[5];
        String[] s = br.readLine().split(" ");
        for (int i = 0; i <5 ; i++) {
            arr[i]= Integer.parseInt(s[i]);
        }

        for (int i = 0; i <5 ; i++) {
            if(arr[i]%10 == N){
                result++;
            }
        }
        System.out.println(result);
    }
}
