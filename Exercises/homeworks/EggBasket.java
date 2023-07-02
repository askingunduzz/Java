package cmpe113;

public class EggBasket {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfBaskets, eggsPerBasket, totalEggs;
		
		numberOfBaskets = 10;
		eggsPerBasket = 6;
		
		totalEggs = numberOfBaskets * eggsPerBasket;
		
		System.out.println("If you have");
		System.out.println(eggsPerBasket + " eggs per basket and");
		System.out.println(numberOfBaskets + " baskets, then");
		System.out.println("the total number of eggs is " + totalEggs);

	}
}
