class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int i = 0; i<sentences.length;i++) {
            int c = 1;
            for (int j=0; j<sentences[i].length();j++) {
                if (sentences[i].charAt(j)==' ')
                c++;
            }
            if (c > max)
            max = c;
        }
        return max;   
    }
}
// https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
