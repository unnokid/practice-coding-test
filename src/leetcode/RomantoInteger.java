package leetcode;

public class RomantoInteger {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
    }
    static class Solution {
        public int romanToInt(String s) {
            //로마 기호를 받으면 숫자로 변환하기
            //I=1, V=5, X=10, L= 50, C=100, D=500, M=1000

            int count =0;
            int before =0;
            for (int i = 0; i <s.length() ; i++) {
                char target = s.charAt(i);
                int num =getNumber(target);
                
                //다음 값이 없는경우
                if(i+1 == s.length()){
                    count+=num;
                    break;
                }

                char nextTarget = s.charAt(i+1);

                //다음값이 더 크면 -, 작으면 +
                if(num < getNumber(nextTarget)){
                    count-=num;
                }else{
                    count+=num;
                }
            }
            return count;
        }
        public int getNumber(char ch){
            switch (ch)
            {
                case 'I': return 1;
                case 'V': return 5;
                case 'X': return 10;
                case 'L': return 50;
                case 'C': return 100;
                case 'D': return 500;
                case 'M': return 1000;
                default: return 1;
            }
        }
    }
}
