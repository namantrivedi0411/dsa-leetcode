class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    private void Traverse(TreeNode root){
        if(root==null) return;
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> list=new ArrayList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode curr=q.remove();
            if(curr==null){
                ans.add(list);
                if(q.isEmpty()) break;
                else{
                    q.add(null);
                    list=new ArrayList<>();
                }
            }
            else{
                list.add(curr.val);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        Traverse(root);
        return ans;
    }
}
