package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BOJ10807 {
    public static void main(String[] args) throws IOException {
        //백준 10807 개수 세기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] s = br.readLine().split(" ");
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int target = Integer.parseInt(s[i]);
            map.put(target,map.getOrDefault(target,0)+1);
        }
        int V = Integer.parseInt(br.readLine());
        System.out.println(map.get(V));
    }
}
