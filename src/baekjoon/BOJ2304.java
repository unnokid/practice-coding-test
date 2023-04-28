package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BOJ2304 {
    public static void main(String[] args) throws IOException {
        //백준 2304 창고 다각형
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Point> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);
            list.add(new Point(x, y));
        }

        Collections.sort(list, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return o1.x - o2.x;
            }
        });

        int result = 0;
        //밑변 길이
        int max = 0;

        Point before = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            Point point = list.get(i);
            if (before.y <= point.y) {
                result += (point.x - before.x) * before.y;
                before = point;
                max = i;
            }
        }

        before = list.get(list.size() - 1);

        for (int i = 1; i < list.size() - max; i++) {
            Point point = list.get(list.size() - 1 - i);

            if (before.y <= point.y) {
                result += (before.x - point.x) * before.y;
                before = point;
            }
        }

        result += list.get(max).y;

        System.out.println(result);
    }

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
}
