package Programmers.level3;

import java.util.Arrays;
import java.util.Comparator;

public class ConnectIsland {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        int[][] costs;
        n=4;
        costs = new int[][]{{0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}};
        System.out.println(solution.solution(n,costs));
    }
    static class Solution {
        static int[] connect;
        public int solution(int n, int[][] costs) {
            int answer = 0;

            //n개의 섬
            //각 섬사이 연결하는 비용 costs 에 들어있음
            // A: 첫번째 섬 번호, B: 두번째 섬 번호, C: 연결하는 다리 비용
            //최소의 비용으로 모든 섬이 서로 통행 가능하도록 만들 때
            //최소 비용을 return

            //모든 섬이 연결만 되있으면 됨

            connect = new int[n];
            //연결을 위해서 자신의 섬과 연결된 정보 초기화
            //자기 자신으로 초기화
            for (int i = 0; i < n; i++) {
                connect[i] = i;
            }
            // 다리건설에 드는 비용 순서로 정렬
            Arrays.sort(costs, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    Integer a = o1[2];
                    Integer b = o2[2];
                    return a.compareTo(b);
                }
            });
            //System.out.println(Arrays.deepToString(costs));


            for (int i = 0; i < costs.length; i++) {
                //첫번째, 두번째 섬선택
                //만약 자기번호가 아니고 연결된 섬이 있으면 섬번호 찾아서 받기
                int first = find(costs[i][0]);
                int second = find(costs[i][1]);
                //비용 순서대로 1번섬과 2번섬이 다르다면 서로 연결
                if(first != second){
                    //conntect에 연결 
                    //ex) 1과 2가 이어져있으면 2번인덱스에도 1을 넣음
                    //처음에는 자기 번호로 초기화되어있음
                    connect[second] = first;
                    //사용한 비용 추가
                    answer+= costs[i][2];
                }
            }
            return answer;
        }
        static int find(int child){
            //연결된 섬 번호 찾기
            if(connect[child] == child){
                return child;
            }
            //자기 자신이 아니라면 연결되어있는 번호 인덱스로 다시 이동
            else{
                return connect[child] = find(connect[child]);
            }
        }
    }
}
