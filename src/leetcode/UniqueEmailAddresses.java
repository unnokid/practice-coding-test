package leetcode;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {

  public static void main(String[] args) {
    Solution solution = new Solution();
    String[] emails;
    emails = new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
    System.out.println(solution.numUniqueEmails(emails));

  }
  static class Solution {
    public int numUniqueEmails(String[] emails) {
      //local name+ "@"+domain name
      Set<String> set = new HashSet<>();

      for (int i = 0; i <emails.length; i++) {
        String[] split = emails[i].split("@");

        String frontName = split[0].split("\\+")[0];
        String localName = frontName.replaceAll("\\.","");
        set.add(localName+"@"+split[split.length-1]);
      }
      return set.size();
    }
  }
}
