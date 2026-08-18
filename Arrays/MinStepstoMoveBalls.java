class Solution {
    public int[] minOperations(String boxes) {
        int steps=0;
        int balls=0;
        int[] ans=new int[boxes.length()];
        for(int i=0;i<ans.length;i++){
            ans[i]+=steps;
            if(boxes.charAt(i)=='1') balls++;
            steps+=balls;
        }
        steps=0;balls=0;
        for(int i=ans.length-1;i>=0;i--){
            ans[i]+=steps;
            if(boxes.charAt(i)=='1') balls++;
            steps+=balls;
        }
        return ans;
    }
}
