package DataStructure;

public class Node {
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
