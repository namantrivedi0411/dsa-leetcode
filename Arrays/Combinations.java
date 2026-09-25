class Solution {
    private void findCombi(int i,List<Integer> combi,List<List<Integer>> ans,int n,int k){
        if(k==0){
            ans.add(new ArrayList(combi));
            return;
        }
        if(i>n) return;
        combi.add(i);
        findCombi(i+1,combi,ans,n,k-1);
        combi.remove(combi.size()-1);
        findCombi(i+1,combi,ans,n,k);
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> combi=new ArrayList<>();
        findCombi(1,combi,ans,n,k);
        return ans;
    }
}
