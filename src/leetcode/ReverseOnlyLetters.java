package leetcode;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        s="ab-cd";
        System.out.println(solution.reverseOnlyLetters(s));
    }
    static class Solution {
        public String reverseOnlyLetters(String s) {
            //s를 줄때 문자만 뒤집어라
            char[] chars = s.toCharArray();
            int left = 0, right = chars.length - 1;
            //양쪽 포인터
            while (left < right) {
                // 둘다 알파벳인지 확인하기
                if (Character.isAlphabetic(chars[left]) && Character.isAlphabetic(chars[right])) {
                    char temp = chars[right];
                    chars[right] = chars[left];
                    chars[left] = temp;
                    left++;
                    right--;
                }
                else if (Character.isAlphabetic(chars[left]))
                {
                    //왼쪽
                    right--;
                }
                else if (Character.isAlphabetic(chars[right])) {
                    //오른쪽
                    left++;
                }
                else {//모두 아닐경우
                    left++;
                    right--;
                }
            }
            return String.valueOf(chars);
        }
    }
}
