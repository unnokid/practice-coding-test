package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ3009 {
    public static void main(String[] args) throws IOException {
        //백준 3009 네 번째 점

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer,Integer> x = new HashMap<>();
        Map<Integer,Integer> y = new HashMap<>();
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i <3 ; i++) {
            String[] s = br.readLine().split(" ");
            int A = Integer.parseInt(s[0]);
            int B = Integer.parseInt(s[1]);
            x.put(A, x.getOrDefault(A,0)+1);
            y.put(B, y.getOrDefault(B,0)+1);
        }

        for (int target : x.keySet()){
            if(x.get(target) == 1){
                sb.append(target).append(" ");
            }
        }
        for (int target : y.keySet()){
            if(y.get(target) == 1){
                sb.append(target);
            }
        }
        System.out.println(sb);
    }
}
