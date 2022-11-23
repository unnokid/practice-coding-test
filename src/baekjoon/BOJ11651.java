package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ11651 {

    public static void main(String[] args) throws IOException {
        //백준 11651 좌표 정렬하기 2

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] map = new int[N][2];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <N ; i++) {
            String[] s = br.readLine().split(" ");
            map[i][0] = Integer.parseInt(s[0]);
            map[i][1] = Integer.parseInt(s[1]);
        }

        //먼저 2번째 오름차순 기준, 2번째가 같다면 첫번째 오름차순
        Arrays.sort(map, (o1, o2) -> {
            if(o1[1] == o2[1]){
                return o1[0]-o2[0];
            }else{
                return o1[1] -o2[1];
            }
        });

        for (int i = 0; i <N ; i++) {
            sb.append(map[i][0] +" "+map[i][1]+"\n");
        }
        System.out.println(sb);
    }
}
