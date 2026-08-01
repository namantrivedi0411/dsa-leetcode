class Solution {
    int i=0;
    private TreeNode buildTree(String t,int d,int n){
        if(i>n) return null;
        int j=i;
        while(j<n && t.charAt(j)=='-'){
            j++;
        }
        int dash=j-i;
        if(d!=dash){
            return null;
        }
        i=j;
        int num=0;
        while(i<n && (t.charAt(i)>=48 && t.charAt(i)<=57)){
            num=(num*10)+(t.charAt(i)-'0');
            i++;
        }
        TreeNode node=new TreeNode(num);
        node.left=buildTree(t,d+1,n);
        node.right=buildTree(t,d+1,n);
        return node;
    }
    public TreeNode recoverFromPreorder(String traversal) {
        int d=0;
        int n=traversal.length();
        return buildTree(traversal,d,n);
    }
}
