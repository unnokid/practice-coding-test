package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2757 {

    public static void main(String[] args) throws IOException {
        //백준 2757 엑셀

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        while(true){
            String s = br.readLine();

            int split = s.indexOf("C");
            int r = Integer.parseInt(s.substring(1,split));
            int c = Integer.parseInt(s.substring(split+1));

            if(r == 0&& c ==0){
                break;
            }

            StringBuilder sb=  new StringBuilder();
            while(c >0){
                c--;
                sb.append((char)('A'+c%26));
                c/=26;
            }
            result.append(sb.reverse()).append(r).append("\n");

        }
        System.out.println(result);
    }
}
