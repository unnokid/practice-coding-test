package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ14659 {
    public static void main(String[] args) throws IOException {
        //백준 14659 한조서열정리하고옴ㅋㅋ
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        String[] s = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        int result =0;
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = i + 1; j < N; j++) {
                if (arr[i] > arr[j]) { // 자신보다 높은 봉우리면 킬
                    count++;
                } else { // 자신보다 낮은 봉우리면 포기
                    break;
                }
            }
            result = Math.max(result, count);
        }
        System.out.println(result);
    }
}
