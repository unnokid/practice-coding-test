package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1308 {
    public static void main(String[] args) throws IOException {
        //백준 1308 D-Day

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int startY = Integer.parseInt(s[0]);
        int startM = Integer.parseInt(s[1]);
        int startD = Integer.parseInt(s[2]);

        String[] s1 = br.readLine().split(" ");
        int endY = Integer.parseInt(s1[0]);
        int endM = Integer.parseInt(s1[1]);
        int endD = Integer.parseInt(s1[2]);

        int total1 = check(startY, startM, startD);
        int total2 = check(endY, endM, endD);

        if(endY - startY > 1000 || endY - startY == 1000 && (startM < endM || startM == endM && startD <= endD)) System.out.println("gg");
        else System.out.println("D-" + (total2 - total1));
    }
    public static int check(int year, int month, int day) {
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int sum = 0;

        for(int i = 1; i < year; i++){
            sum += 365 + checkYear(i);
        }

        for(int i = 1; i < month; i++){
            if(i == 2) sum += checkYear(year);
            sum += days[i];
        }

        sum += day;

        return sum;
    }
    private static int checkYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? 1 : 0;
    }
}
