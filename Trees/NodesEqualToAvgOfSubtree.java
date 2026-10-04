class Solution {
    int count=0;int sum=0;int size=0;
    private int avg(TreeNode root){
        if(root==null) return 0;
        sum+=root.val;
        size++;
        avg(root.left);
        avg(root.right);
        return sum/size;
    }
    public int averageOfSubtree(TreeNode root) {
        if(root==null) return 0;
        averageOfSubtree(root.left);
        if(avg(root)==root.val) count++;
        sum=0;size=0;
        averageOfSubtree(root.right);
        return count;
    }
}
