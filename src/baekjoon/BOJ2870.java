package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BOJ2870 {
    public static void main(String[] args) throws IOException {
        //백준 2870 수학문제

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Pattern pattern = Pattern.compile("[\\d]+");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            Matcher matcher = pattern.matcher(s);

            while (matcher.find()) {
                String target = matcher.group().replaceAll("^0+", "");
                //0 처리
                list.add(target.length() == 0 ? "0" : target);
            }
        }

        Collections.sort(list, (o1, o2) -> o1.length() == o2.length() ? o1.compareTo(o2) : o1.length() - o2.length());
        StringBuilder result = new StringBuilder();
        for (String next : list) {
            result.append(next).append("\n");
        }
        System.out.println(result);

    }
}
