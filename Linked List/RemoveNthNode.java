class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr=head;
        int last=1;
        while(curr.next!=null){
            curr=curr.next;
            last++;
        }
        if(last==1){
            head=null;
            return head;
        }
        int del=last-n;
        if(del==0){
            head=head.next;
            return head;
        }
        curr=head;
        ListNode prev=head;
        for(int i=0;i<del;i++){
            prev=curr;
            curr=curr.next;
        }
        prev.next=curr.next;
        curr.next=null;
        return head;
    }
}
