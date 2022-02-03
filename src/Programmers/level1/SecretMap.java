package Programmers.level1;

import java.util.Arrays;

public class SecretMap {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        int[] arr1;
        int[] arr2;
        n=5;
        arr1 = new int[]{9,20,28,18,11};
        arr2 = new int[]{30,1,21,17,28};
        System.out.println(Arrays.toString(solution.solution(n, arr1, arr2)));
        n=6;
        arr1 = new int[]{46,33,33,22,31,50};
        arr2 = new int[]{27,56,19,14,14,10};
        System.out.println(Arrays.toString(solution.solution(n, arr1, arr2)));
    }
    static class Solution {
        public String[] solution(int n, int[] arr1, int[] arr2) {
            String[] answer = new String[n];
            //지도의 한변의 크기 n
            //정수 배열를 이진수로 변환했을때  0<= x <= 2^n -1를 만족해야함
            
            for (int i = 0; i < n; i++) {
                //여기서 arr1 arr2 각각 이진수로 바꿔서 #를 넣어줘야함
                String total = Integer.toBinaryString(arr1[i]|arr2[i]);
                total = String.format("%"+n+"s",total);
                total = total.replaceAll("1","#");
                total = total.replaceAll("0"," ");
                answer[i] = total;
            }
            return answer;
        }
    }
}
