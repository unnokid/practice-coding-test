package Programmers.level2;

import java.util.Arrays;

public class Developfunction {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] progresses;
        int[] speeds;
        progresses = new int[]{93,30,55};
        speeds = new int[]{1,30,5};
        System.out.println(Arrays.toString(solution.solution(progresses, speeds)));
        progresses = new int[]{95, 90, 99, 99, 80, 99};
        speeds = new int[]{1,1,1,1,1,1};
        System.out.println(Arrays.toString(solution.solution(progresses, speeds)));
    }
    static class Solution {
        public int[] solution(int[] progresses, int[] speeds) {
            //각기능은 진도가 100일때 서비스 반영가능
            // 작업 작업 완료도 progresses, 진행 속도 speeds
            // 뒤에 있는 기능은 앞에 있는 기능이 배포될때 함께 배포됨
            //먼저 끝났다고 바로 배포되는게 아님
            //각 배포마다 몇개의 기능이 배포되는지 배열로 return
            int[] answer;
            int[] temp = new int[progresses.length];
            boolean[] check = new boolean[progresses.length];
            int count = progresses.length;//100모두 다되야할 항목 갯수
            int curIndex=0;
            int answerIndex=0;
            //다 채울때 까지 while문
            while(curIndex<count){
                //for문으로 각 진행속도를 더해줌
                for(int i=curIndex;i<progresses.length;i++){
                    progresses[i]+=speeds[i];
                    //100이 넘어가면 check에서 끝남을 알려줌
                    if(progresses[i]>=100){
                        check[i]=true;
                    }
                }
                //result 몇개 완성됬는지
                int result=0;
                //for문으로 100넘은 개수세기, 개수만큼 curIndex 올려주기
                for(int i=curIndex;i<progresses.length;i++){
                    if(check[i] == true){
                        curIndex++;
                        result++;
                    }
                    //뒤에 작업이 완료해도 앞에 기능이 배포되어야 배포가능하므로
                    //true가 아니면 break
                    else{
                        break;
                    }
                }
                //배포가능한 수를 temp에 저장
                if(result>0){
                    temp[answerIndex]=result;
                    answerIndex++;
                }
            }
            //몇번에 배포횟수가 있을지 모르므로 answerIndex로 세서 answer배열 만듬
            //temp 배열에있는 값 이전
            answer = new int[answerIndex];
            for(int i=0;i<answer.length;i++){
                answer[i] = temp[i];
            }


            return answer;
        }
    }
}
