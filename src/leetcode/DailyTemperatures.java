package leetcode;

import java.util.Arrays;

public class DailyTemperatures {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] tem;
    tem = new int[]{73,74,75,71,69,72,76,73};
    System.out.println(Arrays.toString(solution.dailyTemperatures(tem)));
    tem = new int[]{30,40,50,60};
    System.out.println(Arrays.toString(solution.dailyTemperatures(tem)));
  }
  static class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

      int n = temperatures.length;
      int[] result = new int[n];
      for (int i = 0; i <n-1 ; i++) {
        int len =0;
        for (int j = i+1; j <n ; j++) {
          if(temperatures[i] < temperatures[j]){
            len++;
            result[i] = len;
            break;
          }else{
            len++;
          }
        }
      }

      return result;
    }
  }
}
