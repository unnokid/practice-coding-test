package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1075 {
    public static void main(String[] args) throws IOException {
        //백준 1075 나누기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());

        //2자리 제거
        int target = (N/100) *100;

        while(true){
            if(target%F ==0){
                int result = target%100;
                if(result <10){
                    System.out.println("0"+result);
                }else{
                    System.out.println(result);
                }
                return;
            }
            target++;
        }
    }
}
