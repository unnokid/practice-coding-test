package Programmers.level1;

public class Year2016 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int a;
        int b;
        a= 5;
        b= 24;
        System.out.println(solution.solution(a,b));
    }
    static class Solution {
        public String solution(int a, int b) {
            String answer = "";
            String[] days = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
            int[] dayNumber = {31,29,31,30,31,30,31,31,30,31,30,31};
            int sum =0;
            //2016년 1월 1일은 금요일
            //2016년은 윤년입니다 -> 2월이 29일까지 있다는뜻
            //2016년 a월 b일은 무슨요일인지 return

            for (int i = 0; i < a-1; i++) {
                sum+=dayNumber[i];
            }
            sum+=(b+4);

            return days[sum%7];
        }
    }
}
