package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1668 {
    public static void main(String[] args) throws IOException {
        //백준 1668 트로피 진열
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr =new int[n];
        int left =0;
        int lCount =0;
        int right =0;
        int rCount =0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < n; i++) {
            if(arr[i] > left){
                left = arr[i];
                lCount++;
            }
        }
        for (int i = n-1; i >=0 ; i--) {
            if(arr[i] > right){
                right = arr[i];
                rCount++;
            }
        }
        System.out.println(lCount);
        System.out.println(rCount);
    }
}
