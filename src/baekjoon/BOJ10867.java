package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class BOJ10867 {

    public static void main(String[] args) throws IOException {
        //백준 10867 중복 빼고 정렬하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] s = br.readLine().split(" ");
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i <N ; i++) {
            set.add(Integer.valueOf(s[i]));
        }
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        for (int i = 0; i <list.size() ; i++) {
            sb.append(list.get(i)).append(" ");
        }

        System.out.println(sb);
    }
}
