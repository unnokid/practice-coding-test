package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2530 {
    public static void main(String[] args) throws IOException {
        //백준 2530 인공지능 시계

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");

        int h = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        int s = Integer.parseInt(split[2]);

        int T = Integer.parseInt(br.readLine());

        //요리시간 추가
        s+= T%60;
        T/=60;
        m+= T%60;
        T/=60;
        h+=T;

        //넘치는 시간 계산
        m+= s/60;
        s%=60;
        h+= m/60;
        m%=60;
        h%=24;

        System.out.println(h+" "+m+" "+s);
    }
}
