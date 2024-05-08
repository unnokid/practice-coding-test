package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BOJ28249 {
    public static void main(String[] args) throws IOException {
        //백준 28249 Chili Peppers
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result =0;
        Map<String,Integer> map = new HashMap<>();
        map.put("Poblano",	1500);
        map.put("Mirasol",	6000);
        map.put("Serrano",	15500);
        map.put("Cayenne",	40000);
        map.put("Thai",	75000);
        map.put("Habanero",	125000);

        for (int i = 0; i < N; i++) {
            String target = br.readLine();
            result+= map.get(target);
        }
        System.out.println(result);

    }
}
