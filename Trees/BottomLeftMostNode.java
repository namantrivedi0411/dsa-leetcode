class Solution {
    int count=1;
    int leftMost=0;
    private void findVal(TreeNode root){
        if(root==null) return;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode curr=q.remove();
            if(curr==null){
                if(q.isEmpty()) break;
                else{
                    q.add(null);
                    count=1;
                }
            }
            else{
                if(count==1){
                    leftMost=curr.val;
                };
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
                count++;
            }
        }
    }
    public int findBottomLeftValue(TreeNode root) {
        findVal(root);
        return leftMost;
    }
}
