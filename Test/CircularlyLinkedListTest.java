package Test;
import static org.junit.Assert.*;

import org.junit.Test;

import DataStructure.CircularlyLinkedList;

public class CircularlyLinkedListTest {

	@Test
	public void shouldConstuctUsingArray() {
		int[] array = new int[]{1, 2, 3};
		CircularlyLinkedList myList = new CircularlyLinkedList(array);
		assertArrayEquals(array, myList.listToArray());
		
		array = new int[3];
		myList = new CircularlyLinkedList(array);
		assertArrayEquals(array, myList.listToArray());		
	}
	
	@Test
	public void shouldReturnSizeCorrectly() {
		CircularlyLinkedList myList = new CircularlyLinkedList();
		assertEquals(0,  myList.size());
		assertTrue(myList.isEmpty());
		
		int[] array = new int[]{1, 2, 3};
		myList = new CircularlyLinkedList(array);
		assertEquals(array.length, myList.size());
	}
	
	@Test
	public void shouldAddFirstCorrectly() {
		CircularlyLinkedList myList = new CircularlyLinkedList();
		myList.addFirst(12);
		assertEquals(12, myList.first());
		assertEquals(12, myList.last());
		
		myList.addFirst(10);
		assertEquals(10, myList.first());
		assertEquals(12, myList.last());
	}
	
	@Test
	public void shouldAddLastCorrectly() {
		CircularlyLinkedList myList = new CircularlyLinkedList();
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
		CircularlyLinkedList sList = new CircularlyLinkedList(array);
		
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
	public void shouldRotateCorrectly() {
		CircularlyLinkedList sList = new CircularlyLinkedList(new int[]{1, 2, 3, 4, 5});
		
		assertArrayEquals(new int[]{1, 2, 3, 4, 5}, sList.rotate(0).listToArray());
		assertArrayEquals(new int[]{3, 4, 5, 1, 2}, sList.rotate(2).listToArray());
		assertArrayEquals(new int[]{2, 3, 4, 5, 1}, sList.rotate(-1).listToArray());
		assertArrayEquals(new int[]{5, 1, 2, 3, 4}, sList.rotate(13).listToArray());
		
		sList = new CircularlyLinkedList(new int[]{});
		assertArrayEquals(new int[]{}, sList.rotate(0).listToArray());
		assertArrayEquals(new int[]{}, sList.rotate(5).listToArray());
		assertArrayEquals(new int[]{}, sList.rotate(-5).listToArray());
	}
}
