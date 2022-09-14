package baekjoon;


import java.util.Scanner;

public class AppleGame {

  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
    int width = sc.nextInt();
    int basket = sc.nextInt();
    int t = sc.nextInt();
    int result = 0;

    int left = 0;
    int right = (basket - 1);

    for(int i = 0; i < t; i++) {
      int apple = sc.nextInt() - 1;
      if(apple > right) {
        result += apple - right;
        right = apple;
        left = apple - (basket - 1);
      }
      else if(apple < left) {
        result += left - apple;
        left = apple;
        right = apple + (basket - 1);
      }
    }
    System.out.println(result);


  }

}
