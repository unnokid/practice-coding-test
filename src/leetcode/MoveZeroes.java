package leetcode;

public class MoveZeroes {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;
        nums = new int[] {0,1,0,3,12};
        solution.moveZeroes(nums);
    }

    static class Solution {
        public void moveZeroes(int[] nums) {

            //한 정수 배열을 준다.
            //모든 0을 새로운 배열을 만들지 말고
            // 상대적 순서를 지키며 이동한다.

            //하나면 그냥 끝
            if(nums.length ==1){
                return ;
            }

            int index =0;

            //0이 아니면 앞에서부터 하나씩 채워넣는다
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] !=0){
                    nums[index] = nums[i];
                    index++;
                }
            }

            //남은 index칸에 0을 채워넣는다
            for (int i = index; i <nums.length ; i++) {
                nums[index] =0;
                index++;
            }
        }
   }
}
