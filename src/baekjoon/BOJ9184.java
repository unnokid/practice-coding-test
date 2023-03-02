package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9184 {

    static int[][][] map = new int[21][21][21];

    public static void main(String[] args) throws IOException {
        //백준 9184 신나는 함수 실행

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        while (true) {
            String[] s = br.readLine().split(" ");

            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            int c = Integer.parseInt(s[2]);

            if (a == -1 && b == -1 && c == -1) {
                break;
            }
            sb.append("w(").append(a).append(", ").append(b).append(", ").append(c).append(") = ")
                .append(w(a, b, c)).append("\n");
        }

        System.out.println(sb);
    }

    public static int w(int a, int b, int c) {
        //피보나치 느낌
        //끝나는 조건
        if (a <= 0 || b <= 0 || c <= 0) {
            return 1;
        }

        if (a > 20 || b > 20 || c > 20) {
            return w(20, 20, 20);
        }

        //만약 한번 계산했던 내용인지를 확인하기
        if(map[a][b][c] != 0){
            return map[a][b][c];
        }

        //그다음 계산
        if (a < b && b < c) {
            map[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
            return map[a][b][c];
        }

        //나머지 조건
        map[a][b][c] = w(a-1,b,c) + w(a-1,b-1,c) + w(a-1,b,c-1) - w(a-1,b-1,c-1);
        return map[a][b][c];
    }
}
