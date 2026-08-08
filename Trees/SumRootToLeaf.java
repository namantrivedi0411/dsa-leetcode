class Solution {
    int sum=0;
    private void Traverse(TreeNode root,int num){
        if(root==null){
            return;
        }
        num=(num*10)+root.val;
        if(root.left==null && root.right==null){
            sum+=num;
            return;
        }
        Traverse(root.left,num);
        Traverse(root.right,num);
    }
    public int sumNumbers(TreeNode root) {
        Traverse(root,0);
        return sum;
    }
}
