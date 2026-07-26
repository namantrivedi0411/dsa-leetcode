class Solution {
    public int pairSum(ListNode head) {
        Stack<Integer> s=new Stack<>();
        int max=0;
        ListNode curr=head;
        while(curr!=null){
            s.push(curr.val);
            curr=curr.next;
        }
        curr=head;
        while(curr!=null && !s.isEmpty()){
            int sum=curr.val+s.pop();
            max=Math.max(max,sum);
            curr=curr.next;
        }
        return max;
    }
}
