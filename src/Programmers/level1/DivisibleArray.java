package Programmers.level1;

import java.util.Arrays;

public class DivisibleArray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr;
        int divisor;
        arr = new int[]{5,9,7,10};
        divisor = 5;
        System.out.println(Arrays.toString(solution.solution(arr, divisor)));
        arr = new int[]{2, 36, 1, 3};
        divisor = 1;
        System.out.println(Arrays.toString(solution.solution(arr, divisor)));
        arr = new int[]{3,2,6};
        divisor = 10;
        System.out.println(Arrays.toString(solution.solution(arr, divisor)));
    }
    static class Solution {
        public int[] solution(int[] arr, int divisor) {
            int[] answer = {};

            //arr로 넘어온 배열중 divisor로 딱 떨어지는 값만 배열에 추가하기
            //마지막에 오름차순 정렬 하기
            //만약 나누어 떨어지는 element가 없다면 -1을 배열에 담아서 반환하기
            int[] choice = new int[arr.length];
            int count=0;

            for (int j : arr) {
                if (j % divisor == 0) {
                    //나누어 떨어짐, 배열에 추가
                    choice[count] = j;
                    count++;
                }
            }

            if(count ==0){
                //아무것도 나눠지는게 없다
                answer = new int[1];
                answer[0] = -1;
            }
            else{
                //나눠진게 존재한다
                answer = new int[count];
                for(int i=0;i<answer.length;i++)
                {
                    answer[i] = choice[i];
                }
                Arrays.sort(answer);
            }
            return answer;
        }
    }
}
