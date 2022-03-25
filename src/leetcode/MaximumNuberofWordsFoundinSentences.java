package leetcode;

public class MaximumNuberofWordsFoundinSentences {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] sentences;
        sentences = new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(solution.mostWordsFound(sentences));
        sentences = new String[]{"please wait", "continue to fight", "continue to win"};
        System.out.println(solution.mostWordsFound(sentences));
    }
    static class Solution {
        public int mostWordsFound(String[] sentences) {
            //문장 파트가 가장 긴 개수를 세서 return
            int answer =0;
            for (int i = 0; i <sentences.length ; i++) {
                String[] temp = sentences[i].split(" ");
                answer = Math.max(answer,temp.length);
            }
            return  answer;
        }
    }
}
