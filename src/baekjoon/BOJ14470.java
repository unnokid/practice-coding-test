package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ14470 {
    public static void main(String[] args) throws IOException {
        //백준 14470 전자레인지
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int degree = 0;

        if(arr[0] <0){
            degree = Math.abs(arr[0])* arr[2] + arr[3] + (arr[1]*arr[4]);
        }else if(arr[0] == 0){
            degree = arr[3] + (arr[1]*arr[4]);
        }else{
            degree = (arr[1] - arr[0])*arr[4];
        }
        System.out.println(degree);
    }
}
