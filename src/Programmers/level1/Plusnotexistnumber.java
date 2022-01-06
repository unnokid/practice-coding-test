package Programmers.level1;

public class Plusnotexistnumber {
    static public int solution(int[] numbers) {
        int answer = 45;

        //0~9 까지 숫자 가 들어있는 numbers 배열
        //numbers의 모든수는 서로 다르다.
        //numbers에서 찾을 수 없는 숫자 0~9까지의 숫자를 모두 찾아 더한수를 return

        //시작값이 0~9까지 다 더해진 45에서 부터 시작

        for (int i = 0; i < numbers.length; i++) {
            //중복은 없다고 했으니 값이 존재할 때 45에서 빼주면 됨
            answer -=numbers[i];
        }
        return answer;
    }
}
