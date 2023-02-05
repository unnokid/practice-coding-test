package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BOJ2776 {

    public static void main(String[] args) throws IOException {
        //백준 2776 암기왕

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            Set<Integer> set = new HashSet<>();
            String[] s = br.readLine().split(" ");
            //존재하는 정수 수첩1에 넣기
            for (int j = 0; j < n; j++) {
                set.add(Integer.parseInt(s[j]));
            }
            int m = Integer.parseInt(br.readLine());
            String[] s1 = br.readLine().split(" ");

            for (int j = 0; j < m; j++) {
                int target = Integer.parseInt(s1[j]);

                if(set.contains(target)){
                    sb.append(1).append("\n");
                }else{
                    sb.append(0).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
