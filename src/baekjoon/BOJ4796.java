package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ4796 {
    public static void main(String[] args) throws IOException {
        //백준 4796 캠핑
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int count =1;
        while(true){
            String[] s = br.readLine().split(" ");
            int L = Integer.parseInt(s[0]);
            int P = Integer.parseInt(s[1]);
            int V = Integer.parseInt(s[2]);

            if(L ==0 && P ==0 && V ==0){
                break;
            }

            int total = L * (V / P) + Math.min(L, V % P);
            sb.append("Case ").append(count++).append(": ").append(total).append("\n");

        }
        System.out.println(sb);
    }
}
