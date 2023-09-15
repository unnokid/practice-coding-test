package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ13866 {
    public static void main(String[] args) throws IOException {
        //백준 13866 팀 나누기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int[] arr = new int[4];

        for (int i = 0; i <s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(arr);

        System.out.println(Math.abs((arr[3]+arr[0])-(arr[1]+arr[2])));
    }
}
