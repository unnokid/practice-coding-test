package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ16435 {
    public static void main(String[] args) throws IOException {
        //백준 16435 스네이크 버드

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int N = Integer.parseInt(s[0]);
        int L = Integer.parseInt(s[1]);

        String[] split = br.readLine().split(" ");
        int[] arr = new int[N];
        for (int i = 0; i <N ; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }

        Arrays.sort(arr);

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] <= L){
                L++;
            }else{
                break;
            }
        }

        System.out.println(L);
    }
}
