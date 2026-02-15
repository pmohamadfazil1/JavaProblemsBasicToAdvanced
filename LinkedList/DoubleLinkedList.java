public class DoubleLinkedList {
    Node head;
    Node tail;
    int count = 0;
    DoubleLinkedList() {
        this.count = 0;
    }
    // Size
    public int size() {
        return count;
    }
    // isEmpty()
    public boolean isEmpty() {
        return count == 0;
    }

    // Add Elements
    public void add(Object ele) {
        Node n = new Node(ele);
        if(head == null) {
            head = n;
            tail = head;
        } else {
            n.prev = tail;
            tail.next = n;
            tail = n;
        }
        count++;
    }
    
    // Display 
    public void display() {
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.ele + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}
