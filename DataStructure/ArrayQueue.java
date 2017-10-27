package DataStructure;

import MyInterfaces.IQueue;

public class ArrayQueue implements IQueue{
	public static final int CAPACITY = 1000;	// default value of capacity
	
	private int[] data;		// data array used for storage
	private int frontIndex;	// index of the front element
	private int size;		// current number of elements
	
	/*
	 * Constructs queue with default capacity
	 */
	public ArrayQueue() { this(CAPACITY); }
	
	/*
	 * Constructs queue with given capacity
	 */
	public ArrayQueue(int capacity) { data = new int[capacity]; }
	
	// Access methods
	public int[] getData() { return data; } // Use for test
	public int size() { return size; }
	public boolean isEmpty() { return (size == 0); }
	public int first() {
		if (isEmpty()) return 0;
		return data[frontIndex];
	}
	
	// Update methods
	public void enqueue (int element) throws IllegalStateException {
		if (size == data.length) throw new IllegalStateException("Queue is full");
		int availIndex = (frontIndex + size) % data.length;
		data[availIndex] = element;
		size ++;
	}
	
	public int dequeue() {
		if (isEmpty()) return 0;
		int result = data[frontIndex];
		data[frontIndex] = 0;
		frontIndex = (frontIndex + 1) % data.length;
		size --;
		return result;
	}
}
