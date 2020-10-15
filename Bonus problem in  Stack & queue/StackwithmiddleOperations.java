public class Stack {

    /********************************

        STRUCTURE OF NODE CLASS

        class Node {
            int data;
            Node next;
            Node prev;
            Node(int data) {
                this.data = data;
                this.next = null;
                this.prev = null;
            }
        }

    *******************************/
    Node head;
    Node tail;
    Node mid;
    int size,temp;
    Stack() {
        head=null;
        tail=null;
        mid=head;
        size=0;
        temp=0;

    }

    public void push(int element) {
        Node n=new Node(element);
        if(head==null){
            head=n;
            mid=head;
        }
        else{
            n.next=head;
            head.prev=n;
            head=n;
        }
        // head=n;
        size+=1;
        temp+=1;
        // if (size==1){
        //     mid=head;
        //     temp=0;
        // }
        if (temp==2){
            mid=mid.prev;
            temp=0;
        }
    }

    public int pop() {
        if (size==0){
            return 0;
        }
        if (size==1){
            int D=head.data;
            head=null;
            mid=null;
            size--;
            return D;
        }
        size-=1;
        int data=head.data;
        head=head.next;
        head.prev=null;
        //         check for temp also
        temp--;
        if(temp == 1){
            mid = mid.next;
        }

        return data;
    }

    public int getmiddle() {
        if (size==0){
            return 0;    }
        if (size%2==0){
            return mid.next.data;
        }
        return mid.data;       
    }

    public int removeMiddle() {
        if (size==0){
            return -1;   
        }
        if (size==1){
            int D=mid.data;
            head=null;
            mid=null;
            size--;
            return D;
            // head=null;
        }
        int M=0;
        if (size%2==0){
            M=mid.next.data;
            mid.next=mid.next.next;
            // mid=mid.next;
        }
        else{
            M=mid.data;
            Node pre=mid.prev;
            pre.next=mid.next;
            mid=mid.prev;
        }
        
        size--;
        return M;

    }

    public void print() {
        // if (head==null){
        //     System.out.print(2609);
        // }
        Node cur=head;
        while (cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        // System.out.println();

    } 
}

