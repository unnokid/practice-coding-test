package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2480 {
    public static void main(String[] args) throws IOException {
        //백준 2480 주사위 세개

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int[] arr =new int[3];
        for (int i = 0; i <3 ; i++) {
            arr[i] =Integer.parseInt(s[i]);
        }
        Arrays.sort(arr);
        int sum =0;
        if(arr[0] == arr[1] && arr[1] == arr[2]){
            sum = 10000 + arr[0]*1000;
        }else if(arr[0] != arr[1] && arr[1] != arr[2]){
            sum = arr[2]*100;
        }else{
            sum = 1000 + arr[1]*100;
        }
        System.out.println(sum);
    }
}
