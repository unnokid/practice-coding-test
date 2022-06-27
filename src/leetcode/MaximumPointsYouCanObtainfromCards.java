package leetcode;

public class MaximumPointsYouCanObtainfromCards {
  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] cardPoints;
    int k;
    cardPoints = new int[]{1,2,3,4,5,6,1};
    k = 3;
    System.out.println(solution.maxScore(cardPoints,k));
    cardPoints = new int[]{9,7,7,9,7,7,9};
    k = 7;
    System.out.println(solution.maxScore(cardPoints,k));
  }
  static class Solution {
    public int maxScore(int[] cardPoints, int k) {
      //왼쪽 or 오른쪽부터 k개를 더했을때 가장 큰 점수를 계산
      int total =0;
      int sum =0;
      int answer =0;
      for (int i = 0; i <cardPoints.length ; i++) {
        sum+=cardPoints[i];
      }
      if(cardPoints.length==k){
        return sum;
      }

      for(int i=0;i<cardPoints.length-k-1;++i)
        total += cardPoints[i]; // sum of sliding window of n-k-1 starting from 0

      for(int i=cardPoints.length-k-1;i<cardPoints.length;++i) { // maximizing sum by shifiting window
        total += cardPoints[i];
        answer = Math.max(answer,sum-total);
        total -= cardPoints[i-(cardPoints.length-k-1)];
      }

      return answer;
    }
  }

}
