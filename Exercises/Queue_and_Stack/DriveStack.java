
public class DriveStack {

	public static void main(String[] args) {

		Stack a = new Stack();
		a.push(15);
		a.push(12);
		a.push(100);
		a.push(50);
		
		System.out.println(a); //calling the toString method
		
		System.out.println(a.pop());
		System.out.println(a.pop());
		System.out.println(a);
		System.out.println(a.pop());
		System.out.println(a.pop());
		System.out.println(a.pop());

		
	}

}