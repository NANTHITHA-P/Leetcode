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
        if(head == null || head.next == null){
            return ;
        }
        //Finding the middle node
        ListNode slow = head,fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //Reversing after middle node
        ListNode second = reverse(slow.next);
        slow.next = null;
        ListNode first = head;
        while(second!=null){
            ListNode fn = first.next;
            ListNode sn = second.next;
            first.next = second;
            second.next = fn;
            first = fn;
            second = sn;
        }
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode cur = head;
        while(cur!=null){
            ListNode new_node = cur.next;
            cur.next = prev;
            prev = cur;
            cur = new_node;
        }
        return prev;
    }
}