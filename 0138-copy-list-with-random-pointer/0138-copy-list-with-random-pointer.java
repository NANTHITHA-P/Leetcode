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
        while(cur!=null){//creating a copy of a original node with its next part nearer to the original node and making links
            Node copy = new Node(cur.val);
            copy.next = cur.next;
            cur.next = copy;
            cur = copy.next;
        }
        cur = head;
        while(cur!=null){// storing the random part in the copy nodes
            if(cur.random!=null){
                cur.next.random = cur.random.next;// copy.random = orig.random.next
            }
            cur = cur.next.next;// move to next original node
        }
        cur = head;
        Node newHead = head.next;
        Node copyCur = newHead;
        while(cur!=null){// separating original and copy nodes
            cur.next = cur.next.next;//restoring original node
            if(copyCur.next!=null){//separating copy nodes 
                copyCur.next = copyCur.next.next;
            }//if copy node's next is not null means copy node's next part will store the address of next copy node whose address is in copycur's next's next 
            // suppose if it is null means it will store null that is is in copyCur's next part (you will get a doubt so dry run )
            cur = cur.next;
            copyCur = copyCur.next;
        }
        return newHead;
    }
}