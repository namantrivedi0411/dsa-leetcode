class Solution {
    int sum=0;
    private void calculateSum(TreeNode root,int par,int gpar){
        if(root==null) return;
        int curr=root.val;
        calculateSum(root.left,curr,par);
        if(gpar!=0 && gpar%2==0) sum+=curr;
        calculateSum(root.right,curr,par);
    }
    public int sumEvenGrandparent(TreeNode root){
        calculateSum(root,0,0);
        return sum;
    }
}
