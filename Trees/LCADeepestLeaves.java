class Solution {
    Map<Integer,Integer> m=new HashMap<>();
    int maxD=0;
    private TreeNode LCA(TreeNode root){
        if(root==null || m.get(root.val)==maxD) return root;
        TreeNode leftN=LCA(root.left);
        TreeNode rightN=LCA(root.right);
        if(rightN==null) return leftN;
        if(leftN==null) return rightN;
        return root;
    }
    private void findDepth(TreeNode root,int d){
        if(root==null) return;
        m.put(root.val,d);
        maxD=Math.max(maxD,d);
        findDepth(root.left,d+1);
        findDepth(root.right,d+1);
    }
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        findDepth(root,0);
        return LCA(root);
    }
}
