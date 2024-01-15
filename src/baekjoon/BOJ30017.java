package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ30017 {
    public static void main(String[] args) throws IOException {
        //백준 30017 치즈버거 만들기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int meat = Integer.parseInt(s[0]);
        int cheeze = Integer.parseInt(s[1]);

        meat-=2;
        cheeze--;
        int result = 3;
        result +=2*Math.min(meat,cheeze);
        System.out.println(result);
    }
}
