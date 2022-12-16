package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ17419 {

    public static void main(String[] args) throws IOException {
        //백준 17419 비트가 넘쳐흘러

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String s = br.readLine();
        int total=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1'){
                total++;
            }
        }
        System.out.println(total);
    }
}
