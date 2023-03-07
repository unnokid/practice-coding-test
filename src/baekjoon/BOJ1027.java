package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1027 {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        //백준 1027 고층 건물

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        String[] s = br.readLine().split(" ");
        for (int i = 0; i <N ; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        //두 위치를 이었을때 중간에 큰 빌딩이 없어야할 것(같은 높이라면 인정하는 듯)
        //선을 잇는다고 가정한다면 <- 시선 방향시 기울기가 감소해야함, -> 시선 방향시 기울기가 증가해야 보임

        int[] answer = new int[N];

        for (int i = 0; i <N-1 ; i++) {
            //각각의 건물 입장에서 보이는 건물을 카운트 해주기
            answer[i]++;//현재 건물은 오른쪽이 보임
            answer[i+1]++;//마찬가지로 오른쪽 건물도 왼쪽이 보임

            //기준이 될 기울기 설정해야함
            double level = slope(i,i+1);

            //오른쪽으로 2칸이동부터 시작함
            for (int j = i+2; j < N; j++) {
                double nextLevel = slope(i,j);
                 //-> 시선 방향시 기울기가 증가해야 보임
                if(nextLevel > level){
                    level = nextLevel;
                    //i와 j에 각각 보이는 건물 추가
                    answer[i]++;
                    answer[j]++;
                }
            }
        }
        int result =0;

        for (int i = 0; i <answer.length ; i++) {
            result = Math.max(result,answer[i]);
        }

        System.out.println(result);
    }
    private static double slope(int x, int y){
        return (double)(arr[y]-arr[x]) / (y - x);
    }
}
