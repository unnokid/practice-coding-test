package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2869 {

    public static void main(String[] args) throws IOException {
        //백준 2869 달팽이는 올라가고 싶다

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int go = Integer.parseInt(s[0]);
        int back = Integer.parseInt(s[1]);
        int way = Integer.parseInt(s[2]);

        int day =(way - back)/ (go-back);

        //나머지 존재하는지 처리
        if((way-back) %(go-back) != 0){
            day++;
        }

        System.out.println(day);

    }
}
