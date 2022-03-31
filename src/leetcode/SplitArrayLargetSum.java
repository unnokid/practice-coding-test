package leetcode;

public class SplitArrayLargetSum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;
        int m;
        nums = new int[]{7,2,5,10,8};
        m=2;
        System.out.println(solution.splitArray(nums,m));
        nums = new int[]{1,2,3,4,5};
        m=2;
        System.out.println(solution.splitArray(nums,m));
    }
    static class Solution {
        public int splitArray(int[] nums, int m) {
            //배열을 m개로 나눌때
            //각 배열의 부분집합 합이 가장 큰 값중
            //가장 작게나오는 값을 return

            int start =0;
            int end =0;

            for (int i = 0; i <nums.length ; i++) {
                start = Math.max(start,nums[i]);
                end +=nums[i];
            }
            //연속된 배열로 나누기
            //모든배열의 합에서

            while(start < end){
                //중간값
                //배열을 나눌 기준치
                int mid = start +(end-start)/2;

                int sum =0;
                int count =1;
                for (int i = 0; i <nums.length ; i++) {
                    //배열의 값을 다 더해가며 mid값기준으로 배열개수 나누기
                    if(sum+ nums[i] >mid ){
                        sum = nums[i];
                        count++;
                    }else{
                        sum +=nums[i];
                    }
                }

                //나눠지는 파트의 개수에 따라 합값 조절
                if(count > m){
                    start = mid +1;
                }else{
                    end = mid;
                }
            }
            return end;

        }
    }
}
