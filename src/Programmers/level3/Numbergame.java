package Programmers.level3;

import java.util.Arrays;

public class Numbergame {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] A;
        int[] B;

        A = new int[]{5, 1, 3, 7};
        B = new int[]{2, 2, 6, 8};
        System.out.println(solution.solution(A,B));
        A = new int[]{2, 2, 2, 2};
        B = new int[]{1, 1, 1, 1};
        System.out.println(solution.solution(A,B));
    }

    static class Solution {
        public int solution(int[] A, int[] B) {
            int answer = 0;

            //2 x N 명이 사원들은 N명씩 두팀으로 나눠 숫자게임
            //모든 사원이 무작위 자연수를 하나씩 부여
            //각 사원한 딱 한번씩 경기
            //각 경기당 한팀에 한사람씩 나와 서로의 수를 공개
            //그이후 큰쪽이 승리하게 되고 승리한팀은 승점 1점획득
            //숫자가 같다면 무승부로 패스
            //A팀 출전순서를 알려줄테니
            //B팀 출전 순서를 조정해서 B팀이 얻을 수 있는 최대 승점을 return 하도록 완성

            //각 배열 정렬
            Arrays.sort(A);
            Arrays.sort(B);
            int target = A.length-1;
            for (int i = A.length -1; i>=0; i--) {
                //B에서 가장 큰수부터 확인
                //이길수 없다면 A의 그다음 큰수와 B의 큰수 비교
                if(B[target] > A[i]){
                    //수가 더 크다면 숫자 소모
                    answer++;
                    target--;
                }
            }
            return answer;
        }
    }
}


