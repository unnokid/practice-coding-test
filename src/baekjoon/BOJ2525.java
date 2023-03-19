package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2525 {

    public static void main(String[] args) throws IOException {
        //백준 2525 오븐 시계

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int A = Integer.parseInt(s[0]);
        int B= Integer.parseInt(s[1]);

        int C = Integer.parseInt(br.readLine());

        int min = 60* A+ B;
        min +=C;

        int hour = (min/60)%24;
        int minute = min%60;

        System.out.println(hour +" "+minute);
    }
}
