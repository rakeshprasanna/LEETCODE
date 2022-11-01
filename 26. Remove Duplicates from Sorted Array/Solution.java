class Solution {
    public int removeDuplicates(int[] nums) {
       int leftPtr =1;
       int rightPtr =1;

       for( ;rightPtr<nums.length;rightPtr++){
           if(nums[rightPtr]!=nums[rightPtr-1]){
               nums[leftPtr]=nums[rightPtr];
               leftPtr++;
           }
       } 
       return leftPtr;
    }
}
