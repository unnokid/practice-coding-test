package leetcode;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;
        int k;
        nums = new int[]{1,1,1,2,2,3};
        k=2;
        System.out.println(Arrays.toString(solution.topKFrequent(nums, k)));
    }
    static class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            //정수 배열과 k개가 주어짐
            //k개의 빈번한 횟수를 가진 요소를 배여로 만들어 return

            Map<Integer,Integer> map = new HashMap<>();

            for (int num : nums) {
                map.put(num,map.getOrDefault(num,0)+1);
            }

            //가장 많이 등장한 횟수로 내림차순
            PriorityQueue<Map.Entry<Integer,Integer>> queue =
                    new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
            queue.addAll(map.entrySet());

            //System.out.println(queue);
            int[] result = new int[k];
            for (int i = 0; i <result.length ; i++) {
                result[i] = queue.poll().getKey();
            }

            return result;
        }
    }

}
