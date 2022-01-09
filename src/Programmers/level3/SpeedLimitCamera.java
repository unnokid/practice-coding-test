package Programmers.level3;

import java.util.Arrays;
import java.util.Comparator;

public class SpeedLimitCamera {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] routes;
        routes = new int[][] {{-20,-15},{-14,-5},{-18,-13},{-5,-3}};
        System.out.println(solution.solution(routes));
    }

    static class Solution {
        public int solution(int[][] routes) {
            int count =0;

            //고속도로 이용시 단속용 카메라 한번씩 만나도록 카메라 설치
            // 최소 몇대의 카메라가 필요할지 return


            //정렬방식 따로 선언
            Arrays.sort(routes, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    Integer a = o1[1];
                    Integer b = o2[1];
                    return a.compareTo(b);
                }
            });
            //System.out.println(Arrays.deepToString(routes));

            int min = Integer.MIN_VALUE;
            for (int i = 0; i < routes.length; i++) {
                if(min < routes[i][0]){
                    min = routes[i][1];
                    count++;
                }
            }




            return count;
        }
    }
}
