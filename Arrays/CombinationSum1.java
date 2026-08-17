class Solution {
    private void findCombi(int[] arr,int i,List<Integer> combi,List<List<Integer>> ans,int target){
        if(target==0){
            ans.add(new ArrayList(combi));
            return;
        }
        if(i==arr.length || target<0) return;
        combi.add(arr[i]);
        findCombi(arr,i,combi,ans,target-arr[i]);
        combi.remove(combi.size()-1);
        findCombi(arr,i+1,combi,ans,target);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> combi=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        findCombi(candidates,0,combi,ans,target);
        return ans;
    }
}
