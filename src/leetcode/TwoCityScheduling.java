package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class TwoCityScheduling {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] cost;
        cost= new int[][]{{10,20},{30,200},{400,50},{30,20}};
        System.out.println(solution.twoCitySchedCost(cost));
        cost= new int[][]{{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}};
        System.out.println(solution.twoCitySchedCost(cost));
    }
    static class Solution {
        public int twoCitySchedCost(int[][] costs) {
            //2개의 선택지중 반반 보내고 싶은데 최소비용을 알고싶음

            //n개의 최소값을 알고 더한다음 선택되지 않은 나머지를 반대를 고른다
            int answer =0;
            Arrays.sort(costs, new Comparator<int []>(){

                @Override
                public int compare(int[] o1, int[] o2) {
                    return (o1[1]-o1[0]) - (o2[1]-o2[0]);
                }
            });
            System.out.println(Arrays.deepToString(costs));
            for (int i = 0; i < costs.length/2 ; i++) {
                answer += costs[i][1] +costs[costs.length-1-i][0];
            }
            return answer;

        }
    }
}
