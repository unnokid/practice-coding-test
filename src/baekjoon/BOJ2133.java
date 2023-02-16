package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2133 {

    public static void main(String[] args) throws IOException {
        //백준 2133 타일 채우기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        //총 5가지의 경우의 수가 나올 수 있음
        // 가로가 4칸으로 구성일때 나올수 있는 경우 2가지
        // 가로가 2칸일때 나올 수 있는 경우 3가지
        // 생각해보니 세로가 이미 홀수인데, N마저 홀수가 나오면 채워넣을 경우가 존재하지 않음
        //2 -> 3가지, 4-> 11(3*3 +2(4사이즈로 2가지 방법))

        if (N % 2 == 1) {
            System.out.println(0);
            return;
        }

        int[] map = new int[N + 1];
        map[0] = 1;// 나중에 +2 하는 수때문에 1로 고정함
        map[1] = 0;// 만들 수 없음
        map[2] = 3;// N=2 일때 경우 3가지

        for (int i = 4; i <= N; i += 2) {
            map[i] = map[i - 2] * map[2];

            for (int j = i - 4; j >= 0; j -= 2) {
                //N이 4일때부터 추가적인 경우의 수 발생
                map[i] = map[i] + (map[j] * 2);
            }
        }

        System.out.println(map[N]);
    }
}
