class Solution {
    private TreeNode buildBST(TreeNode root,int x){
        if(root==null) return new TreeNode(x);
        if(root.val>x){
            root.left=buildBST(root.left,x);
        }
        else{
            root.right=buildBST(root.right,x);
        }
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=null;
        for(int x:preorder){
            root=buildBST(root,x);
        }
        return root;
    }
}
