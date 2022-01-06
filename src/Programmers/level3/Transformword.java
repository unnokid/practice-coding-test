package Programmers.level3;

public class Transformword {

    static int result =50;
    static public int solution(String begin, String target, String[] words) {
        //begin , target words 한번에 한개의 알파벳만 바꿀 수 있음
        // words에 있는 단어로만 변환가능
        //단어를 비교해서 알파벳 한개만 다르면 변환가능
        //1. 먼저 words를 순회해서 target이 있는지 부터 확인하기
        //2. 바꿀수있는 단어 체크하기 (주어진 단어와 알파벳이 1개만 다른지)
        boolean pass = false;

        //target이 존재하는지 먼저 확인하기
        for (int i = 0; i < words.length; i++) {
            if(words[i].equals(target)){
                pass= true;
                break;
            }
        }
        if(!pass){//타겟이 없으면 끝
            return 0;
        }
        //여기까지 오면 target이 존재함
        int start =0;
        String before ="";
        dfs(begin,target,words,start,before);
        return result;
    }
    static void dfs(String begin, String target, String[] words,int count,String before){
        if(begin.equals(target)){
            //바꾸는 단어가 target과 같으면 끝
            result = Math.min(count,result);
            return;
        }
        if(count > words.length){
            // 바꾼횟수가 단어개수보다 많으면 끝
            return;
        }
        for (int i = 0; i < words.length ; i++) {
            //단어들과 현재 before단어가 같지않고 알파벳 한개만 다를경우 찾기
            if(!words[i].equals(before) &&change(begin,words[i])){
                //words[i]로 바꾸고 바꾼횟수+1, 다시 순회
                dfs(words[i], target,words,count+1,begin);
            }
        }
    }
    static boolean change(String begin, String end){
        //단어중 하나만 다른지 확인하기 그래야 바꿀수 있기때문
        int result =0;
        for (int i = 0; i <begin.length() ; i++) {
            if(begin.charAt(i)!= end.charAt(i)){
                result++;
                if (result > 1) {
                    return false;
                }
            }
        }
        return result == 1;
    }

}