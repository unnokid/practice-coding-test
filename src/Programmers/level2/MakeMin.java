package Programmers.level2;

import java.util.Arrays;

public class MakeMin {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A;
        int[] B;
        A = new int[]{1,4,2};
        B = new int[]{5,4,4};
        System.out.println(solution.solution(A,B));
        A = new int[]{1,2};
        B = new int[]{3,4};
        System.out.println(solution.solution(A,B));
    }
    static class Solution
    {
        public int solution(int []A, int []B)
        {
            int answer = 0;
            //길이가 같은 자연수로 이루어진 배열 A B 줌
            //각각 한개씩 뽑아서 두수를 곱함
            //최종적으로 누적된 값이 최소가 되도록 하기
            //한번뽑았으면 다시 뽑을 수 없음

            //크기순으로 정렬후에 최대값과 최소값을 곱한다.
            Arrays.sort(A);
            Arrays.sort(B);

            for (int i = 0; i < A.length; i++) {
                answer+= A[i]*B[A.length-1-i];
            }

            return answer;
        }
    }
}
