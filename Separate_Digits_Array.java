class Solution {
    public int[] separateDigits(int[] nums) {
        int arr [] 
        for(int i = 0; i<nums.length; i++) {
            int n = nums[i];
            while(n>0) {
                
                System.out.println(n % 10);
                n /= 10;
            }
        }
        return nums;
    }
}
// https://leetcode.com/problems/separate-the-digits-in-an-array/
