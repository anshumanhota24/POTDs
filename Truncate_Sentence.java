class Solution {
    public String truncateSentence(String s, int k) {
        
        int i = 0;
        int j = 0;
        while (j < s.length()) {
            if (s.charAt(j) == ' ') k--;
            if (k == 0) break;
            j++;
        }
        return s.substring(i, j);
    }
}
