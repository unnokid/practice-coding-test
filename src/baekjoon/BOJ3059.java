package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ3059 {
    public static void main(String[] args) throws IOException {
        //백준 3059 등장하지 않는 문자의 합
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());



        for (int i = 0; i < t; i++) {
            int[] arr =new int[91];
            String s = br.readLine();
            int sum =0;
            for (int j = 0; j <s.length() ; j++) {
                char ch =s.charAt(j);
                arr[ch]++;
            }

            for (int j = 65; j <arr.length ; j++) {
                if(arr[j] < 1){
                    sum+= j;
                }
            }
            System.out.println(sum);
        }
    }
}
