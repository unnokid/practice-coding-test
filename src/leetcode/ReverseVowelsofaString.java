package leetcode;

public class ReverseVowelsofaString {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        s="hello";
        System.out.println(solution.reverseVowels(s));
        s="leetcode";
        System.out.println(solution.reverseVowels(s));
    }
    static class Solution {
        public String reverseVowels(String s) {
            // a e i o u인 경우 반대로 뒤집어서 문자열을 만들기

            StringBuilder sb= new StringBuilder();

            for (int i = 0; i <s.length() ; i++) {
                if(s.charAt(i) == 'a'
                    ||s.charAt(i) == 'e'
                    ||s.charAt(i) == 'o'
                    ||s.charAt(i) == 'i'
                    ||s.charAt(i) == 'u'
                    ||s.charAt(i) == 'A'
                    ||s.charAt(i) == 'E'
                    ||s.charAt(i) == 'O'
                    ||s.charAt(i) == 'I'
                    ||s.charAt(i) == 'U'){
                    sb.append(s.charAt(i));
                }
            }
            StringBuilder sr = sb.reverse();
            sb = new StringBuilder();
            int count =0;
            for (int i = 0; i <s.length() ; i++) {
                if(s.charAt(i) == 'a'
                        ||s.charAt(i) == 'e'
                        ||s.charAt(i) == 'o'
                        ||s.charAt(i) == 'i'
                        ||s.charAt(i) == 'u'
                        ||s.charAt(i) == 'A'
                        ||s.charAt(i) == 'E'
                        ||s.charAt(i) == 'I'
                        ||s.charAt(i) == 'O'
                        ||s.charAt(i) == 'U'){
                    sb.append(sr.charAt(count++));
                }else{
                    sb.append(s.charAt(i));
                }
            }
            return sb.toString();
        }
    }
}
