package Programmers.level1;

import java.util.Arrays;

public class Lotto {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] lottos;
        int[] win_nums;
        lottos = new int[]{44, 1, 0, 0, 31, 25};
        win_nums = new int[]{31, 10, 45, 1, 6, 19};
        System.out.println(Arrays.toString(solution.solution(lottos, win_nums)));
        lottos = new int[]{0, 0, 0, 0, 0, 0};
        win_nums = new int[]{38, 19, 20, 40, 15, 25};
        System.out.println(Arrays.toString(solution.solution(lottos, win_nums)));
        lottos = new int[]{45, 4, 35, 20, 3, 9};
        win_nums = new int[]{20, 9, 3, 45, 4, 35};
        System.out.println(Arrays.toString(solution.solution(lottos, win_nums)));
    }
    static class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {

            int[] answer = new int[2];

            //로또 45개 숫자중 6개 맞추기
            //낙서로인해 알아볼수없는게 0으로 표기
            //될수있는 최고순위와 최저순위를 return
            int countzero =0;
            int countright=0;
            int highrank=7;
            int lowrank=7;

            //정렬한후에 비교하기
            Arrays.sort(lottos);
            Arrays.sort(win_nums);

            for(int i=0; i<lottos.length;i++)
            {
                if(lottos[i] == 0)
                {
                    countzero+=1;
                }
                else
                {
                    for(int j=0;j<win_nums.length;j++)
                    {
                        if(lottos[i] == win_nums[j])
                        {
                            countright+=1;
                            break;
                        }
                    }
                }
            }


            answer[0]=getRank(countright+countzero);
            answer[1]=getRank(countright);
            return answer;
        }

        public static int getRank(int n) {

            switch (n) {
                case 6:
                    return 1;
                case 5:
                    return 2;
                case 4:
                    return 3;
                case 3:
                    return 4;
                case 2:
                    return 5;
                default:
                    return 6;
            }
        }

    }
}
