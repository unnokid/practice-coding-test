package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5717 {
    public static void main(String[] args) throws IOException {
        //백준 5717 상근이의 친구들

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            String[] s = br.readLine().split(" ");
            int man = Integer.parseInt(s[0]);
            int women = Integer.parseInt(s[1]);

            if(man ==0 && women ==0){
                break;
            }
            int sum = man +women;
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}
