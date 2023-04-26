package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2023 {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        //백준 2023 신기한 소수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        check(0,N);

        System.out.println(sb);
    }
    private static void check(int cur,int len){
        //만들어짐
        if(len ==0){
            if(isPrime(cur)){
                //최종 확인
                sb.append(cur).append("\n");
                return;
            }
        }

        //아니라면 다음 숫자 증강
        for (int i = 0; i <10 ; i++) {
            int target = cur*10+i;
            if(isPrime(target)){
                check(target,len-1);
            }
        }
    }

    private static boolean isPrime(int num){
        if(num <2){
            return false;
        }

        for (int i = 2; i <=Math.sqrt(num) ; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
