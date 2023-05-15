package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ2635 {
    public static void main(String[] args) throws IOException {
        //백준 2635 수 이어 가기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int result = 0;
        List<Integer> list = new ArrayList<>();

        //1번 2번 3번을 돌아가며 줄줄이 빼면서 세우기
        //이때 가장 길게 만들수있는 배열의 길이와 배열을 출력

        for (int i = N; i >= N/2 ; i--) {
            List<Integer> temp = new ArrayList<>();
            temp.add(N);

            int first = N;
            int second = i;

            while(true){
                if(first <0){
                    break;
                }
                int third = first;

                if(second >=0){
                    temp.add(second);
                }

                first =second;
                second = third - first;
            }

            if(result < temp.size()){
                result = temp.size();
                list = temp;
            }
        }

        System.out.println(result);
        for (int next: list){
            System.out.print(next+" ");
        }

    }
}
