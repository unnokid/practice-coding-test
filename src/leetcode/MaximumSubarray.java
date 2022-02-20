package leetcode;

public class MaximumSubarray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;
        nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(solution.maxSubArray(nums));
    }
    static class Solution {
        public int maxSubArray(int[] nums) {
            //정수배열 줌
            //가장 큰 합을 갖는 연속 하위 배열
            //앞부터 순서대로 더해가면서 그 배열보다 작아진다면 다시 배열 시작
            int sum =nums[0];

            for (int i = 1; i <nums.length ; i++) {
                //i번 자리에 전 인덱스와 현재 인덱스를 합친 값중 뭐가 더 큰지
                //i가 그냥 더 크면 그대로 두고 sum 넣기
                //더해온게 크면 더한값으로 바꾸고 sum과 비교해서 큰값
                nums[i] = Math.max(nums[i],nums[i]+nums[i-1]);
                sum = Math.max(sum,nums[i]);
            }
            return sum;
        }
    }
}
