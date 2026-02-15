public class StackLL {
    Node head;
    int count = 0;

    public int size() {
        return count;
    }
    public boolean isEmpty() {
        return count==0;
    }

    public void push(Object ele) {
        Node n = new Node(ele);
        n.next = head;
        head = n;
        count++;
    }
    public Object pop() {
        if(isEmpty()) throw new RuntimeException("Stack is Empty");
        Object val = head.ele;
        head = head.next;
        count--;
        return val;
    }
    public Object peek() {
        if(isEmpty()) throw new RuntimeException("Stack is Empty");
        return head.ele;
    }
}
