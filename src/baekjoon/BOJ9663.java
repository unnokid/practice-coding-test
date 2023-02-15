package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9663 {
    static int[] visit;
    static int N;
    static int count =0;
    public static void main(String[] args) throws IOException {
        //백준 9663 N-Queen

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        //퀸을 놓을수 있는지에 대한 조건 찾기
        visit = new int[N];
        dfs(0); // 세로 idx 0부터 시작
        System.out.println(count);
    }
    private static void dfs(int line){
        //여기서 라인은 세로로 생각
        if(line == N){
            count++;
            return;
        }

        for (int i = 0; i < N; i++) {
            //몇번째 세로 line , i번째 가로로 놓을것인지 넣기
            visit[line] = i; 
            
            if(check(line)){
                //놓는게 가능하다면 다음 세로칸으로 이동
                dfs(line+1);
            }
        }
    }
    private static boolean check(int line){
        // 들어온 세로 line, 가로 i에 퀸을 놓을수 있는지 여부

        for (int i = 0; i <line ; i++) {
            if(visit[i] == visit[line]){
                //같은 가로 idx가 존재하는지?
                return false;
            }else if(Math.abs(line -i) == Math.abs(visit[line] - visit[i])){
                //같은 대각선에 있는 경우 x - y의 편차가 같음
                return false;
            }
        }
        return true;
    }
    

}
