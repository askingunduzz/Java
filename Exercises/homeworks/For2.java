package cmpe113;


public class For2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		for (int n = 1; n <= 10; sum = sum + n * n, n++);
		
		System.out.println("sum: " + sum);
	}

}
