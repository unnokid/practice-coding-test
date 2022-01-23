package Programmers.level2;

public class Visitlength {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String dirs;
        dirs = "ULURRDLLU";
        System.out.println(solution.solution(dirs));
        dirs = "LULLLLLLU";
        System.out.println(solution.solution(dirs));
    }
    static class Solution {
        public int solution(String dirs) {
            int answer = 0;
            
            //4가지 명령어 존재
            //U -> 위로 한칸
            //D -> 아래로 한칸
            //R -> 오른쪽으로 한칸
            //L -> 왼쪽으로 한칸
            //(0,0)에서 시작시 캐릭터가 지나간길중 처음간 길이 return
            boolean[][][][] visited = new boolean[11][11][11][11];
            //시작지점
            int currentX=5;
            int currentY=5;
            int nextX=5;
            int nextY=5;
            //캐릭터는 지금 어떤 명령인지
            for (int i = 0; i < dirs.length(); i++) {
                currentX = nextX;
                currentY = nextY;

                switch (dirs.charAt(i)){
                    case 'U':
                        nextX=currentX;
                        nextY=currentY+1;
                        break;
                    case 'D':
                        nextX=currentX;
                        nextY=currentY-1;
                        break;
                    case 'L':
                        nextX=currentX-1;
                        nextY=currentY;
                        break;
                    case 'R':
                        nextX=currentX+1;
                        nextY=currentY;
                        break;
                }
                //최대 인덱스 조절
                if(nextX <0 || nextX > 10 || nextY <0 || nextY >10){
                    nextX = currentX;
                    nextY = currentY;
                    continue;
                }
                //현재좌표에서 다음좌표로 이동한적이있는가 확인
                if(!visited[currentX][currentY][nextX][nextY]){
                    visited[currentX][currentY][nextX][nextY] = true;
                    visited[nextX][nextY][currentX][currentY] = true;
                    answer++;
                }
            }
            return answer;
        }
    }
}
