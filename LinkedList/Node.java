public class Node {
    Object ele;
    Node next;
    Node prev;

    Node(Object ele) {
        this.ele = ele;
    }

    Node(Object ele, Node next) {
        this.ele = ele;
        this.next = next;
    }
    Node(Object ele, Node next, Node prev) {
        this(ele, next);
        this.prev = prev;
    }
}
