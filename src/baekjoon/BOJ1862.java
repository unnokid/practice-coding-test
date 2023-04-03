package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1862 {
    public static void main(String[] args) throws IOException {
        //백준 1862 미터계

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int len = Integer.toString(N).length();
        int answer =0;
        //숫자 4를 사용하지 않음
        //N보다 작은 숫자이면서 4를 포함한 숫자인 경우 거리가 -1 하도록 계산

        // 현재 위치에서 4를 포함하는지에 대한 여부를 생각 해야함
        for (int i = 0; i < len; i++) {
            int target = N%10;
            N /=10;

            if(target >4){
                //현재 자릿수가 4이상이면
                //i가 점점 쌓여서 각 자릿수 경우의 수로 계산
                answer += (target -1) * Math.pow(9,i);
            }else{
                answer += target * Math.pow(9,i);
            }
        }

        System.out.println(answer);
    }
}
