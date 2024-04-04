package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ10804 {
    public static void main(String[] args) throws IOException {
        //백준 10804 카드 역 배치

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[21];
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <arr.length ; i++) {
            arr[i] =i;
        }


        for (int i = 0; i < 10; i++) {
            String[] s = br.readLine().split(" ");
            int start = Integer.parseInt(s[0]);
            int end = Integer.parseInt(s[1]);

            //반대로 돌리기
            for (int j = start; j < end; j++) {
                if(j > end-j+start){
                    break;
                }
                int temp = arr[j];
                arr[j] = arr[end-j+start];
                arr[end-j+start] = temp;
            }
        }

        for (int i = 1; i < arr.length; i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
}
