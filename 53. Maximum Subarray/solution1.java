class Solution {
    public int maxSubArray(int[] nums) {
        int largestSum=nums[0];
        int currentSum=largestSum;
        
        for(int i=1;i<nums.length;i++){
            currentSum = Math.max(nums[i],nums[i]+currentSum);
            largestSum = Math.max(currentSum,largestSum);
        }
        
        return largestSum;
    }
}
