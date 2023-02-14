package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ14719 {

    public static void main(String[] args) throws IOException {
        //백준 14719 빗물

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int H = Integer.parseInt(s[0]);
        int W = Integer.parseInt(s[1]);

        int[] map = new int[W];
        String[] temp = br.readLine().split(" ");
        for (int i = 0; i < W; i++) {
            map[i] = Integer.parseInt(temp[i]);
        }

        int result =0;
        for (int i = 1; i < map.length; i++) {
            int left =0;
            int right =0;
            //현재 위치에서 왼쪽 오른쪽으로 갈때 가장 큰 기둥찾기
            for (int j = 0; j <i ; j++) {
                left = Math.max(left,map[j]);
            }

            for (int j = i; j <W ; j++) {
                right = Math.max(right,map[j]);
            }

            if(map[i] < left && map[i] < right){
                //현재 위치에서 left, right 중 낮은 기둥과 길이 차이
                result+= Math.min(left,right) - map[i];
            }
        }
        System.out.println(result);
    }
}
