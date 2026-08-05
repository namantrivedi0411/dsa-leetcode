class Solution {
    int count=0;int num=0;
    private void findNum(TreeNode root,int k){
        if(root==null || count>=k) return;
        findNum(root.left,k);
        count++;
        if(count==k){
            num=root.val;
            return;
        }
        findNum(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        findNum(root,k);
        return num;
    }
}
