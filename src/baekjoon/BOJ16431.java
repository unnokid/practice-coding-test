package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ16431 {
    public static void main(String[] args) throws IOException {
        //백준 16431 베시와 데이지
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[6];
        for (int i = 0; i < 6; i+=2) {
            String[] s = br.readLine().split(" ");
            arr[i] = Integer.parseInt(s[0]);
            arr[i+1] = Integer.parseInt(s[1]);
        }


        int bessie = Math.max(Math.abs(arr[4] - arr[0]),Math.abs(arr[5] - arr[1]));
        int daisy = Math.abs(arr[4] - arr[2]) + Math.abs(arr[5] - arr[3]);

        if(bessie == daisy){
            System.out.println("tie");
        }else{
            System.out.println(bessie < daisy ? "bessie":"daisy");
        }

    }
}
