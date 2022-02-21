package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;
        nums = new int[]{3,2,3};
        System.out.println(solution.majorityElement(nums));
        nums = new int[]{2,2,1,1,1,2,2};
        System.out.println(solution.majorityElement(nums));
    }
    static class Solution {
        public int majorityElement(int[] nums) {
            //n길이의 정수 배열을 준다
            //majority element란 요소가 n/2 번보다 많이 등장하는 요소를 나타낸다
            //이 배열에는 majority element 는 항상 존재한다

            //각 원소의 개수를 세서 배열의 길이/2 번보다 많이 있는지 확인해서 추가
            int answer =0;
            int len = nums.length/2;
            Map<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i <nums.length ; i++) {
                if(map.containsKey(nums[i])){
                    map.put(nums[i],map.get(nums[i])+1);
                }else{
                    map.put(nums[i],1);
                }
            }

            for(int target : map.keySet()){
                //target 키
                //count가 개수
                int count = map.get(target);
                if(count > len){
                    answer = target;
                    break;
                }
            }
            return answer;
        }
    }
}
