import static org.junit.Assert.*;

import org.junit.Test;

public class SinglyLinkedListTest {

	@Test
	public void shouldConstuctUsingArray() {
		int[] array = new int[]{1, 2, 3};
		SinglyLinkedList myList = new SinglyLinkedList(array);
		assertArrayEquals(array, myList.listToArray());
		
		array = new int[3];
		myList = new SinglyLinkedList(array);
		assertArrayEquals(array, myList.listToArray());		
	}
	
	@Test
	public void shouldReturnSizeCorrectly() {
		SinglyLinkedList myList = new SinglyLinkedList();
		assertEquals(0,  myList.getSize());
		assertTrue(myList.isEmpty());
		
		int[] array = new int[]{1, 2, 3};
		myList = new SinglyLinkedList(array);
		assertEquals(array.length, myList.getSize());
	}
	
	@Test
	public void shouldAddFirstCorrectly() {
		SinglyLinkedList myList = new SinglyLinkedList();
		myList.addFirst(12);
		assertEquals(12, myList.first());
		assertEquals(12, myList.last());
		
		myList.addFirst(10);
		assertEquals(10, myList.first());
		assertEquals(12, myList.last());
	}
	
	@Test
	public void shouldAddLastCorrectly() {
		SinglyLinkedList myList = new SinglyLinkedList();
		myList.addLast(12);
		assertEquals(12, myList.first());
		assertEquals(12, myList.last());
		
		myList.addLast(10);
		assertEquals(12, myList.first());
		assertEquals(10, myList.last());
	}
	
	@Test
	public void shouldRemoveFirstCorrectly () {
		int[] array = new int[]{2, 3, 4};
		SinglyLinkedList sList = new SinglyLinkedList(array);
		
		array = new int[]{3, 4};
		assertEquals(2, sList.removeFirst());
		assertArrayEquals(array, sList.listToArray());
		
		array = new int[]{4};
		assertEquals(3, sList.removeFirst());
		assertArrayEquals(array, sList.listToArray());
		
		array = new int[]{};
		assertEquals(4, sList.removeFirst());
		assertArrayEquals(array, sList.listToArray());
	
		assertEquals(0, sList.removeFirst());
	}
	
	@Test
	public void shouldCloneCorrectly() throws CloneNotSupportedException {
		assertEquals(new SinglyLinkedList(new int[]{1, 2, 3}), new SinglyLinkedList(new int[]{1, 2, 3}).clone());
		assertEquals(new SinglyLinkedList(new int[]{}), new SinglyLinkedList(new int[]{}).clone());
	}
	
	@Test 
	public void shouldEqualsCorrectly() {
		assertEquals(new SinglyLinkedList(new int[]{2, 3, 4}), new SinglyLinkedList(new int[]{2, 3, 4}));
		assertNotEquals(new SinglyLinkedList(new int[]{2, 3}), new SinglyLinkedList(new int[]{2, 3, 4}));
		assertNotEquals(new SinglyLinkedList(new int[]{2, 3, 5}), new SinglyLinkedList(new int[]{2, 3, 4}));
	}
}
