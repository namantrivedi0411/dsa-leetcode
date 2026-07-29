class Solution {
    public ListNode addTwoNumbers(ListNode first, ListNode second) {
        StringBuilder num1=new StringBuilder("");
        StringBuilder num2=new StringBuilder("");
        ListNode curr1=first;ListNode curr2=second;
        while(curr1!=null && curr2!=null){
            num1.append(curr1.val);
            num2.append(curr2.val);
            curr1=curr1.next;curr2=curr2.next;
        }
        while(curr1!=null){
            num1.append(curr1.val);
            curr1=curr1.next;
        }
        while(curr2!=null){
            num2.append(curr2.val);
            curr2=curr2.next;
        }
        int carry=0;
        int i=0;int j=0;
        int sum=0;
        int max=Math.max(num1.length(),num2.length());
        StringBuilder numAdd=new StringBuilder("");
        while(i<num1.length() || j<num2.length()){
            if(i<num1.length() && j<num2.length()){
                sum=(num1.charAt(i)-'0')+(num2.charAt(j)-'0')+carry;
                numAdd.append(sum%10);
                carry=sum/10;
            }
            else if(i<num1.length()){
                sum=(num1.charAt(i)-'0')+carry;
                numAdd.append(sum%10);
                carry=sum/10;
            }
            else if(j<num2.length()){
                sum=(num2.charAt(j)-'0')+carry;
                numAdd.append(sum%10);
                carry=sum/10;
            }
            i++;j++;
        }
        if(carry!=0) numAdd.append(carry);
        ListNode node=new ListNode(numAdd.charAt(0)-'0');
        ListNode temp=node;
        for(int k=1;k<numAdd.length();k++){
            ListNode newNode=new ListNode(numAdd.charAt(k)-'0');
            temp.next=newNode;
            temp=newNode;
        }
        return node;
    }
}
