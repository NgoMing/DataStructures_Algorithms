
public class SinglyLinkedList {	
	private Node head = null;		// head node of the list ( or null if empty )
	private Node tail = null;		// last node of the list ( or null if empty )
	private int size = 0;			// number of nodes in the list
	public SinglyLinkedList() {}	// constructs an initially empty list
	
	/*
	 * Constructor Singly Linked List with array param
	 */
	public SinglyLinkedList (int[] array) {
		this.arrayToList(array);
	}
	
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
		Node node = head;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = node.getElement();
			node = node.getNext();
		}
		
		return array;
	}
}
