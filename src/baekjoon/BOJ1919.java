package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1919 {
    public static void main(String[] args) throws IOException {
        //백준 1919 애너그램 만들기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();

        int[] arr = new int[26];

        for (int i = 0; i < A.length(); i++) {
            char targetA = A.charAt(i);
            arr[targetA-'a']++;
        }
        for (int i = 0; i < B.length(); i++) {
            char targetB = B.charAt(i);
            arr[targetB-'a']--;
        }

        int sum =0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] =Math.abs(arr[i]);
            if(arr[i] !=0){
                sum+=arr[i];
            }
        }

        System.out.println(sum);
    }
}
