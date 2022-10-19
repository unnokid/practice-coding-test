package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class TopKFrequentWords {

  public static void main(String[] args) {

  }
  static class Solution {
    public List<String> topKFrequent(String[] words, int k) {

      HashMap<String,Integer> map = new HashMap<>();
      List<String> result = new ArrayList<>();
      for (String word: words){
        map.put(word,map.getOrDefault(word,0)+1);
      }

      PriorityQueue<String> pq = new PriorityQueue<>((a,b)->{
        if(map.get(a) == map.get(b)){
          return a.compareTo(b);
        }else{
          return map.get(b) - map.get(a);
        }});

      pq.addAll(map.keySet());
      while(k >0){
        result.add(pq.remove());
        k--;
      }
      return result;
    }
  }
}
