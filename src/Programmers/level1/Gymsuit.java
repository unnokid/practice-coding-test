package Programmers.level1;

public class Gymsuit {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n;
        int[] lost;
        int[] reserve;
        n=5;
        lost = new int[]{2,4};
        reserve = new int[]{1,3,5};
        System.out.println(solution.solution(n,lost,reserve));
        n=5;
        lost = new int[]{2,4};
        reserve = new int[]{3};
        System.out.println(solution.solution(n,lost,reserve));
        n=3;
        lost = new int[]{3};
        reserve = new int[]{1};
        System.out.println(solution.solution(n,lost,reserve));
    }
    static class Solution {
        public int solution(int n, int[] lost, int[] reserve) {
            int answer = n;

            //n은 전체 학생 수
            //lost는 도난당한 학생 번호
            //reserve는 여벌 옷이 있는 학생 번호
            //앞번호나 뒷번호 학생에게만 체육복을 빌려줄 수 있음
            //빌려서 체육수업을 들을 수 있는 학생 최댓값 return

            //도난된 경우 배열
            boolean[] lostArr = new boolean[n + 1];
            for (int j : lost) {
                lostArr[j] = true;
            }

            //여벌옷 배열 가지고있는데 도난당했으면 빼기
            boolean[] reserveArr = new boolean[n + 2];
            for (int i : reserve) {
                if(lostArr[i])
                {
                    lostArr[i] =false;
                }
                else
                {
                    reserveArr[i] = true;
                }
            }
            for (int i = 1; i < lostArr.length; i++) {
                if (!lostArr[i]) {
                    continue;
                }
                //없는경우 앞뒤번호에 체육복을 가지고 있는지 확인하기
                if (reserveArr[i - 1]) {
                    reserveArr[i - 1] = false;
                } else if (reserveArr[i + 1] ) {
                    reserveArr[i + 1] = false;
                } else {
                    answer--;
                }
            }
            return answer;
        }
    }
}
