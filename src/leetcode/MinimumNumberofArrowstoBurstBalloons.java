package leetcode;

import java.util.Arrays;

public class MinimumNumberofArrowstoBurstBalloons {

    public static void main(String[] args) {

    }
    static class Solution {
        public int findMinArrowShots(int[][] points) {
            Arrays.sort(points, (a, b) -> Integer.compare(a[1],b[1]));
            int result = 1;
            int before = 0;

            for(int i = 1; i < points.length; i++){
                if(points[i][0] > points[before][1]){
                    result++;
                    before = i;
                }
            }
            return result;
        }
    }
}
