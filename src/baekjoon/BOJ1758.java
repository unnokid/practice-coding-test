package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ1758 {

    public static void main(String[] args) throws IOException {
        //백준 1758 알바생 강호

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i <N ; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        long result =0;
        int count =1;
        for (int i = arr.length-1; i >=0 ; i--) {
            int sum = arr[i] - (count -1);

            if(sum >=0){
                result += sum;
            }
            count++;
        }

        System.out.println(result);
    }
}
