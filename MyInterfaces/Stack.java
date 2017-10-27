package MyInterfaces;

public interface Stack {
	/*
	 * Returns the number of elements in the stack.
	 * @return number of elements in the stacks
	 */
	int size();
	
	/*
	 * Tests whether the stack is empty
	 * @return true if the stack is empty, false otherwise
	 */
	boolean isEmpty();
	
	/*
	 * Inserts an element at the top of the stack.
	 * @param element	the element to be inserted
	 */
	void push(int element);
	
	/*
	 * Returns, but does not remove, the element at the top of the stack.
	 * @return top element in the stack ( or null if empty)
	 */
	int top();
	
	/*
	 * Removes and returns the top element from the stack.
	 * @return element removed ( or null if empty)
	 */
	int pop();
}
