package leetcode;

public class ReverseWordsInaString3 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        s = "Let's take LeetCode contest";
        System.out.println(solution.reverseWords(s));
        s = "God Ding";
        System.out.println(solution.reverseWords(s));
    }

    static class Solution {
        public String reverseWords(String s) {
            //문자열 s가 주어짐
            //스페이스를 기준으로 뒤집기
            //공백유지하면서 반대로 뒤집기
            //s의 길이는 최대 5만길이
            if (s.length() <= 1) {
                return s;
            }

            StringBuilder answer = new StringBuilder();
            int idx = 0;
            int len = 0;
            for (int k = idx; k < s.length(); k++) {
                //빈칸을 만나거나 마지막일 경우
                if (s.charAt(k) == ' ' || k == s.length() - 1) {
                    StringBuilder sb = new StringBuilder();

                    if (k == s.length() - 1) {
                        //마지막이면 k++
                        k++;
                    }
                    for (int i = 0; i < k - len; i++) {
                        int result = k - 1 - i;
                        sb.append(s.charAt(k - 1 - i));
                    }
                    len = k + 1;
                    answer.append(sb);
                    if (k != s.length()) {
                        //마지막이 아니면 공백추가
                        answer.append(" ");
                    }
                }
            }

            return answer.toString();
        }
    }
}
