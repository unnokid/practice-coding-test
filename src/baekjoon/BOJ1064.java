package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1064 {

    public static void main(String[] args) throws IOException {
        //백준 1064 평행사변형

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int x1 = Integer.parseInt(s[0]);
        int y1 = Integer.parseInt(s[1]);
        int x2 = Integer.parseInt(s[2]);
        int y2 = Integer.parseInt(s[3]);
        int x3 = Integer.parseInt(s[4]);
        int y3 = Integer.parseInt(s[5]);

        //평행 사변형 3점이 주어졌을때 내가 만들어낼수있는 경우는 총 3가지
        //넓이가 아닌 외부 길이니 두점사이 거리만 측정해서 앞뒤옆 3가지 방법중 가장 큰것과 작은것

        // 세점이 같은 직선 위에 있으면 실패
        if((x2-x1)*(y3-y2)== (x3-x2)*(y2-y1)){
            System.out.println(-1);
            return;
        }


        //두점 사이 거리 공식 (y2-y1)^2 - (x2-x1)^2 = (두점사이 거리)^2
        double first = Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));
        double second = Math.sqrt(Math.pow(y3 - y1, 2) + Math.pow(x3 - x1, 2));
        double third = Math.sqrt(Math.pow(y3 - y2, 2) + Math.pow(x3 - x2, 2));

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        //3가지중 2개 선택하고 2배하면 평행사변형 외곽 길이
        double[] map = new double[3];
        map[0] = first + second;
        map[1] = second + third;
        map[2] = first + third;

        for (int i = 0; i < 3; i++) {
            if (map[i] > max) {
                max = map[i];
            }
            if (map[i] < min) {
                min = map[i];
            }
        }

        System.out.println((2 * max) - (2 * min));
    }

}
