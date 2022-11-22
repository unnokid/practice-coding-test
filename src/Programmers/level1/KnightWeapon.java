package Programmers.level1;

import java.util.Arrays;

public class KnightWeapon {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int number;
        int limit;
        int power;
        number =5;
        limit =3;
        power = 2;
        System.out.println(solution.solution(number,limit,power));
        number =10;
        limit =3;
        power = 2;
        System.out.println(solution.solution(number,limit,power));

    }
    static class Solution {
        public int solution(int number, int limit, int power) {
            // 프로그래머스 LV 1 기사단원의 무기
            int answer = 0;
            for (int i = 1; i <=number ; i++) {
                int target = check(i);

                if(target <= limit){
                    answer+=target;
                }else{
                    answer+=power;
                }
            }
            return answer;
        }
        private int check(int n){
            int count =0 ;
            for (int i = 1; i*i <=n ; i++) {
                if(n%i ==0){
                    count++;
                    if(i*i < n){
                        count++;
                    }
                }
            }
            return count;
        }
    }
}
