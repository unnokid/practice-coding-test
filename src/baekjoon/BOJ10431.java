package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10431 {
    public static void main(String[] args) throws IOException {
        //백준 10431 줄세우기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            int num = Integer.parseInt(s[0]);
            int count =0;
            sb.append(num).append(" ");

            int[] arr = new int[21];
            for (int j = 1; j < arr.length; j++) {
                arr[j] = Integer.parseInt(s[j]);
            }

            //정렬시 움직인 횟수 체크
            for (int j = 1; j < arr.length-1; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if(arr[j] > arr[k]){
                        count++;
                        int temp = arr[j];
                        arr[j] = arr[k];
                        arr[k] = temp;
                    }
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}
