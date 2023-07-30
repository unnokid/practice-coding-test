package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1769 {
    public static void main(String[] args) throws IOException {
        //백준 1769 3의 배수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String target = br.readLine();
        String answer = "NO";

        int temp = 0;
        int count = 0;
        int next = 0;
        for (int i = 0; i < target.length(); i++)
            temp += target.charAt(i) - '0';
        if (temp < 10 && temp % 3 == 0)
            answer = "YES";
        else if (temp > 9) {
            count = 1;
            while (temp > 9) {
                count++;
                next = 0;
                while (temp > 0) {
                    next += temp % 10;
                    temp /= 10;
                }
                temp = next;
            }
            if (temp % 3 == 0)
                answer = "YES";
        }
        System.out.println(count);
        System.out.println(answer);
    }
}
