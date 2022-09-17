class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode temp = new ListNode(0);
        ListNode l3 = temp;
        int carry = 0;
        while(l1 !=null || l2 != null){
            int l1_vals = (l1 != null) ? l1.val : 0;
            int l2_vals  = (l2 != null) ? l2.val : 0;
            
            int sum = l1_vals + l2_vals + carry;
            carry = sum/10;
            int last_digit = sum%10;
            
            ListNode newNode = new ListNode(last_digit);
            l3.next = newNode;
            
            
            if(l1 != null) l1 = l1.next;
            if(l2 != null ) l2 = l2.next;
            l3 = l3.next;
        }
        if(carry>0){
            ListNode newNod = new ListNode(carry);
            l3.next = newNod;
            l3 = l3.next;
        }
        return temp.next;
    }
    
}