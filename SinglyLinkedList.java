
public class SinglyLinkedList implements Cloneable{	
	private Node head = null;		// head node of the list ( or null if empty )
	private Node tail = null;		// last node of the list ( or null if empty )
	private int size = 0;			// number of nodes in the list
	public SinglyLinkedList() {}	// constructs an initially empty list
	
	/*
	 * Constructor Singly Linked List with array param
	 */
	public SinglyLinkedList (int[] array) {
		for (int i = 0; i < array.length; i++) {
			this.addLast(array[i]);
		}
	}
	
	// access methods
	public int getSize() { return this.size; }
	public boolean isEmpty() { return getSize() == 0; }
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
	
	@Override
	public SinglyLinkedList clone() throws CloneNotSupportedException {
		SinglyLinkedList cloneList = (SinglyLinkedList)super.clone();
		
		if (getSize() > 0) {
			cloneList.head = new Node(head.getElement(), null);
			Node trackingNode = head.getNext();
			Node cloneListTail = cloneList.head;
			while (trackingNode != null) {
				Node newNode = new Node(trackingNode.getElement(), null);
				cloneListTail.setNext(newNode);
				cloneListTail = newNode;
				trackingNode = trackingNode.getNext();
			}
		}
		
		return cloneList;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null) return false;
		if (this.getClass() != o.getClass()) return false;
		
		SinglyLinkedList other = (SinglyLinkedList)o;
		if (this.getSize() != other.getSize()) return false;
		
		Node thisTrackingNode = this.head;
		Node otherTrackingNode = other.head;
		
		while(thisTrackingNode != null) {
			if (!(thisTrackingNode.getElement() == otherTrackingNode.getElement())) return false;
			thisTrackingNode = thisTrackingNode.getNext();
			otherTrackingNode = otherTrackingNode.getNext();
		}
		
		return true;
	}
}
