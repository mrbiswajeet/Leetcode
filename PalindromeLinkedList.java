class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next; 
        }
        
        slow = reversed(slow);
        fast=head;
        
        while(slow != null){
            if(slow.val != fast.val){
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }
    public ListNode reversed(ListNode slow){
        ListNode prev = null;
        
        while(slow != null){
            ListNode nex = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nex;
        }
        return prev;   
    }
}
