class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0) nums[i]*=-1;
        }
        Arrays.sort(nums);
        long sum=0;
        int j=0; int k=nums.length-1;
        while(j<=k){
            if(j==k){
                sum+=(long)nums[k]*nums[k];
                k--;j++;
            }
            else{
                sum+=(long)nums[k]*nums[k];
                sum-=(long)nums[j]*nums[j];
                k--;j++;
            }
        }
        return sum;
    }
}
