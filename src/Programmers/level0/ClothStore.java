package Programmers.level0;

public class ClothStore {

  public static void main(String[] args) {

  }
  static class Solution {
    public int solution(int price) {
      if(price<100000){
        return price;
      }else if(price<300000){
        price= (int) (price*0.95);
      }else if(price<500000){
        price= (int) (price*0.9);
      }else{
        price= (int) (price*0.8);
      }

      return price;
    }
  }
}
