package Programmers.level1;

import java.util.*;

public class Failure {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        int[] stages;
        n= 5;
        stages = new int[]{2,1,2,6,2,4,3,3};
        System.out.println(Arrays.toString(solution.solution(n, stages)));
        n= 4;
        stages = new int[]{4,4,4,4,4};
        System.out.println(Arrays.toString(solution.solution(n, stages)));
    }
    static class Solution {
        public int[] solution(int N, int[] stages) {
            int[] answer = new int[N];

            //실패율 정의
            //스테이지에 도달했으나 아직 클리어하지못한 플레이어수/스테이지에 도달한 플레이어수수
            //실패율이 높은 스테이지부터 내림차순으로 스테이지 번호가 담겨있는 배열 return
            HashMap<Integer, Double> hashMap = new HashMap<Integer, Double>();

            for (int i = 1; i <= N ; i++) {
                int clear =0;
                int notClear =0;
                for (int j = 0; j < stages.length; j++) {
                    if(stages[j] == i){
                        notClear++;
                    }
                    if(stages[j]>=i){
                        clear++;
                    }
                }
                if(clear ==0){
                    hashMap.put(i,0.0);
                }
                else{
                    hashMap.put(i,(double)notClear/clear);
                }
            }

            List<Integer> list = new ArrayList<>(hashMap.keySet());
            Collections.sort(list,(o1, o2) -> (hashMap.get(o2).compareTo(hashMap.get(o1))));
            System.out.println(list);
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }

            return answer;
        }
    }
}
