package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortedArray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1;
        int[] nums2;
        int m;
        int n;
        nums1 = new int[]{1,2,3,0,0,0};
        nums2 = new int[]{2,5,6};
        n=3;
        m=3;
    }
    static class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            //void라서 그냥 예시 참고
            //2개의 배열 제시
            //각 기준의 번호를 주고 합칠때 정렬해서 만들기
            //앞배열에 뒷배열 개수 붙이기
            for (int i = m; i < m + n; i++) {
                nums1[i] = nums2[i-m];
            }
            Arrays.sort(nums1);

        }
    }
}
