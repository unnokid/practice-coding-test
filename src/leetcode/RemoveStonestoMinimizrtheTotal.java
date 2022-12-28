package leetcode;

import java.util.Collections;
import java.util.PriorityQueue;

public class RemoveStonestoMinimizrtheTotal {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] piles;
        int k;
        piles = new int[]{5,4,9};
        k =2;
        System.out.println(solution.minStoneSum(piles,k));

    }
    static class Solution {
        public int minStoneSum(int[] piles, int k) {
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

            for (int i : piles){
                pq.add(i);
            }

            while(!pq.isEmpty() && k-- >0){
                int x = pq.poll();
                int a = x- (int) Math.floor(x/2);
                pq.add(a);
            }
            int sum =0;
            while (!pq.isEmpty()){
                sum+=pq.poll();
            }
            return sum;
        }
    }
}
