package leetcode;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;
        nums = new int[] {1,1,2};
        System.out.println(solution.removeDuplicates(nums));
        nums = new int[] {1};
        System.out.println(solution.removeDuplicates(nums));
    }
    static class Solution {
        public int removeDuplicates(int[] nums) {
            //내림차순으로 정렬된 배열이 주어짐
            //중복을 제자리에서 제거
            //상대적 순서는 유지되어야함
            if(nums.length <= 1){
                return nums[0];
            }

            int target =-101;
            int count =0;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] != target){
                    nums[count] = nums[i];
                    target = nums[i];
                    count++;
                }
            }
            return count;
        }
    }
}
