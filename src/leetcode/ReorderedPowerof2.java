package leetcode;

import java.util.Arrays;

public class ReorderedPowerof2 {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int n;
    n=1;
    System.out.println(solution.reorderedPowerOf2(n));
    n=46;
    System.out.println(solution.reorderedPowerOf2(n));
    n=128;
    System.out.println(solution.reorderedPowerOf2(n));
    n=36;
    System.out.println(solution.reorderedPowerOf2(n));
    n=63;
    System.out.println(solution.reorderedPowerOf2(n));
    n=10;
    System.out.println(solution.reorderedPowerOf2(n));
  }
  static class Solution {
    boolean result;
    public boolean reorderedPowerOf2(int n) {

      //문제를 잘 읽자
      //2의 거듭제곱 구하는 문제였음

      int[] target = count(n);
      int num =1;

      for (int i = 0; i <=30 ; i++) {
        if(Arrays.equals(target, count(num))){
          return true;
        }
        num = num<<1;
      }


      return false;
    }
    int[] count(int n){
      //비트 연산자 2의 제곱구할때 유용한 듯
      int[] arr =new int[10];
      while(n>0){
        arr[n%10]++;
        n/=10;
      }
      return arr;
    }


  }
}
