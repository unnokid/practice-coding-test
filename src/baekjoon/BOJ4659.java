package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ4659 {
    public static void main(String[] args) throws IOException {
        //백준 4659 비밀번호 발음하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        String password;
        char[] passwords;
        char before;
        int count =0;
        boolean pass = false;
        while (!(password = br.readLine()).equals("end")) {
            passwords = password.toCharArray();
            before = '?';
            count = 0;

            pass = false;
            for (char p : passwords) {
                if (isVowel(p)) pass = true;

                if (isVowel(p) != isVowel(before)) count = 1;
                else count++;

                if (count > 2 || (before == p && (p != 'e' && p != 'o'))) {
                    pass = false;
                    break;
                }

                before = p;
            }

            if (pass) sb.append('<').append(password).append("> is acceptable.").append("\n");
            else sb.append('<').append(password).append("> is not acceptable.").append("\n");
        }
        System.out.println(sb);
    }
    public static boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
