package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1032 {
    public static void main(String[] args) throws IOException {
        //백준 1032 명령 프롬프트

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] s = new String[N];
        for (int i = 0; i < N; i++) {
            s[i] = br.readLine();
        }

        //파일 길이는 다 동일하게 주어짐
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s[0].length(); i++) {
            boolean pass = true;
            char target = s[0].charAt(i);
            //하나라도 같지 않으면 false
            for (int j = 1; j < N; j++) {
                if (target != s[j].charAt(i)) {
                    pass = false;
                }
            }

            if (pass) {
                sb.append(target);
            } else {
                sb.append("?");
            }
        }

        System.out.println(sb);
    }
}
