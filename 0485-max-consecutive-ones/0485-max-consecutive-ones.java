class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int currmax=0;
        int maxmax=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                currmax++;
            }
            else{
                maxmax=(int) Math.max(maxmax,currmax);
                currmax=0;
            }
        }
        maxmax=(int) Math.max(maxmax,currmax);

        return maxmax;

        
    }
}