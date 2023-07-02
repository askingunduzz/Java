
public class ExceptionPropagation {
 // iç içe metodlarda exception yakalama!!!

	public static void ucuncufonksiyon() {
		//try {
			int a = 12/0;
		//}
		//catch (ArithmeticException e) {
			System.out.println("bir sayi 0a bölünemez.");
		//}
	}
	
	public static void ikincifonksiyon() {
		try {
		ucuncufonksiyon(); //!!!!!! burda yakaladım.
		}
		catch (ArithmeticException e) {
			System.out.println("bir sayi 0a bölünemez.");
		}
	}
	
	public static void birincifonksiyon() {
		ikincifonksiyon();
	}
	
	
	public static void main(String[] args) {
		birincifonksiyon();
		//stack mantığı yararlı
		//exception yakalanana kadar stack boşalıyo sırayla bakıyo
	}
}
