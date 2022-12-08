package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ20055 {
    static int N;
    static int K;
    public static void main(String[] args) throws IOException {
        //백준 20055 컨베이어 벨트 위의 로봇

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        N = Integer.parseInt(s[0]);
        K = Integer.parseInt(s[1]);
        int[] durability = new int[2*N];
        String[] s1 = br.readLine().split(" ");
        for (int i = 0; i <durability.length ; i++) {
            durability[i] = Integer.parseInt(s1[i]);
        }
        boolean[] robot = new boolean[N];

        //로봇은 무조건 1에 놓음
        //N번째 칸에 도착하면 바로 내려짐
        // 칸을 밟는 순간 내구도 -1
        int turn =0;
        while(check(durability)){
            boolean pass = false;

            //한칸 회전
            int temp  = durability[durability.length-1];
            for (int i = durability.length-1; i >0 ; i--) {
                durability[i] = durability[i-1];
            }
            durability[0] = temp;

            //벨트에 따른 로봇이동
            for (int i = robot.length-1; i >0 ; i--) {
                robot[i] = robot[i-1];
            }

            //회전시 바로 내려버리라고 했으니 false
            robot[0] =false;
            robot[N-1] = false;


            //로봇혼자 이동
            for (int i = N-1; i >0 ; i--) {
                if(robot[i-1] && !robot[i] && durability[i] >0){
                    //전에 존재하면서 현재위치는 존재안하고 내구도가 0이상인 경우
                    robot[i] = true;
                    robot[i-1] = false;
                    durability[i]--;
                }
            }

            if(durability[0] >0){
                //로봇 1번위치에 놓을수 있는지 여부
                robot[0] = true;
                durability[0]--;
            }

            turn++;
        }
        System.out.println(turn);

    }
    private static boolean check(int[] durability){

        int total =0;
        for (int i = 0; i <durability.length ; i++) {
            if(durability[i] ==0){
                total++;
            }

            if(total >= K){
                //끝
                return false;
            }
        }
        return true;
    }

}
