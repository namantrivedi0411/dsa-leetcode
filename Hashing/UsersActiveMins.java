class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        Map<Integer,HashSet<Integer>> m=new HashMap<>();
        int[] ans=new int[k];
        for(int[] user:logs){
            int id=user[0];
            int min=user[1];
            if(!m.containsKey(id)){
                m.put(id,new HashSet<>());
            }
            m.get(id).add(min);
        }
        for(HashSet<Integer> set:m.values()){
            if(set.size()!=0){
                ans[set.size()-1]++;
            }
        }
        return ans;
    }
}
