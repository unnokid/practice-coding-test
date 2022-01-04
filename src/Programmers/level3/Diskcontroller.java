package Programmers.level3;

import java.util.Arrays;

public class Diskcontroller {
    static public int solution(int[][] jobs) {
        int answer = 0;

        //하나의 디스크로 일처리 수행
        //대기한 시작시간과 작업 완료한 시점의 시간이 최종 원하는 시간
        //이 시간을 평균내서 가장 짧게 처리된 평균시간을 return
        //소수점 아래는 버림

        int[] startTime = new int[jobs.length];
        int[] workTime = new int[jobs.length];
        int[] resultTime = new int[jobs.length];
        boolean[] finish = new boolean[jobs.length];
        int time =0;
        int endTime =-1;
        int targetIndex =0;

        //배열 순서 정리
        for (int i = 0; i < jobs.length; i++) {
            startTime[i] = jobs[i][0];
            workTime[i] = jobs[i][1];
        }
        for (int i = 0; i < startTime.length ; i++) {
            for (int j = i+1; j < startTime.length ; j++) {
                if(workTime[j] < workTime[i]){
                    int temp1 = startTime[j];
                    startTime[j] = startTime[i];
                    startTime[i] = temp1;
                    temp1 = workTime[j];
                    workTime[j] = workTime[i];
                    workTime[i] = temp1;
                }
            }
        }

        while(check(finish)){

            if(time < endTime){
                //일 중
                time++;
                continue;
            }
            else if(time == endTime){
                //하던 일 종료
                finish[targetIndex] = true;
                resultTime[targetIndex] = endTime;

            }
            //일 추가
            int target =1001;
            int choice = 0;
            boolean pass = false;
            for (int i = 0; i < startTime.length ; i++) {
                //수행된 일인지 현재시간에서 수행가능한 일인지 확인
                if(!finish[i] && startTime[i] <= time){
                    if(target > workTime[i]){
                        //수행할 수 있는 일중 가장 최소 소요시간 찾기
                        choice =i;
                        target = workTime[i];
                        pass= true;
                    }
                }
            }
            if(pass){//순회해서 최소 소요시간 일을 찾아옴
                targetIndex = choice;
                endTime = time + target;
                if(target ==0){
                    //만약 걸리는 시간이 0이면 그 시간대를 다시 검사하게 --
                    time--;
                }
            }
            //시간 증가
            time++;
        }
        //끝난시간 - 시작시간을 모두 더해서 n로 나누기
        int sum =0;
        for (int i = 0; i <startTime.length ; i++) {
            sum += resultTime[i] - startTime[i];
        }
        answer = sum/ startTime.length;
        return answer;
    }
    static boolean check(boolean[] finish){
        //모든 일들이 다 수행되었는지 확인
        for (int i = 0; i < finish.length; i++) {
            if(!finish[i]){
                return true;
            }
        }
        return false;
    }


}
