package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BOJ1268 {
    public static void main(String[] args) throws IOException {
        //백준 1268 임시 반장 정하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] table = new int[N][5];
        int result = 0;
        int max = 0;

        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            for (int j = 0; j < 5; j++) {
                table[i][j] = Integer.parseInt(str[j]);
            }
        }

        for (int i = 0; i < N; i++) {
            Set<Integer> set = new HashSet<>();

            for (int j = 0; j < 5; j++) {

                for (int k = 0; k < N; k++) {

                    if (i == k){
                        continue;
                    }
                    if (table[i][j] == table[k][j]) {
                        set.add(k);
                    }
                }
            }
            if (max < set.size()) {
                max = set.size();
                result = i + 1;
            }

        }

        if(result == 0) {
            System.out.println(1);
        } else {
            System.out.println(result);
        }

    }
}
