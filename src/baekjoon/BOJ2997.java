package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2997 {
    public static void main(String[] args) throws IOException {
        //백준 2997 네 번째 수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int[] arr = new int[3];

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        Arrays.sort(arr);

        int front = arr[1] - arr[0];
        int back = arr[2] - arr[1];

        if(front == back){
            System.out.println(arr[2]+front);
        }else if(front < back){
            System.out.println(arr[1]+front);
        }else{
            System.out.println(arr[0]+back);
        }
    }
}
