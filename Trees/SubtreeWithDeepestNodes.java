class Solution {
    private int treeHeight(TreeNode root){
        if(root==null) return 0;
        int left=treeHeight(root.left);
        int right=treeHeight(root.right);
        return Math.max(left,right)+1;
    }
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if(root==null) return null;
        int l=treeHeight(root.left);
        int r=treeHeight(root.right);
        if(l==r) return root;
        TreeNode node;
        if(l<r) node=subtreeWithAllDeepest(root.right);
        else node=subtreeWithAllDeepest(root.left);
        return node;
    }
}
