package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class BullsandCows {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String secret;
        String guess;
        secret = "1807";
        guess = "7810";
        System.out.println(solution.getHint(secret, guess));
        secret = "1123";
        guess = "0111";
        System.out.println(solution.getHint(secret, guess));
        secret = "1122";
        guess = "1222";
        System.out.println(solution.getHint(secret, guess));
    }

    static class Solution {
        public String getHint(String secret, String guess) {

            //Bulls and Cows 라는 게임을 친구와 한다
            //비밀 번호를 적고 친구에게 추측해서 숫자가 무엇인지 물어본다

            //숫자가 bulls 이면 위치와 숫자가 맞다
            //숫자가 cows 면 숫자는 맞지만 위치가 다르다

            //정답 secret과 추측한 guess를 줄때  A는 위치까지 맞는 번호, B는 숫자는 맞지만 틀린 위치
            //중복된 숫자도 존재가능
            // 숫자 야구인데 중복숫자가 가능한 파트
            String answer = "";
            int bulls = 0;
            int cows = 0;
            int[] count = new int[10];
            HashSet<Integer> set = new HashSet<>();
            //종류와 개수 만들기
            for (int i = 0; i < secret.length(); i++) {
                int target = Integer.parseInt(String.valueOf(secret.charAt(i)));
                set.add(target);
                count[target]++;
            }
            System.out.println(set);
            System.out.println(Arrays.toString(count));

            //먼저 자리가 맞는 개수부터 확인하기
            for (int i = 0; i <guess.length() ; i++) {
                int target = Integer.parseInt(String.valueOf(guess.charAt(i)));
                if(set.contains(target)){
                    if (secret.charAt(i) == guess.charAt(i)) {
                        //올바른 숫자 올바른 자리
                        if (count[target] > 0) {
                            bulls++;
                            count[target]--;
                        }
                    }
                }
            }
            //그다음에 숫자는 맞지만 위치가 틀린 개수 찾기
            for (int i = 0; i < guess.length(); i++) {
                int target = Integer.parseInt(String.valueOf(guess.charAt(i)));
                if (set.contains(target)) {
                    if (secret.charAt(i) != guess.charAt(i)) {
                        if (count[target] > 0) {
                            cows++;
                            count[target]--;
                        }
                    }
                }
            }
            //개수 String으로 만들기
            answer = answer + bulls + "A";
            answer = answer + cows + "B";
            return answer;
    }
}
}
