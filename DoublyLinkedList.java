
public class DoublyLinkedList {
	private DoubledNode header;		// header sentinel
	private DoubledNode trailer;	// trailer sentinel
	private int size = 0;			// number of elements in the list
	
	/*
	 * Constructs a new empty list
	 */
	public DoublyLinkedList() {
		header = new DoubledNode(0, null, null);
		trailer = new DoubledNode(0, header, null);
		header.setNext(trailer);
	}
	
	public DoublyLinkedList(int[] array) {
		header = new DoubledNode(0, null, null);
		trailer = new DoubledNode(0, header, null);
		header.setNext(trailer);
		
		for (int i = 0; i < array.length; i++) {
			this.addLast(array[i]);
		}
	}
	
	// access methods
	public int getSize() { return size; }
	public boolean isEmpty() { return getSize() == 0; }
	public int first() {
		if (isEmpty()) return 0;
		return header.getNext().getElement();
	}
	public int last() {
		if (isEmpty()) return 0;
		return trailer.getPrev().getElement();
	}
	
	// public update methods
	public void addFirst(int e) {
		addBetween(e, header, header.getNext());
	}
	public void addLast(int e) {
		addBetween(e, trailer.getPrev(), trailer);
	}
	
	public int removeFirst() {
		if (isEmpty()) return 0;
		return remove(header.getNext());
	}
	public int removeLast() {
		if (isEmpty()) return 0;
		return remove(trailer.getPrev());
	}
	
	public int[] listToArray() {
		int[] array = new int[getSize()];
		DoubledNode trackingNode = header.getNext();
		
		for (int i = 0; i < getSize(); i++) {
			array[i] = trackingNode.getElement();
			trackingNode = trackingNode.getNext();
		}
		
		return array;
	}
	
	// private update methods
	private void addBetween(int e, DoubledNode p, DoubledNode n) {
		DoubledNode newNode = new DoubledNode(e, p, n);
		p.setNext(newNode);
		n.setPrev(newNode);
		size ++;
	}
	
	private int remove(DoubledNode node) {
		DoubledNode prev = node.getPrev();
		DoubledNode next = node.getNext();
		prev.setNext(next);
		next.setPrev(prev);
		size --;
		return node.getElement();
	}
}
