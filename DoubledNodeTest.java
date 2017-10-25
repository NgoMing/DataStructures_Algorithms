import static org.junit.Assert.*;

import org.junit.Test;

public class DoubledNodeTest {

	@Test
	public void shouldContructUsingValidParameters() {
		DoubledNode myNode = new DoubledNode(0, null, null);
		assertEquals(0,  myNode.getElement());
		assertEquals(null, myNode.getNext());
		assertEquals(null, myNode.getPrev());
		
		myNode = new DoubledNode(Integer.MAX_VALUE, null, null);
		assertEquals(Integer.MAX_VALUE, myNode.getElement());
		assertEquals(null, myNode.getNext());
		assertEquals(null, myNode.getPrev());
		
		myNode = new DoubledNode(Integer.MIN_VALUE, null, null);
		assertEquals(Integer.MIN_VALUE, myNode.getElement());
		assertEquals(null, myNode.getNext());
		assertEquals(null, myNode.getPrev());
		
		DoubledNode newNode = new DoubledNode(0, myNode, myNode);
		assertEquals(0, newNode.getElement());
		assertEquals(myNode, newNode.getNext());
		assertEquals(myNode, newNode.getPrev());
	}
	
	@Test
	public void shouldSetPrevCorrectly() {
		DoubledNode myNode = new DoubledNode (12, null, null);
		DoubledNode newNode = new DoubledNode (10, null, null);
		
		myNode.setPrev(newNode);
		assertEquals(newNode, myNode.getPrev());
	}
	
	@Test
	public void shouldSetNextCorrectly() {
		DoubledNode myNode = new DoubledNode (12, null, null);
		DoubledNode newNode = new DoubledNode (10, null, null);
		
		myNode.setNext(newNode);
		assertEquals(newNode, myNode.getNext());
	}

}
