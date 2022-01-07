package leetcode;

public class SearchInsertPosition {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;
        int target;
        nums = new int[] {1,3,5,6};
        target = 5;
        System.out.println(solution.searchInsert(nums,target));
        nums = new int[] {1,3,5,6};
        target = 2;
        System.out.println(solution.searchInsert(nums,target));
        nums = new int[] {1,3,5,6};
        target = 7;
        System.out.println(solution.searchInsert(nums,target));
    }

    static class Solution {
        public int searchInsert(int[] nums, int target) {

            //정렬된 각각 다른 배열과 target 을 준다
            //찾을수 있으면 그 배열의 인덱스를 return
            //찾을 수 없으면 그 숫자가 들어갈 수 있는 인덱스를 찾아서 return;

            if(target < nums[0]){
                return 0;
            }

            if(target > nums[nums.length-1]){
                return nums.length;
            }

            int start =0;
            int end = nums.length-1;
            int index;

            while(start <= end){
                index = (start+end)/2;

                //찾았으면 바로 끝
                if(target == nums[index]){
                    return index;
                }
                else if(target > nums[index]){
                    start = index +1;
                }
                else{
                    end = index -1;
                }
            }

            //못찾아서 나왔음
            return  end+1;

            //아니면 존재하면 안됨

        }
    }

}



