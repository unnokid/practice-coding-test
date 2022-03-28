package leetcode;

public class SearchinRoatatedSortedArray2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;
        int target;
        nums = new int[]{2,5,6,0,0,1,2};
        target = 0;
        System.out.println(solution.search(nums,target));
        nums = new int[]{2,5,6,0,0,1,2};
        target = 3;
        System.out.println(solution.search(nums,target));
    }
    static class Solution {
        public boolean search(int[] nums, int target) {
            //중복이 존재하는 정수 배열 정렬이 되어진 배열
            //target이 존재하면 true
            //결국 전체를 다 돌아야함
            //이분 탐색
            int start =0;
            int end = nums.length-1;

            while(start <= end){
                int mid = start + (end-start) /2;

                if(nums[mid] == target){
                    return true;
                }else if(nums[mid] > nums[start]){
                    //현재 mid값이 start보다 크다
                    if(target >= nums[start] && target < nums[mid]){
                        end = mid -1;
                    }else{
                        start = mid +1;
                    }

                }else if(nums[mid] < nums[start]){
                    if(target <= nums[end] && target > nums[mid]){
                        start = mid +1;
                    }else{
                        end = mid -1;
                    }
                }else{
                    start++;
                }
            }
            return false;
        }
    }
}
