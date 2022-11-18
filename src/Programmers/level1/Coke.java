package Programmers.level1;

public class Coke {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int a;
        int b;
        int n;
        a =2;
        b= 1;
        n=20;
        System.out.println(solution.solution(a,b,n));
        a =3;
        b= 1;
        n=20;
        System.out.println(solution.solution(a,b,n));
    }
    static class Solution {
        public int solution(int a, int b, int n) {
            //프로그래머스 LV 1 콜라 문제
            int answer = 0;

            while(n/a>0){
                int cost = n/a;
                n= (n%a) + (cost*b);
                answer+=(cost*b);
            }


            return answer;
        }
    }
}
