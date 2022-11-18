package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BOJ15665 {

    static StringBuilder sb = new StringBuilder();
    static Set<String> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        //백준 15665 N과 M(11)

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");

        int N = Integer.parseInt(split[0]);
        int count = Integer.parseInt(split[1]);

        int[] map = new int[N];
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            map[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(map);

        dfs(map, count, 0, new int[count]);
        System.out.println(sb);
    }

    static void dfs(int[] map, int count, int choice, int[] list) {
        if (count == choice) {
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < list.length; i++) {
                temp.append(list[i]).append(" ");
            }
            if (!set.contains(temp.toString())) {
                set.add(temp.toString());
                sb.append(temp);
                sb.append("\n");
            }
            return;
        }

        for (int i = 0; i < map.length; i++) {
            list[choice] = map[i];
            dfs(map, count, choice + 1, list);
        }
    }
}
