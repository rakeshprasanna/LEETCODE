import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] solutionIndex = new int[2];
        
        HashMap<Integer,Integer> solutionIndexHashMap = new HashMap<>();
        // adds value and its corresponding Index;
        
        for(int i=0;i<=nums.length;i++){
            if(solutionIndexHashMap.containsKey(target-nums[i])){
                solutionIndex[0]=i;
                solutionIndex[1]=solutionIndexHashMap.get(target-nums[i]);
                break;
            }
            else{
                solutionIndexHashMap.put(nums[i],i);
            }
        }
        
        return solutionIndex;
        
    }
}
