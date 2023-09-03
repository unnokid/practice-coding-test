package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ4999 {
    public static void main(String[] args) throws IOException {
        //백준 4999 아!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        String h = br.readLine();

        if(s.length() >= h.length()){
            System.out.println("go");
        }else{
            System.out.println("no");
        }
    }
}
