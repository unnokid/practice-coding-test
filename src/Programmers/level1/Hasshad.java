package Programmers.level1;

public class Hasshad {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int arr;
        arr =10;
        System.out.println(solution.solution(arr));
        arr =12;
        System.out.println(solution.solution(arr));
        arr =11;
        System.out.println(solution.solution(arr));
        arr =13;
        System.out.println(solution.solution(arr));
    }
    static class Solution {
        public boolean solution(int x) {
            boolean answer = false;
            // 양의 정수 x 가 하샤드 인 조건
            // = x의 자릿수 합으로 x가 나누어져야함
            //자연수 x가 하샤드 수인지 아닌지 검사하는 결과 return
            int count =0;
            int num = x;
            //각 자릿수 더하기
            while(x>0){
                count += x%10;
                x/=10;
            }
            //맞는지
            if(num % count == 0){
                return true;
            }
            return answer;
        }
    }
}
