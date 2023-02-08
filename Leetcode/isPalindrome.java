//https://leetcode.com/problems/palindrome-linked-list/
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null)
        {
            return true;
        }
        ListNode mid= middle(head);
        ListNode last=reverse(mid);
        ListNode cur=head;
        while(last!=null){
        if(last.val!=cur.val)
         return false;
        last=last.next;
        cur=cur.next;
        }
        
        return true;
    }
ListNode middle(ListNode head){
    
    
    ListNode slow=head;
    ListNode fast=head;
    while(fast!=null&&fast.next!=null){
         slow=slow.next;
        fast=fast.next.next;
        
           
    }
      return slow;
}
        
       ListNode reverse(ListNode mid){
           ListNode cur= mid;
           ListNode prev=null;
           while(cur!=null){
           ListNode temp=cur.next;
               cur.next=prev;
               prev=cur;
               cur=temp;
           }
               return prev;
           
           
       } 
    
    
    }
    
