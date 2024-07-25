package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5218 {
    public static void main(String[] args) throws IOException {
        //백준 5218 알파벳 거리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            sb.append("Distances: ");
            for (int j = 0; j < s[0].length(); j++) {
                int front = s[0].charAt(j) -'A'+1;
                int back = s[1].charAt(j) -'A'+1;
                if(front <= back){
                    sb.append(back-front).append(" ");
                }else{
                    sb.append(back+26-front).append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
