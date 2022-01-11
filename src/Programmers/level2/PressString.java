package Programmers.level2;

public class PressString {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;
        s = "aabbaccc";
        System.out.println(solution.solution(s));
        s = "ababcdcdababcdcd";
        System.out.println(solution.solution(s));
    }
    static class Solution {
        public int solution(String s) {
            int answer = 1000;

            //aabbaccc -> 2a2ba3c  반복되지않으면 1은 생략함
            //1개 단위가 아닌 2개 단위로도 짤라서 압축하려고함
            //ababcdcdababcdcd -> 2ab2cd2ab2cd or 2ababcdcd 가될수있다.

            //몇글자씩 자를지 for문을 통해서 정하고 그걸 함수로 넣어준다
            for (int i = 1; i <= s.length(); i++) {
                String str = encoding(s, i, answer);
                if(str != null){
                    answer = Math.min(answer, str.length());
                }
            }


            return answer;
        }
        static String encoding(String s , int slice, int max) {
            StringBuilder sb = new StringBuilder();
            String prev = "";//앞꺼와 비교하기 위한 저장
            int cnt = 0;//숫자 반복횟수
            int idx = 0;//인덱스지점

            while (idx + slice <= s.length()) {//자를 파트가 길이를 넘어가기전까지 반복
                String cur = s.substring(idx, idx + slice);//길이만큼 짜르기

                if (prev.compareTo(cur) != 0) {//전 비교값과 자른 문자열과 같지않다면
                    if (prev.compareTo("") != 0) {//전 비교값이 비어있지 않는다면
                        if (cnt != 1) {
                            //반복횟수가 1이 아니라면
                            sb.append(cnt);
                        }
                        sb.append(prev);//그뒤에 반복되어진 문자열 추가
                    }
                    prev = cur; //이제 비교할 문자열을 현재자른 문자열로 대체
                    cnt = 1;//갯수는 다시 초기화

                } else {//비교할 문자열과 자른문자열이 같다면 반복횟수 ++
                    cnt++;
                }
                //다음 자를 인덱스 이동
                idx += slice;

                //그 만약 길이값이 긴 문자열 길이를 넘어선다면 더이상 계산 필요없음
                if (sb.length() >= max) {
                    return null;
                }
            }
            //while 끝
            //남은 문자열을 붙여야함
            if (idx <= s.length()) {
                if (cnt != 1) {
                    sb.append(cnt + prev + s.substring(idx));
                } else {
                    sb.append(prev + s.substring(idx));
                }
            }

            return sb.toString();
        }
    }
}
