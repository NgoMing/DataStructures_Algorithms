package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import DataStructure.ArrayStack;

public class ArrayStackTest {

	@Test
	public void shouldConstructUsingGivenCapacity() {
		assertArrayEquals(new int[3], new ArrayStack(3).getData());
	}
	
	@Test
	public void shouldConstructUsingDefaultCapacity() {
		assertArrayEquals(new int[ArrayStack.CAPACITY], new ArrayStack().getData());
	}
	
	@Test 
	public void shouldGetSizeCorrectly() {
		ArrayStack myArray = new ArrayStack(3);
		assertEquals(0, myArray.size());
		assertTrue(myArray.isEmpty());
		
		myArray.push(1);
		assertEquals(1, myArray.size());
		assertFalse(myArray.isEmpty());
	}
	
	@Test
	public void shouldPushPopCorrectly() {
		ArrayStack myArray = new ArrayStack(5);
		myArray.push(1);
		assertEquals(1, myArray.top());
		
		myArray.push(-2);
		assertEquals(-2, myArray.top());
		
		assertEquals(-2, myArray.pop());
		assertEquals(1, myArray.pop());
		assertEquals(0, myArray.pop());
	}
	@Test (expected = IllegalStateException.class)
	public void shouldThrowIllegalStateExceptionWhenPushOverCapacity() {
		ArrayStack myArray = new ArrayStack(2);
		myArray.push(1);
		myArray.push(2);
		myArray.push(3);
	}
}
