/*
Structure of Linked List Node we have used.

class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;
	
	public LinkedListNode(T data) {
		this.data = data;
		this.next = null;
	}
}*/

public class Solution {

	public static void deleteNode(LinkedListNode<Integer> node) {
		//Your code goes here
        // LinkedListNode<Integer> tmp;
        node.data=node.next.data;
        node.next=node.next.next;
	}
}
