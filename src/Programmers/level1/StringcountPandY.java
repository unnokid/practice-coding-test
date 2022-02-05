package Programmers.level1;

public class StringcountPandY {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        s = "pPoooyY";
        System.out.println(solution.solution(s));
        s = "Pyy";
        System.out.println(solution.solution(s));
    }
    static class Solution {
        boolean solution(String s) {
            boolean answer = true;

            //대소문자가 섞인 s를 줌 - 개수count시 대소문자 구별 X
            //s에 있는 p개수와 y개수가 같으면 T
            //다르면 F return
            //p,y가 모두 하나도 없으면 True

            int pCount=0;
            int yCount=0;
            for(int i=0;i<s.length();i++)
            {
                char target = s.charAt(i);
                if(target == 'p' || target == 'P')
                {
                    pCount++;
                }
                else if(target == 'y' || target == 'Y')
                {
                    yCount++;
                }

            }

            return pCount == yCount;
        }
    }
}
