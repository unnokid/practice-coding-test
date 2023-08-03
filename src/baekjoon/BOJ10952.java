package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10952 {
    public static void main(String[] args) throws IOException {
        //백준 10952 A+B -5
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();
        while(true){
            String[] s = br.readLine().split(" ");
            int A = Integer.parseInt(s[0]);
            int B = Integer.parseInt(s[1]);

            if(A ==0 && B ==0){
                break;
            }
            sb.append(A+B).append("\n");
        }
        System.out.println(sb);
    }
}
