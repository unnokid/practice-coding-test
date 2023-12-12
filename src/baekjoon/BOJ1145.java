package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ1145 {
    public static void main(String[] args) throws IOException {
        //백준 1145 적어도 대부분의 배수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[5];
        int count =0;
        int result =0;
        String[] s = br.readLine().split(" ");
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(arr);
        while(true){
            result++;

            for (int i = 0; i <arr.length; i++) {
                if(result%arr[i] ==0){
                    count++;
                }
            }

            if(count >2){
                break;
            }
            count =0;
        }
        System.out.println(result);
    }
}
