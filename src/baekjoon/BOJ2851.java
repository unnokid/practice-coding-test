package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2851 {
    public static void main(String[] args) throws IOException {
        //백준 2851 슈퍼 마리오
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum =0;
        int result =0;
        for (int i = 0; i < 10; i++) {
            int target = Integer.parseInt(br.readLine());
            if(sum < 100){
                sum+=target;

                if(Math.abs(result - 100) > Math.abs(sum-100)){
                    result = sum;
                }else if(Math.abs(result -100) == Math.abs(sum-100) ){
                    result = result > sum? result:sum;
                }
            }
        }
        System.out.println(result);
    }
}
