package Programmers.level2;

import java.util.HashMap;
import java.util.Map;

public class Phonelist {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] phone_book;
        phone_book = new String[]{"119", "97674223", "1195524421"};
        System.out.println(solution.solution(phone_book));
        phone_book = new String[]{"123","456","789"};
        System.out.println(solution.solution(phone_book));
        phone_book = new String[]{"12","123","1235","567","88"};
        System.out.println(solution.solution(phone_book));
    }
    static class Solution {
        public boolean solution(String[] phone_book) {
            boolean answer = true;

            //전화번호 리스트중 한 번호가 다른번호의 접두어인 경우가 있는지 확인
            //만약 그런 경우가 있다면 F, 아니면 T
            //전화번호 리스트중 중복은 없음

            Map<String,Integer> map = new HashMap<>();
            for (int i = 0; i <phone_book.length ; i++) {
                map.put(phone_book[i],i);
            }

            for (int i = 0; i < phone_book.length; i++) {
                for (int j = 1; j < phone_book[i].length(); j++) {
                    if(map.containsKey(phone_book[i].substring(0,j))){
                        return false;
                    }
                }
            }

            return answer;
        }
    }
}
