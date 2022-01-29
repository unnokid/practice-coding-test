package Programmers.level3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Travel {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[][] tickets;
        tickets = new String[][]{{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
        System.out.println(Arrays.toString(solution.solution(tickets)));
        tickets = new String[][]{{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
        System.out.println(Arrays.toString(solution.solution(tickets)));
    }
    static class Solution {
        boolean[] visited;
        ArrayList<String> list;
        public String[] solution(String[][] tickets) {
            String[] answer = {};

            //항공권을 이용해 여행경로를 짜려고함
            //항상 ICN에서 출발함
            //방문하는 공항 경로를 배열에 담아 return

            visited = new boolean[tickets.length];
            list = new ArrayList<>();
            //시작 횟수, 시작위치, 현재까지온 경로, 티켓배열 이 들어감
            dfs(0,"ICN","ICN",tickets);
            //전체 순회

            //System.out.println(list);
            //여러가지 경로가 존재할 수 있기에 list를 정렬해줌
            Collections.sort(list);
            //정렬후 맨앞에 있는 String을 가져와 ,로 잘라서 answer에 넣음
            String temp = list.get(0);
            answer = temp.split(",");
            return answer;
        }
        void dfs(int count, String currnet, String after,String[][] ticket){
            if(count == ticket.length){
                //횟수 다 소모하면 list에 더하기
                list.add(after);
                return;
            }

            //현재 위치에서 갈수있으면 가기
            for (int i = 0; i <ticket.length ; i++) {
                if(!visited[i] && ticket[i][0].equals(currnet)){
                    visited[i]=true;
                    //다음 여행지역을 추가하기
                    String temp = after+","+ticket[i][1];
                    dfs(count+1,ticket[i][1],temp,ticket);
                    //그 모든 경로로 들어가는게 끝나면 다시 경로 열기
                    visited[i] = false;
                }
            }
        }
    }
}
