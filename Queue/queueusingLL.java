public class Queue {
	
	Node head=null;
    Node tail=null;
    int size;


	public Queue() {
		//Implement the Constructor
        size=0;
	}
	


	/*----------------- Public Functions of Stack -----------------*/


	public int getSize() { 
		//Implement the getSize() function
        return size;
    }


    public boolean isEmpty() { 
    	return size==0;
    }


    public void enqueue(int data) {
    	//Implement the enqueue(element) function
        Node n=new Node(data);
        if (head==null){
            head=n;
            tail=n;
        }
        else{
            tail.next=n;
            tail=tail.next;
        }
        size++;
    }


    public int dequeue() {
        if (size==0){
            return -1;
        }
        int data=head.data;
        head=head.next;
        size--;
    	return data;
    }


    public int front() {
    	//Implement the front() function
        if (size==0){
            return -1;
        }
        return head.data;
    }
}
