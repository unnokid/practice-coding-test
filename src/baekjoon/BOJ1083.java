package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ1083 {

    public static void main(String[] args) throws IOException {
        //백준 1083 소트

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> arr = new ArrayList<>();
        String[] s = br.readLine().split(" ");
        int S = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(s[i]));
        }

        //버블정렬으로 내림차순 생각 중
        //사전순으로 정해진 숫자안에 제일 크려면 바꾸는 카운트로 제일 큰수가 맨앞으로 와야함

        int move = 0;
        int startIdx = 0;
        while (move < S && startIdx < N - 1) {
            //움직임이 S보다 작고, 지정할 위치
            int target = arr.get(startIdx);
            int maxIdx = -1;

            int cur = startIdx + 1;
            int count = 1;
            while (move + count <= S && cur < N) {
                //움직임과 정렬후에도 S를 넘지않기
                int num = arr.get(cur);
                if (num > target) {
                    //큰 숫자를 찾으면 저장
                    target = num;
                    maxIdx = cur;
                }
                count++;
                cur++;
            }

            //찾았다면
            if (maxIdx != -1) {
                arr.remove(maxIdx);
                arr.add(startIdx, target);
                move += maxIdx - startIdx;
            }

            startIdx++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(arr.get(i)).append(" ");
        }
        System.out.println(sb);
    }
}
