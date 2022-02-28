package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;
        nums = new int[]{0,1,2,4,5,7};
        System.out.println(solution.summaryRanges(nums));
    }
    static class Solution {
        public List<String> summaryRanges(int[] nums) {
            //유니크한 정렬된 정수 배열을 부여
            //연속된 구간을  "a->b"로 만들어서 압축후 return

            List<String> answer = new ArrayList<>();

            int idx =0;
            int len = nums.length;
            while(idx < len){
                int start = nums[idx];
                int end;
                //최대길이를 안넘고 다음값인경우 반복
                while(idx+1 <len && nums[idx+1] == nums[idx]+1){
                    idx++;
                }
                end = nums[idx];

                if(start == end){
                    answer.add(start+"");
                }else{
                    answer.add(start+"->"+end);
                }

                idx++;
            }


            return answer;
        }
    }
}
