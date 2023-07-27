package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1598 {
    public static void main(String[] args) throws IOException {
        //백준 1598 꼬리를 무는 숫자 나열

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int A = Integer.parseInt(s[0])-1;
        int B = Integer.parseInt(s[1])-1;

        int widthA = A/4;
        int heightA = A%4;

        int widthB = B/4;
        int heightB = B%4;

        System.out.println(Math.abs(widthA-widthB)+Math.abs(heightA-heightB));
    }
}
