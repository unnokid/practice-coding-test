package leetcode;

import java.util.Arrays;

public class MedianofTwoSortedArrays {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1;
        int[] nums2;
        nums1 = new int[]{1,3};
        nums2 = new int[]{2,4};
        System.out.println(solution.findMedianSortedArrays(nums1,nums2));
    }
    static class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            double result =0;

            //정렬
            Arrays.sort(nums1);
            Arrays.sort(nums2);

            int[] map = new int[nums1.length+nums2.length];
            int i =0;
            int j =0;
            int count =0;
            //두개의 배열을 합친 map 배열 생성
            while(i < nums1.length && j < nums2.length){
                if(nums1[i] <= nums2[j]){
                    map[count++] = nums1[i];
                    i++;
                }else{
                    map[count++] = nums2[j];
                    j++;
                }
            }
            
            //아직 들어가지 못한 배열 정리
            if(i != nums1.length){
                for (int k = i; k <nums1.length ; k++) {
                    map[count++] = nums1[k];
                }
            }
            if(j != nums2.length){
                for (int k = j; k <nums2.length ; k++) {
                    map[count++] = nums2[k];
                }
            }

            //map의 길이가 홀수인지 짝수인지
            result = map.length %2 != 0 ? map[map.length/2] :(map[map.length/2] + map[(map.length-1)/2])/2.0;
            return result;
        }
    }


}
