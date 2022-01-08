package Programmers.level2;

public class NormalSquare {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int w;
        int h;
        w = 8;
        h = 12;
        System.out.println(solution.solution(w,h));
    }

    static class Solution {
        public long solution(int w, int h) {
            long answer = 1;

            //가로가 W 세로가 H인 직사각형 종이가 있으며 모든 격자칸은 1x1입니다
            //누가 대각선으로 망가뜨림
            //대각선이 지나간 종이를 제외한 나머지 사용할수있는 사각형 개수 return

            //못쓰는 사각형의 패턴이 반복되어진다 그 파트만큼반복됨
            //4번, 가로와 세로의 배수 느낌이듬

            //1. w와 h의 최대공약수를 찾기-> 그만큼 패턴이 반복된다
            //2. w와 h를 최대공약수로 나눈 그 영역에서 대각선으로 몇개가 짤려나가는지 계산
            //3. 전체 w x h 개수에서 그 2번에서 구한 짤린 개수와 최대공약수를 곱해서 빼준다
            int width = w;
            int height = h;
            int temp=0;
            int circle=0;
            while(width !=0){
                if(width < height){
                    temp = width;
                    width = height;
                    height = temp;
                }

                width = width - height;
            }
            //이러면 height가 최대 공약수
            circle = height;//반복되는 수
            width = w / circle;
            height = (h / circle)-1;//가로가 길던 세로가 길던 뒤집으면 같음
            answer = ((long) w *h) - ((long) (width + height) * circle);
            return answer;
        }
    }
}
