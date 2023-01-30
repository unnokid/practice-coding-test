package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ1246 {

    public static void main(String[] args) throws IOException {
        //백준 1246 온라인 판매

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        int[] arr = new int[M];
        int price = 0;
        int result =0;
        for (int i = 0; i < M; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        //N개의 달걀을 M명에게 최대수익을 올릴 수 있게 달걀 가격 정하기
        //한사람에게는 한개씩만 팜
        Arrays.sort(arr);

        for (int i = arr.length-1; i >=0 ; i--) {
            //높은 달걀 가격부터
            int target = arr[i];
            int count = N;
            int sum =0;
            for (int j = arr.length - 1; j >= 0; j--) {
                //개수가 부족할 수 있기에 높은 순서대로
                if (count > 0 && arr[j] >= target) {
                    sum+=target;
                    count--;
                }else{
                    break;
                }
            }
            if(result < sum){
                result = sum;
                price = target;
            }
        }

        System.out.println(price+" "+result);
    }
}
