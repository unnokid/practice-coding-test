package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10799 {

    public static void main(String[] args) throws IOException {
        //백준 10799 쇠막대기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int count = 0;
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                count++;
            } else {
                count--;

                //레이저가 발사되는 () 인지 아니면 ))) 닫는 중인지 알아야함
                if (s.charAt(i - 1) == '(') {
                    result += count;
                } else {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
