class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer,TreeNode> m=new HashMap<>();
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<descriptions.length;i++){
            if(!m.containsKey(descriptions[i][0])){
                m.put(descriptions[i][0],new TreeNode(descriptions[i][0]));
            }
            s.add(descriptions[i][1]);
            if(!m.containsKey(descriptions[i][1])){
                m.put(descriptions[i][1],new TreeNode(descriptions[i][1]));
            }
            if(descriptions[i][2]==1){
                m.get(descriptions[i][0]).left=m.get(descriptions[i][1]);
            }
            else{
                m.get(descriptions[i][0]).right=m.get(descriptions[i][1]);
            }
        }
        TreeNode root=null;
        for(int i=0;i<descriptions.length;i++){
            if(!s.contains(descriptions[i][0])){
                root=m.get(descriptions[i][0]);
                break;
            }
        }
        return root;
    }
}
