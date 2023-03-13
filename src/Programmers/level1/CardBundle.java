package Programmers.level1;

public class CardBundle {

    public static void main(String[] args) {
        Solution s = new Solution();

    }
    static class Solution {
        public String solution(String[] cards1, String[] cards2, String[] goal) {
            //카드 뭉치

            int a =0;
            int b =0;
            int idx;
            for (idx = 0; idx <goal.length ; idx++) {

                if(cards1.length > a){
                    if(goal[idx].equals(cards1[a])){
                        a++;
                        continue;
                    }
                }

                if(cards2.length > b){
                    if(goal[idx].equals(cards2[b])){
                        b++;
                        continue;
                    }
                }

                break;
            }

            if(idx == goal.length){
                return "Yes";
            }else{
                return "No";
            }

        }
    }
}
