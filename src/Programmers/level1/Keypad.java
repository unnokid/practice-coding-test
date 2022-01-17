package Programmers.level1;

public class Keypad {
    public static void main(String[] args) {
        Solution solution= new Solution();
        int[] numbers;
        String hand;
        numbers = new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        hand = "right";
        System.out.println(solution.solution(numbers,hand));
        numbers = new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        hand = "left";
        System.out.println(solution.solution(numbers,hand));
        numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        hand = "right";
        System.out.println(solution.solution(numbers,hand));
    }
    static class Solution {
        public String solution(int[] numbers, String hand) {
            String answer = "";
            int[][] map = {{1,2,3},{4,5,6},{7,8,9},{10,0,10}};

            //왼손 오른손만 움직여 번호 입력
            //이때 가까운 손이 먼저 움직이도록 하기
            //왼쪽 147은 왼쪽손만, 오른쪽369는 오른쪽손만
            //그리고 2580번호는 거리가 가까운 손만 사용
            //누를 번호에 대한 배열이 주어질때 어떤 손으로 누르는지에 대한 String return

            //처음 손가락의 위치는 *과 #에서 시작하기에
            //첫 시작 좌표 고정
            int leftX =3;
            int leftY =0;
            int rightX =3;
            int rightY =2;

            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < map.length; j++) {
                    for (int k = 0; k <map[0].length ; k++) {
                        if(map[j][k] == numbers[i]){
                            //1 4 7이면 왼손사용
                            if(numbers[i] == 1 ||numbers[i] == 4 || numbers[i] == 7){
                                leftX = j;
                                leftY = k;
                                answer+="L";
                            }
                            //3 6 9이면 오른손 사용
                            else if(numbers[i] == 3 ||numbers[i] == 6 || numbers[i] == 9){
                                rightX = j;
                                rightY = k;
                                answer+="R";
                            }
                            //중간 2 5 8 0 누를시 거리계산
                            else{
                                int left = Math.abs(leftX-j)+Math.abs(leftY - k);
                                int right = Math.abs(rightX-j)+Math.abs(rightY - k);
                                if(left > right){//왼쪽더 멀면
                                    rightX = j;
                                    rightY = k;
                                    answer+="R";
                                }
                                else if(left == right){//거리가 같으면
                                    //무슨 손잡이인지 확인해서 보내기
                                    if(hand.equals("left")){
                                        leftX = j;
                                        leftY = k;
                                        answer+="L";
                                    }
                                    else{
                                        rightX = j;
                                        rightY = k;
                                        answer+="R";
                                    }
                                }else{//오른쪽이 더멀면
                                    leftX = j;
                                    leftY = k;
                                    answer+="L";
                                }
                            }



                        }
                    }
                }
            }
            return answer;
        }
    }
}
