package Programmers.level1;

import java.util.Arrays;

public class Reportresult {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] id_list;
        String[] report;
        int k;
        id_list = new String[]{"muzi", "frodo", "apeach", "neo"};
        report = new String[]{"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        k =2;
        System.out.println(Arrays.toString(solution.solution(id_list, report, k)));
        id_list = new String[]{"con", "ryan"};
        report = new String[]{"ryan con", "ryan con", "ryan con", "ryan con"};
        k =3;
        System.out.println(Arrays.toString(solution.solution(id_list, report, k)));
    }
    static class Solution {
        public int[] solution(String[] id_list, String[] report, int k) {
            int[] answer = {};

            //불량 이용자를 신고하려는 시스템
            //각 유저는 한번에 한명만 신고 가능
            //신고 횟수는 제한 X
            //한 유저를 여러번 신고가능하지만 신고횟수는 1회로 침

            //k번 이상 신고된 유저는 게시판 이용 정지됨
            //신고가 되서 정지가 된다면 정지가 됬다고 메일이 날아옴
            //각 유저별로 정지 처리 결과 메일을 받은 횟수를 배열에 담아 return
            //유저들 id_list, 신고내용 report, 신고제한횟수 k


            //중복신고가 안되니까 2차 행렬로 생각하면 쉽다
            answer= new int[id_list.length];
            boolean[][] map = new boolean[id_list.length][id_list.length];

            for (int i = 0; i < report.length; i++) {
                String[] temp = report[i].split(" ");
                //temp[0]이 temp[1]을 신고함
                //System.out.println(temp[0]+"이 "+temp[1]+"신고");
                int front = search(id_list,temp[0]);
                int back = search(id_list,temp[1]);
                //System.out.println(front+"와 "+back);
                map[front][back] = true;
            }

            for (int i = 0; i < id_list.length ; i++) {
                int sum =0;
                for (int j = 0; j < id_list.length; j++) {
                    if(map[j][i]){
                        sum++;
                    }
                }

                if(sum >= k){
                    for (int j = 0; j < id_list.length ; j++) {
                        if(map[j][i]){
                            answer[j]++;
                        }
                    }
                }
            }

            return answer;
        }
    }
    static int search(String[] id_list, String target){
        for (int i = 0; i < id_list.length ; i++) {
            if(id_list[i].equals(target)){
                return i;
            }
        }
        //존재안하면 id_list제한보다 더큰값 주기
        return 1001;
    }
}
