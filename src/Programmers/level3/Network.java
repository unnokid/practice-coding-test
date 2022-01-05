package Programmers.level3;

public class Network {
    static public int solution(int n, int[][] computers) {
        int answer = 0;

        //상호간 정보를 교환가능하도록 연결
        //컴퓨터의 대수 n, 연결에 대한 정보 2차원 배열 주어짐
        // 네트워크의 개수를 return

        //배열을 돌면서
        boolean[] check = new boolean[n];

        for (int i = 0; i <n; i++) {
            if(!check[i]){
                //방문한적이없는 배열이면 dfs 시작
                check = dfs(computers,i,check);
                answer++;//네트워크 개수 추가
            }
        }
        return answer;
    }
    static boolean[] dfs(int[][] computers,int target, boolean[] check){
        check[target] = true;//방문 체크

        //연결된곳이 있으면 그곳으로 이동
        for (int i = 0; i < computers.length; i++) {
            if(target != i && !check[i] && computers[target][i] == 1){
                check = dfs(computers,i,check);
            }
        }
        return check;
    }

}