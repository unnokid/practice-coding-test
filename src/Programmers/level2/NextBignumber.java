package Programmers.level2;

public class NextBignumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        n= 78;
        System.out.println(solution.solution(n));
        n= 15;
        System.out.println(solution.solution(n));
    }
    static class Solution {
        public int solution(int n) {
            int answer = n;
            //자연수 n이 주어질때 n보다 다음 큰숫자를 구하기
            //다음 큰숫자는 
            // 1.n보다 큰 자연수
            // 2. 2진수로 변환할때 1의 개수가 같은 수
            // 3. 1,2 조건을 만족하는 수중 가장 작은수
            
            
            while(true){
                //1씩 증가시키면서
                answer++;
                //Integer.bigCount(자연수) -> 2진수로 변환해서 1의 개수 가져오는 함수
                if(Integer.bitCount(n)==Integer.bitCount(answer)){
                    return answer;
                }

            }
        }
    }
}
