package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ16486 {
    public static void main(String[] args) throws IOException {
        //백준 16486 운동장 한 바퀴
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());
        int R = Integer.parseInt(br.readLine());

        System.out.println(2*C + 2*R*3.141592);
    }
}
