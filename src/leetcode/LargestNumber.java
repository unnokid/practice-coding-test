package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] num;
    num = new int[]{10, 2};
    System.out.println(solution.largestNumber(num));
    num = new int[]{3,30,34,5,9};
    System.out.println(solution.largestNumber(num));
    num = new int[]{0,0};
    System.out.println(solution.largestNumber(num));
  }

  static class Solution {

    public String largestNumber(int[] nums) {
      //음수를 제외한 양수로 이루어진 배열이 주어짐
      //1. 맨 앞자리 비교
      //2. 만약 같다면 그다음자리 비교
      //3. 자리비교시 0보단 존재하지 않는게 더 큼

      String result = "";
      String[] arr = new String[nums.length];
      //문자열로 바꾸기
      for (int i = 0; i < nums.length; i++) {
        arr[i] = String.valueOf(nums[i]);
      }

      Arrays.sort(arr, new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
          String before = o1 + o2;
          String after = o2 + o1;
          return after.compareTo(before);
        }
      });
      if(arr[0].equals("0")){
        return "0";
      }
      for (String target : arr) {
        result += target;
      }

      return result;
    }
  }
}
