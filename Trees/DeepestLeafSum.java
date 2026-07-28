class Solution {
    int sum=0;
    private int maxTraverse(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=maxTraverse(root.left);
        int right=maxTraverse(root.right);
        return Math.max(left,right)+1;
    }
    private void maxSum(TreeNode root,int height,int max){
        if(root==null){
            return;
        }
        if(height==max){
            sum+=root.val;
        }
        maxSum(root.left,height+1,max);
        maxSum(root.right,height+1,max);
    }
    public int deepestLeavesSum(TreeNode root) {
        int maxDepth=maxTraverse(root);
        maxSum(root,1,maxDepth);
        return sum;
    }
}
