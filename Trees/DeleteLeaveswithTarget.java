class Solution {
    private TreeNode buildTree(TreeNode root,int t){
        if(root==null) return null;
        root.left=buildTree(root.left,t);
        root.right=buildTree(root.right,t);
        if(root.left==null && root.right==null){
            if(root.val==t) return null;
        }
        return root;
    }
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        return buildTree(root,target);
    }
}
