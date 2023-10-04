package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10995 {
    public static void main(String[] args) throws IOException {
        //백준 10995 별 찍기 - 20
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        StringBuilder star = new StringBuilder();
        for (int i = 0; i < N*2; i++) {
            if(i%2==0){
                star.append("*");
            }else{
                star.append(" ");
            }
        }

        for (int i = 0; i <N ; i++) {
            if(i%2==0){
                sb.append(star).append("\n");
            }else{
                sb.append(star.reverse()).append("\n");
                star.reverse();
            }
        }
        System.out.println(sb);
    }
}
