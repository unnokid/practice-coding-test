package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11501 {
    public static void main(String[] args) throws IOException {
        //백준 11501 주식

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int day = Integer.parseInt(br.readLine());
            int[] list = new int[day];
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < list.length; j++) {
                list[j] = Integer.parseInt(s[j]);
            }

            long result =0;
            int max =0;
            //뒤에서 부터 계산하기
            for (int j = day-1; j >=0 ; j--) {
                if(list[j] > max){
                    max= list[j];
                }else{
                    //비싼값에 팔아서 이익 계산
                    result+=(max-list[j]);
                }
            }
            System.out.println(result);
        }
    }
}
