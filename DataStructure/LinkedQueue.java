package DataStructure;

import MyInterfaces.IQueue;

public class LinkedQueue implements IQueue {
	private SinglyLinkedList list = new SinglyLinkedList();	// an empty list
	public LinkedQueue() { }
	
	// access methods
	public int size() { return list.getSize(); }
	public boolean isEmpty() { return list.isEmpty(); }
	public int first() { return list.first(); }
	
	// update methods
	public void enqueue(int element) { list.addLast(element); }
	public int dequeue() { return list.removeFirst(); }
}
