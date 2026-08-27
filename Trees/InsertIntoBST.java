class Solution {
    private TreeNode insert(TreeNode root,int num){
        if(root==null) return new TreeNode(num);
        if(root.val>num){
            root.left=insert(root.left,num);
        }
        else if(root.val<num){
            root.right=insert(root.right,num);
        }
        return root;
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        return insert(root,val);
    }
}
