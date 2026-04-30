/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null) return head;
        Stack<Node> st = new Stack<>();
        Node temp = head;
        while(temp!=null){//node met is not last node
          if(temp.child!=null){
            if(temp.next!=null){
                st.push(temp.next);
            }
          temp.next=temp.child;
          temp.child.prev=temp;
          temp.child=null;
          }
          if(temp.next==null && !st.isEmpty()){
            Node t1 = st.pop();
            temp.next=t1;
            t1.prev=temp;
          }
          temp=temp.next;
        }
        return head;
    }
}