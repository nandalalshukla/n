/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
         if(head==null) return head;

          ListNode rhead = reverse(head);
          if(n==1){
            rhead=rhead.next;
            return reverse(rhead);
          }
          ListNode curr = rhead;
          int i=1;
          while(i<n-1){
            curr=curr.next;
            i++;
          }
          if(curr!=null && curr.next!=null){
              curr.next=curr.next.next;
          }
          
          return reverse(rhead);

    }
    private ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
