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
    public void reorderList(ListNode head) {
        ListNode sp= head;
        ListNode fp=head;
        while(fp!=null && fp.next!=null){
            sp=sp.next;
            fp=fp.next.next;
        }
        ListNode curr= sp.next;
        sp.next=null;
        ListNode prev=null;
        while(curr!=null){
            ListNode next= curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode l1 =head;
        ListNode l2= prev;;
        while( l2!=null){
            ListNode temp1=l1.next;
            ListNode temp2=l2.next;

            l1.next=l2;
            l2.next=temp1;
            
            l1=temp1;
            l2=temp2;

        }
    }
}
