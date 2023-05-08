package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ1417 {
    public static void main(String[] args) throws IOException {
        //백준 1417 국회의원 선거
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if(N == 1){
            System.out.println(0);
            return;
        }

        int A = Integer.parseInt(br.readLine());
        int[] arr = new int[N-1];
        for (int i = 0; i <N-1 ; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int count =0;

        while(true){
            Arrays.sort(arr);
            if(arr[N-2] < A){
                break;
            }
            arr[N-2]--;
            A++;
            count++;
        }

        System.out.println(count);
    }
}
