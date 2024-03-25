package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ26546 {
    public static void main(String[] args) throws IOException {
        //백준 26546 Reverse

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
            String[] split = br.readLine().split(" ");
            String word = split[0];
            int start = Integer.parseInt(split[1]);
            int end = Integer.parseInt(split[2]);
            
            for(int j=0;j<word.length();j++){
                if(j>=start && j< end){
                    continue;
                }
                sb.append(word.charAt(j));
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }
}
