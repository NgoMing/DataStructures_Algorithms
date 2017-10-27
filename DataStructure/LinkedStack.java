package DataStructure;

public class LinkedStack {
	private SinglyLinkedList list = new SinglyLinkedList();
	public LinkedStack() { }
	
	// access methods
	public int size() { return list.getSize(); }
	public boolean isEmpty() { return list.isEmpty(); }
	public int top() { return list.first(); }
	
	// update methods
	public void push(int element) { list.addFirst(element); }
	public int pop() { return list.removeFirst(); }
}
