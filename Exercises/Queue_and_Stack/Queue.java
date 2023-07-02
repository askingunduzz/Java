
public class Queue{
	public NodeString initialNode;
	
	public Queue() {
		initialNode = null;
	}
	

public void push(String item)
{
	if (initialNode == null) {
		initialNode = new NodeString(item);
		}
	
	else {
		
		NodeString current = initialNode;
		while(current.next != null)
			current= current.next;
		current.next = new NodeString(item);
	}
		
		
		
}


public String pop() {
	if (initialNode==null) {
		return null;
	}
	else if (initialNode.next==null) {
	String valTR = initialNode.value;
	initialNode=null;
	return valTR;
	}
	else {
		NodeString current = initialNode;
		NodeString pre = null;
		while(current.next != null) {
			pre = current;
			current = current.next;}
		String valTR = current.value;
		pre.next = null;
		return valTR;

		
	
	
	} 
}
	
	public String toString() {
		NodeString current = initialNode;
		String msg = "Queue contains elements: ";
		while(current != null) {
			msg += current.value + " ";
			current = current.next;
		}
		return msg;
	}
}
