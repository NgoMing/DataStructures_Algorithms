
public class SinglyLinkedList {
	// nested Node class
	private static class Node {
		private int element;	// reference to the element stored at this node
		private Node next;		// reference to the subsequent node in the list
		
		public Node(int element, Node next) {
			this.element = element;
			this.next = next;
		}
		
		// access and update methods
		public int getElement() { return element; }
		public Node getNext() { return next; }
		public void setNext(Node next) { this.next = next; }
	}
	// end of nested Node class
	
	private Node head = null;		// head node of the list ( or null if empty )
	private Node tail = null;		// last node of the list ( or null if empty )
	private int size = 0;			// number of nodes in the list
	public SinglyLinkedList() {}	// constructs an initially empty list
	
	// access methods
	public int size() { return this.size; }
	public boolean isEmpty() { return this.size == 0; }
	public int first() {
		if (isEmpty()) return 0;
		return head.getElement();
	}
	public int last() {
		if (isEmpty()) return 0;
		return tail.getElement();
	}
	
	// update methods
	/*
	 * add element to the front of the list
	 */
	public void addFirst(int element) {
		this.head = new Node(element, this.head);
		if (isEmpty())
			this.tail = this.head;
		size ++;
	}
	/*
	 * add element to the end of the list
	 */
	public void addLast(int element) {
		Node newNode = new Node(element, null);
		if (isEmpty())
			this.head = newNode;
		else
			this.tail.setNext(newNode);
		this.tail = newNode;
		size ++;
	}
	/*
	 * remove and return the first element
	 * @return 0 if the list is empty
	 */
	public int removeFirst() {
		if (isEmpty()) return 0;
		
		int firstElement = this.head.getElement();
		this.head = this.head.getNext();
		size --;
		
		if (isEmpty())
			this.tail = null;
		
		return firstElement;
	}
	
	public static void main (String[] args) {
		System.out.println("Singly Linked List class");
	}
	
}
