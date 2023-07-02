
public class Stack {
	//In this question, you are asked to implement the stack data structure using linked
	//lists.
	
	// Note: Pop should return -1 when the stack is empty.
	

	public Node initialNode;
	
	public Stack() {
		initialNode = null;
	}
	
	
	public void push(int val) {
		if (initialNode == null) {
			initialNode = new Node(val);
			}
		else {
			
			Node current = initialNode;
			while(current.next != null)
				current= current.next;
			current.next = new Node(val);
		
	}
}
	public int pop() {
		if (initialNode==null) {
			return -1;
		}
		
		else if (initialNode.next==null) {
			
		int valTR = initialNode.value;
		initialNode=null;
		return valTR;
		}
		
		else {
			
		Node current = initialNode;
		Node pre = null;
		
		while(current.next != null) {
			pre = current;
			current = current.next;
			}
		int valTR = current.value;
		pre.next = null;
		return valTR;
		
		
		} 
}
	
	
	public String toString() {
		Node current = initialNode;
		String msg = "Stack contains elements: ";
		while(current != null) {
			msg += current.value + " ";
			current = current.next;
		}
		return msg;
	}
	
}