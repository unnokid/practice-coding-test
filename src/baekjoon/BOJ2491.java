package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2491 {
    public static void main(String[] args) throws IOException {
        //백준 2491 수열
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        int countMax =1;
        int result =1;
        for (int i = 0; i <N-1 ; i++) {
            if(arr[i] <= arr[i+1]){
                countMax++;
            }else{
                countMax =1;
            }
            result = Math.max(result,countMax);
        }

        int countMin = 1;
        for (int i = 0; i <N-1 ; i++) {
            if(arr[i] >= arr[i+1]){
                countMin++;
            }else{
                countMin =1;
            }
            result = Math.max(result,countMin);
        }

        System.out.println(result);
    }
}
