
public class FinallyBlogu {
	//FINALLY BLOKLARI EXCEPTİON OLUŞSA DA OLUŞMASA DA ÇALIŞIR
		/*
		 * KODDA MUTLAKA YAPILMASI GEREKEN İŞLEMLERİ YAPMAK İÇİN
		 * DOSYA KAPAMA VEYA VERİ TABANI BAĞLANTISINI KESMEK GİBİ
		 * ARKA PLANDAKİ İŞLEMLERİN AKSAMAMASI İÇİN KAYNAKLARIN GEREKSİZ YERE 
		 * KULLANILMAMASI İÇİN
		 * 
		 */
		/*
		 * Finally bloğun 3 farklı durumu var
		 */
		public static void main(String[] args) {
			
			
			
		/* try {
			String s = null;
			System.out.println(s.hashCode()); //NullPointer
		}
			
			catch (NullPointerException e) {
				System.out.println("Null Referans hatası " );
			}
			
		finally {
			System.out.println("blok çalışıyor");
		}*/
			
			
			
		/*try {
			String s = "Mustafa";
			System.out.println(s.hashCode()); 
		}
			
			catch (NullPointerException e) {
				System.out.println("Null Referans hatası " );
			}
			
		finally {
			System.out.println("blok çalışıyor");
		}*/
			
			
		/*	try {
		int a = 30 /0 ;
		}
			
			catch (NullPointerException e) {
				System.out.println("Null Referans hatası " );
			}
			
		finally {
			System.out.println("blok çalışıyor ");
		}
			System.out.println("g");
			/*
			 * OUTPUT= 
			 * blok çalışıyor
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at FinallyBlogu.main(FinallyBlogu.java:48)
			 */
			
			try {
				int a = 30 /0 ;
				}
					
			
			
					catch (NullPointerException e) {
						System.out.println("Null Referans hatası " );
					}
			catch (Exception e) {
				System.out.println("bir sayi sıfıra bölünemez ");
			}
	//EĞER EXCEPTİON E KULLANACAKSAN EN ALTA KOY!!
					
				finally {
					System.out.println("blok çalışıyor ");
				}
					System.out.println("g");
					
			
			
			
			
}
}