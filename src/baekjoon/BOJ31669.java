package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ31669 {
    public static void main(String[] args) throws IOException {
        //백준 31669 특별한 학교 탈출
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        boolean[] schedule= new boolean[M];

        for (int i = 0; i < N; i++) {
            String[] s1 = br.readLine().split("");
            for (int j = 0; j < M; j++) {
                if(s1[j].equals("O")){
                    schedule[j] =true;
                }
            }
        }
        int result = -1;
        for (int i = 0; i <schedule.length ; i++) {
            if(!schedule[i]){
                result = i+1;
                break;
            }
        }
        System.out.println(result == -1 ? "ESCAPE FAILED":result);
    }
}
