package leetcode;

public class DayoftheYear {
    public static void main(String[] args) {
        Solution solutions = new Solution();
        String date;
        date ="2019-01-09";
        System.out.println(solutions.dayOfYear(date));
    }
    static class Solution {
        public int dayOfYear(String date) {
            int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            //연도 날 계산
            String[] temp = date.split("-");
            int y = Integer.parseInt(temp[0]);
            int m = Integer.parseInt(temp[1]);
            int d = Integer.parseInt(temp[2]);

            //윤년계산
            if(m > 2 && y %4 ==0 && (y %100 !=0 || y%400 ==0)){
                d++;
            }

            while(--m >0){
                d+=days[m-1];

            }
            return d;
        }
    }
}
