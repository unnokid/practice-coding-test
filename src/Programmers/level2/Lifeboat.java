package Programmers.level2;

import java.util.Arrays;

public class Lifeboat {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] people;
        int limit;
        people = new int[]{70,50,80,50};
        limit = 100;
        System.out.println(solution.solution(people,limit));
        people = new int[]{70,80,50};
        limit = 100;
        System.out.println(solution.solution(people,limit));
    }
    static class Solution {
        public int solution(int[] people, int limit) {
            int answer = 0;

            //한번에 최대 2명 탐
            //무게 제한 존재
            int start =0;
            
            //정렬해서 가장 무거운사람이랑 가장 가벼운사람 먼저 태워서 보내기
            Arrays.sort(people);
            for (int i = people.length-1; start<= i ; i--) {
                if(people[start] + people[i] <= limit){
                    start++;
                }
                answer++;
            }

            return answer;
        }
    }
}
