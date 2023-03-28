package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1543 {
    public static void main(String[] args) throws IOException {
        //백준 1543 문서 검색

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String target = br.readLine();

        int count =0;
        for (int i = 0; i <s.length()-target.length()+1; i++) {

            boolean check = true;
            for (int j = 0; j <target.length() ; j++) {
                if(s.charAt(i+j) != target.charAt(j)){
                    check =false;
                    break;
                }
            }

            if(check){
                count++;
                i+=target.length()-1;
            }
        }
        System.out.println(count);
    }
}
