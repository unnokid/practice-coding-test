package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10205 {
    public static void main(String[] args) throws IOException {
        //백준 10205 헤라클레스와 히드라
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= M; i++) {
            int head = Integer.parseInt(br.readLine());

            String[] s = br.readLine().split("");
            for (int j = 0; j < s.length; j++) {
                if(s[j].equals("c")){
                    head++;
                }else{
                    head--;
                }
            }
            sb.append("Data Set ").append(i).append(":").append("\n").append(head).append("\n\n");
        }
        System.out.println(sb);
    }
}
