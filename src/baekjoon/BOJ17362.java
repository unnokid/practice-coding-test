package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ17362 {
    public static void main(String[] args) throws IOException {
        //백준 17362 수학은 체육과목입니다 2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        //돌아오는 주기를 계산함
        if(N %8 ==0){
            System.out.println(2);
        }else if(N%4 == 3){
            System.out.println(3);
        }else if(N%8 == 6){
            System.out.println(4);
        }else{
            //1번과 5번은 그대로 8 나머지
            System.out.println(N%8);
        }
    }
}
