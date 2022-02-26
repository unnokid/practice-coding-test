package leetcode;

public class SumGame {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String num;
        num = "5023";
        System.out.println(solution.sumGame(num));
        num = "25??";
        System.out.println(solution.sumGame(num));
        num = "?3295???";
        System.out.println(solution.sumGame(num));
    }
    static class Solution {
        public boolean sumGame(String num) {
            //숫자와 ?로 구성된 짝수길이의 문자열번호 줌
            //앨리스부터 시작 ,턴마다 2가지 행동 가능
            //?의 자리를 고르고
            //0~9사이의 숫자로 바꾼다
            //?이 없으면 게임은 종료됨
            //숫자는 반으로 나눠서 양쪽 숫자를 다 더했을때 똑같으면 승리
            //아니면 패배
            //bob이 이기면 false, alice가 이기면 true return

            int left = 0;
            int right =0;
            int leftStar =0;
            int rightStar =0;

            int half = num.length()/2;

            for (int i = 0; i < half; i++) {
                if(num.charAt(i) == '?'){
                    leftStar++;
                }else{
                    left+= num.charAt(i) -'0';
                }
            }


            for (int i = half; i <num.length() ; i++) {
                if(num.charAt(i) == '?'){
                    rightStar++;
                }else{
                    right+=num.charAt(i)-'0';
                }
            }

            //양쪽합은 구해졌고 star의 개수로 판가름
            int total = left - right;
            int star = leftStar - rightStar;

            //별이 같거나 이미 완성시 만들어져있어야됨
            if (star == 0){
                return total != 0;
            }

            //왼쪽이 아예크고 별도 많으면 또는 반대면 이김
            if ((total > 0 && star > 0) || (total < 0 && star < 0)) {
                return true;
            }

            //같은 방향인걸 걸렀음
            total = Math.abs(total);
            star = Math.abs(star);

            //별이 2개씩 사라짐
            //현재 합과 별에 최대값만 넣었을때 차이를 좁힐수없으면 앨리스가 이김
            if (total>star/2*9 || total<(star+1)/2*9){
                return true;
            }

            return false;



        }
    }
}
