package swacdemy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SW1859 {
    public static void main(String[] args) throws IOException {
        //삼성 아카데미 1859 백만 장자 프로젝트

        //하루에 1개씩 구매가 가능하며
        //모든 날 매매를 알고있음
        //즉 싸게사서 가장 비싸게 파는 방식으로 이익 최대화

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int max = 0;
            long sum =0;
            int[] arr = new int[N];

            String[] s = br.readLine().split(" ");
            for (int j = 0; j <N ; j++) {
                arr[j] = Integer.parseInt(s[j]);
            }

            //뒤에서 부터 max값을 찾아가며 구매할지 안할지 계산
            for (int j = N-1; j >=0 ; j--) {
                if(arr[j] > max){
                    max = arr[j];
                }
                sum += (max - arr[j]);
            }

            System.out.println("#"+(i+1)+" "+sum);
        }
    }
}
