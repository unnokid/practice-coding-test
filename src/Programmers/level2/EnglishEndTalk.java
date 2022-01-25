package Programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnglishEndTalk {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        String[] word;
        n=3;
        word = new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        System.out.println(Arrays.toString(solution.solution(n, word)));
        n=5;
        word = new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
        System.out.println(Arrays.toString(solution.solution(n, word)));
        n=2;
        word = new String[]{"hello", "one", "even", "never", "now", "world", "draw"};
        System.out.println(Arrays.toString(solution.solution(n, word)));
    }
    static class Solution {
        public int[] solution(int n, String[] words) {
            int[] answer = {};
            answer = new int[2];
            List<String> list = new ArrayList<>();
            boolean pass = true;
            //1부터 n까지 번호가 있는 n명의 사람이 끝말잇기중
            //1번부터 순서대로 하고 다시 1번으로 돌아옴
            //앞사람이 말한 단어의 마지막 문자로 시작하는 단어 말해야함
            //중복하면 아웃


            for (int i = 0; i < words.length; i++) {
                if(words[i].length() == 1){
                    //1.한글자 실패
                    answer[0] = i%n +1;
                    answer[1] = i/n +1;
                    pass =false;
                    break;
                }

                if(list.contains(words[i])){//2.단어 중복
                    answer[0] = i%n +1;
                    answer[1] = i/n +1;
                    pass =false;
                    break;
                }
                list.add(words[i]);

                if(i>0 && words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)){//3.끝말잇기실패
                    answer[0] = i%n +1;
                    answer[1] = i/n +1;
                    pass =false;
                    break;
                }
            }
            if(pass){
                answer[0] =0;
                answer[1] =0;
            }
            return answer;
        }
    }
}
