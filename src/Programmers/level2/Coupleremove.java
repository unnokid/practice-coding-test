package Programmers.level2;

import java.util.Stack;

public class Coupleremove {
    static public int solution(String s)
    {
        int answer = -1;

        //알파벳 소문자로 이루어진 문자열 부여
        //같은 알파벳이 2개 붙어있는 짝을 찾음
        //모두 제거가 가능한지 여부 반환

        Stack<Character> removeStack = new Stack<>();

        for(int i=0;i<s.length();i++){
            //스택이 비어있지않고 s.charAt(i)와 맨위에 있는게 같은지 비교
            if(!removeStack.empty() && removeStack.peek() == s.charAt(i)){
                //들어갈 알파벳과 맨위가 같다면 맨위 알파벳 제거
                removeStack.pop();
            }
            else//비어 있거나, 맨위 알파벳이 다르다면 알파벳 추가
                removeStack.push(s.charAt(i));
        }

        //스택이 깔끔하게 처리되면 1, 남아있으면 0
        answer = (removeStack.empty()) ? 1 : 0;

        return answer;
    }
}
