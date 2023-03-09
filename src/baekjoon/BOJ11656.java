package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ11656 {

    public static void main(String[] args) throws IOException {
        //백준 11656 접미사 배열

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        List<String> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            list.add(s.substring(i));
        }

        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append("\n");
        }

        System.out.println(sb);
    }
}
