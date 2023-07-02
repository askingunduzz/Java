package cmpe113;


public class Deq {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
	    double f1, f2;
	    
	    f1 = 0.0;
	    f1 = f1 + 0.3;
	    f1 = f1 + 0.3;
	    f1 = f1 + 0.3;
	    
	    if(f1 == 0.9) {
	    	System.out.println("equal");
	    }
	    else {
	    	System.out.println("not equal");
	    }

	    System.out.println("f1 is: " + f1);
	    if (Math.abs(f1-0.9) < 0.000000000000001) {
	    	System.out.println("Equal values");
	    }
	    else {
	    	System.out.println("Not equal values");
	    }
	    
	    
		String s1 = new String("hello");
		
		String s2 = new String("hello");
		
		if (s1 == s2) {
			System.out.println("They are equal");
		}
		else
		{
			System.out.println("They are not equal");
		}
	
	}
	

}