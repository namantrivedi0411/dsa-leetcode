class Solution {
    public int longestSubarray(int[] nums) {
        int count=2;int max=0;
        for(int i=2;i<nums.length;i++){
            if(nums[i-2]+nums[i-1]==nums[i]){
                count++;
                if(i==nums.length-1) max=Math.max(max,count);;
            }
            else{
                max=Math.max(max,count);
                count=2;
            }
        }
        return max;
    }
}
