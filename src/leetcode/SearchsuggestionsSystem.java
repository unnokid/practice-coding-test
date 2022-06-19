package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchsuggestionsSystem {

  public static void main(String[] args) {
    Solution solution = new Solution();
    String[] products;
    String searchWord;
    products = new String[]{"mobile","mouse","moneypot","monitor","mousepad"};
    searchWord = "mouse";

    System.out.println(solution.suggestedProducts(products,searchWord));
  }
  static class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
      List<List<String>> result = new ArrayList<>();
      Arrays.sort(products);
      String target = new String();
      for(int i=0; i<searchWord.length(); i++){
        List<String> list = new ArrayList<>();
        int count = 0;
        target += searchWord.charAt(i);
        for(String product : products){
          if(product.length() >= target.length() && product.substring(0,i+1).equals(target) && count < 3){
            list.add(product);
            count++;
          }
        }
        result.add(list);
      }
      return result;
    }
  }

}
