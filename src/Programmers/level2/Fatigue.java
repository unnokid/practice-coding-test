package Programmers.level2;


public class Fatigue {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 80;
        int[][] dungeons = {{80,20},{50,40},{30,10}};

        System.out.println(solution.solution(n,dungeons));
    }
}

class Solution {
    static boolean[] visited;
    static int max =0;
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];

        //하루 한번 던전을 탐험할 수 있는데 유저가 탐험할 수 있는 최대 던전 수를 return
        counting(dungeons,k,1);
        return max;
    }
    static void counting(int[][] d, int k,int count){
        //던전을 순회 첫번째 들어갈 친구들
        for (int i = 0; i <d.length ; i++) {
            //방문한적이 없으면
            if(!visited[i]){
                visited[i] = true;
                //최소 필요 피로도가 만족하는지
                if(k >= d[i][0]){
                    //현재 던전 방문개수 저장
                    max = Math.max(max,count);
                    //다음 던전 순회 소모 피로도 빼고 count+1
                    counting(d,k- d[i][1], count +1);
                }
                //나머지 순회가 끝나면 다시 해제
                visited[i] = false;
            }
        }
    }
}