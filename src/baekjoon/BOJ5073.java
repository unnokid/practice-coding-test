package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ5073 {
    public static void main(String[] args) throws IOException {
        //백준 5073 삼각형과 세 변

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String[] s = br.readLine().split(" ");
            int[] arr = new int[3];
            for (int i = 0; i < 3; i++) {
                arr[i] = Integer.parseInt(s[i]);
            }
            Arrays.sort(arr);
            if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0){
                break;
            }

            if(arr[2] >= arr[0] + arr[1]) {
                System.out.println("Invalid");
            }else if(arr[0] == arr[1] && arr[1] == arr[2]) {
                System.out.println("Equilateral");
            }else if(arr[0] == arr[1] || arr[1] == arr[2] || arr[0] == arr[2]) {
                System.out.println("Isosceles");
            }else {
                System.out.println("Scalene");
            }
        }
    }
}
