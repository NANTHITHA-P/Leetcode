/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return head;
        }
        Node cur = head;
        while(cur!=null){
            Node copy = new Node(cur.val);
            copy.next = cur.next;
            cur.next = copy;
            cur = copy.next;
        }
        cur = head;
        while(cur!=null){
            if(cur.random!=null){
                cur.next.random = cur.random.next;
            }
            cur = cur.next.next;
        }
        cur = head;
        Node newHead = head.next;
        Node copyCur = newHead;
        while(cur!=null){
            cur.next = cur.next.next;
            if(copyCur.next!=null){
                copyCur.next = copyCur.next.next;
            }
            cur = cur.next;
            copyCur = copyCur.next;
        }
        return newHead;
    }
}