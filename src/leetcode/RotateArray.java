package leetcode;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        Solution solution = new Solution();

        //아직 덜풀었음
        int[] nums;
        int k;
        /*nums = new int[]{1,2,3,4,5,6,7};
        k=3;
        solution.rotate(nums,k);
        nums = new int[]{-1,-100,3,99};
        k=2;
        solution.rotate(nums,k);
        nums = new int[]{1,2,3,4,5,6};
        k=3;
        solution.rotate(nums,k);*/
        nums = new int[]{1,2,3,4,5,6};
        k=4;
        solution.rotate(nums,k);
    }

    static class Solution {
        public void rotate(int[] nums, int k) {

            // 한 배열을 준다.
            // k만큼 오른쪽 이동
            /*int[] temp = new int[nums.length];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = nums[i];
            }
            int target =0 ;
            for (int i = 0; i < nums.length ; i++) {
                target = (i+k)% nums.length;
                nums[target] = temp[i];
            }*/

            //공간 O(1)만 사용하기

            if(k ==0){
                return ;
            }

            int before= 0;
            int next =0;
            int target =0;

            if(nums.length%k == 0){
                //안맞을때 처리
                System.out.println("배열이 딱맞음");
                for (int i = 0; i <k ; i++) {
                    System.out.println(i+"시작인덱스");
                    for (int count = 0; count < nums.length/k; count++) {
                        if(count ==0){
                            target = (i+k)% nums.length;
                            before = nums[i];
                            next = nums[target];
                        }
                        else{
                            target= (target+k)%nums.length;
                            before = next;
                            next = nums[target];
                        }
                        System.out.println(target+"첫지정target");
                        System.out.println(next+"next");
                        nums[target] = before;
                        System.out.println(Arrays.toString(nums));
                    }
                }
            }
            else{
                for (int i = 0; i < nums.length; i++) {
                    if(i ==0){
                        target = (i+k)% nums.length;
                        before = nums[i];
                        next = nums[target];
                    }
                    else{
                        target= (target+k)%nums.length;
                        before = next;
                        next = nums[target];
                    }
                    System.out.println(target+"첫지정target");
                    System.out.println(next+"next");
                    nums[target] = before;
                    System.out.println(Arrays.toString(nums));

                }
            }



        }

    }
}
