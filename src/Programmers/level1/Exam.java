package Programmers.level1;

import java.util.Arrays;

public class Exam {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] answers = {1,3,2,4,2};
        System.out.println(Arrays.toString(solution.solution(answers)));
    }
}


class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};

        //3명의 수포자 문제찍기 패턴 제공
        //문제가 제시되었을 때 가장 많은 문제를 맞춘 사람이 누구인지 return
        //가장 높은 점수가 여러명이면 오름차순


        //3명의 수포자 패턴 배열 선언
        int[] person1 = {1,2,3,4,5};//길이 5
        int[] person2 = {2,1,2,3,2,4,2,5};//길이8, 2 4 --- 마다 2 나머진 ,1,2,3,4,5
        int[] person3 = {3,3,1,1,2,2,4,4,5,5};//길이10

        //각 배열 맞춘 개수
        int[] count={0,0,0};


        //문제 개수만큼 순회
        for(int i=0;i<answers.length;i++)
        {
            if(answers[i]== person1[i%5])
            {

                count[0]+=1;
            }
            if(answers[i] == person2[i%8])
            {

                count[1]+=1;
            }
            if(answers[i] == person3[i%10])
            {

                count[2]+=1;
            }
        }

        //맞춘개수중 제일 높은 max 구하기
        int max=Math.max(Math.max(count[0],count[1]),count[2]);

        int number=0;
        //높은점수가 몇명인지 확인
        for(int i=0;i<count.length;i++)
        {
            if(max == count[i])
            {
                number++;
            }
        }
        //answer 선언
        answer = new int[number];
        number=0;
        for(int i=0;i<count.length;i++)
        {
            if(max == count[i])
            {
                //가장 높은점수인 사람이면 answer 배열에 번호 추가
                answer[number] = i+1;
                number++;
            }
        }

        //여러명일시 오름차순으로 정리
        Arrays.sort(answer);
        return answer;
    }
}