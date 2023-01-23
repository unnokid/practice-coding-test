package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ12605 {

    public static void main(String[] args) throws IOException {
        //백준 12605 단어순서 뒤집기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            String[] s = br.readLine().split(" ");
            StringBuilder sb= new StringBuilder();
            if(s.length == 1){
                sb.append("Case #").append(i).append(": ").append(s[0]);
            }else{
                sb.append("Case #").append(i).append(": ");
                for (int j = s.length-1; j >=0 ; j--) {
                    sb.append(s[j]).append(" ");
                }
            }

            System.out.println(sb);
        }

    }
}
