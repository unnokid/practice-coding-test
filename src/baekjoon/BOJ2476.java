package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2476 {
    public static void main(String[] args) throws IOException {
        //백준 2476 주사위 게임
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int max =0;
        for (int i = 0; i < N; i++) {
            int[] arr = new int[3];
            int sum =0;
            String[] s = br.readLine().split(" ");

            for (int j = 0; j < 3; j++) {
                int idx = Integer.parseInt(s[j]);
                arr[j] = idx;
            }
            Arrays.sort(arr);
            if(arr[0] == arr[1] && arr[1] == arr[2]){
                //3개가 모두 같은 경우
                sum = 10000+ arr[0]*1000;
            }else if(arr[0] !=arr[1] && arr[1] != arr[2]){
                //3개가 모두 다른경우
                //왜 0과 2를 비교하지 않은이유는 이미 크기순으로 정렬했기 때문
                sum = arr[2] *100;
            }else{
                //2개만 같은 경우
                sum = 1000+arr[1] *100;
            }
            max = Math.max(max, sum);
        }
        System.out.println(max);

    }
}
