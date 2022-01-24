package Programmers.level2;

public class Expressnumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        n=15;
        System.out.println(solution.solution(n));
    }
    static class Solution {
        public int solution(int n) {
            int answer = 0;

            //n을 줄때 여러가지 자연수의 덧셈으로 n을 만들어 낼 수 있음
            //표현할수 있는 방법의 수를 return

            // 연속된 자연수의 조합으로 n을 만들어낼수있는가?
            //i는 시작숫자 , j는 순서대로 sum에 더할 숫자증가
            for (int i = 1; i <= n; i++) {//시작숫자
                int sum =0;

                for (int j = i; j <= n; j++) {
                    sum+=j;
                    //만약 순서대로 더하는데 넘어가면 끝
                    if(sum>n){
                        break;
                    }
                    //순서대로 더해서 n이 나오면 answer++
                    else if(sum == n){
                        answer++;
                        break;
                    }
                }
            }


            return answer;
        }
    }
}
