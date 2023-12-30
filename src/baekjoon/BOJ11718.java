package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11718 {
    public static void main(String[] args) throws IOException {
        //백준 11718 그대로 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while(true){
            String s = br.readLine();
            if(s == null || s.isEmpty()){
                break;
            }
            System.out.println(s);
        }


    }
}
