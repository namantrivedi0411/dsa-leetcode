class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr=head;
        while(curr!=null && curr.next!=null){
            int min=Math.min(curr.val,curr.next.val);
            int gcd=1;
            for(int i=min;i>1;i--){
                if(curr.val%i==0 && curr.next.val%i==0){
                    gcd=i;
                    break;
                }
            }
            ListNode mid=new ListNode(gcd);
            mid.next=curr.next;
            curr.next=mid;
            curr=mid.next;
        }
        return head;
    }
}
