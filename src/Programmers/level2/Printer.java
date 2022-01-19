package Programmers.level2;

import java.util.Arrays;

public class Printer {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] priorities;
        int location;
        priorities = new int[]{2,1,3,2};
        location = 2;
        System.out.println(solution.solution(priorities,location));
        priorities = new int[]{1, 1, 9, 1, 1, 1};
        location = 0;
        System.out.println(solution.solution(priorities,location));
    }
    static class Solution {
        public int solution(int[] priorities, int location) {
            int answer = 0;


            //중요도가 높은 순서 먼저 인쇄하도록해야함
            //1. 대기목록에서 맨앞에서  J 꺼내서
            //2. 나머지 인쇄 대기목록에서 J보다  중요한게 있으면 J를 대기목록 맨뒤로 보냄
            //3. 만약 그런일이 없으면 J를 인쇄

            //중요도가 담긴 배열 주어짐
            //내가 요청한 문서가 몇번째 위치에 있는지 알려줌
            //그 인쇄문서가 몇번째로 인쇄되는지 return

            int count =0;
            int[] first = new int[priorities.length];

            //중요도의 종류를 알아야됨
            for (int i = 0; i < priorities.length; i++) {
                first[i] = priorities[i];
            }
            Arrays.sort(first);
            //중요도를 미루는게 중요해 만약 찾는 인덱스가 중복없이 혼자라면?
            int maxIdx = first.length-1;
            int max = first[maxIdx];
            int swapcount =0;

            //개수가 1개고 위치도 0이면 바로 1
            if(priorities[0] == max && location == 0){
                return 1;
            }

            for (int i = 0; i < priorities.length ; i++) {
                for (int j = 0; j <priorities.length ; j++) {
                    //중요도가 높은 친구찾기
                    if(max == priorities[j]){
                        swapcount = j;
                        break;
                    }
                }
                //옮겨진 위치 조정해주기
                location = location - swapcount >=0? location - swapcount: priorities.length-swapcount+location;
                count++;
                for (int j = 0; j <swapcount ; j++) {
                    swap(priorities);
                }
                priorities[0] =0;
                //만약 원했던 문서가 0 이면 바로 끝
                if(location == 0){
                    answer = count;
                    break;
                }
                //아니면 다음 중요도 찾기
                maxIdx--;
                max = first[maxIdx];
            }


            return answer;
        }
        static void swap(int[] p){
            //대기목록 한칸씩 옮기기
            int temp = p[0];
            int i;
            for (i = 0; i <p.length-1 ; i++) {
                p[i] = p[i+1];
            }
            p[i] = temp;
        }
    }
}
