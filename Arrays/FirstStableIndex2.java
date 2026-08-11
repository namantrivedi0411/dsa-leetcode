class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] prefMax=new int[nums.length];
        int[] suffMin=new int[nums.length];
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            prefMax[i]=max;
        }
        for(int i=nums.length-1;i>=0;i--){
            min=Math.min(min,nums[i]);
            suffMin[i]=min;
        }
        for(int i=0;i<nums.length;i++){
            int score=prefMax[i]-suffMin[i];
            if(score<=k) return i;
        }
        return -1;
    }
}
