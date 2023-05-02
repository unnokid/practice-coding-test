package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ13305 {
    public static void main(String[] args) throws IOException {
        //백준 13305 주유소

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long[] road = new long[N - 1];
        long[] cost = new long[N];

        long total =0;

        String[] s = br.readLine().split(" ");
        for (int i = 0; i < N - 1; i++) {
            road[i] = Long.parseLong(s[i]);
        }
        String[] s1 = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            cost[i] = Long.parseLong(s1[i]);
        }


        //현재 위치에서 모든 기름을 다 살것인가 or 다음 역에서 기름이 더 싸서 필요한 양만 채울것인가
        for (int i = 0; i <N-1 ; i++) {
            if(cost[i] < cost[i+1]){
                //다음역이 현재보다 더 비쌀경우
                //다음역에 필요한 기름도 이역에서 살꺼임
                cost[i+1] = cost[i];
            }
        }

        //기름 계산
        for (int i = 0; i <N-1 ; i++) {
            total+= road[i]*cost[i];
        }
        System.out.println(total);

    }
}
