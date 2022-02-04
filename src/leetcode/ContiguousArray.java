package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class ContiguousArray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;
        nums = new int[]{0,1,0,1};
        //System.out.println(solution.findMaxLength(nums));
        nums = new int[]{0,0,1,0,0,0,1,1};
        System.out.println(solution.findMaxLength(nums));
        nums = new int[]{0,1,1};
        //System.out.println(solution.findMaxLength(nums));
    }
    static class Solution {
        public int findMaxLength(int[] nums) {
            // 0,1 로 이루어진 배열 nums를 줌
            // 여기서 0과 1의 개수가 같으면서 인접한 부분배열의 길이를 return


            //1개수 연속 세기
            //0개수 연속 세기
            //만약 1과 0의 개수가 같다면 그 길이를 answer에 넣기
            HashMap<Integer,Integer> map = new HashMap<>();
            // 합이 0 이 되는값에 길이를 넣어주기 ?
            map.put(0, -1);
            int answer =0;
            int sum =0;
            for (int i = 0; i < nums.length; i++) {
                sum =sum + (nums[i] == 1? 1 : -1);
                if(map.containsKey(sum)){
                    //전에 지나간 적이있는 sum
                    //이때 전에 있던  최대길이=현재인덱스 - 전에있었던인덱스
                    answer = Math.max(answer ,i-map.get(sum));
                }else{
                    map.put(sum,i);
                }
                System.out.println(map);
            }
            return answer;


        }
    }
}
