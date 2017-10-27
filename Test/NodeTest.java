package Test;
import static org.junit.Assert.*;

import org.junit.Test;

import DataStructure.Node;

public class NodeTest {
	
	@Test
	public void shouldContructUsingValidParameters() {
		Node myNode = new Node(12, null);
		assertEquals(12,  myNode.getElement());
		assertEquals(null, myNode.getNext());
		
		myNode = new Node(Integer.MAX_VALUE, null);
		assertEquals(Integer.MAX_VALUE, myNode.getElement());
		assertEquals(null, myNode.getNext());
		
		myNode = new Node(Integer.MIN_VALUE, null);
		assertEquals(Integer.MIN_VALUE, myNode.getElement());
		assertEquals(null, myNode.getNext());
		
		Node newNode = new Node(0, myNode);
		assertEquals(0, newNode.getElement());
		assertEquals(myNode, newNode.getNext());
	}
	
	@Test
	public void shouldSetNextCorrectly() {
		Node myNode = new Node (12, null);
		Node newNode = new Node (10, null);
		
		myNode.setNext(newNode);
		assertEquals(newNode, myNode.getNext());
	}

}
