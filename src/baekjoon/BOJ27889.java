package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BOJ27889 {
    public static void main(String[] args) throws IOException {
        //백준 27889 특별한 학교 이름
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s= br.readLine();

        Map<String,String> map = new HashMap<>();
        map.put("NLCS", "North London Collegiate School");
        map.put("BHA", "Branksome Hall Asia");
        map.put("KIS", "Korea International School");
        map.put("SJA", "St. Johnsbury Academy");
        System.out.println(map.get(s));
    }
}
