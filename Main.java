
public class Main {
	public static void main (String[] args) {
		System.out.println("Main class running");
		
		Node myNode = new Node(Integer.MAX_VALUE + 1, null);
		System.out.println(myNode.getElement());
	}
}
