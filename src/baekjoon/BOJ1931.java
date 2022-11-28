package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ1931 {

    public static void main(String[] args) throws IOException {
        //백준 1931 회의실 배정

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] time = new int[N][2];
        int count = 0;
        int finish =0;
        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            time[i][0] = Integer.parseInt(s[0]);
            time[i][1] = Integer.parseInt(s[1]);
        }

        Arrays.sort(time, (o1, o2) -> {
            if(o1[1] == o2[1]){
                return o1[0] - o2[0];
            }
            return o1[1]- o2[1];
        });

        for (int i = 0; i <N ; i++) {
            if(finish <= time[i][0]){
                finish = time[i][1];
                count++;
            }
        }
        System.out.println(count);
    }
}
