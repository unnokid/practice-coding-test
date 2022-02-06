package Programmers.level1;

public class BasicString {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        s = "a234";
        System.out.println(solution.solution(s));
        s = "1234";
        System.out.println(solution.solution(s));
    }
    static class Solution {
        public boolean solution(String s) {
            boolean answer = true;

            //문자열 s가 길이가 4 또는 6인지 확인하고
            //숫자로만 구성되어있는지 확인
            //모든걸 만족하면 true, 아니면 false return

            if(s.length() ==4 || s.length()==6){
                for (int i = 0; i < s.length(); i++) {
                    if('0' <= s.charAt(i) && s.charAt(i) <= '9'){
                        answer= true;
                    }
                    else{
                        return false;
                    }
                }
            }
            else{
                return  false;
            }
            return answer;
        }
    }
}
