package leetcode;

import java.util.Arrays;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] height;
        height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(solution.maxArea(height));
        height = new int[]{1,1};
        System.out.println(solution.maxArea(height));
    }
    static class Solution {
        public int maxArea(int[] height) {
            //n길이의 정수 배열 height를 줌
            // 두점을 기준으로 안에 물을 채울때 가장 많이 채울수 있는 물의 양

            //두점을 정하고 두점중 높이가 적은것이 높이
            //두점의 인덱스차이가 가로
            //가로 x 높이가 가장 큰 것이 return

            if(height.length ==2){
                return Math.min(height[0],height[1]);
            }


            int answer = 0;
            //두점 설정
            int left = 0;
            int right = height.length-1;

            while(left < right){
                int y = Math.min(height[left],height[right]);
                int x = right-left;
                answer = Math.max(answer,x*y);
                if(height[left] < height[right]){
                    left++;
                }else{
                    right--;
                }
            }

            return answer;
        }
    }
}
