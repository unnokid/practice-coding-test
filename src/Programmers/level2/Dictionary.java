package Programmers.level2;

import java.util.LinkedList;
import java.util.List;

public class Dictionary {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String word;
        word = "AAAAE";
        System.out.println(solution.solution(word));
        word = "AAAE";
        System.out.println(solution.solution(word));
        word = "I";
        System.out.println(solution.solution(word));
        word = "EIO";
        System.out.println(solution.solution(word));
    }
    static class Solution {
        static List<String> s = new LinkedList<String>();
        static String[] Vowelword = {"A","E","I","O","U"};
        public int solution(String word) {
            int answer = 0;

            //알파벳 A E I O U로 만 만들수 있는 조합 몇번째로 만들어지는지  return
            for(int i=0;i<5;i++){
                makedictionaray(Vowelword[i]);
            }

            int count=0;

            for(int i=0;i<s.size();i++){

                if(s.get(i).equals(word)){
                    answer=count+1;
                    break;
                }
                count++;
            }


            return answer;
        }
        static void makedictionaray(String cur){
            if(cur.length()>5) return;

            s.add(cur);
            for(int i=0;i<5;i++){
                makedictionaray(cur+Vowelword[i]);
            }
        }
    }
}
