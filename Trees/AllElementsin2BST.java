class Solution {
    List<Integer> nums1=new ArrayList<>();
    List<Integer> nums2=new ArrayList<>();
    private void getAll1(TreeNode root1){
        if(root1==null) return;
        getAll1(root1.left);
        nums1.add(root1.val);
        getAll1(root1.right);
    }
    private void getAll2(TreeNode root2){
        if(root2==null) return;
        getAll2(root2.left);
        nums2.add(root2.val);
        getAll2(root2.right);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        getAll1(root1);
        getAll2(root2);
        int n1=nums1.size();int n2=nums2.size();
        int i=0;int j=0;
        List<Integer> ans=new ArrayList<>();
        while(i<n1 && j<n2){
            if(nums1.get(i)<=nums2.get(j)){
                ans.add(nums1.get(i));
                i++;
            }
            else{
                ans.add(nums2.get(j));
                j++;
            }
        }
        while(i<n1){
            ans.add(nums1.get(i));
            i++;
        }
        while(j<n2){
            ans.add(nums2.get(j));
            j++;
        }
        return ans;
    }
}
