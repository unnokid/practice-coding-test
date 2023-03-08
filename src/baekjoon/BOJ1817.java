package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1817 {

    public static void main(String[] args) throws IOException {
        //백준 1817 짐 챙기는 숌

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        if(N == 0){
            System.out.println(0);
            return;
        }

        String[] s1 = br.readLine().split(" ");
        int[] arr = new int[N];
        for (int i = 0; i <N ; i++) {
            arr[i] = Integer.parseInt(s1[i]);
        }

        int box = 1;
        int sum =0;

        for (int i = 0; i < N; i++) {
            sum+=arr[i];
            if(sum > M){
                box++;
                sum = arr[i];
            }
        }
        System.out.println(box);

    }
}
