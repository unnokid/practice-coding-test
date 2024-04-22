package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ25641 {
    public static void main(String[] args) throws IOException {
        //백준 25641 균형 잡힌 소떡소떡
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();

        int sCount = 0;
        int tCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 's') {
                sCount++;
            } else if (s.charAt(i) == 't') {
                tCount++;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (sCount == tCount) {
                sb.append(s.substring(i)).append("\n");
                break;
            } else if (s.charAt(i) == 's') {
                sCount--;
            } else if (s.charAt(i) == 't') {
                tCount--;
            }
        }

        System.out.println(sb);
    }
}
