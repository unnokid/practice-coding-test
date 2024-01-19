package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1526 {
    public static void main(String[] args) throws IOException {
        //백준 1526 가장 큰 금민수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s =br.readLine();

        while(true){
            boolean pass = true;

            for (int i = 0; i <s.length() ; i++) {
                if(s.charAt(i) != '4' && s.charAt(i) != '7'){
                    pass = false;
                    break;
                }
            }
            if(pass){
                break;
            }
            s = String.valueOf(Integer.parseInt(s) -1);
        }
        System.out.println(s);

    }
}
