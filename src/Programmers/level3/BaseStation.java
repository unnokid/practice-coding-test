package Programmers.level3;

public class BaseStation {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        int[] station;
        int w;
        n =11;
        station = new int[]{4,11};
        w =1;
        System.out.println(solution.solution(n,station,w));
        n =16;
        station = new int[]{9};
        w =2;
        System.out.println(solution.solution(n,station,w));
    }
    static class Solution {
        public int solution(int n, int[] stations, int w) {
            int answer = 0;

            //아파트가 일렬로 존재
            //n은 아파트 개수, stations은 현재 기지국이 존재하는 아파트 번호
            //w는 전파 도달범위거리
            //최소로 설치하면서 모든 아파트에 전파를 전달하려고함
            //증설해야 될 기지국 개수의 최솟값을 return

            //start는 현재 보고있는 아파트 번호
            int start =1;
            //먼저 세워진 기지국 가장 처음 번호
            int stationIdx =0;

            while(start <= n){
                //start가 먼저존재하는 기지국전파범위에 도달해있는지 확인
                if(stationIdx < stations.length && start >= stations[stationIdx]-w){
                    //stationIdx에 기지국에 존재하는 오른쪽으로 범위를 넘어선 인덱스로 이동
                    start = stations[stationIdx]+w+1;
                    stationIdx++;
                }
                else{
                    //없으면 기지국 추가하고 범위밖으로 이동동                    answer++;
                    start += (w*2) +1;
                }
            }

            return answer;
        }
    }
}
