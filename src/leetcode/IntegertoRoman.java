package leetcode;

public class IntegertoRoman {

  public static void main(String[] args) {

  }
  static class Solution {
    public String intToRoman(int num) {
      //로마자 각각 나머지 구하기
      String M[] = {"", "M", "MM", "MMM"};
      String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
      String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
      String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

      return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
    }
  }
}
