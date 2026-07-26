class Solution {
    public ListNode mergeNodes(ListNode head) {
        head=head.next;
        ListNode temp=new ListNode(0);
        ListNode curr=temp;
        int sum=0;
        while(head!=null){
            if(head.val!=0){
                sum+=head.val;
            }
            else{
                curr.next=new ListNode(sum);
                curr=curr.next;
                sum=0;
            }
            head=head.next;
        }
        return temp.next;
    }
}
