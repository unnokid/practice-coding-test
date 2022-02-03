package Programmers.level1;

import java.util.Arrays;

public class NumberK {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr;
        int[][] commands;
        arr = new int[]{1,5,2,6,3,7,4};
        commands = new int[][]{{2,5,3},{4,4,1},{1,7,3}};
        System.out.println(Arrays.toString(solution.solution(arr, commands)));
    }
    static class Solution {
        public int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];
            int[] target;
            int choosenumber;
            int number;
            int answernumber=0;
            int targetnumber=0;
            
            //배열 arr 에서 i번째부터 j번째 까지 자르고 정렬할때
            //k번재 있는 수를 구하면 됨
            
            //command[?][0], command[?][1] 의 갯수
            // y -x +1 개를 하면 된다. 정렬후 총 command[?][2] 번째에 있는 수 이것도 z -1 해줘야됨
            //
            for(int count=0;count<commands.length;count++)
            {
                targetnumber= commands[count][2];
                number=0;
                choosenumber = commands[count][1]-commands[count][0]+1;

                target = new int[choosenumber];
                for(int i = commands[count][0];i<commands[count][1]+1;i++)
                {
                    target[number] =array[i-1];
                    number++;
                }
                Arrays.sort(target);
                answer[answernumber] = target[targetnumber-1];

                answernumber++;
            }
            return answer;
        }
    }
}
