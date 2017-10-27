package DataStructure;

public class DoubledNode {
	private int element;		// reference to the element stored at this node
	private DoubledNode prev;	// reference to the previous node in the list
	private DoubledNode next; 	// reference to the next node in the list
	
	public DoubledNode(int e, DoubledNode p, DoubledNode n) {
		element = e;
		prev = p;
		next = n;
	}
	
	public int getElement() { return element; }
	public DoubledNode getPrev() { return prev; }
	public DoubledNode getNext() { return next; }
	public void setPrev(DoubledNode p) { prev = p; }
	public void setNext(DoubledNode n) { next = n; }
}
