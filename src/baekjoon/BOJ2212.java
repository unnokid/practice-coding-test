package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2212 {

    public static void main(String[] args) throws IOException {
        //백준 2212 센서

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        //만약 센서개수보다 설치할 수 있는 기지국이 많으면 하나씩 다 놓으면 됨
        if(K >= N){
            System.out.println(0);
            return;
        }

        int[] sense = new int[N];
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            sense[i] = Integer.parseInt(s[i]);
        }

        Arrays.sort(sense);
        //어떻게하면 가까운 그룹끼리 묶어서 K부분 만큼 나눌수있는가?
        //파트를 K 만큼으로 나누어서 길이를 더해야함
        int[] distance = new int[N-1];

        //만약 기지국을 설치하고 그 기지국은 센서를 포함해야함
        //거리가 젤 가까운녀석부터 포함하려면 제일 작은 거리부터 더해야 기지국이 영향력을 펼칠수있는 최소 단위
        //거리가 가까운 친구들부터 묶어야함

        for (int i = 0; i <distance.length ; i++) {
            //각 센서와의 거리
            distance[i] = sense[i+1] - sense[i];
        }
        Arrays.sort(distance);
        int result =0;

        for (int i = 0; i <distance.length-K+1 ; i++) {
            result+= distance[i];
        }
        System.out.println(result);
    }
}
