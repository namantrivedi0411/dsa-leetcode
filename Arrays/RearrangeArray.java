class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos=new int[nums.length/2];
        int[] neg=new int[nums.length/2];
        int j=0; int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) pos[j++]=nums[i];
            else neg[k++]=nums[i];
        }
        j=0;k=0;
        for(int i=0;i<nums.length;i+=2){
            nums[i]=pos[j++];
            nums[i+1]=neg[k++];
        }
        return nums;
    }
}
