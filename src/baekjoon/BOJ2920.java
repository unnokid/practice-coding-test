package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class BOJ2920 {
    public static void main(String[] args) throws IOException {
        //백준 2920 음계
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");

        int[] arr = new int[8];
        int[] A = new int[]{1,2,3,4,5,6,7,8};
        int[] B  = new int[]{8,7,6,5,4,3,2,1};

        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        if(Arrays.equals(arr, A)){
            System.out.println("ascending");
        }else if(Arrays.equals(arr,B)){
            System.out.println("descending");
        }else{
            System.out.println("mixed");
        }
    }
}
