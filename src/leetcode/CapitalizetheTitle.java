package leetcode;

import java.util.Locale;

public class CapitalizetheTitle {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String title;
        title = "capiTalIze tHe titLe";
        System.out.println(solution.capitalizeTitle(title));
        title = "First leTTeR of EACH Word";
        System.out.println(solution.capitalizeTitle(title));

    }
    static class Solution {
        public String capitalizeTitle(String title) {
            //길이가 1 or 2이면 모든 문자를 소문자로 바꾸기
            //아닌경우는 첫번째 문자만 대문자로 그리고 나머진 소문자로 바꾸기
            StringBuilder sb = new StringBuilder();
            String[] temp = title.split(" ");

            for (int i = 0; i <temp.length ; i++) {
                if(i !=0){
                    sb.append(" ");
                }

                if(temp[i].length() <=2){
                    sb.append(temp[i].toLowerCase());
                }else{
                    sb.append(temp[i].substring(0,1).toUpperCase()+temp[i].substring(1).toLowerCase());
                }
            }

            return String.valueOf(sb);
        }
    }
}
