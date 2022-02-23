package leetcode;

public class LengthofLastWord {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        s="Hello World";
        System.out.println(solution.lengthOfLastWord(s));
        s="   fly me   to   the moon  ";
        System.out.println(solution.lengthOfLastWord(s));
        s="luffy is still joyboy";
        System.out.println(solution.lengthOfLastWord(s));
    }
    static class Solution {
        public int lengthOfLastWord(String s) {
            //String을 줄때
            //마지막 word의 길이가 몇인지 return

            int answer =0;

            for (int i = s.length()-1; i >=0 ; i--) {
                if(s.charAt(i) ==' '){
                    if(answer !=0){
                        break;
                    }else{
                        continue;
                    }
                }else{
                    answer++;
                }
            }
            return answer;

        }
    }
}
