package Programmers.level1;

public class Colatz {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        n=6;
        System.out.println(solution.solution(n));
        n=16;
        System.out.println(solution.solution(n));
        n=626331;
        System.out.println(solution.solution(n));
    }
    static class Solution {
        public int solution(long num) {
            int answer = 0;

            //주어진 수가 1이 될때까지 이 작업을 반복
            //짝수면 2로 나눔
            //홀수면 3곱하고 +1
            //1이 될때 까지 이 작업 반복
            //500번을 반복해도 1이 안되면 -1 return
            if(num == 1){
                return 0;
            }


            while(answer < 501){
                if(num %2 ==0){
                    num/=2;
                }
                else{
                    num=num*3+1;
                }
                answer++;
                if(num == 1){
                    break;
                }
            }
            if(answer == 501){
                return -1;
            }


            return answer;
        }
    }
}
