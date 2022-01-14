package Programmers.level1;

public class NumberStringandWord {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        s= "one4seveneight";
        System.out.println(solution.solution(s));
        s= "23four5six7";
        System.out.println(solution.solution(s));
        s= "2three45sixseven";
        System.out.println(solution.solution(s));
        s= "123";
        System.out.println(solution.solution(s));
    }
    static class Solution {
        public int solution(String s) {
            int answer = 0;
            String[] englishes = {"zero","one","two","three",
                    "four","five","six","seven","eight","nine"};
            String[] numbers={"0","1","2","3","4","5","6","7","8","9"};
            //숫자와 영단어가 섞여서 넘어오는 문자열을
            //숫자로만 만들어서 리턴
            for(int i=0;i<10;i++)
            {
                s=s.replaceAll(englishes[i],numbers[i]);
                //System.out.println(s);
            }
            answer = Integer.parseInt(s);
            return answer;
        }
    }
}
