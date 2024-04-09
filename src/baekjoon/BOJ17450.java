package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ17450 {
    public static void main(String[] args) throws IOException {
        //백준 17450 과자 사기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] name = {"S","N","U"};

        double result = -10000L;
        int idx =0;
        for (int i = 0; i <3 ; i++) {
            String[] s = br.readLine().split(" ");
            int price = Integer.parseInt(s[0]) * 10;
            int weight = Integer.parseInt(s[1]) * 10;
            if(price >= 5000){
                price-=500;
            }

            double value = (double)weight/price;


            if(result < value){
                idx =i;
                result = value;
            }
        }
        System.out.println(name[idx]);
    }
}
