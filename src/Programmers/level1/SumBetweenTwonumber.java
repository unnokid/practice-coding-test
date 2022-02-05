package Programmers.level1;

public class SumBetweenTwonumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int a;
        int b;
        a=3;
        b=5;
        System.out.println(solution.solution(a,b));
        a=3;
        b=3;
        System.out.println(solution.solution(a,b));
        a=5;
        b=3;
        System.out.println(solution.solution(a,b));
    }
    static class Solution {
        public long solution(int a, int b) {
            long answer = 0;
            int temp;
            //a ,b 가 주어질때 그 사이에 있는 모든 정수의 합을 리턴함
            if(a > b)
            {
                temp =a;
                a = b;
                b= temp;
            }
            for(int i= a;i<=b;i++){
                answer+=i;
            }
            return answer;
        }
    }
}
