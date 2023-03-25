class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].charAt(1) == '+') X++;
            else X--;
        }
        return X;
        
    }
}
// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
