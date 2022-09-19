package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateFileinSystem {

  public static void main(String[] args) {
    Solution solution = new Solution();
    String[] paths;
    paths = new String[]{"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)","root 4.txt(efgh)"};
    System.out.println(solution.findDuplicate(paths));
  }
  static class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
      //같은 컨텐츠면 같은곳에 넣기
      List<List<String>> result = new ArrayList<>();
      Map<String, List<String>> map = new HashMap<>();
      for (String path: paths){
        String[] target = path.split(" ");
        String way = target[0];

        for (int i = 1; i <target.length ; i++) {
          int idx = target[i].indexOf("(");
          //파일이름 완성, content 분리
          String content = target[i].substring(idx);
          String name = way+"/"+target[i].substring(0,idx);

          List<String> list = map.getOrDefault(content, new ArrayList<>());
          list.add(name);
          map.put(content, list);
        }
      }

      //map에 넣은거 다 꺼내서 result에 넣기
      for(String target :map.keySet()){
        //중복된 값만 찾기때문에 2이상
        if(map.get(target).size() >1){
          result.add(map.get(target));
        }
      }


      return result;
    }
  }
}
