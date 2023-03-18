package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BOJ17219 {

    public static void main(String[] args) throws IOException {
        //백준 17219 비밀번호 찾기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        Map<String, String> map = new HashMap<>();

        for (int i = 0; i <N ; i++) {
            String[] temp = br.readLine().split(" ");
            map.put(temp[0], temp[1]);
        }

        for (int i = 0; i < M; i++) {
            String target = br.readLine();
            System.out.println(map.get(target));
        }

    }
}
