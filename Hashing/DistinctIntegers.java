class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            int rev=0;int num=nums[i];
            while(num!=0){
                rev*=10;
                rev+=num%10;
                num/=10;
            }
            set.add(rev);
        }
        return set.size();
    }
}
