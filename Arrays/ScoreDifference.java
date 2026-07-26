class Solution {
    public int scoreDifference(int[] nums) {
        int first=0;int second=0;int player=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
               if(i%6==5) player=player^1;
               if(player==0) first+=nums[i];
               else if(player==1) second+=nums[i];
            }
            else{
                player=player^1;
                if(i%6==5) player=player^1;
                if(player==0) first+=nums[i];
                else if(player==1) second+=nums[i];
            }
        } 
        return first-second;   
   }
}
