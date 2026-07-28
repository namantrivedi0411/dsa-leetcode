class Solution {
    List<Integer> list=new ArrayList<>();
    public void toArray(TreeNode root){
        if(root==null) return;
        toArray(root.left);
        list.add(root.val);
        toArray(root.right);
    }
    public TreeNode buildBST(int[] nums,int start,int end){
        if(start>end) return null;
        int mid=start+(end-start)/2;
        TreeNode node=new TreeNode(nums[mid]);
        node.left=buildBST(nums,start,mid-1);
        node.right=buildBST(nums,mid+1,end);
        return node;
    }
    public TreeNode balanceBST(TreeNode root) {
        toArray(root);
        int[] nums=list.stream().mapToInt(Integer::intValue).toArray();
        return buildBST(nums,0,nums.length-1);
    }
}
