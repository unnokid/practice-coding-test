package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10987 {
    public static void main(String[] args) throws IOException {
        //백준 10987  모음의 개수

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int count =0;
        for (int i = 0; i <s.length() ; i++) {
            char target = s.charAt(i);
            if(target =='a' || target =='e' || target =='i' || target =='o'|| target =='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
