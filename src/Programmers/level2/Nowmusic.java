package Programmers.level2;

public class Nowmusic {
    public static void main(String[] args) {
        Solution solution = new Solution();

    }
    static class Solution {
        public String solution(String m, String[] musicinfos) {
            String answer = "(None)";
            //멜로디로 m 문자열을 줌
            //musicinfos는 시작시간,끝난시간,음악제목,악보정보

            //근데 들은 부분이 한곡이 끝나고 다음곡 파트로 이어진 경우가 있을수 있다.

            //샾붙은거 변환
            int total=0;
            for (int i = 0; i <m.length() ; i++) {
                m = m.replace("A#","a");
                m = m.replace("C#","c");
                m = m.replace("D#","d");
                m = m.replace("F#","f");
                m = m.replace("G#","g");
            }

            for (int i = 0; i <musicinfos.length ; i++) {
                //시작시간,끝난시간,음악제목,악보정보
                String[] temp = musicinfos[i].split(",");
                //3이 악보정보
                temp[3] = temp[3].replace("A#","a");
                temp[3] = temp[3].replace("C#","c");
                temp[3] = temp[3].replace("D#","d");
                temp[3] = temp[3].replace("F#","f");
                temp[3] = temp[3].replace("G#","g");

                String[] start = temp[0].split(":");
                String[] end = temp[1].split(":");

                int hour = Integer.parseInt(end[0]) - Integer.parseInt(start[0]);
                int min = Integer.parseInt(end[1]) - Integer.parseInt(start[1]) + (hour*60);

                String music ="";
                //길이 반복해서 music에 방송되었던 악보완성
                for (int j = 0; j <min ; j++) {
                    music += temp[3].charAt(j%temp[3].length());
                }

                if(music.contains(m)){
                    //뮤직 안에 포함되는가
                    if(total < music.length()){
                        //조건이 여러개이면 가장 긴 진행시간인지
                        total = music.length();
                        answer = temp[2];
                    }
                }

            }

           return answer;
        }
    }
}
