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
    public ListNode rotateRight(ListNode head, int k) {
      if(head==null||head.next==null||k==0) return head;
       int len=0;
       ListNode temp=head,l2;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
       while(k>=len){
        k-=len;
       }
       if(k==0) return head;
       temp=head;
       for(int i=0;i<(len-k-1);i++){
         temp=temp.next;
       }
       
       l2=temp.next;
       temp.next=null;
       ListNode l3 = l2;
       while(l3.next!=null){
        
        l3=l3.next;
       }
       l3.next=head;
       return l2;
    }
}