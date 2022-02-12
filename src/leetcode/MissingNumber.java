package leetcode;

public class MissingNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;
        nums = new int[]{3,0,1};
        System.out.println(solution.missingNumber(nums));
    }
    static class Solution {
        public int missingNumber(int[] nums) {

            //배열을 넘겨주면 0~n까지 들어있는데 빠진 번호를 찾아라
            boolean[] map = new boolean[nums.length+1];
            for (int i = 0; i <nums.length ; i++) {
                if(!map[nums[i]]){
                    map[nums[i]] = true;
                }
            }

            for (int i = 0; i <map.length ; i++) {
                if(!map[i]){
                    return i;
                }
            }

            return 0;
        }
    }
}
