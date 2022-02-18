package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        n=3;
        System.out.println(solution.fizzBuzz(n));
        n=5;
        System.out.println(solution.fizzBuzz(n));
        n=15;
        System.out.println(solution.fizzBuzz(n));
    }
    static class Solution {
        public List<String> fizzBuzz(int n) {
            //정수 n을 줄때
            //인덱스가 3,5의 배수면 FizzBuzz
            //인덱스가 3의 배수면 Fizz
            //인덱스가 5의 배수면 Buzz
            //리스트를 만들어서 return


            List<String> answer = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    answer.add("FizzBuzz");
                } else if (i % 3 == 0) {
                    answer.add("Fizz");
                } else if (i % 5 == 0) {
                    answer.add("Buzz");
                } else {
                    answer.add(String.valueOf(i));
                }
            }
            return answer;
        }
    }
}
