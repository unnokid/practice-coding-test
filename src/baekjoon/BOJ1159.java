package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BOJ1159 {
    public static void main(String[] args) throws IOException {
        //백준 1159 농구 경기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String substring = br.readLine().substring(0, 1);
            map.put(substring, map.getOrDefault(substring, 0) + 1);
        }

        for (String key : map.keySet()) {
            if (map.get(key) >= 5) {
                sb.append(key);
            }
        }

        if(sb.length() > 0){
            System.out.println(sb);
        }else{
            System.out.println("PREDAJA");
        }

    }
}
