class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        int oddCount=0;
        int nice=0;
        m.put(0,1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                m.put(oddCount,m.get(oddCount)+1);
            }
            else{
                oddCount++;
                m.put(oddCount,1);
            }
            int temp=oddCount-k;
            if(temp>=0) nice+=m.get(temp);
        }
        return nice;
    }
}
