class Solution {
    public int largestAltitude(int[] gain) {
        int highestpoint = 0;
        int point = 0;
        for (int i = 0; i<gain.length; i++) {
            point += gain[i];

            highestpoint = Math.max(highestpoint,point);
        }
        return highestpoint;  
    }
}
//  https://leetcode.com/problems/find-the-highest-altitude/
