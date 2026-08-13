class BSTIterator {
    Stack<TreeNode> s=new Stack<>();

    private void storeLeftMost(TreeNode root){
        while(root!=null){
            s.push(root);
            root=root.left;
        }
    }

    public BSTIterator(TreeNode root) {
        storeLeftMost(root);
    }
    
    public int next() {
        TreeNode curr=s.pop();
        storeLeftMost(curr.right);
        return curr.val;
    }
    
    public boolean hasNext() {
        if(!s.isEmpty()) return true;
        return false;
    }
}
