package Programmers.level2;

public class Predicttournament {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int N;
        int A;
        int B;
        N=8;
        A=4;
        B=7;
        System.out.println(solution.solution(N,A,B));
    }
    static class Solution
    {
        public int solution(int n, int a, int b)
        {
            int answer = 0;

            //1 - 2번 3 - 4번끼리 게임 진행
            //이기면 다음 라운드 진출가능
            //이때 다시 1번부터 N/2번을 차례대로 번호를 배정받음
            // 1 - 2 에서 승리자는 다시 1번이 됨
            // 3 - 4 에서 승리자는 다시 2번이 됨

            //게임참가자 N명
            //A와 B의 번호를 줄때 몇번째 라운드에서 만나는지 return

            //서로 라운드 대결을 한후에 /2 했을때 같은 수가 되어야함
            while(a!=b){
                //라운드 수
                answer++;
                //2로 안나눠지면 다음 번호가 한자리 내려므로 +1
                if(a%2==1){
                    a+=1;
                }
                if(b%2==1){
                    b+=1;
                }
                //2로 나누어준다
                a/=2;
                b/=2;
            }

            return answer;
        }
    }
}
