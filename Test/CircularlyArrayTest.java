package Test;
import static org.junit.Assert.*;

import org.junit.Test;

import DataStructure.CircularlyArray;

public class CircularlyArrayTest {

	@Test
	public void shouldConstructUsingValidSize() {
		assertArrayEquals(new int[0], new CircularlyArray(0).getElements());
		assertArrayEquals(new int[3], new CircularlyArray(3).getElements());
	}
	
	@Test (expected = RuntimeException.class)
	public void shouldThrowRuntimeExceptionWhenConstructUsingInvalidSize() {
		new CircularlyArray(-1);
	}
	
	@Test
	public void shouldConstructUsingValidArray() {
		int[] array = new int[]{};
		assertArrayEquals(array, new CircularlyArray(array).getElements());
		
		array = new int[]{0, 0, 0};
		assertArrayEquals(array, new CircularlyArray(array).getElements());
	}
	
	@Test
	public void shouldRotateCorrectly() {
		CircularlyArray myArray = new CircularlyArray(new int[]{1, 2, 3, 4, 5});
		
		assertArrayEquals(new int[]{1, 2, 3, 4, 5}, myArray.rotate(0).getElements());
		assertArrayEquals(new int[]{3, 4, 5, 1, 2}, myArray.rotate(2).getElements());
		assertArrayEquals(new int[]{2, 3, 4, 5, 1}, myArray.rotate(-1).getElements());
		assertArrayEquals(new int[]{5, 1, 2, 3, 4}, myArray.rotate(13).getElements());
		
		myArray = new CircularlyArray(new int[]{});
		assertArrayEquals(new int[]{}, myArray.rotate(0).getElements());
		assertArrayEquals(new int[]{}, myArray.rotate(5).getElements());
		assertArrayEquals(new int[]{}, myArray.rotate(-5).getElements());
	}
}
