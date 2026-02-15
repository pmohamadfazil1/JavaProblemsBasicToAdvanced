public class LinkedList {
    int count = 0;
    Node head;
    Node tail;

    LinkedList() {
        this.count = 0;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }
    //adding element in the beginning
    public void insert(Object ele) {
        Node n = new Node(ele);
        if(head==null) {
            head = tail = n;
        } else {
            n.next = head;
            head = n;
        }
        count++;
    }
    // adding element at the end
    public void add(Object ele) {
        Node n = new Node(ele);
        if(head==null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
        count++;
        
    }
    // Adding element at an index
    public void insertAt(Object ele, int index) {
        if(index <0||index>count) throw new RuntimeException("Index out of Bounds");
        if(index==0) {
            insert(ele);
            return;
        }
        if(index==count) {
            add(ele);
            return;
        }
        Node curr = head;
        for(int i = 0; i < index-1; i++) {
            curr = curr.next;
        }
        Node n = new Node(ele);
        n.next = curr.next;
        curr.next = n;
        count++;
    }
    // Remove at index 
    public void remove(int index) {
        if(index<0||index>=count) {
            throw new RuntimeException("Index out of Bounds");
        }
        if(index == 0) {
            remove();
            return;
        }
        if(index == count-1) {
            delete();
            return;
        }
        Node curr = head;
        for(int i = 0; i < index-1; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        count--;
    }
    // Remove element at the beginning 
    public void remove() {
        if(isEmpty()) throw new RuntimeException("List is Empty");
        if(head.next == null) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
        count--;
    }
    // Removing element at the end
    public void delete(){
        if(isEmpty()) throw new RuntimeException("Empty List");
        if(head.next == null) {
            head = null;
            tail = null;
            count--;
            return;
        }
        Node curr = head;
        while(curr.next.next!=null) {
            curr = curr.next;
        }
        tail = curr;
        curr.next = null;
        count--;
    }
    //display list
    public void display() {
        Node curr = head;
        while(curr!=null) {
            System.out.print(curr.ele + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    //Search element and return index
    public int search(Object ele) {
        if(isEmpty()) return -1;
        Node curr = head;
        int i = 0;
        while(curr != null) {
            if(curr.ele.equals(ele)) {
                return i;
            }
            i++;
            curr = curr.next;
        }
        return -1;
    }
    // Reversing the list
    public void reverse() {
        if(isEmpty()) return;
        tail = head;
        Node prev = null;
        Node curr = head;
        while(curr!=null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
}
