package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class KdiffPairsinanArray {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums;
        int k;
        nums = new int[]{3,1,4,1,5};
        k=2;
        System.out.println(solution.findPairs(nums,k));
        nums = new int[]{1,2,3,4,5};
        k=1;
        System.out.println(solution.findPairs(nums,k));

    }
    static class Solution {
        public int findPairs(int[] nums, int k) {
            // 정수 배열 nums을 주고 한개의 정수 k를 줌
            //k-diff pairs인 개수를 배열에서 return

            //k-diff 조건 (nums[i],nums[j])
            // 1. 0 <= i < j < nums.length    i보다 j 가 큼
            // 2. |nums[i] - nums[j]| ==k     2개의 정수 차이가 k

            //인덱스 순서 조건
            int answer =0;
            HashMap<Integer,Integer> map = new HashMap<>();

            //중복의 여부를 보고싶은데 set이 아닌 전체 개수를 넣자
            for (int i = 0; i <nums.length ; i++) {
                map.put(nums[i],map.getOrDefault(nums[i],0) +1);
            }
            //[3,1,4,1,5] -> [3,1] [1,2] [4,1] [5,1]
            for(int key : map.keySet()){
                if(k == 0){//만약 같은 숫자 찾기
                    if(map.get(key) >1){
                        answer++;
                    }
                }else if(map.containsKey(key+k)){
                    //k차이가 반드시 난다면 key+k를 가진 키가 존재한다면 조건 2를 만족
                    answer++;
                }
            }

            return answer;
        }
    }

}
