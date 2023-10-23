package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ11005 {
    public static void main(String[] args) throws IOException {
        //백준 11005 진법 변환 2

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);

        List<Character> list = new ArrayList<>();

        //0~9 에서 10부터 A로 표현함
        while(N >0){
            if(N%B <10){
                list.add((char) (N%B +'0'));
            }else{
                list.add((char) (N%B -10+'A'));
            }
            N/=B;
        }
        StringBuilder sb= new StringBuilder();
        for (int i = list.size()-1; i >=0 ; i--) {
            sb.append(list.get(i));
        }
        System.out.println(sb);
    }
}
