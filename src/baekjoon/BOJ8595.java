package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BOJ8595 {
    public static void main(String[] args) throws IOException {
        //백준 8595 히든 넘버
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        BigDecimal sum = new BigDecimal("0");
        String target = br.readLine();

        //정규식
        String regex = "([\\d]+)";
        Matcher matcher = Pattern.compile(regex).matcher(target);
        while(matcher.find()) {
            sum = sum.add(new BigDecimal(matcher.group()));
        }
        System.out.println(sum);
    }
}
