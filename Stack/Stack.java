import java.util.ArrayList;

public class Stack {
    ArrayList<Object> list = new ArrayList<>();
    int top = -1;

    // Size
    public int size() {
        return top+1;
    }
    // isEmpty
    public boolean isEmpty() {
        return top==-1;
    }

    //push 
    public void push(Object ele) {
        list.add(ele);
        top++;
    }
    //pop
    public Object pop(){
        if(isEmpty()) throw new RuntimeException("Stack is Empty");
        Object val = list.remove(top);
        top--;
        return val;
    }
    //peek
    public Object peek() {
        if(isEmpty()) throw new RuntimeException("Stack is Empty");
        return list.get(top);
    }
}
