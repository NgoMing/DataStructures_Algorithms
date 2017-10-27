package DataStructure;
import MyInterfaces.IRotateable;

public class CircularlyArray implements IRotateable<CircularlyArray> {
	int[] elements;
	
	/*
	 * Constructor a new Array instance
	 * @param size: the size of the Array instance
	 */
	public CircularlyArray(int size) {
		elements = new int[size];
	}
	
	/*
	 * Constructs a new Array instance from an array
	 * @param array: is used to clone
	 */
	public CircularlyArray(int[] array) {
		elements = array.clone();
	}
	
	/*
	 * Access methods
	 */
	public int getSize() {
		return elements.length;
	}
	
	public int[] getElements () {
		return elements;
	}
	
	/*
	 * Rotate the Array in left direction using temp array
	 * Time complexity O(size)
	 * Auxiliary space O(numOfStep)
	 * @param numOfStep: the number of elements will be shifted, 
	 * 					   positive for left rotation,
	 * 					   negative for right rotation 
	 */
	@Override
	public CircularlyArray rotate(int numOfStep) {
	    int[] temArray = this.elements.clone();
	    for (int i = 0; i < this.getSize(); i++) {
	    	this.elements[Utils.positiveModulos(i - numOfStep, this.getSize())] = temArray[i];
	    }
	    
	    return this;
	}
}
