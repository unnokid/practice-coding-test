package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SingleNumber3 {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] nums;
    nums = new int[]{1,2,1,3,2,5};
    System.out.println(Arrays.toString(solution.singleNumber(nums)));
  }
  static class Solution {
    public int[] singleNumber(int[] nums) {
      List<Integer> list = new ArrayList<>();

      Arrays.sort(nums);
      int before = nums[0];
      int count = 0;
      for (int i = 1; i <nums.length ; i++) {
        if(nums[i] == before){
          count++;
        }else{
          if(count > 0){
            count = 0;
          }else{
            list.add(before);
            count = 0;
          }
          before = nums[i];
        }
      }

      //마무리
      if(count == 0){
        list.add(before);
      }

      return list.stream().mapToInt(i->i).toArray();
    }
  }
}
