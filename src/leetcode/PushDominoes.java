package leetcode;

import java.util.Arrays;

public class PushDominoes {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String dominoes;
        dominoes = "RR.L";
        System.out.println(solution.pushDominoes(dominoes));
        dominoes = ".L.R...LR..L..";
        System.out.println(solution.pushDominoes(dominoes));
    }

    static class Solution {
        public String pushDominoes(String dominoes) {
            //도미노에 대한 정보를 줄때
            //결과로 도미노가 왼쪽인지 오른쪽인지를 return

            //종류는 총 6가지
            //--L -> LLL
            //--R -> 변동X
            //L-- -> 변동X
            //R-- -> RRR
            //L-R -> 변동X
            //R-L -> 사이값이 하나씩 바뀜 RR.LL

            char[] map = dominoes.toCharArray();
            int L = -1;
            int R = -1;

            for (int i = 0; i <= dominoes.length(); i++) {

                //끝에 도달하거나 R을 만남
                if (i == dominoes.length() || map[i] == 'R') {
                    //최근에 R이 나옴
                    if (L < R) {
                        //현재인덱스까지 R로 변환
                        while (R < i) {
                            map[R] = 'R';
                            R++;
                        }
                    }
                    //최근 갱신
                    R = i;
                }
                //L만남
                else if (map[i] == 'L') {
                    //초창기 시작인경우
                    if (L == -1 && R == -1) {
                        L = 0;//인덱스 맞춰주기
                        while (L < i) {
                            map[L] = 'L';
                            L++;
                        }
                    }
                    //최근에 만난게 L인경우
                    else if (R < L) {
                        while (L < i) {
                            map[L] = 'L';
                            L++;
                        }
                    }
                    //최근에 만난게 R인경우
                    else {
                        int left = R + 1;
                        int right = i - 1;
                        while (left < right) {
                            map[left] = 'R';
                            map[right] = 'L';
                            left++;
                            right--;
                        }
                    }
                    //최근 갱신
                    L = i;
                }
            }

            return new String(map);
        }
    }
}
