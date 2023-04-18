class Solution {
    public int maxProduct(int[] nums) {
        int ans =0;
        Arrays.sort(nums);
            ans = (nums[nums.length-1]-1) * (nums[nums.length-2]-1);
        return ans;
    }
}
// https:leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
