package leetcode;

public class GuessNumberHigherorLower {

  public static void main(String[] args) {

  }
  static public class Solution{
    public int guessNumber(int n) {
      int low = 1;
      int high = n;

      while(low <= high){
        int mid = low + (high - low) / 2;

        int g = guess(mid);
        if(g == 1) low = mid + 1;
        else if(g == -1) high = mid - 1;
        else return mid;
      }
      return 1;
    }
    int guess(int num){
      //추측하는 부분 구현부분이 없어서 대충 만듬
      int pick = 0;
      if(pick < num){
        return 1;
      }else if(pick > num){
        return -1;
      }
      return 0;
    }

  }
}
