package leetcode;

import java.util.HashSet;
import java.util.Set;

public class MinimumGeneticMutation {

  public static void main(String[] args) {

  }

  static class Solution {

    int total = Integer.MAX_VALUE;

    public int minMutation(String start, String end, String[] bank) {
      if (bank.length == 0) {
        return -1;
      }

      pass(start, end, bank, 0, new HashSet<>());
      return total == Integer.MAX_VALUE ? -1 : total;
    }

    void pass(String start, String end, String[] bank, int count, Set<String> set) {

      if (start.equals(end)) {
        total = Math.min(count, total);
        return;
      }

      for (int i = 0; i <bank.length ; i++) {
        if(check(start,bank[i]) == 1 && !set.contains(bank[i])){
          set.add(bank[i]);
          pass(bank[i],end,bank,count+1,set);
          set.remove(bank[i]);
        }
      }
    }

    int check(String a, String b) {
      int count = 0;
      for (int i = 0; i < 8; i++) {
        if (a.charAt(i) != b.charAt(i)) {
          count++;
        }
      }
      return count;
    }

  }
}
