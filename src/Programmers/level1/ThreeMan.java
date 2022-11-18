package Programmers.level1;

import java.util.Arrays;

public class ThreeMan {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] number;
        number = new int[]{-3,-2,-1,0,1,2,3};
        System.out.println(solution.solution(number));
    }
    static class Solution {
        static int total;
        public int solution(int[] number) {
            //프로그래머스 LV1 삼총사
            total=0;
            Arrays.sort(number);
            boolean[] visit = new boolean[number.length];

            dfs(number,visit,new int[3],0,0);


            return total;
        }
        void dfs(int[] number,boolean[] visit, int[] list, int count,int start){
            if(count == 3){
                int sum = 0;
                for (int i = 0; i <list.length ; i++) {
                    System.out.print(list[i]+" ");
                    sum+=list[i];
                }
                System.out.println();
                if(sum ==0){
                    System.out.println("위는 추가됨");
                    total++;
                }
                return;
            }

            for (int i = start; i <number.length ; i++) {
                if(!visit[i]){
                    list[count] = number[i];
                    visit[i] = true;
                    dfs(number,visit,list,count+1,i+1);
                    visit[i] = false;
                }
            }
        }
    }
}
