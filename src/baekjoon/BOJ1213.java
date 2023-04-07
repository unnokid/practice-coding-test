package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1213 {
    public static void main(String[] args) throws IOException {
        //백준 1213 팰린드롬 만들기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int[] str = new int[26];

        int oddIdx = 0;
        int odd = 0;
        for(int i=0;i<s.length();i++) {
            str[s.charAt(i)-'A'] += 1;

        }

        for(int i=0;i<str.length;i++) {
            if(str[i]%2 == 1) {
                oddIdx = i;
                odd += 1;
            }
        }

        if((s.length() % 2 != 0 && odd > 1) || (s.length()%2 == 0 && odd > 0 )) {
            System.out.println("I'm Sorry Hansoo");
        } else {
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<str.length;i++) {
                for(int j=0;j<str[i]/2;j++) {
                    sb.append((char) (i + 'A'));
                }
            }


            String result = (new StringBuilder(sb.toString())).reverse().toString();
            if(odd==1) {
                sb.append((char) (oddIdx + 'A'));
            }

            System.out.println(sb+result);
        }
    }
}
