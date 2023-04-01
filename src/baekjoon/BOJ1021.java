package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class BOJ1021 {
    public static void main(String[] args) throws IOException {
        //백준 1021 회전하는 큐

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            list.add(i + 1);
        }

        int result = 0;
        String[] s1 = br.readLine().split(" ");
        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(s1[i]);

            //앞으로 찾을것인가 뒤로 돌아서 찾을것인가
            boolean reverse = !check(target, list);
            while (target != list.get(0)) {
                if (!reverse) {
                    //첫번째 요소를 뒤로 보내기
                    list.addLast(list.pollFirst());
                    result++;
                } else {
                    //맨뒤 요소를 앞으로 보내기
                    list.addFirst(list.pollLast());
                    result++;
                }

            }
            //제거한뒤 list에서도 제거
            list.removeFirst();
        }
        System.out.println(result);
    }

    static boolean check(int target, LinkedList<Integer> list) {
        for (int i = 0; i <= list.size() / 2; i++) {
            if (target == list.get(i)) {
                return true;
            }
        }
        return false;
    }
}
