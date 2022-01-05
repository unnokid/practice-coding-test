package Programmers.level1;

import java.util.Arrays;

public class Nofinishplayer {
    static public String solution(String[] participant, String[] completion) {
        String answer = "";
        int count;
        //마라톤을 참가했지만 낙오자는 단 한명
        //배열이 길이가 1차이가 나고 나머진 다 똑같다면 정렬
        Arrays.sort(participant);
        Arrays.sort(completion);
        //정렬후 만약 끝까지 가게된다면 i는 completion맨끝에 있게 될꺼임
        for(count =0; count< completion.length; count++)
        {
            //정렬했으니 같다면 그자리 그대로 같을예정
            if(!participant[count].equals(completion[count]))
            {
                //같지 않는다면 참가자는 했지만 완주자에 없는것이므로 참가자이름을 넘겨줌
                answer = participant[count];
                break;
            }
        }
        //answer에 낙오자 한명을 찾아 출력하는 함수
        answer = participant[count];
        return answer;
    }
}