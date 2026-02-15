public class Queue {
    Node head;
    Node tail;
    int count = 0;

    public int size() {
        return count;
    }
    public boolean isEmpty() {
        return count == 0;
    }

    // enqueue
    public void enqueue(Object ele) {
        Node n = new Node(ele);
        if(head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
        count++;
    }
    //dequeue
    public Object dequeue() {
        if(isEmpty()) throw new RuntimeException("Queue is Empty");
        Object val = head.ele;
        if(head.next == null) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
        count--;
        return val;
    }
}
