package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BOJ16499 {
    public static void main(String[] args) throws IOException {
        //백준 16499 동일한 단어 그룹화하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            char[] chars = br.readLine().toCharArray();
            Arrays.sort(chars);
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < chars.length; j++) {
                sb.append(chars[j]);
            }
            map.put(sb.toString(),map.getOrDefault(sb,0)+1);
        }
        int count =0;
        for (String key: map.keySet()){
            count++;
        }
        System.out.println(count);
    }
}
