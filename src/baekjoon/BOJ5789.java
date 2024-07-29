package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5789 {
    public static void main(String[] args) throws IOException {
        //백준 5789 한다 안한다
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            int startIdx =s.length()/2-1;
            int endIdx = s.length()/2;

            if(s.charAt(startIdx) == s.charAt(endIdx)){
                sb.append("Do-it").append("\n");
            }else{
                sb.append("Do-it-Not").append("\n");
            }
        }
        System.out.println(sb);
    }
}
