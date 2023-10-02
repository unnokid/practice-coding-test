package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1269 {
    public static void main(String[] args) throws IOException {
        //백준 1269 대칭 차집합

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int[] arr = new int[100000001];
        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);
        String[] s1 = br.readLine().split(" ");
        for (int i = 0; i < A; i++) {
            arr[Integer.parseInt(s1[i])]++;
        }

        String[] s2 = br.readLine().split(" ");
        for (int i = 0; i < B; i++) {
            arr[Integer.parseInt(s2[i])]++;
        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 1){
                sum++;
            }
        }

        System.out.println(A+B-(sum*2));
    }
}
