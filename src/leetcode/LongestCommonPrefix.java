package leetcode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] str;
        str = new String[]{"flower","flow","flight"};
        System.out.println(solution.longestCommonPrefix(str));
        str = new String[]{"dog","racecar","car"};
        System.out.println(solution.longestCommonPrefix(str));
    }
    static class Solution {
        public String longestCommonPrefix(String[] strs) {
            //배열이 주어짐
            //배열끼리 같은 문자열중 가장 긴 문자열 return
            
            if (strs.length == 0) {
                return "";
            }

            StringBuilder sb = new StringBuilder();
            
            for (int i = 0; i < strs[0].length(); i++) {
                char c = strs[0].charAt(i);
                for (String str : strs) {
                    //길이가 끝나거나 다른문자일경우 끝
                    if (str.length() <= i || c != str.charAt(i)) {
                        return sb.toString();
                    }
                }
                //모든 문자가 같으므로 추가
                sb.append(c);
            }


            return sb.toString();
        }
    }
}
