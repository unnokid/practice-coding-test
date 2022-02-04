package Programmers.level1;

public class DivisorCountandPlus {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int left;
        int right;
        left = 13;
        right =17;
        System.out.println(solution.solution(left,right));
        left = 24;
        right =27;
        System.out.println(solution.solution(left,right));
    }
    static class Solution {
        public int solution(int left, int right) {
            int answer = 0;

            //두정수 left, right
            //사이의 모든 수들중 약수의 개수의 짝수이면 더함
            //약수의 개수가 홀수인수는 뺀 수를 리턴

            for(int i=left;i<=right;i++){
                if(countdivisor(i) % 2 ==0){
                    //약수의 개수가 짝수일 경우
                    answer+=i;
                }
                else{
                    //약수의 개수가 홀수일 경우
                    answer-=i;
                }

            }
            return answer;
        }
        static int countdivisor(int number)//숫자를 부여하면 그 숫자의 약수갯수 가져오기
        {
            int count =0;
            for(int i=1;i<=number;i++)
            {
                if(number % i ==0){
                    count++;
                }
            }
            return count;
        }
    }
}
