package leetcode;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class RemoveDuplicateLetters {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        s="bcabc";
        System.out.println(solution.removeDuplicateLetters(s));
        s="cbacdcbc";
        System.out.println(solution.removeDuplicateLetters(s));
        s="cbabdbca";
        System.out.println(solution.removeDuplicateLetters(s));
        s="abcabcabc";
        System.out.println(solution.removeDuplicateLetters(s));
        s="aaaabbbccc";
        System.out.println(solution.removeDuplicateLetters(s));
    }
    static class Solution {
        public String removeDuplicateLetters(String s) {
            //중복을 제거했을 때 사전순서가 제일 빠른 결과를 return
            //스택에 순서대로 쌓아야함

            //중복의 여부, 같은문자끼리의 인덱스 순서 확인해야함

            //문자가 존재하는지 확인해야함 Set? 인덱스위치는 모름
            boolean[] visit = new boolean[26];
            //존재하는 문자의 가장 끝 문자의 위치
            //1개면 그대로 그냥 들어가짐
            //2개면 앞부터 순차적으로 따져서 사전순
            int[] map = new int[26];
            for (int i = 0; i <s.length() ; i++) {
                map[s.charAt(i)-'a'] = i;
            }

            Stack<Integer> stack = new Stack<>();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i <s.length() ; i++) {

                //만약 적용한 숫자라면 패스
                int target = s.charAt(i) -'a';
                if(visit[target]){
                    continue;
                }
                //적용이 안됬다면 스택에서 비교해야 함
                //스택 맨위가 현재보다 더 크면 스택에서 뽑기
                // 사전순으로 높아야함, 현재 인덱스가 마지막에 나온것보단 앞이어야함
                // 스택이 빈지 확인안하면 에러
                while(!stack.isEmpty()&&stack.peek() > target && i < map[stack.peek()]){
                    int temp = stack.pop();
                    visit[temp] = false;
                    //추가한 알파벳 지우기
                }

                //현재 인덱스 알파벳 추가
                stack.push(target);
                visit[target] = true;
            }

            //맨앞부터 집어넣어서 뒤집어야함
            while(!stack.isEmpty()){
                char temp = (char) (stack.pop()+'a');
                sb.append(temp);
            }

            return sb.reverse().toString();
        }
    }
}
