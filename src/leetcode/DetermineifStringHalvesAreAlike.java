package leetcode;

public class DetermineifStringHalvesAreAlike {

    public static void main(String[] args) {

    }
    static class Solution {
        public boolean halvesAreAlike(String s) {
            int n=s.length();
            int count=0;
            for(int i=0;i<n/2;i++){
                if(isVowel(s.charAt(i))){
                    count++;
                }
            }
            for(int i=n/2;i<n;i++){
                if(isVowel(s.charAt(i))){
                    count--;
                }
            }
            if(count==0){
                return true;
            }
            return false;
        }
    }
    static public boolean isVowel(char ch){
        if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'
            ||ch=='A'||ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            return true;
        }
        return false;
    }
}
