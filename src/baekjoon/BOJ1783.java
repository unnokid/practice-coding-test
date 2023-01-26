package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1783 {
    public static void main(String[] args) throws IOException {
        //백준 1783 병든 나이트

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        //4번보다 크다면 이동방법을 한번씩 사용해야한다? 이말은 같은 이동을 다른이동안하고는 최대 4번이라고 이해했음
        //가능한 움직임은 1. ↑↑→, 2. ↑→→, 3.↓↓→, 4. ↓→→
        //즉 세로길이가 중요한 N에 따라 나누어질듯
        //dfs식으로 찾으려고 했지만 제한사항이 너무 커서 시간초과
        int result = 0;
        if(N ==1){
            //움직임 불가 서있는자리가 끝
            result =1;
        }else if(N ==2){
            // 2번과 4번 움직임 사용 가능하지만 5회차 움직임부터는 조건을 만족해야되서 최대 4번
            //가로길이를 만족하는지?
            result = Math.min(4,(M+1)/2);
        }else {
            //n이 3이상으로 1,2,3,4 이동가능
            if (M < 7) {
                //1,2,3,4 오른쪽움직임을 모두 만족할 가로가 짧은 경우
                result = Math.min(4,M);
            }else{
                //4가지 모두 만족하기 위해 2 1 2 1 이동
                //최대로 많이 이동하기위해선 위 조건 만족후 오른쪽으로 1씩만 이동하는게 유리
                //즉 M에서 처음 2칸씩 간 경우를 빼면 됨
                result = M-2;

            }
        }
        System.out.println(result);
    }
}
