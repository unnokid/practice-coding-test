package Programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class Hatesamenumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr;
        arr = new int[]{1,1,3,3,0,1,1};
        System.out.println(solution.solution(arr));
        arr = new int[]{4,4,4,3,3};
        System.out.println(solution.solution(arr));
    }
    static public class Solution {
        public int[] solution(int []arr) {
            int[] answer = {};

            //배열 arr 가 주어짐 0~9 까지  연속적으로 이루어져있음
            //이때 연속적으로 나타내는숫자는 하나만 남기고 전부제거하려고함
            //단 제거된후 남은수들의 반환할때 arr원소 순서는 유지되어야함

            int[] test = new int[arr.length];
            int testcount =0;

            //set은 사용못할듯
            //슬라이딩 윈도우가 이때 필요한건가???

            //for문 돌아야하고 시작인덱스, 끝나는 인덱스 그리고 비교해야하므로 칸은 2개
            int target = arr[0];//현재 보고 있는 숫자
            List<Integer> answerList = new ArrayList<>();

            for(int i=0;i<arr.length;i++){
                //맨끝에 i+1 처리해줘야됨
                if(i == arr.length-1){
                    //target 배열에 추가해주고 마무리
                    test[testcount] = target;
                    testcount++;
                    break;
               /* answerList.add(target);
                break;*/
                }
                //1. 2개가 같을경우
                if(arr[i] == arr[i+1] ) {
                    continue;
                }
                else{//2. 2개가 다를경우
                    test[testcount] = target;
                    testcount++;

                    //target을 배열에 넣어주고
                    //answerList.add(target);
                    //target = arr[i+1]; 해주고
                    target = arr[i+1];

                }
            }
            answer = new int[testcount];
            for(int i=0;i<answer.length;i++)
            {
                answer[i] = test[i];
            }

        /*answer = new int[answerList.size()];
        for(int i=0;i<answerList.size();i++)
        {
            answer[i] = answerList.get(i);
        }*/

            return answer;
        }
    }
}
