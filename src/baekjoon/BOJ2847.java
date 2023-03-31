package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2847 {
    public static void main(String[] args) throws IOException {
        //백준 2847 게임을 만든 동준이

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        for (int i = 0; i <N ; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int count =0;
        //뒤에서 부터 쓸며 내려가기
        for (int i = N-2; i >=0 ; i--) {
            //2개의 대상 비교
            int max = arr[i+1];
            int min = arr[i];

            if(max <= min){
                //왼쪽 작은 부분이 클경우 갱신후 -1
                count += min - max +1;
                arr[i] = max -1;
            }
        }

        System.out.println(count);
    }
}
