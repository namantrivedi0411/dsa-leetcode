class Solution {
    private TreeNode construct(int[] arr,int lb,int ub){
        if(lb>ub) return null;
        if(lb==ub) return new TreeNode(arr[lb]);
        int idx=findMax(arr,lb,ub);
        TreeNode root=new TreeNode(arr[idx]);
        root.left=construct(arr,lb,idx-1);
        root.right=construct(arr,idx+1,ub);
        return root;
    }
    private int findMax(int[] arr,int lb,int ub){
        int max=lb;
        for(int i=lb+1;i<=ub;i++){
            if(arr[i]>arr[max]) max=i;
        }
        return max;
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums,0,nums.length-1);
    }
}
