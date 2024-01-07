package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BOJ28235 {
    public static void main(String[] args) throws IOException {
        //백준 28235 코드마스터 2023
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        Map<String,String> map = new HashMap<>();

        map.put("SONGDO","HIGHSCHOOL");
        map.put("CODE","MASTER");
        map.put("2023","0611");
        map.put("ALGORITHM","CONTEST");

        System.out.println(map.get(s));
    }
}
