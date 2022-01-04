package Programmers.level2;

public class Fibonacci {
    static public int solution(int n) {
        int answer = 0;

        int n1= 1;
        int n2= 1;
        int sum =0;

        if(n == 1 || n == 2){ return 1;}

        for (int i = 3; i <= n; i++) {
            sum = n1 + n2;
            sum%= 1234567;
            n1=n2;
            n2=sum;
        }


        return sum;
    }
}
