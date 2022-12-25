package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class BOJ9237 {

    public static void main(String[] args) throws IOException {
        //백준 9237 이장님 초대

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int max = 0;
        String[] s = br.readLine().split(" ");
        Integer[] arr = new Integer[T];
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.valueOf(s[i]);
        }
        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i <T ; i++) {
            arr[i] = arr[i] +i+1;
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max+1);

    }
}
