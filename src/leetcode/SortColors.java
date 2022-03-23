package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortColors {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;
        nums = new int[]{2,0,2,1,1,0};
        solution.sortColors(nums);
    }
    static class Solution {
        public void sortColors(int[] nums) {
            //정수 배열 nums
            //sort 함수를 사용하지않고 0,1,2에 대하여 정렬

            int zero =0;
            int one = 0;
            int two =0;

            for (int i = 0; i <nums.length; i++) {
                if(nums[i] ==0) zero++;
                if(nums[i] ==1) one++;
                if(nums[i] ==2) two++;
            }

            for (int i = 0; i <zero ; i++) {
                nums[i] =0;
            }
            for (int i = zero; i <zero+one ; i++) {
                nums[i] =1;
            }
            for (int i = zero+one; i <nums.length ; i++) {
                nums[i] =2;
            }

        }
    }
}
