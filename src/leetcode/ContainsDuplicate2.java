package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class ContainsDuplicate2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;
        int k;/*
        nums = new int[]{1,2,3,1};
        k = 3;
        System.out.println(solution.containsNearbyDuplicate(nums,k));
        nums = new int[]{1,2,3,1,2,3};
        k =2;
        System.out.println(solution.containsNearbyDuplicate(nums,k));*/
        nums = new int[]{99,99};
        k =2;
        System.out.println(solution.containsNearbyDuplicate(nums,k));
    }
    static class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            //배열이 주어지면
            //nums[i] == nums[j]일때 abs(i-j) <=k이면 true를 반환
            //정리하면 같은값끼리 거리가 k보다 작거나 같으면 true
            //아니면 false return

            HashMap<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i <nums.length; i++) {
                if(map.containsKey(nums[i])){
                    int idx = map.get(nums[i]);
                    if(i-idx <=k){
                        return true;
                    }
                }
                //그 값,그 자리 인덱스 추가
                map.put(nums[i],i);
            }

            return false;
        }
    }
}
