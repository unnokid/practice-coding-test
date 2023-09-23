package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1731 {
    public static void main(String[] args) throws IOException {
        //백준 1731 추론
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        boolean check = false;
        int A = arr[1] - arr[0];
        int B = arr[2] - arr[1];

        if(A == B){
            System.out.println(arr[arr.length-1]+A);
        }else{
            int target = arr[1]/arr[0];
            System.out.println(arr[arr.length-1]*target);
        }
    }
}
