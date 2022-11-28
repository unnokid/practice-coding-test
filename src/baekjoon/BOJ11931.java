package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ11931 {

    public static void main(String[] args) throws IOException {
        //백준 11931 수 정렬하기 4

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[N];
        for (int i = 0; i <N ; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        for (int i = arr.length-1; i >=0 ; i--) {
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb);
    }
}
