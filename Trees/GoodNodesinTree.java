class Solution {
    int count=0;
    private void traverse(TreeNode root,int max){
        if(root==null) return;
        if(root.val>=max) count++;
        traverse(root.left,Math.max(max,root.val));
        traverse(root.right,Math.max(max,root.val));
    }
    public int goodNodes(TreeNode root) {
        traverse(root,Integer.MIN_VALUE);
        return count;
    }
}
