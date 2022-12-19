package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1120 {

    public static void main(String[] args) throws IOException {
        //백준 1120 문자열

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        String a = s[0];
        String b = s[1];
        int result = 0;

        for (int i = 0; i <b.length()-a.length()+1 ; i++) {
            String nextB = b.substring(i, i + a.length());
            //B의 문자열을 한칸씩 밀어가면서 A의 문자열과 비교하기 위한변수

            int same = 0;
            for(int j = 0 ; j < nextB.length(); j++) {
                if(a.charAt(j) == nextB.charAt(j)) {
                    same++;
                    //A와 B를 비교하여 같으면 더해줌
                }
            }
            if(same > result) {
                result=same;
            }
        }
        System.out.println(a.length()-result);
    }
}
