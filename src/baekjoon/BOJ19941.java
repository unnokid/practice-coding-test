package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ19941 {
    public static void main(String[] args) throws IOException {
        //백준 19941 햄버거 분배

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);

        String line = br.readLine();

        char[] arr = new char[N];
        boolean[] check = new boolean[N];
        for (int i = 0; i < line.length(); i++) {
            arr[i] = line.charAt(i);
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            //왼쪽 부터 먹음

            if (arr[i] == 'P') {
                //양쪽 사이드 넘어가는 부분 처리
                int start = Math.max(i - K, 0);
                int end = Math.min(i + K, N - 1);

                for (int j = start; j <= end; j++) {
                    if (arr[j] == 'H' && !check[j]) {
                        check[j] = true;
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
