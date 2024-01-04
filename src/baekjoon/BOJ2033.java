package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2033 {
    public static void main(String[] args) throws IOException {
        //백준 2033 반올림
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();
        int len = chars.length;

        int next =0;
        StringBuilder sb = new StringBuilder();

        for (int i = len -1; i >= 1 ; i--) {
            int num = (int) chars[i] - '0';
            int target = num + next;
            next = target >= 5? 1:0;
            sb.append(0);
        }
        sb.insert(0, (int)(chars[0] - '0')+next);
        System.out.println(sb);
    }
}
