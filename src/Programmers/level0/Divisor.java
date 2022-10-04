package Programmers.level0;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Divisor {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int n;
    n= 24;
    System.out.println(Arrays.toString(solution.solution(n)));
  }
  static class Solution {
    public int[] solution(int n) {
      Set<Integer> set = new HashSet<>();

      for (int i = 1; i <n/2 ; i++) {
        if(n%i ==0){
          set.add(i);
          set.add(n/i);
        }
      }
      int[] result = set.stream().mapToInt(i->i).toArray();
      Arrays.sort(result);
      return result;
    }
  }
}
