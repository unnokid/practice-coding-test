package Programmers.level1;

public class FindKim {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] seoul;
        seoul = new String[]{"Jane","Kim"};
        System.out.println(solution.solution(seoul));
    }
    static class Solution {
        public String solution(String[] seoul) {
            String answer = "";
            //Kim의 위치를 찾아서 그 인덱스 값을 나타내는 문자 return
            for (int i = 0; i < seoul.length; i++) {
                if(seoul[i].equals("Kim")){
                    return "김서방은 "+ i+"에 있다";
                }
            }

            return answer;
        }
    }
}
