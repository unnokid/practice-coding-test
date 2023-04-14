package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ4153 {
    public static void main(String[] args) throws IOException {
        //백준 4153 직각삼각형
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        while(true){
            String[] s = br.readLine().split(" ");

            for (int i = 0; i < 3; i++) {
                arr[i] = Integer.parseInt(s[i]);
            }
            if(arr[0] == 0 && arr[1] ==0 && arr[2] ==0){
                break;
            }

            Arrays.sort(arr);
            if(Math.pow(arr[0],2)+ Math.pow(arr[1],2) == Math.pow(arr[2],2)){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }
        }
    }
}
