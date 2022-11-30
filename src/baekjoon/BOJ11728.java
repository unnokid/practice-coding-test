package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ11728 {

    public static void main(String[] args) throws IOException {
        //백준 11728 배열 합치기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        String[] s1 = br.readLine().split(" ");
        String[] s2 = br.readLine().split(" ");

        int[] arr = new int[s1.length+s2.length];
        int idx =0;
        for (int i = 0; i <s1.length ; i++) {
            arr[idx++] = Integer.parseInt(s1[i]);
        }

        for (int i = 0; i <s2.length ; i++) {
            arr[idx++] = Integer.parseInt(s2[i]);
        }
        Arrays.sort(arr);
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i <arr.length ; i++) {
            sb.append(arr[i]).append(" ");
        }

        System.out.println(sb);
    }
}
