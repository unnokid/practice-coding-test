package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BOJ31428 {
    public static void main(String[] args) throws IOException {
        //백준 31428 엘리스 트랙 매칭
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            map.put(s[i],map.getOrDefault(s[i],0)+1);
        }

        System.out.println(map.getOrDefault(br.readLine(),0));
    }
}
