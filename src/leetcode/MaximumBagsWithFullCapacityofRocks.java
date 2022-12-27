package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumBagsWithFullCapacityofRocks {

    public static void main(String[] args) {

    }

    static class Solution {

        public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < rocks.length; i++) {
                list.add(capacity[i] - rocks[i]);
            }
            Collections.sort(list);
            int answer = 0;
            int count = 0;
            for (int a : list) {
                count += a;
                if (count > additionalRocks) {
                    break;
                }
                answer++;
            }
            return answer;
        }
    }
}
