class Solution {
    List<List<Integer>> sets=new ArrayList<>();
    private void findSubsets(int[] nums,int i,List<Integer> s){
        if(i==nums.length){
            sets.add(new ArrayList<>(s));
            return;
        }
        s.add(nums[i]);
        findSubsets(nums,i+1,s);
        s.remove(s.size()-1);
        findSubsets(nums,i+1,s);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> s=new ArrayList<>();
        findSubsets(nums,0,s);
        return sets;
    }
}
