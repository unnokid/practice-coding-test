package Programmers.level2;

public class TransformBinary {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        s="110010101001";
        System.out.println(solution.solution(s));
        s="01110";
        System.out.println(solution.solution(s));
        s="1111111";
        System.out.println(solution.solution(s));
    }
    static class Solution {
        public int[] solution(String s) {
            int[] answer = {0,0};
            
            // 0과 1로 이루어진 문자열 s 줌
            // 1.x의 모든 0을 제거
            // 2.x의 길이를 c이라고 하면 이 c를 2진법으로 표현해서 변환

            //s가 1이 될 때 까지 변환 했을 때 제거된 모든 0의 개수를 배열에 담아 return
            
            String changeS =s;
            // 1이 될때 까지 반복
            while(!changeS.equals("1")){

                for (int i = 0; i < changeS.length(); i++) {
                    if(changeS.charAt(i) == '0'){//0 개수 세기
                        answer[1]++;
                    }
                }
                //0 제거
                changeS=changeS.replace("0","");
                //길이 비교
                changeS = Integer.toBinaryString(changeS.length());
                //변환 횟수 추가
                answer[0]++;
            }

            return answer;
        }
    }
}
