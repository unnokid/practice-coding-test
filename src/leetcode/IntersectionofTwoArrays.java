package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionofTwoArrays {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1;
        int[] nums2;
        nums1 = new int[]{1,2,2,1};
        nums2 = new int[]{2,2};
        System.out.println(solution.intersection(nums1,nums2));
    }
    static class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            //두 배열을 줌
            //두 배열에 모두 존재하는 원소의 배열을 return
            List<Integer> list = new ArrayList<>();
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < nums1.length; i++) {
                set.add(nums1[i]);
            }
            for (int i = 0; i <nums2.length ; i++) {
                if(set.contains(nums2[i])){
                    list.add(nums2[i]);
                    set.remove(nums2[i]);
                }
            }
            int[] answer = new int[list.size()];
            for (int i = 0; i <list.size() ; i++) {
                answer[i] = list.get(i);
            }
            return answer;
        }
    }
}
