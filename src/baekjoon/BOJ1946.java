package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BOJ1946 {
    public static void main(String[] args) throws IOException {
        //백준 1946 신입 사원

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());

            List<Score> list = new ArrayList<>();

            for (int j = 0; j < N; j++) {
                String[] s = br.readLine().split(" ");
                int a = Integer.parseInt(s[0]);
                int b = Integer.parseInt(s[1]);

                list.add(new Score(a,b));
            }

            //첫번째 점수로 정렬후 나머지 값을 보며 낮은사람 체크하면 됨
            Collections.sort(list, new Comparator<Score>() {
                @Override
                public int compare(Score o1, Score o2) {
                    return o1.a - o2.a;
                }
            });

            int result = 1;
            int min = list.get(0).b;
            //2등부터 체크
            for (int j = 1; j < N; j++) {
                if(list.get(j).b <min){
                    //최솟값 갱신
                    result++;
                    min = list.get(j).b;
                }
            }
            System.out.println(result);
        }
    }
    static class Score{
        int a;
        int b;

        public Score(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }


}
