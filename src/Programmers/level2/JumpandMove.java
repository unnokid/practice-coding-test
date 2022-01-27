package Programmers.level2;

public class JumpandMove {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        n=5;
        System.out.println(solution.solution(n));
        n=6;
        System.out.println(solution.solution(n));
        n=5000;
        System.out.println(solution.solution(n));
    }
    static public class Solution {
        public int solution(int n) {
            int answer = 0;

            //K칸 앞으로 점프하거나 or x2 순간 이동 가능
            // 점프는 K만큼 건전지 사용량 줄어듬
            // 순간이동은 사용량 없음

            //목표 거리 n을 주어질때
            //건전지 사용량을 최소화하고 이동하는 값 return
            
            //2배하는건 사용안하니까 목표에서 2로 나누어 떨어지면 줄기
            //아니면 뒤로 한칸 줄이기 -> 에너지 사용
            while(n>0){
                if(n%2==0){
                    n/=2;
                }
                else{
                    answer++;
                    n-=1;
                }
            }

            return answer;
        }
    }
}
