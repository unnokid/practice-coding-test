package Programmers.level1;

public class Average {
    static public double solution(int[] arr) {
        double answer = 0;
        for (int j : arr) {
            answer += j;
        }
        return answer/arr.length;
    }
}
