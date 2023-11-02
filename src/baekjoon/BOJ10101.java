package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ10101 {
    public static void main(String[] args) throws IOException {
        //백준 10101 삼각형 외우기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        if (arr[0] + arr[1] + arr[2] == 180) {
            if (arr[0] == arr[1] && arr[1] == arr[2]) {
                System.out.println("Equilateral");
            }else if(arr[0] == arr[1] || arr[1] == arr[2]){
                System.out.println("Isosceles");
            }else{
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Error");
        }


    }
}
