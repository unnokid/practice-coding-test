package Programmers.level1;

import java.util.Arrays;

public class Budget {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] d;
        int budget;
        d = new int[] {1,3,2,5,4};
        budget =9;
        System.out.println(solution.solution(d,budget));
        d = new int[] {2,2,3,3};
        budget =10;
        System.out.println(solution.solution(d,budget));
    }

    static class Solution {
        public int solution(int[] d, int budget) {
            int answer = 0;

            //최대한 많은 부서에 물품을 구매할 수 있도록 지원하려고 함
            //최대 몇개의 부서에 물품을 지원할 수 있는지 return

            //가장 적게드는 부서부터 알기위해서 정렬
            Arrays.sort(d);
            for (int i = 0; i < d.length; i++) {
                //적은부서부터 부여
                budget-=d[i];
                //재고 소진시 끝
                if(budget<0)
                {
                    break;
                }
                answer++;
            }
            return answer;
        }
    }
}
