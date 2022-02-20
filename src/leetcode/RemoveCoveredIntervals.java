package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveCoveredIntervals {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] intervals;
        intervals = new int[][]{{1,4},{3,6},{2,8}};
        System.out.println(solution.removeCoveredIntervals(intervals));
    }
    static class Solution {
        public int removeCoveredIntervals(int[][] intervals) {
            //배열을 줄떄
            //간격 a,b a~b 사이의 인터벌을 의미함
            //이때 다른 인터벌을 감싼 배열이 있다면 제거가 가능
            //남아있는 interval의 개수를 구해라

            //정렬할때 앞 배열 수로 정렬한다
            Arrays.sort(intervals, (a,b)-> a[0] == b[0]? b[1] - a[1] : a[0] - b[0]);
            int count =0;
            int before =0;
            int end =0;

            for (int[] interval: intervals){
                //end에 끝값을 넣고
                end = interval[1];
                //전에 끝보다 end가 더 크면 개수추가
                if(before < end){
                    count++;
                    before=end;
                }
            }

            return count;

        }
    }
}
