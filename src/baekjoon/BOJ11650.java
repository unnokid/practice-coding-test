package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ11650 {

    public static void main(String[] args) throws IOException {
        //백준 11650 좌표 정렬하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());

        int[][] map = new int[N][2];
        for (int i = 0; i <N ; i++) {
            String[] s = br.readLine().split(" ");
            map[i][0] = Integer.parseInt(s[0]);
            map[i][1] = Integer.parseInt(s[1]);
        }

        //정렬
        Arrays.sort(map, (o1, o2) ->{
            if(o1[0] == o2[0]){
                return Integer.compare(o1[1], o2[1]);
            }else{
                return Integer.compare(o1[0], o2[0]);
            }
        });

        for (int i = 0; i < N; i++) {
            System.out.println(map[i][0]+ " "+map[i][1]);
        }

    }
}
