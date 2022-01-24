package leetcode;

import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] intervals;
        intervals = new int[][]{{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(solution.merge(intervals)));
        intervals = new int[][]{{1,4},{5,6}};
        System.out.println(Arrays.deepToString(solution.merge(intervals)));
        intervals = new int[][]{{1,4},{4,5}};
        System.out.println(Arrays.deepToString(solution.merge(intervals)));
        intervals = new int[][]{{1,4},{0,4}};
        System.out.println(Arrays.deepToString(solution.merge(intervals)));
        intervals = new int[][]{{1,4},{0,1}};
        System.out.println(Arrays.deepToString(solution.merge(intervals)));
        intervals = new int[][]{{1,4},{0,2},{3,5}};
        System.out.println(Arrays.deepToString(solution.merge(intervals)));
        intervals = new int[][]{{1,4},{0,0}};
        System.out.println(Arrays.deepToString(solution.merge(intervals)));
    }
    static class Solution {
        public int[][] merge(int[][] intervals) {



            //intervals이라는 배열을 준다
            //겹치는 부분은 합쳐서 배열로 만들어서 return
            List<int[]> list = new ArrayList<>();
            //start 부분으로 정렬
            Arrays.sort(intervals, (o1, o2) -> {
                if(o1[0] == o2[0]){
                    return Integer.compare(o1[1],o2[1]);
                }
                else{
                    return Integer.compare(o1[0],o2[0]);
                }
            });

            //시작 start , end 정의
            int start = intervals[0][0];
            int end = intervals[0][1];
            for (int i = 1; i < intervals.length; i++) {
                int[] temp = intervals[i];
                //왼쪽 end가 더 크다면
                if(temp[0] <= end){
                    end = Math.max(end,temp[1]);
                }
                // 반대
                else{
                    list.add(new int[]{start,end});
                    start = temp[0];
                    end = temp[1];
                }
            }
            //맨 마지막 남은거 add
            list.add(new int[]{start,end});

            //list를 배열형태로 변환
            return list.toArray(new int[list.size()][2]);

        }
    }
}
