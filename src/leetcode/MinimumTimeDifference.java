package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MinimumTimeDifference {

  public static void main(String[] args) {
    Solution solution = new Solution();
    List<String> timePoints;
    timePoints = new ArrayList<>();
    timePoints.add("23:59");
    timePoints.add("00:00");
    System.out.println(solution.findMinDifference(timePoints));
    timePoints.add("00:00");
    System.out.println(solution.findMinDifference(timePoints));
    List<String> time = new ArrayList<>();
    time.add("01:01");
    time.add("02:01");
    time.add("03:00");
    System.out.println(solution.findMinDifference(time));
  }

  static class Solution {

    public int findMinDifference(List<String> timePoints) {
      int result = 1440;
      Set<String> set = new HashSet<>(timePoints);
      //같은게 존재하면 0
      if (timePoints.size() != set.size()) {
        return 0;
      }

      Collections.sort(timePoints);
      System.out.println(timePoints);
      String[] temp = timePoints.get(0).split(":");
      timePoints.add(Integer.parseInt(temp[0])+24 +":"+temp[1]);
      System.out.println(timePoints);
      for (int i = 0; i < timePoints.size() - 1; i++) {
        String[] before = timePoints.get(i).split(":");
        String[] after = timePoints.get(i + 1).split(":");

        int value = (Integer.parseInt(after[0]) * 60 + Integer.parseInt(after[1]))
            - (Integer.parseInt(before[0]) * 60 + Integer.parseInt(before[1]));

        result = Math.min(result, value);
      }

      return result;
    }
  }
}
