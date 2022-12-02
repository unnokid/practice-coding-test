package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11053 {

    public static void main(String[] args) throws IOException {
        //백준 11053 가장 긴 증가하는 부분 수열

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr =new int[N];
        int[] count = new int[N];
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        count[0] = 1;

        for (int i = 1; i <N ; i++) {
            count[i] =1;
            for (int j = 0; j <i ; j++) {
                if(arr[j] < arr[i] && count[i] <= count[j]){
                    count[i] =count[j] +1;
                }
            }
        }

        int max =0;
        for (int i = 0; i <count.length ; i++) {
            max =Math.max(max,count[i]);
        }
        System.out.println(max);
    }
}
