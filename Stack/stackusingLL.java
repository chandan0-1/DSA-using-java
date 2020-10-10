public class Stack {

    int size;
    Node head;

    public Stack() {
        size=0;
        head=null;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        return size;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public void push(int element) {
        Node n=new Node(element);
        size++;
        n.next=head;
        head=n;
    }

    public int pop() {
        if (size==0){
            return -1;
        }
        int data=head.data;
        head=head.next;
        size--;
        return data;
    }

    public int top() {
        if (size==0){
            return -1;
        }
        return head.data;
    }
}
