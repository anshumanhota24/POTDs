class Solution {
  public boolean halvesAreAlike(String s) {
    int a = s.length()/2;
    int counta = Check_vowel(s.substring(0,a));
    int countb = Check_vowel(s.substring(a,s.length()));
    if ( counta ==  countb) {
      return true;
    }else {
      return false;
    }
  }
  public static int Check_vowel(String s) {
    String str = "aeiouAEIOU";
    int count = 0;
    for (int i = 0; i <s.length(); i++) {
      for (int j = 0; j <str.length(); j++) {
        if (s.charAt(i) == str.charAt(j)) {
          count++;
        }
      }
    }
    return count;
  }

}
//https://leetcode.com/problems/determine-if-string-halves-are-alike/
