class Solution {
    public int maximumGap(int[] nums) {
        int max=0;
        if(nums.length<2) return max;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            max=Math.max(max,Math.abs(nums[i]-nums[i-1]));
        }
        return max;
    }
}
