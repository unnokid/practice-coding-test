package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddtoArrayFormofInteger {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;
        int k;
        nums = new int[]{1,2,0,0};
        k = 34;
        System.out.println(solution.addToArrayForm(nums,k));
        nums = new int[]{9,9,9,9,9,9,9,9,9,9};
        k = 1;
        System.out.println(solution.addToArrayForm(nums,k));
    }
    static class Solution {
        public List<Integer> addToArrayForm(int[] num, int k) {
            //배열칸에 K값 더해서 return

            List<Integer> answer = new ArrayList<>();

            for (int i = num.length-1; i >=0 ; i--) {
                //앞에서 채우기
                answer.add(0,(num[i]+k)%10);
                k = (num[i]+k)/10;
            }

            //k가 남으면 안됨
            while(k>0){
                answer.add(0,k%10);
                k/=10;
            }

            return answer;
        }
    }
}
