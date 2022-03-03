package leetcode;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] h;
        h= new int[]{1,1,4,2,1,3};
        System.out.println(solution.heightChecker(h));
        h= new int[]{5,1,2,3,4};
        System.out.println(solution.heightChecker(h));
    }
    static class Solution {
        public int heightChecker(int[] heights) {
            // 사진찍기
            // 높이에 따라 감소하지 않는 순서로 한줄에 서도록 요청
            // 순서를 변경했을 때 변경된 자리의 개수를 return
            int[] map = new int[heights.length];
            int answer =heights.length;
            for (int i = 0; i <heights.length ; i++) {
                map[i] = heights[i];
            }

            for (int i = 0; i <map.length ; i++) {
                if(map[i] == heights[i]){
                    answer--;
                }
            }

            return answer;
        }
    }
}
