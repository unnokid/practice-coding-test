package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2947 {
    public static void main(String[] args) throws IOException {
        //백준 2947 나무 조각
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        boolean pass =true;
        StringBuilder sb = new StringBuilder();
        while(pass){
            //무조건 버블정렬 진행시 커야함
            pass =false;

            for (int i = 0; i < 4; i++) {
                if(arr[i] > arr[i+1]){
                    pass = true;
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;

                    for (int j = 0; j < 5; j++) {
                        sb.append(arr[j] + " ");
                    }
                    sb.append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
