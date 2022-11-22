package Programmers.level1;

public class Babbling2 {

    public static void main(String[] args) {

    }
    static class Solution {
        public int solution(String[] babbling) {
            //프로그래머스 LV1 옹알이2
            int answer = 0;

            String[] temp = new String[]{"aya","ye","woo","ma"};
            String[] twice = new String[]{"ayaaya","yeye","woowoo","mama"};

            for (String target : babbling){
                //먼저 연속된 단어가 있는지
                for (int i = 0; i <twice.length ; i++) {
                    target = target.replace(twice[i],"X");
                }
                //오리지널로 확인
                for (int i = 0; i <temp.length ; i++) {
                    target = target.replace(temp[i],"O");
                }

                int count =0 ;

                for (int i = 0; i <target.length() ; i++) {
                    if(target.charAt(i) != 'O'){
                        count = 1;
                        break;
                    }
                }

                if(count ==0){
                    answer++;
                }

            }

            return answer;
        }
    }
}
