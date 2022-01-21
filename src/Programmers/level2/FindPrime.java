package Programmers.level2;

import java.util.HashSet;

public class FindPrime {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String numbers;
        numbers = "17";
        System.out.println(solution.solution(numbers));
        numbers = "011";
        System.out.println(solution.solution(numbers));
    }
    static class Solution {
        public int solution(String numbers) {
            //한자리 숫자가 적힌 종이 조각이 있음
            //종이 조각을 붙여 소수를 몇개 만들수 잇는 지알아내려고 합니다.
            //각 종이 조각이 적힌 숫자 문자열이 줄때
            //종이 조각으로 만들 수있는 소수가 몇개 인지 return
            //개수 구하기
            HashSet<Integer> set = new HashSet<>();
            permutation("",numbers,set);

            int count =0;
            //set에 중복되지않고 각 자리로 만든 모든 경우의수 뽑아서 소수인지 확인
            while(set.iterator().hasNext()){
                int a = set.iterator().next();
                set.remove(a);
                if(a ==2)
                    count++;
                if(a%2 !=0 && isPrime(a)){
                    count++;
                }
            }

            return count;
        }
        static public void permutation(String prefix,String str, HashSet<Integer> set){
            //각 자리를 잘라서 set에 넣기
            int n= str.length();
            if(!prefix.equals("")){
                set.add(Integer.valueOf(prefix));
            }

            for (int i = 0; i < n; i++) {
                permutation(prefix + str.charAt(i),str.substring(0,i)+str.substring(i+1,n),set);
            }
        }
        static boolean isPrime(int n){
            if(n<=1){
                return false;
            }

            for (int i = 2; i <= (int)Math.sqrt(n); i+=1) {
                if(n % i ==0){
                    return false;
                }
            }
            return  true;
        }
    }
}
