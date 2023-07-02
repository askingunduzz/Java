package cmpe113;


public class For3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int product, n;
		n = 1;
		product = 1;
				
		for ( ; n <= 5; )
		{
			product = product * n;
			n++;
		}
		
		System.out.println(n-1 + "! is " + product);

	}

}
