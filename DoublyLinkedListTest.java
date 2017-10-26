import static org.junit.Assert.*;

import org.junit.Test;

public class DoublyLinkedListTest {

	@Test
	public void shouldConstuctUsingArray() {
		int[] array = new int[]{1, 2, 3};
		DoublyLinkedList myList = new DoublyLinkedList(array);
		assertArrayEquals(array, myList.listToArray());
		
		array = new int[3];
		myList = new DoublyLinkedList(array);
		assertArrayEquals(array, myList.listToArray());		
	}
	
	@Test
	public void shouldReturnSizeCorrectly() {
		DoublyLinkedList myList = new DoublyLinkedList();
		assertEquals(0,  myList.getSize());
		assertTrue(myList.isEmpty());
		
		int[] array = new int[]{1, 2, 3};
		myList = new DoublyLinkedList(array);
		assertEquals(array.length, myList.getSize());
	}
	
	@Test
	public void shouldAddFirstCorrectly() {
		DoublyLinkedList myList = new DoublyLinkedList();
		myList.addFirst(12);
		assertEquals(12, myList.first());
		assertEquals(12, myList.last());
		
		myList.addFirst(10);
		assertEquals(10, myList.first());
		assertEquals(12, myList.last());
	}
	
	@Test
	public void shouldAddLastCorrectly() {
		DoublyLinkedList myList = new DoublyLinkedList();
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
		DoublyLinkedList sList = new DoublyLinkedList(array);
		
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
	public void shouldRemoveLastCorrectly () {
		int[] array = new int[]{2, 3, 4};
		DoublyLinkedList sList = new DoublyLinkedList(array);
		
		array = new int[]{2, 3};
		assertEquals(4, sList.removeLast());
		assertArrayEquals(array, sList.listToArray());
		
		array = new int[]{2};
		assertEquals(3, sList.removeLast());
		assertArrayEquals(array, sList.listToArray());
		
		array = new int[]{};
		assertEquals(2, sList.removeLast());
		assertArrayEquals(array, sList.listToArray());
	
		assertEquals(0, sList.removeLast());
	}
}
