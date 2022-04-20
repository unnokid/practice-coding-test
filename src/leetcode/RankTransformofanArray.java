package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RankTransformofanArray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr;
        arr = new int[]{40,10,20,30};
        System.out.println(Arrays.toString(solution.arrayRankTransform(arr)));
    }
    static class Solution {
        public int[] arrayRankTransform(int[] arr) {
            int[] list = new int[arr.length];
            Map<Integer,Integer> map = new HashMap<>();
            int count = 1;
            for (int i = 0; i <arr.length ; i++) {
                list[i] = arr[i];
            }
            Arrays.sort(list);
            for (int i = 0; i <list.length ; i++) {
                if(!map.containsKey(list[i])){
                    map.put(list[i],count);
                    count++;
                }
            }
            for (int i = 0; i <arr.length ; i++) {
                arr[i] = map.get(arr[i]);
            }
            return arr;
        }
    }
}
