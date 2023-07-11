package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5575 {
    public static void main(String[] args) throws IOException {
        //백준 5575 타임 카드
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            String[] s = br.readLine().split(" ");
            int startH = Integer.parseInt(s[0]);
            int startM = Integer.parseInt(s[1]);
            int startS = Integer.parseInt(s[2]);
            int endH = Integer.parseInt(s[3]);
            int endM = Integer.parseInt(s[4]);
            int endS = Integer.parseInt(s[5]);

            if(endS<startS){
                endM--;
                endS+=60;
            }
            if(endM<startM){
                endH--;
                endM+=60;
            }

            sb.append(endH-startH).append(" ").append(endM-startM).append(" ").append(endS-startS).append("\n");
        }

        System.out.println(sb);

    }
}
