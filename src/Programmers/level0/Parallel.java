package Programmers.level0;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Parallel {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[][] dots;
    dots = new int[][]{{0, 1}, {0, 2}, {0, 3}, {0, 4}};
    System.out.println(solution.solution(dots));
    dots = new int[][]{{1, 0}, {2, 0}, {3, 0}, {4, 0}};
    System.out.println(solution.solution(dots));
    dots = new int[][]{{1, 4}, {9, 2}, {3, 8}, {10, 4}};
    System.out.println(solution.solution(dots));
  }

  static class Solution {

    public int solution(int[][] dots) {

      Set<Double> set = new HashSet<>();
      int[] x = new int[4];
      int[] y = new int[4];

      Arrays.sort(dots,(a,b)-> a[0] -b[0]);
      for (int i = 0; i < 4; i++) {
        x[i] = dots[i][0];
        y[i] = dots[i][1];
      }
      for (int i = 0; i < 3; i++) {
        for (int j = i + 1; j < 4; j++) {
          if (x[j] - x[i] == 0) {
            //기울기 분모가 0 인경우 따로 101 추가
            if (set.contains(101.0)) {
              return 1;
            }
            set.add(101.0);
          } else {
            //기울기를 구할 수 있는 경우
            double m = (y[j] - y[i]) * 1.0 / (x[j] - x[i]);
            if (set.contains(m)) {
              return 1;
            } else {
              set.add(m);
            }

          }

          System.out.println(set);
        }

      }
      return 0;
    }
  }
}
