package leetcode;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumsDivisiblebyK {

    public static void main(String[] args) {

    }
    static class Solution {
        public int subarraysDivByK(int[] nums, int k) {
            int sum = 0;
            int count = 0;
            Map<Integer, Integer> map = new HashMap<>();
            map.put(0, 1);

            for (int num : nums) {
                sum += num;
                int key = (sum % k + k) % k;
                count += map.getOrDefault(key, 0);
                map.put(key, map.getOrDefault(key, 0) + 1);
            }

            return count;
        }
    }
}
