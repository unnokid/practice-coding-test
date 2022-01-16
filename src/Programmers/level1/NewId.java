package Programmers.level1;

public class NewId {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String new_id;
        new_id = "...!@BaT#*..y.abcdefghijklm";
        System.out.println(solution.solution(new_id));
        new_id = "z-+.^.";
        System.out.println(solution.solution(new_id));
        new_id = "=.=";
        System.out.println(solution.solution(new_id));
        new_id = "123_.def";
        System.out.println(solution.solution(new_id));
        new_id = "abcdefghijklmn.p";
        System.out.println(solution.solution(new_id));
    }
    static class Solution {
        public String solution(String new_id) {
            String answer = "";

            //규칙에 맞게 아이디 추천해주는 프로그램

            int n =0;
            while(n<5){
                // 1단계
                new_id = new_id.toLowerCase();
                // 2단계
                new_id = new_id.replaceAll("[^a-z0-9-_.]","");
                // 3단계
                new_id = new_id.replaceAll("[.]{2,}",".");
                // 4단계
                if(new_id.charAt(0) == '.'){
                    new_id = new_id.substring(1,new_id.length());
                }
                if(new_id.length() > 0 && new_id.charAt(new_id.length()-1) == '.'){
                    new_id = new_id.substring(0,new_id.length()-1);
                }
                // 5단계
                if(new_id.length() == 0){
                    new_id+="a";
                }
                // 6단계
                if(new_id.length() >=16){
                    new_id = new_id.substring(0,15);
                }
                // 7단계
                if(new_id.length() <=2){
                    while(new_id.length() < 3){
                        new_id+=new_id.charAt(new_id.length()-1);
                    }
                }
                answer = new_id;
                n++;
            }
            return answer;
        }
    }
}
