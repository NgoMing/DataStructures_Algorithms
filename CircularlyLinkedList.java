import MyInterfaces.Rotateable;

public class CircularlyLinkedList implements Rotateable<CircularlyLinkedList> {
	private Node tail = null;	// last node of the list
	private int size = 0;		// number of nodes in the list
	public CircularlyLinkedList() {}	// constructs an initially empty list
	
	/*
	 * Constructor Singly Linked List with array param
	 */
	public CircularlyLinkedList (int[] array) {
		this.arrayToList(array);
	}
	
	// access methods
	public int size() { return this.size; }
	public boolean isEmpty() { return this.size == 0; }
	public int first() {
		if (isEmpty()) return 0;
		return tail.getNext().getElement();
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
		if (isEmpty()) {
			tail = new Node(element, null);
			tail.setNext(tail);
		}
		else {
			Node newNode = new Node(element, tail.getNext());
			tail.setNext(newNode);
		}
		size ++;
	}
	/*
	 * add element to the end of the list
	 */
	public void addLast(int element) {
		addFirst(element);
		tail = tail.getNext();
	}
	/*
	 * remove and return the first element
	 * @return 0 if the list is empty
	 */
	public int removeFirst() {
		if (isEmpty()) return 0;
		
		Node head = tail.getNext();
		if (head == tail)
			tail = null;
		else
			tail.setNext(head.getNext());
		size --;
		return head.getElement();
	}
	
	/*
	 * convert array to Singly Linked List
	 */
	public void arrayToList (int[] array) {
		while (!isEmpty()) {
			this.removeFirst();
		}
		
		for (int i = 0; i < array.length; i++) {
			this.addLast(array[i]);
		}
	}
	
	/*
	 * convert Singly Linked List to array
	 */
	public int[] listToArray() {
		int[] array = new int[this.size];
		Node node = tail.getNext();
		
		for (int i = 0; i < array.length; i++) {
			array[i] = node.getElement();
			node = node.getNext();
		}
		
		return array;
	}
	
	public CircularlyLinkedList rotate(int numOfStep) {
		if (this.tail != null) {
			for (int i = 0; i < numOfStep; i++)
				this.tail = this.tail.getNext();
		}
		return this;
	}
}
