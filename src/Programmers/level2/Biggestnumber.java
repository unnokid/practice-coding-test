package Programmers.level2;

import java.util.Arrays;
import java.util.Comparator;

public class Biggestnumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers;
        numbers = new int[]{6, 10, 2};
        System.out.println(solution.solution(numbers));
        numbers = new int[]{3, 30, 34, 5, 9};
        System.out.println(solution.solution(numbers));
    }
    static class Solution {
        public String solution(int[] numbers) {
            String answer = "";

            //0 또는 양의정수 주어짐
            //정수를 이어붙일때 가장 큰 수를 알아내서 return

            String[] result = new String[numbers.length];
            for(int i=0;i<numbers.length;i++){
                result[i] = String.valueOf(numbers[i]);
            }

            Arrays.sort(result, new Comparator<String>(){
                //numbers배열의 값들을 모두 넣고 정렬
                @Override
                public int compare(String o1, String o2){
                    return ((o2+o1).compareTo(o1+o2));
                }
            });


            //맨앞에가 0이면 그배열은 0으로만 넘어옴
            if(result[0].equals("0")){
                return "0";
            }

            //정렬된걸 앞에서부터 answer에 붙여서 만들기
            for(String a : result){
                answer+=a;
            }

            return answer;
        }

    }
}
