package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10951 {
    public static void main(String[] args) throws IOException {
        //백준 10951 A+B -4
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        String s;
        while( (s=br.readLine()) != null){
            String[] temp = s.split(" ");
            int A = Integer.parseInt(temp[0]);
            int B = Integer.parseInt(temp[1]);
            sb.append(A+B).append("\n");
        }
        System.out.println(sb);
    }
}
