package Programmers.level1;

public class HidePhonenumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String phone;
        phone = "01033334444";
        System.out.println(solution.solution(phone));
        phone = "027778888";
        System.out.println(solution.solution(phone));

    }
    static class Solution {
        public String solution(String phone_number) {
            String answer = "";
            // 전화번호 뒷 4자리를 제외하고 나머지 숫자는 다 *로 바꾸기

            for (int i = 0; i < phone_number.length()-4; i++) {
                answer+="*";
            }
            answer+=phone_number.substring(phone_number.length()-4,phone_number.length());
            return answer;
        }
    }
}
