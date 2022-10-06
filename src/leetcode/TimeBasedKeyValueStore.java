package leetcode;

import java.util.HashMap;

public class TimeBasedKeyValueStore {

  public static void main(String[] args) {

  }
  static class TimeMap {

    private HashMap<String, HashMap<Integer, String>> map;
    public TimeMap() {
      this.map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
      if(!this.map.containsKey(key)) {
        HashMap<Integer, String> secondMap = new HashMap<>();
        secondMap.put(timestamp, value);
        this.map.put(key, secondMap);
      } else {
        HashMap<Integer, String> secondMap = this.map.get(key);
        secondMap.put(timestamp, value);
        this.map.put(key, secondMap);
      }
    }

    public String get(String key, int timestamp) {
      if(!this.map.containsKey(key)) {
        return "";
      } else {
        HashMap<Integer, String> secondMap = this.map.get(key);
        for(int i=timestamp; i>=1; i--) {
          if(secondMap.containsKey(i)) {
            return secondMap.get(i);
          }
        }
        return "";
      }
    }
  }
}
