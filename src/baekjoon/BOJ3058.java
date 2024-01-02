package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ3058 {
    public static void main(String[] args) throws IOException {
        //백준 3058 짝수를 찾아라
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            String[] s = br.readLine().split(" ");
            int sum =0;
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < s.length; j++) {
                int target = Integer.parseInt(s[j]);
                if(target %2==0){
                    sum+=target;
                    min = Math.min(min,target);
                }
            }
            sb.append(sum).append(" ").append(min).append("\n");
        }
        System.out.println(sb);
    }
}
