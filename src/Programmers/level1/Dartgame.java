package Programmers.level1;

public class Dartgame {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String dartResult;
        dartResult = "1S2D*3T";
        System.out.println(solution.solution(dartResult));
        dartResult = "1D2S#10S";
        System.out.println(solution.solution(dartResult));
        dartResult = "1T2D3D#";
        System.out.println(solution.solution(dartResult));
    }

    static class Solution {
        public int solution(String dartResult) {
            int[] scores = new int[3];
            int scoreIdx = 0;
            int currentIdx =0;
            //* #를 찾았을때 어디에 적용할지를 고민해야함

            for(int i=0;i<dartResult.length();i++)
            {
                char target = dartResult.charAt(i);
                int targetInt = target - '0';

                //점수일경우
                if(targetInt >=0 && targetInt <= 10){
                    if(targetInt == 1 && dartResult.charAt(i+1) -'0' == 0){
                        targetInt =10;
                        i++;
                    }
                    scores[scoreIdx] = targetInt;
                    currentIdx++;//숫자갯수
                }
                //보너스 또는 옵션일경우
                else{
                    switch (target){
                        case 'S': scores[scoreIdx] = (int) Math.pow(scores[scoreIdx],1);
                            scoreIdx++;break;
                        case 'D': scores[scoreIdx] = (int) Math.pow(scores[scoreIdx],2);
                            scoreIdx++;break;
                        case 'T': scores[scoreIdx] = (int) Math.pow(scores[scoreIdx],3);
                            scoreIdx++;break;
                        case '#': scores[scoreIdx-1] = scores[scoreIdx-1] * (-1);break;
                        case '*': scoreIdx = (Math.max(scoreIdx - 2, 0));
                            while(scoreIdx < currentIdx){
                                scores[scoreIdx] = scores[scoreIdx] *2;
                                scoreIdx++;
                            }
                            break;
                    }
                }

            }

            return scores[0]+scores[1]+scores[2];
        }
    }
}
