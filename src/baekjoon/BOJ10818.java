package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ10818 {

    public static void main(String[] args) throws IOException {
        //백준 10818 최소, 최대

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        String[] s = br.readLine().split(" ");
        for (int i = 0; i <N ; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(arr);

        System.out.println(arr[0]+" "+arr[N-1]);
    }
}
