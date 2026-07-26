class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        List<Integer> list=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            list.add(curr.val);
            curr=curr.next;
        }
        int n=list.size();
        int temp=list.get(k-1);
        list.set(k-1,list.get(n-k));
        list.set(n-k,temp);
        curr=head;
        for(int i=0;i<list.size();i++){
            if(i==k-1){
                curr.val=list.get(i);
                curr=curr.next;
            }
            else if(i==n-k){
                curr.val=list.get(i);
                curr=curr.next;
            }
            else curr=curr.next;
        }
        return head;
    }
}
