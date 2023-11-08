package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11655 {
    public static void main(String[] args) throws IOException {
        //백준 11655 ROT13
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        StringBuilder sb = new StringBuilder();


        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            if(!Character.isLetter(ch)){
                //추가
                sb.append(ch);
                continue;
            }
            int next = ch +13;

            if(Character.isUpperCase(ch) && next >90){
                next-=26;
            }

            if(Character.isLowerCase(ch) && next >122){
                next-=26;
            }
            sb.append((char)next);
        }
        System.out.println(sb);
    }
}
