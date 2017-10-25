import MyInterfaces.Rotateable;

public class CircularlyArray implements Rotateable<CircularlyArray> {
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
	 * positive modulo
	 */
	public int positiveModulos(int a, int b) {
		if (b == 0)
			throw new ArithmeticException();
		
		if (b < 0) {
			a = -a;
			b = -b;
		}
		return (((a % b) + b) % b);
	}
	
	/*
	 * Rotate the Array in left direction using temp array
	 * Time complexity O(size)
	 * Auxiliary space O(numOfStep)
	 * @param numOfStep: the number of elements will be shifted, 
	 * 					   negative for left rotation,
	 * 					   positive for right rotation 
	 */
	@Override
	public CircularlyArray rotate(int numOfStep) {
	    int[] temArray = this.elements.clone();
	    for (int i = 0; i < this.getSize(); i++) {
	    	this.elements[positiveModulos(i + numOfStep, this.getSize())] = temArray[i];
	    }
	    
	    return this;
	}
}
