package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5555 {

    public static void main(String[] args) throws IOException {
        //백준 5555 반지

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int n = Integer.parseInt(br.readLine());
        int count =0;
        for (int i = 0; i < n; i++) {
            String temp = br.readLine();
            temp+=temp;
            if(temp.contains(s)){
                count++;
            }
        }
        System.out.println(count);
    }
}
