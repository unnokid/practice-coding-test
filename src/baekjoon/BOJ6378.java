package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ6378 {
    public static void main(String[] args) throws IOException {
        //백준 6378 디지털 루트
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            String S = br.readLine();
            if(S.equals("0")){
                break;
            }
            while(true) {
                int sum = 0;

                if(S.length() < 2) {
                    break;
                }else {
                    for(int i = 0; i < S.length(); i++) {
                        sum += S.charAt(i) - '0';
                    }
                }
                S = String.valueOf(sum);
            }
            System.out.println(S);
        }

    }
}
