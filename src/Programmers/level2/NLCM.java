package Programmers.level2;

public class NLCM {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr;
        arr = new int[]{2,6,8,14};
        System.out.println(solution.solution(arr));
        arr = new int[]{1,2,3};
        System.out.println(solution.solution(arr));
    }
    static class Solution {
        public int solution(int[] arr) {
            int answer = 0;

            //arr 배열을 줄때 이 배열안에 모든 수들의 배수중 공통배수
            //가장 작은 공통배수를 return
            int N = arr.length;
            answer = arr[N-1];

            //목표를 맨 마지막 배열로 잡고 모든 배열로 나눠질때까지 더해준다
            while(true){
                int i;
                //배열 순서대로
                for (i =0; i < N; i++) {
                    if(answer%arr[i] !=0){
                        break;
                    }
                }

                //끝까지 순회 다했으면 끝
                if(i ==N){
                    return answer;
                }
                //아니면 증가
                else{
                    answer++;
                }
            }
        }
    }
}
