package Programmers.level2;

public class JoyStick {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String name;
        name = "JEROEN";
        System.out.println(solution.solution(name));
        name = "JAN";
        System.out.println(solution.solution(name));
    }
    static class Solution {
        public int solution(String name) {
            int answer = 0;

            //위로 다음알파벳
            //이전 알파벳 A에서 아래면 Z
            //커서를 왼쪽으로 이동
            //커서를 오른쪽으로 이동

            //주어진거에 A가 존재하는가?
            //존재하면 돌아갈지 아니면 그대로 갈지 결정하는 조건이 필요함

            for (int i = 0; i <name.length() ; i++) {
                char c = name.charAt(i);
                int move = (c - 'A') < 'Z' - c+1 ? c - 'A':'Z' - c+1;
                answer +=move;
            }

            int minCount = name.length() -1;

            for (int i = 0; i <name.length() ; i++) {
                if (name.charAt(i) == 'A') {
                    continue;
                }
                int check =i+1;
                while(check <name.length() && name.charAt(check) == 'A'){
                    check++;
                }
                int move = i*2 + (name.length() - check);
                minCount = Math.min(minCount, move);
            }
            answer +=minCount;

            return answer;
        }
    }
}
