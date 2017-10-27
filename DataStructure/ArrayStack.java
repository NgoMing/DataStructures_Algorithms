package DataStructure;

import MyInterfaces.Stack;

public class ArrayStack implements Stack{
	public static final int CAPACITY = 1000;	// default array capacity
	private int[] data;							// data used for storage
	private int topIndex = -1;					// index of the top element in stack
	
	/*
	 * Constructs stack with default capacity
	 */
	public ArrayStack() { this(CAPACITY); }
	
	/*
	 * Constructs stack with given capacity 
	 */
	public ArrayStack(int capacity) {
		data = new int[capacity];
	}
	
	// Access methods
	public int[] getData() { return data; } // Use for test
	public int size() { return (topIndex + 1); }
	public boolean isEmpty() { return (topIndex == -1); }
	public int top() {
		if (isEmpty()) return 0;
		return data[topIndex];
	}
	
	// Update methods
	public void push(int element) throws IllegalStateException {
		if (size() == data.length) 
			throw new IllegalStateException("Stack is full");
		data[++topIndex] = element;
	}
	
	public int pop() {
		if (isEmpty()) return 0;
		int result = data[topIndex];
		data[topIndex] = 0;
		topIndex--;
		return result;				
	}
}
