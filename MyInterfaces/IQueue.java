package MyInterfaces;

public interface IQueue {
	/*
	 * Returns the number of the elements in the queue
	 */
	int size();
	
	/*
	 * Tests whether the queue is empty
	 */
	boolean isEmpty();
	
	/*
	 * Inserts an element at the rear of the queue
	 */
	void enqueue(int element);
	
	/*
	 * Returns but not remove the first element of the queue (0 if empty)
	 */
	int first();
	
	/*
	 * Removes and returns the first element of the queue (0 if empty)
	 */
	int dequeue();
}
