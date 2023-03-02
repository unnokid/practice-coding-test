package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11057 {

    public static void main(String[] args) throws IOException {
        //백준 11057 오르막 수

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        //끝자리수 0~9, 맨앞자리
        long[][] map = new long[N+1][10];
        long[] result = new long[N+1];

        for (int i = 0; i <10 ; i++) {
            //1자리의 숫자는 0~9까지 모두 1개
            map[1][i] = 1;
        }
        //따라서 N이 1일때 오르막 수의 개수는 10개
        result[1] = 10;

        for (int i = 2; i <=N ; i++) {
            //result N의 수
            for (int j = 0; j <10 ; j++) {
                //끝자리가 0인수는 무조건 1개 그대로 가져오기
                if(j ==0){
                    map[i][j] = map[i-1][j];
                }else{
                    map[i][j] = map[i][j-1] + map[i-1][j];
                    map[i][j]%=10007;
                }
                result[i]+=map[i][j];
            }

        }

        System.out.println(result[N]%10007);
    }
}
