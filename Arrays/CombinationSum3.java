class Solution {
    private void findCombi(List<Integer> combi,List<List<Integer>> ans,int k,int target,int i){
        if(k==0){
            if(target==0) ans.add(new ArrayList<>(combi));
            return;
        }
        if(i>9) return;
        combi.add(i);
        findCombi(combi,ans,k-1,target-i,i+1);
        combi.remove(combi.size()-1);
        findCombi(combi,ans,k,target,i+1);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> combi=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        findCombi(combi,ans,k,n,1);
        return ans;
    }
}
