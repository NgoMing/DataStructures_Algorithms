package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import DataStructure.ArrayQueue;

public class ArrayQueueTest {

	@Test
	public void shouldConstructUsingGivenCapacity() {
		assertArrayEquals(new int[3], new ArrayQueue(3).getData());
	}
	
	@Test
	public void shouldConstructUsingDefaultCapacity() {
		assertArrayEquals(new int[ArrayQueue.CAPACITY], new ArrayQueue().getData());
	}
	
	@Test 
	public void shouldGetSizeCorrectly() {
		ArrayQueue myArray = new ArrayQueue(3);
		assertEquals(0, myArray.size());
		assertTrue(myArray.isEmpty());
		
		myArray.enqueue(1);
		assertEquals(1, myArray.size());
		assertFalse(myArray.isEmpty());
	}
	
	@Test
	public void shouldEnqueueDequeueCorrectly() {
		ArrayQueue myArray = new ArrayQueue(5);
		myArray.enqueue(1);
		assertEquals(1, myArray.first());
		
		myArray.enqueue(-2);
		assertEquals(1, myArray.first());
		
		assertEquals(1, myArray.dequeue());
		assertEquals(-2, myArray.dequeue());
		assertEquals(0, myArray.dequeue());
	}
	@Test (expected = IllegalStateException.class)
	public void shouldThrowIllegalStateExceptionWhenPushOverCapacity() {
		ArrayQueue myArray = new ArrayQueue(2);
		myArray.enqueue(1);
		myArray.enqueue(2);
		myArray.enqueue(3);
	}
}
