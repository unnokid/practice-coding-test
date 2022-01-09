package Programmers.level1;

import java.util.HashSet;

public class Phonekemon {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;
        nums = new int[] {3,1,2,3};
        System.out.println(solution.solution(nums));
        nums = new int[] {3,3,3,2,2,4};
        System.out.println(solution.solution(nums));
        nums = new int[] {3,3,3,2,2,2};
        System.out.println(solution.solution(nums));
    }


    static class Solution {
        public int solution(int[] nums) {
            int answer = 0;
            HashSet<Integer> set = new HashSet<>();

            //최대한 다양한 포켓몬을 가지길 원하기에
            // N/2마리의 포켓몬을 선택할때 가장 많은 종류를 선택하는 방법 return


            //Hashset을 사용하여 중복 제거
            for(int i=0;i< nums.length;i++)
            {
                set.add(nums[i]);
            }

            //중복제거한후에 선택의 개수만큼 가져오기
            if(set.size()<=nums.length/2)
            {
                answer =set.size();
            }
            else
            {
                answer = nums.length/2;
            }



            return answer;
        }
    }
}
