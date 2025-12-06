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
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode temp = new ListNode(head.val);
        head=head.next;
        while(head!=null){
            ListNode new_node = new ListNode(head.val);
            new_node.next=temp;
            temp=new_node;
            head=head.next;
        }
        return temp;
    }
}