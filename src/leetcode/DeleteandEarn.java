package leetcode;

import java.util.Arrays;

public class DeleteandEarn {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;
        nums = new int[]{3,4,2};
        System.out.println(solution.deleteAndEarn(nums));
        nums = new int[]{2,2,3,3,3,4};
        System.out.println(solution.deleteAndEarn(nums));
    }
    static class Solution {
        public int deleteAndEarn(int[] nums) {
            //정수배열에서 하나를 골라 삭제하고 점수를 얻을 수 있음
            // i번째를 고르거 점수를 얻은뒤 i-1, i+1을 배열에서 삭제
            //최대한 많은 점수를 얻도록 return

            //하나를 선택했을때 연쇄적으로 밀리기 때문에 dp 사용
            int[] map;
            //큰값 찾기
            Arrays.sort(nums);
            int max =nums[nums.length-1];
            map = new int[max+1];

            for (int i = 0; i <nums.length ; i++) {
                map[nums[i]]++;
            }

            //내가 i번을 뽑고싶으면 둘중 큰거 택
            // i번 점수*개수 + i-2 점수 <-> i-1 점수
            for (int i = 2; i <=max ; i++) {
                map[i] = Math.max(map[i]*i+map[i-2], map[i-1]);
            }

            return map[max];

        }
    }
}
