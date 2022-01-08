package leetcode;

import java.util.Arrays;

public class TwoSum2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;
        int target;
        nums = new int[] {2,7,11,15};
        target =9;
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }
    static class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int[] answer = new int[2];

            //하나의  정렬 배열을 주고
            // 2개의 인덱스를 더해서 target이 되는 인덱스 return
            //반드시 solution은 존재한다.

            //맨앞은 작고 맨뒤는 제일 크고
            //답은 무조건 하나는 있으므로
            //맨앞뒤 인덱스
            int start =0;
            int end =numbers.length-1;

            while(start < end){
                int sum = numbers[start] + numbers[end];
                if(sum == target){
                    //번호 맞추려고 +1
                    answer[0] = start+1;
                    answer[1] = end+1;
                    break;
                }
                else if(sum > target){
                    end-=1;
                }
                else{
                    start+=1;
                }
            }

            return answer;
        }
    }
}
