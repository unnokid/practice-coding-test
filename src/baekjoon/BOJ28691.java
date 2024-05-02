package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BOJ28691 {
    public static void main(String[] args) throws IOException {
        //백준 28691 정보보호학부 동아리 소개
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        Map<String,String> map = new HashMap<>();
        map.put("M","MatKor");
        map.put("W","WiCys");
        map.put("C","CyKor");
        map.put("A","AlKor");
        map.put("$","$clear");

        System.out.println(map.get(s));
    }
}
