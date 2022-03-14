package leetcode;

import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String path;
        path = "/home/";
        System.out.println(solution.simplifyPath(path));
        path = "/../";
        System.out.println(solution.simplifyPath(path));
    }
    static class Solution {
        public String simplifyPath(String path) {
            //절대 경로
            //. 현재 디렉토리 -> 그냥 생략
            //.. 상위 디렉토리 -> 앞에있던 디렉토리 생략
            // /로 끝나면 그것도 생략
            // //인경우 -> / 로 바꾸기

            StringBuilder sb = new StringBuilder();
            Stack<String> stack = new Stack<>();

            // /로 문자열 자르기
            String[] temp = path.split("/");

            for(String s : temp){
                if (s.equals(".")) {
                    //패스
                } else if (s.equals("..")) {
                    //앞 디렉터리 제거
                    if (!stack.isEmpty()){
                        stack.pop();
                    }
                } else if (s.length() > 0) {
                    //길이가 있는 문자열이면 푸시
                    stack.push(s);
                }
            }


            for(String s: stack){
                sb.append("/");
                sb.append(s);
            }

            //비어있으면 기본 /
            if(sb.length() ==0){
                sb.append("/");
            }
            return sb.toString();
        }
    }
}
